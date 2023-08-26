import java.util.Scanner;

public class CopyingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("the value of " + i + " is: ");
		    arr[i] = scan.nextInt();	
		}
		
		int arr2[] = new int[size];
		for(int i=0;i<arr.length;i++) {
		    arr2[i] = arr[i];	
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		    
		}
		

	}

}
