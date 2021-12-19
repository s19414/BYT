package test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import main.AirportWorker;

public class AirportWorkerTest {
	
	AirportWorker airportWorker;
	
	@Before
	public void setUp() {
		airportWorker = new AirportWorker("Herp", "Derp");
	}
	
	@Test
	public void testFlagAnIssue() {
		assertEquals("Issue has been flagged", airportWorker.flagAnIssue());
	}

}
