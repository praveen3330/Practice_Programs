//MArkable Interfaces - here in interface no need to give any methods just use serializable, clonable etc----
//If there is no methods or variables in interface then it is called as Markable Interface or Tag Interface or Ability interface

interface Serializable{
	//By implementing serializable interface we can send that object cross the network and we can save state of an object into the file
}

class Sample1 implements Serializable{
	//implementation will be done by jvm only
}

interface Clonable{
	// By implementing clonable interface our object is in a position to provide exactly duplicate cloned object
}

class Sample2 implements Clonable{
	//implementation will be done by jvm only
}

interface SingleThreadModel{
	// By implementing SingleThreadModel interface servlet can process only one client get "Thread Safety"
}

class Sample3 implements SingleThreadModel{
	//implementation will be done by jvm only
}


public class MarkerInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Sample1 s1 = new Sample1();
		Sample2 s2 = new Sample2();
		Sample3 s3 = new Sample3();
	}

}
