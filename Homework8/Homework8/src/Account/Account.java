package Account;
import java.math.BigDecimal;;

public class Account {
private BigDecimal moneySum;

public Account(){
	this.moneySum = new BigDecimal(0);
}
public Account(BigDecimal moneySum) throws NegativeException {
	setMoneySum(moneySum);
}
 public void setMoneySum(BigDecimal moneySum) throws NegativeException{
	 if(moneySum.compareTo(new BigDecimal(0)) >= 0){
		 this.moneySum = moneySum;
	 }else{
		 throw new NegativeException("Negative Sum! ");
	 }
	 
	 }



public BigDecimal getMoneySum(){
return moneySum;
}




}


