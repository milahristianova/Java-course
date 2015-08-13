package Zadachi_ot_lekciqta;

public class Town {
String name;
String country;
long population;

public Town(String name, String country, long population){
	setName(name);
	setCountry(country);
	setPopulation(population);
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public long getPopulation() {
	return population;
}

public void setPopulation(long population) {
	this.population = population;
}
public boolean equals(Object o){
	if(o == null){
		return false;
	}
	if(!(o instanceof Town)){
		return false;
	}
	Town name_1 = (Town) o;
	return this.hashCode() == name_1.hashCode();
}
public String toString(){
	return this.name + " " + this.country + this.population;
	
	}
}


