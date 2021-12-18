package main;
//TODO
public class Issue {
	enum Severity{
		LOW,
		MEDIUM,
		HIGH
	}
	public String name;
	//additional information
	public String info;
	//is the issue resolved?
	public boolean resolved;
	public Severity severity;
	
	public Issue(String _name, String _info, Severity _severity) {
		name = _name;
		info = _info;
		severity = _severity;
		resolved = false;
	}
	
	public void notifyManager() {
	}
}
