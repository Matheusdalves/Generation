package com.exercise.security.mode;

public class Token {
	private String token;
	
	public Token(String str) {
		this.token = str;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
