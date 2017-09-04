package ocap.msr.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ocap.msr.repository.ReservationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Test
	public void contextLoads() {
		System.out.println("### RepositoryTest.contextLoads");
		System.out.println("### RepositoryTest.reservationRepository: " + reservationRepository);
		
	}
}
