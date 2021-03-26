package INDIAN_PLANTS;


public class register {
	
	private String username;
	private String password;
	private String email;

	public register(String  string, String strpwd, String stremail) {
		this.username = string;
		this.password = strpwd;
		this.email = stremail;
	}
	
	public Boolean user_register(String  string, String strpwd, String stremail) {
		if(this.username==string && this.password==strpwd && this.email==stremail) {
			return true;
		}else
			
		{
			return false;
		}
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
}

