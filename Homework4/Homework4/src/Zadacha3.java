
public class Zadacha3 {

	public static void main(String[] args) {
	int[] array = new int[10];
	System.out.println("Array = { ");
	for(int i = 0 ; i < array.length; i++){
		array[i] = i * 10;
		System.out.print(array[i] + " ");
	}
	
	System.out.println("}");
	}

}
