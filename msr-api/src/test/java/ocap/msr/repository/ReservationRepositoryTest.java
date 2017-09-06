package ocap.msr.repository;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.Swagger2SpringBoot;
import ocap.msr.entity.Reservation;
import ocap.msr.entity.Seat;

@RunWith(SpringRunner.class)
//@ContextConfiguration
//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@SpringBootTest
//@DataJpaTest
@Ignore
public class ReservationRepositoryTest {

	@Autowired
	private ReservationRepository reservationRepository;
	
	@Test
	public void testFindSeats() throws Exception {
		Timestamp startingTime = getTimestamp("2017-09-05 08:00:00.000");
		Timestamp endingTime = getTimestamp("2017-09-05 09:00:00.000");
		
		System.out.println("startingTime: " + startingTime);
		System.out.println("endingTime: " + endingTime);
		
		List<Seat> seats = reservationRepository.findSeatsByStartTimeAndEndingTime(startingTime, endingTime);
		
		System.out.println("seats: " + seats);
//		System.out.println("### ReservationRepositoryTest.testFindSeats");
//		System.out.println("### ReservationRepositoryTest.reservationRepository: " + reservationRepository);
		
	}
	
	@Test
	public void testfindByStartingTimeBetweenAndEndingTimeBetween() throws Exception {
		Timestamp startingTime = getTimestamp("2017-09-05 08:00:00.000");
		Timestamp endingTime = getTimestamp("2017-09-05 09:00:00.000");
		
		System.out.println("startingTime: " + startingTime);
		System.out.println("endingTime: " + endingTime);
		
//		List<Reservation> reservations = 
//				reservationRepository.findByStartingTimeBetweenAndEndingTimeBetween(startingTime, endingTime);
//		
//		System.out.println("reservations: " + reservations);
	}
	
	@Test
	public void testFindAll() throws Exception {
		List<Reservation> reservations = new ArrayList<>();
		reservationRepository.findAll().iterator().forEachRemaining(reservations::add);

		System.out.println("reservations: " + reservations);		
	}
	
	@Test
	public void contextLoadsxxx() {
		System.out.println("### ReservationRepositoryTest.contextLoads");
		System.out.println("### ReservationRepositoryTest.reservationRepository: " + reservationRepository);
		
	}	
	
	Timestamp getTimestamp(String source) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		return new Timestamp(format.parse(source).getTime());
	}
	
	@Test
	public void testDummy() throws Exception {
		System.out.println("TEST Dummy");
		
	}
}
