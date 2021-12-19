package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Issue;
import main.Manager;

public class ManagerTest {

	Manager manager;
	Issue issue;
	Issue issue2;
	ArrayList<Issue> issues;
	
	@Before
	public void setUp() {
		manager  = new Manager("John","Smith");
		issue = new Issue("CN0357","Intoxicated passenger at gate D15", Issue.Severity.MEDIUM);
		issue2 = new Issue("FN029","Abandonded bag in ticket hall", Issue.Severity.HIGH);
		issues = new ArrayList<>();
		issues.add(issue);
		manager.setIssues(issues);
	}
	@Test
	public void testSetIssues(){
		ArrayList<Issue> newIssues = new ArrayList<>();
		newIssues.add(issue2);
		manager.setIssues(newIssues);
		assertEquals(newIssues,manager.getIssues());
		assertThrows(NullPointerException.class,()->{manager.setIssues(null);});
	}

	@Test
	public void testGetIssues(){
		assertEquals(issues,manager.getIssues());
	}

}
