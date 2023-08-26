import java.util.Scanner;

public class Array_2DJagged {
	
	//2D Jagged Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the value of " + i + " " + j + " is: ");
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
		
		
	}
}