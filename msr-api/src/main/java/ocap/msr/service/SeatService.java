package ocap.msr.service;

import java.util.List;

import ocap.msr.model.NewSeatVO;
import ocap.msr.model.SeatVO;

public interface SeatService {
	public SeatVO addSeat(NewSeatVO vo);
	public void removeSeat(long seatId);
	public List<SeatVO> findSeats(String seatNo);
	public SeatVO viewSeat(long seatId);
	public SeatVO updateSeat(long seatId, NewSeatVO vo);
}
