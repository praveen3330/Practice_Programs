import java.util.*;
public class Array_1D {
	//1D Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		int marks[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the size of marks of " + i + "is: ");
			marks[i] = scan.nextInt();	
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(marks[i]);
		}
	}

}
