import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;


class Animal implements Serializable{
	int i=10;
}

class Dog11 extends Animal{
	int j=20;
}
public class Serilaization_DeSerialization_Ex9 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog11 d=new Dog11();
		
		System.out.println("Serialization started");
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization ended");
		System.out.println("******************************");
		System.out.println("DeSerialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog11 d1=(Dog11)ois.readObject();
		System.out.println(d1.i+"====> "+d1.j);
		System.out.println("DeSerialization ended");


	}

}
