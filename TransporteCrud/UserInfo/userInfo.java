package UserInfo;

import Buyer_Seller.Buyer;

public class userInfo {
	
	
	private String username;
	private String password;
	private Buyer userinformation;
	
	
	public userInfo(String username, String password, Buyer userinformation) {
		this.username = username;
		this.password = password;
		this.userinformation = userinformation;
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
	
}
