package logic.bean;

public class LoginBean {
	
	public LoginBean(String user, String pwd) {
		username = user;
		password = pwd;
	}
	
	private final String username;
	private final String password;
	private int id;
	private String type;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
}
