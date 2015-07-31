package Cat;

public class Cat {

String name;
int years;

public Cat(){
	this.name = "";
	this.years = 0;
}
public Cat(String name, int years){
	this.name = name;
	this.years = years;
}
void Say(){
	System.out.println("My name is : "+ this.name);
	System.out.println("I am : " +this.years + "years old");
	

	}

}
