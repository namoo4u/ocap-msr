package ocap.msr.repository;

import org.springframework.data.repository.CrudRepository;

import ocap.msr.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long>{

}
