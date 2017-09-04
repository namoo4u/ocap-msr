package ocap.msr.service;

import java.util.Date;
import java.util.List;

import ocap.msr.model.SeatVO;

public interface ReservationService {
	public void cancelReservation(long reservationId);
	public List<SeatVO> findSeats(Date date);
	public List<SeatVO> findSeats(Date startingTime, Date endingTime);
}
