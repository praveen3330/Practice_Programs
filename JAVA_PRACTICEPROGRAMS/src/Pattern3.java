import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of n: ");
		int n = scan.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(i==0 || j==0 || i==n-1 || j==n-1 || i==j || (i+j==n-1) || (i+j==(n-1)/2) || (i-j==(n-1)/2) || (i+j == n+ (n-1)/2) ||
        				(j-i == (n-1)/2) )  {
        			System.out.print("*");
        		}
        		else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
	}

}
