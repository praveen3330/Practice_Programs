import java.util.Scanner;

public class Linear_Search {

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
		
		System.out.println("Enter the value to search: ");
		int search = scan.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == search) {
				count++;
				break;
			}
		}
			
		if(count>0) {
			System.out.println("The value is found: " + search);
		}
		else {
			System.out.println("The value is not found " );
		}

	}

}
