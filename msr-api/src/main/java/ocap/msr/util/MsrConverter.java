package ocap.msr.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ocap.msr.entity.Reservation;
import ocap.msr.entity.Seat;
import ocap.msr.model.ReservationVO;
import ocap.msr.model.SeatVO;

@Component
public class MsrConverter {
	@Autowired
	private ModelMapper modelMapper;
	
	public ReservationVO toValueObject(Reservation reservation) {
		ReservationVO vo = modelMapper.map(reservation, ReservationVO.class);
		
		return vo;
	}
	
	public Reservation toEntity(ReservationVO vo) {
		Reservation entity = modelMapper.map(vo, Reservation.class);
		
		return entity;
	}
	
	public SeatVO toValueObject(Seat seat) {
		SeatVO vo = modelMapper.map(seat, SeatVO.class);
		return vo;
	}
	
	public Seat toEntity(SeatVO vo) {
		Seat entity = modelMapper.map(vo, Seat.class);
		
		return entity;
	}
}
