package main;
//TODO
public class Issue {
	enum Severity{
		LOW,
		MEDIUM,
		HIGH
	}
	private String name;
	//additional information
	private String info;
	//is the issue resolved?
	private boolean resolved;
	private Severity severity;
	private Manager[] manager = new Manager[3];
	
	public Issue(String _name, String _info, Severity _severity) {
		name = _name;
		info = _info;
		severity = _severity;
		resolved = false;
	}
	
	public String notifyManager() {
		return "Manager, notified. Horse, eaten.";
	}
	
	//getters and setters
	public void setManager(Manager[] _manager){
		manager = _manager;
	}
	
	public Manager[] getManager(){
		return manager;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	public Severity getSeverity() {
		return severity;
	}
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
}
