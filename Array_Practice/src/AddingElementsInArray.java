import java.util.*;
public class AddingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("the value of " + i + " is: ");
		    arr[i] = scan.nextInt();	
		}
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];   	
		}
		
		
		System.out.println("The toatl sum of given elements in array is: "+ sum);

	}

}
