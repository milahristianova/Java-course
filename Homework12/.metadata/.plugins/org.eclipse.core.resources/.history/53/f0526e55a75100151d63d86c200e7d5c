import java.util.Arrays;
public class Zadacha1 {

	public static void sort(int [] a, int maxVal) {
int[] bucket = new int[maxVal + 1];
for (int i=0; i<bucket.length; i++){
	bucket[i] = 0;
}
for(int i=0; i<a.length; i++){
	int k = a[i];
	bucket[k]++;
}
int outP=0;
for(int i=0; i<bucket.length; i++){
	for(int j=0; j<bucket[i]; i++){
		a[outP++]=i;
	}
}
	}
	public static void main(String[] args) {
		int maxVal = 6;
		int [] data = {5,0,4,1,2,3,3,5,0,2,1,4,3};
		
		System.out.println("Before: " + Arrays.toString(data));
		sort(data,maxVal);
		System.out.println("Now : " + Arrays.toString(data));
		
	}



	}

