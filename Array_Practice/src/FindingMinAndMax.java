import java.util.Scanner;

public class FindingMinAndMax {

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
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("the min value of array is: " + min);
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("the max value of array is: " + max);
		

	}

}
