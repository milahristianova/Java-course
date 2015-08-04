package Account;

import java.math.BigDecimal;

public class PersonalAccount extends Account {
protected String name;
protected long ID;

public PersonalAccount(){
	super();
	this.name = "";
	this.ID = 0L;
}


public PersonalAccount(BigDecimal moneySum , String name, long ID) throws Exception{
	super(moneySum);
	this.name = name;
	this.ID = ID;
	setName(name);
	setID(ID);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getID() {
	return ID;
}

public void setID(long iD) {
	ID = iD;
}
public void print(){
	System.out.println("ID : " + this.ID);
	
}
	 
	
}
	

