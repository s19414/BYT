package test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import main.Issue;
import main.Manager;

public class IssueTest {
	Issue issue;
	Manager[] managers;
	Manager extraManager;
	
	@Before
	public void setUp() {
		issue = new Issue("Terrorist Attack", "Someone flew a bomb-filled jet-powered golf cart into the control tower.", Issue.Severity.HIGH);
		managers = new Manager[3];
		managers[0] = new Manager("Ting Wong", "Sum");
		managers[1] = new Manager("Jiggle", "Physics");
		managers[2] = new Manager("Theodore", "Herztl");
		extraManager = new Manager("Tinder", "Box");
		issue.setManager(managers.clone());
		
	}
	
	@Test
	public void testNotifyManager() {
		assertEquals("Manager, notified. Horse, eaten.", issue.notifyManager());
	}
	
	@Test
	public void testGetManager() {
		for(int i = 0; i < issue.getManager().length; i++) {
			assertEquals(managers[i], issue.getManager()[i]);
		}
	}
	
	@Test
	public void testSetManager() {
		managers[0] = extraManager;
		issue.setManager(managers.clone());
		for(int i = 0; i < issue.getManager().length; i++) {
			assertEquals(managers[i], issue.getManager()[i]);
		}
	}
	
	@Test
	public void testGetName() {
		assertEquals("Terrorist Attack", issue.getName());
	}
	
	@Test
	public void testSetName() {
		issue.setName("Just a prank, bro.");
		assertEquals("Just a prank, bro.", issue.getName());
	}
	
	@Test
	public void testGetInfo() {
		assertEquals("Someone flew a bomb-filled jet-powered golf cart into the control tower.", issue.getInfo());
	}
	
	@Test
	public void testSetInfo() {
		issue.setInfo(issue.getInfo() + " No harm done, he was just kidding around. We need about 10 ambulances though.");
		assertEquals("Someone flew a bomb-filled jet-powered golf cart into the control tower. No harm done, he was just kidding around. We need about 10 ambulances though.",
				issue.getInfo());
	}
	
	@Test
	public void testIsResolved() {
		assertEquals(false, issue.isResolved());
	}
	
	@Test
	public void testSetResolved() {
		issue.setResolved(true);
		assertEquals(true, issue.isResolved());
	}
	
	@Test
	public void testGetSeverity() {
		assertEquals(Issue.Severity.HIGH, issue.getSeverity());
	}
	
	@Test
	public void testSetSeverity() {
		issue.setSeverity(Issue.Severity.LOW);
		assertEquals(Issue.Severity.LOW, issue.getSeverity());
	}
}
