package Email;

public class Main {
public static void main(String[] args) throws EmailException,
	NumberException {
		try {
			User user1 = new User("ivanov.dimitur@gmail.bg" , "abvng25");
			User user2 = new User("velina.petrova@yahoo.com" , "addasr5");
			User user3 = new User("petrov.ivan@abv.bg" , "ivanpet67");
		} catch (EmailException exception) {
			System.out.println(exception.getMessage());
		} catch (NumberException exception){
			System.out.println(exception.getMessage());
		} finally {
			System.out.println("Everything is correct!");
			
			
		}
	}
}

