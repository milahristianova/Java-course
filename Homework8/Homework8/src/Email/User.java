package Email;

public class User {
private String email;
private String pass;

public User(String email, String pass) throws EmailException,
NumberException{
this.email = email;
this.pass = pass;
setEmail(email);
setPass(pass);
}

public String getEmail() {
	return email;
}

public void setEmail(String email) throws EmailException {
	if(email.length() > 5 && email.contains ("@")){
		this.email = email;
	}else{
		throw new EmailException("Please enter valid email: ");
	}
	
}

public String getPass() {
	return pass;
}

public void setPass(String pass) throws NumberException {
	if(pass.length() > 6) {
		this.pass = pass;
	}else{
		throw new NumberException("Please enter a password contains 6 symbols and 1 number:");
		
}

}
}
