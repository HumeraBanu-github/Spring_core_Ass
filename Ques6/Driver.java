package springs.ques6;

import org.springframework.stereotype.Component;

@Component
public class Driver {
	private String name;
	private String dburl;
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	public void disp() {
		System.out.println(getName());
		System.out.println(getDburl());
		System.out.println(getUsername());
		System.out.println(getPassword());
	}
}
