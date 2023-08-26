import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,5,8,6,25,15,10};
		Arrays.sort(arr);               // before binary search the elements must be in asscending order
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " "   );
		}
		System.out.println();
		int min = 0;
		int max = arr.length;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the key to search: ");
		int key = scan.nextInt();
		while(min<=max) {
			int mid = (min+max)/2;
			if(key == arr[mid]) {
				System.out.println("the key is found: " + " " + key);
				break;
			}
			else if(key>arr[mid]) {
				min = mid+1;
			}
			else if(key<arr[mid]) {
				max = mid-1;
			}
		}
		if(min>max) {
			System.out.println("The key is not found " + key);
		}

	}

}
