
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//it is our task to specify target and retention when we are creating the our own annotation
@Target(ElementType.TYPE)    //  by using target we can specify where we can use this annotaion no this annotation can be used for classes, interfaces only)
@Retention(RetentionPolicy.RUNTIME)  //by using retention we can tell that attribute must be there upto at which place this attribute will be there upto runtime)

@interface CricketPlayer{
//@ --> its not interface but its Annotation being created

		int runs();      // here only we can assign the values like-> int runs() default 20000;
		String country();  // here only we can assign the values like-> String country() default "India";
}

//here also we can assign the values for inside the annotation like


@CricketPlayer(runs=20000,country="India")
class ViratKohli{
		private int runs;
		private String country;
		public int getRuns() {
		    return runs;
        }
        public void setRuns(int runs) {
		    this.runs = runs;
        }
        public String getCountry() {
             return country;
        }
        public void setCountry(String country) {
              this.country = country;
        }

}
public class Annotation2 {

        public static void main(String[] args) {
		        ViratKohli vk=new ViratKohli();
		        vk.setRuns(300);
		        vk.setCountry("India");
		       
		        System.out.println(vk.getRuns());
		        System.out.println(vk.getCountry());

       }

}