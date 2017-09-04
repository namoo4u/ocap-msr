package ocap.msr.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ocap.msr.entity.Reservation;
import ocap.msr.entity.Seat;
import ocap.msr.model.NewReservationVO;
import ocap.msr.model.ReservationVO;
import ocap.msr.model.SeatVO;
import ocap.msr.repository.ReservationRepository;
import ocap.msr.util.MsrConverter;

@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private MsrConverter converter;
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public void cancelReservation(long reservationId) {
		reservationRepository.delete(reservationId);
	}

	@Override
	public List<SeatVO> findAvailableSeats(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		
		DateTime startingTime = new DateTime(c.getTimeInMillis());
		
		c.set(Calendar.HOUR_OF_DAY, 18);
		DateTime endingTime = new DateTime(c.getTimeInMillis());
		return findAvailableSeats(startingTime, endingTime);
	}

	@Override
	public List<SeatVO> findAvailableSeats(DateTime startingTime, DateTime endingTime) {
		List<Seat> seats = reservationRepository.findSeatsByStartTimeAndEndingTime(
				new Timestamp(startingTime.getMillis()), new Timestamp(endingTime.getMillis()));
		
		return seats.stream().map( converter::toValueObject).collect(Collectors.toList());
	}

	@Override
	public List<ReservationVO> findReservations(DateTime startingTime, DateTime endingTime) {
		// TODO Auto-generated method stub
		List<Reservation> reservations = null;
		if(startingTime == null && endingTime == null) {
			reservations = new ArrayList<>();
			reservationRepository.findAll().iterator().forEachRemaining(reservations::add);
		} else {
			Timestamp starting = new Timestamp(0L);
			Timestamp ending = new Timestamp(Long.MAX_VALUE);
			
			if(startingTime != null) {
				starting.setTime(startingTime.getMillis());
			}
			if(endingTime != null) {
				ending.setTime(endingTime.getMillis());
			}
			reservations = reservationRepository.findByPeriod(starting, ending);
		}
		return reservations.stream().map(converter::toValueObject).collect(Collectors.toList());
	}

	@Override
	public List<ReservationVO> findByUser(long userId, DateTime startingTime, DateTime endingTime) {
		List<Reservation> reservations = null;
		if(startingTime == null && endingTime == null) {
			reservations = reservationRepository.findByUserId(userId);
		} else {
			Timestamp starting = new Timestamp(0L);
			Timestamp ending = new Timestamp(Long.MAX_VALUE);
			
			if(startingTime != null) {
				starting.setTime(startingTime.getMillis());
			}
			if(endingTime != null) {
				ending.setTime(endingTime.getMillis());
			}
			reservations = reservationRepository.findByUserIdAndPeriod(userId, starting, ending);
		}
		return reservations.stream().map(converter::toValueObject).collect(Collectors.toList());
	}

	@Override
	public ReservationVO reserveSeat(NewReservationVO newReservation) {
		Reservation entity = converter.toEntity(newReservation);
		
		return converter.toValueObject(reservationRepository.save(entity));
	}
	
	
	
	
	

}
