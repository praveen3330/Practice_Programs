import java.util.ArrayList;

public class AccessingCollectionDifferentWays {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10); 
		al.add(10.5);
		al.add('c');
		al.add(10.5f);
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		System.out.println(al2);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al);
		}

	}

}
