/* If 2 interfaces contain a method with same signature and same return type in the implementation class only one method implementation is enough */

interface Left{
	public void one(); 
}

interface Right{
	public void one();
}

class EXT implements Left,Right{
	public void one(){
		System.out.println("One method ");
	}
}
class Interface7  {

	public static void main(String[] args) {
	
		EXT e = new EXT();
		e.one();
	}
}
