
public class forEach2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{10,20}, {30,40}};
		for(int arr[] : a) {
			for(int ele : arr) {
				System.out.println(ele + " ");
			}
		}

	}

}
