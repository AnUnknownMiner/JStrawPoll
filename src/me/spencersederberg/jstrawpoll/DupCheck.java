package me.spencersederberg.jstrawpoll;

public enum DupCheck {

	NORMAL("normal"),
	PERMISSIVE("permissive"),
	DISABLED("disabled");
	
	private String dup;
	
	DupCheck(String dup) {
		this.dup = dup;
	}
	
	public String getDupCheck() {
		return dup;
	}
}
