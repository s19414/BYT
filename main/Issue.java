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
	private Manager manager;
	
	public Issue(String _name, String _info, Severity _severity) {
		name = _name;
		info = _info;
		severity = _severity;
		resolved = false;
	}
	
	public void notifyManager() {
	}
	
	//getters and setters
	public void setManager(Manager _manger){
		manager = _manager;
	}
	
	public Manager getManager(){
		return manager;
	}
}
