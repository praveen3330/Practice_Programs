import java.util.Arrays;

public class ArraysClass_FillFromMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,0,0,0,4,5};
		Arrays.fill(arr, 2, 5, 10);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
