import java.util.*;
public class Array_3DJagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int arr[][][] = new int[2][][];
		arr[0] = new int[2][];
		arr[1] = new int[3][];
		arr[0][0] = new int[2];
		arr[0][1] = new int[3];
		arr[1][0] = new int[2];
		arr[1][1] = new int[3];
		arr[1][2] = new int[2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the value of " + i + " " + j + " " + k + " is : ");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
		}

	}

}
