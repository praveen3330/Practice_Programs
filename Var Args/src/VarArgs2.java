class Harish{
	public void add(int... x) {    //jvm converts automatically into single dimension array
		int total = 0;
		for(int i=0;i<x.length;i++) {
			total = total + x[i];
		}
		System.out.println(total);
	}
}
public class VarArgs2 {

	public static void main(String[] args) {
		Harish h = new Harish();
		h.add(10);
		h.add(10,20);
		h.add(10,20,30);
		h.add(10,20,30,40);

	}

}
