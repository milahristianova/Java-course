package Zadachi_ot_lekciqta;

import java.util.HashMap;
import java.util.HashSet;
public class Test {

	public static void main(String[] args) {
		Town Varna = new Town("Varna", "Bulgaria" ,- 33000);
		Town Madrid = new Town("Madrid", "Spain" , - 555000);
		Town Berlin = new Town("Berlin", "Germany" ,- 420000);
		Town Rome = new Town("Rome" , "Italy" ,- 554000);
		Town Paris = new Town("Paris" , "France" ,- 682000);
		
		HashSet<Town> towns = new HashSet<Town>();
		towns.add(Varna);
		towns.add(Madrid);
		towns.add(Berlin);
		towns.add(Rome);
		towns.add(Paris);
		
		System.out.println(towns);
		System.out.println();
		System.out.println(towns.contains(Varna));
		System.out.println();
		towns.remove(Varna);
		System.out.println(towns);
		
	}

}
