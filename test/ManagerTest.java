import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ManagerTest {

	Manager manager;
	Issue issue;
	ArrayList<Issue> issues;
	
	@Before
	public void setUp() {
		manager  = new Manager("John","Smith");
		issue = new Issue("CN0357","Intoxicated passenger at gate D15", Issue.Severity.MEDIUM);
		issues = new ArrayList<>();
		issues.add(issue);
		
	}
	@Test
	public void testSetIssues(){
		ArrayList<Issue> newIssues = new ArrayList<>();
		newIssues.add(issue);
		manager.setIssues(newIssues);
		assertEquals(newIssues,manager.getIssues());
		assertThrows(NullPointerException.class,()->{manager.setIssues(null);});
	}

	@Test
	public void testGetIssues(){
		assertEquals(issues,issues);
	}

}
