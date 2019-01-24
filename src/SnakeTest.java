import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SnakeTest {

	private Snake peter;
	private Snake takis;
	
	@BeforeEach
	void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	}
	
	@Test
	void testIsHealthyTrue() {
		assertTrue(takis.isHealthy());
		
	}
	
	@Test
	void testIsHealthyFalse() {
		assertFalse(peter.isHealthy());
		
	}
	
	@Test
	void fitsInCageTrue() {
		assertTrue(peter.fitsInCage(11));
		
	}
	
	@Test
	void fitsInCageFalseEquals() {
		assertFalse(peter.fitsInCage(10));
		
	}
	
	@Test
	void fitsInCageFalseSmall() {
		assertFalse(peter.fitsInCage(9));
		
	}

}