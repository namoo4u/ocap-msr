package ocap.msr.service;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ocap.msr.entity.Seat;
import ocap.msr.model.SeatVO;
import ocap.msr.repository.ReservationRepository;
import ocap.msr.util.MsrConverter;

@Service
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
	public List<SeatVO> findSeats(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		c.set(Calendar.HOUR_OF_DAY, 9);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		
		Date startingTime = c.getTime();
		
		c.set(Calendar.HOUR_OF_DAY, 18);
		Date endingTime = c.getTime();
		return findSeats(startingTime, endingTime);
	}

	@Override
	public List<SeatVO> findSeats(Date startingTime, Date endingTime) {
		List<Seat> seats = reservationRepository.findSeatsByStartTimeAndEndingTime(
				new Timestamp(startingTime.getTime()), new Timestamp(endingTime.getTime()));
		
		return seats.stream().map( converter::toValueObject).collect(Collectors.toList());
	}

}
