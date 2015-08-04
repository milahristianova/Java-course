package Account;

import java.math.BigDecimal;

public class CoorporativeAccount extends Account {
protected String nameOfTheFirm;
protected long bulstat;

public CoorporativeAccount(){
	super();
	this.nameOfTheFirm = "";
	this.bulstat = 0L;
}


public CoorporativeAccount(BigDecimal moneySum ,String nameOfTheFirm, long bulstat) throws Exception{
	super(moneySum);
	setNameOfTheFirm(nameOfTheFirm);
	setBulstat(bulstat);
	
}

public String getNameOfTheFirm() {
	return nameOfTheFirm;
}

public void setNameOfTheFirm(String nameOfTheFirm) {
	this.nameOfTheFirm = nameOfTheFirm;
}

public long getBulstat() {
	return bulstat;
}

public void setBulstat(long bulstat) {
	this.bulstat = bulstat;
}
public void print(){
	System.out.println("Bulstat: " + this.bulstat);
	
}
}
	



