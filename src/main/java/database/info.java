package database;

import java.util.List;
import java.util.Set;
public class info {
       private String nickname;
       @Override
	public String toString() {
		return "info [nickname=" + nickname + ", username=" + username + ", password=" + password + "]";
	}
	public info(String nickname, Set<String> username, List<String> password) {
		super();
		this.nickname = nickname;
		this.username = username;
		this.password = password;
	}
	public info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Set<String> getUsername() {
		return username;
	}
	public void setUsername(Set<String> username) {
		this.username = username;
	}
	public List<String> getPassword() {
		return password;
	}
	public void setPassword(List<String> password) {
		this.password = password;
	}
	private Set<String> username;
       private List<String> password;
       
}
