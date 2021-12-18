package main;

import java.util.ArrayList;

public class Manager extends Employee {
    //association attributes
	private ArrayList<Issue> issues;

    public Manager(String firstName, String lastName) {
    	super(firstName,lastName);
    	issues = new ArrayList<>();
    }
    
    public ArrayList<Issue> getIssues(){
    	ArrayList<Issue> copy = new ArrayList<>(issues);
    	return copy;
    }
    
    public void setIssues(ArrayList<Issue> issues) {
    	if(issues == null) {
    		throw new NullPointerException("Issue cannot be null");
    	}
    	this.issues = new ArrayList<>(issues);
    }

    public String resolveIssue(){
        return "Issue has been resolved";
    }

}
