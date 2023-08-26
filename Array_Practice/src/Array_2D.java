import java.util.Scanner;

public class Array_2D {
	//2D Regular Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size1 of array: ");
		int size1 = scan.nextInt();
		System.out.println("Enter the size2 of array: ");
		int size2 = scan.nextInt();
		
		int marks[][] = new int[size1][size2];
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
			     System.out.print("Enter the size of marks of " + i + " " +  j + " is: ");
			     marks[i][j] = scan.nextInt();	
		}
		}
		
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
			System.out.println(marks[i][j]);
		}

		}
	}
}


