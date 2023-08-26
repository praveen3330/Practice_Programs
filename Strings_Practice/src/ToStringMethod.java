class Student{
	int id = 10;
	String name = "harish";
}


public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s);              // here it converts automatically to toString method it gives class@hexadecimalvalue
		System.out.println(s.toString());
		
		System.out.println();
		
		System.out.println(s.id);
		System.out.println(s.name);
		
		System.out.println();
		
		String name = new String("Dhoni");
		System.out.println(name);
		System.out.println(name.toString());

	}

}
