package com.utry.ut.pojo;

public class TestUser {
    private String username;

    @Override
	public String toString() {
		return "TestUser [username=" + username + ", password=" + password + ", nikename=" + nikename + "]";
	}

	private String password;

    private String nikename;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename == null ? null : nikename.trim();
    }
}