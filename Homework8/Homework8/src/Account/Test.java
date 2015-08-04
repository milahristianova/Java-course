package Account;
import java.math.BigDecimal;
import java.util.Scanner;

public class Test {


	public static void main(String[] args) throws Exception {
		
		
		try {
			Scanner scanner = new Scanner(System.in);
			Account personal = new PersonalAccount(new BigDecimal(1000), "Martin", 9306154585L);
			Account coorporative = new CoorporativeAccount(new BigDecimal(2050000), "New day",4521024589L);
			
			System.out.print("Personal: ");
			isAccount(personal);
			
			System.out.print("Coorporative: ");
			isAccount(coorporative);
			
			System.out.print("Scanner: ");
			isAccount(scanner);
			
		
		} catch (InvalidException a){
			System.out.println(a.getMessage());
		} catch (NegativeException a){
			System.out.println(a.getMessage());
		}
	}
		
		public static void isAccount(Object object) throws InvalidException, NegativeException{
			if(!(object instanceof Account)){
				throw new InvalidException("Invalid account!");
			} else {
				if(object instanceof PersonalAccount){
					((PersonalAccount) object).print();
				} else{
					((CoorporativeAccount) object).print();
				}
				
			}
		}
	}

