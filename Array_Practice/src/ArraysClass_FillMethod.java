import java.util.Scanner;
import java.util.Arrays;
public class ArraysClass_FillMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Arrays.fill(arr, 5);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
