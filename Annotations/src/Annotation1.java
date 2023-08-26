// Annotation  java 5

//@CricketPlayer
//class Virat
//{
//
//}

//Annotation --> Annotation --> parent of all Annotations
//Annotation ---> Built in
//           ----> Custome (our Own)


// Annotation can be written for -->
 //1) class
//2) interface
//3) method
// 4) fields // instance var
//5 ) local variables
// 6) Consrtuctor
// 7) Parameters
// 8) enum

@FunctionalInterface    // if we keep annotaion as a functional interface then we can know that here there must be only one method
interface Trial{
		int getNumber();
		//void Number();
}

class JavaLearning{
		public void disp() {
				System.out.println("Learning JAVA");
		}
}

class Learning extends JavaLearning{
		@Override       // it helps to write a correct method name as parent method or else it shows error
		//public void disp1(){
		public void disp(){
		       System.out.println("Python Learning");
		}
}

public class Annotation1 {

		public static void main(String[] args) {
				Trial t = ()->{
				    return 10;
		        };
        System.out.println(t.getNumber());

       }

}