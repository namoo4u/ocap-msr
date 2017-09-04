package ocap.msr.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import ocap.msr.entity.Reservation;
import ocap.msr.entity.Seat;

public interface ReservationRepository extends CrudRepository<Reservation, Long>{
//	@Query(value="from Seat s where s.id NOT IN (SELECT seat.id from Reservation r where r.startingTime between :startingTime AND :endingTime OR r.endingTime between :startingTime AND :endingTime)")
	@Query(value="from Seat s where s.id NOT IN (SELECT seat.id from Reservation r where (r.startingTime > :startingTime AND r.startingTime < :endingTime) OR (r.endingTime > :startingTime AND r.endingTime < :endingTime))")
	List<Seat> findSeatsByStartTimeAndEndingTime(@Param("startingTime") Timestamp startingTime, @Param("endingTime") Timestamp endingTime);
}
