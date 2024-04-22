package Array;

public class App6 {
	public static void main(String []args) {
		int arr[] = {12,66,48,98,121,77};
		int max = 0;
		for(int element : arr) {
			if (element > max) {
			max = element;
			}
		}
		System.out.println(max);
		
	}

}
