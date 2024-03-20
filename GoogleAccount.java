public class GoogleAccount {
 
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	
	public GoogleAccount(){
	System.out.println("GoogleAccount constructor is invoked");
	}

	public void setFirstName(String firstName){
	this.firstName = firstName;
	}
	
	public String getFirstName(){
	return this.firstName;
	}
	
	public void setLastName(String lastName){
	this.lastName = lastName;
	}
	
	public String getLastName(){
	return this.lastName;
	}

	public void setDateOfBirth(String dateOfBirth){
	this.dateOfBirth = dateOfBirth;
	}
	
	public String getDateOfBirth(){
	return this.dateOfBirth;
	}
	
	public void setGender(String gender){
	this.gender = gender;
	}
	
	public String getGender(){
	return this.gender;
	}
	
	public void setUserName(String userName){
	this.userName = userName;
	}
	
	public String getUserName(){
	return this.userName;
	}
	
	public void setEmail(String email){
	this.email = email;
	}
	
	public String getEmail(){
	return this.email;
	}
	
	public void setPassword(String password){
	this.password = password;
	}
	
	public String getPassword(){
	return this.password;
	}
	
	public void setConfirmPassword(String confirmPassword){
	this.confirmPassword = confirmPassword;
	}
	
	public String getConfirmPassword(){
	return this.confirmPassword;
	}
}