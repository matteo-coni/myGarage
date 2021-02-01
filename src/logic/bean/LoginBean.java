package logic.bean;

public class LoginBean {
	
	public LoginBean() {
		
	}
	
	public LoginBean(String user, String pwd) {
		username = user;
		password = pwd;
	}
	
	private String username;
	private String password;
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
