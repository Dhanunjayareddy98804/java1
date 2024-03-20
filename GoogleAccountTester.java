class GoogleAccountTester{
public static void main(String data[]){

//ClassName ref = new Constructor (ClassName());
	GoogleAccount account = new GoogleAccount();
	
	account.setFirstName("neetu");
	account.setLastName("reddy");
	account.setDateOfBirth("13-nov-1997");
	account.setGender("female");
	account.setUserName("neetureddy97");
	account.setEmail("neetureddy97@gmail.com");
	account.setPassword("senior");
	account.setConfirmPassword("senior");
	
	System.out.println(account.getFirstName() +" "+ account.getLastName() +" "+ account.getDateOfBirth() +" "+ account.getGender()+" "+ account.getUserName()+" "+account.getEmail()+" "+ account.getPassword()+" "+ account.getConfirmPassword());
	
}

}