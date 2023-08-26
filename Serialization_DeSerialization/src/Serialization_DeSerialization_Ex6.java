import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

class Dog6 implements Serializable{
	Cat1 c=new Cat1();
}
class Cat1 implements Serializable{
	Rat r=new Rat();
}
class Rat implements Serializable{
    int i=10;
}
public class Serialization_DeSerialization_Ex6 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog6 d= new Dog6();
		
		System.out.println("Serialization Started");
		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization ended");
		System.out.println("***********************************");
		System.out.println("DeSerialization Started");
		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog6 d1=(Dog6)ois.readObject();
		System.out.println(d1.c.r.i);
		System.out.println("DeSerialization ended");

	}
}
