package com.floreysoft.jmte.token;

public class IfToken extends DefaultToken {

	private boolean condition;
	
	public IfToken(boolean condition) {
		this.condition = condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public boolean getCondition() {
		return condition;
	}
}