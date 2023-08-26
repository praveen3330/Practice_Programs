import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

class Animal12 {
	int i=10;
	Animal12(){
	   System.out.println("No arg Animal constructor");
	}
}
class Dog12 extends Animal12 implements Serializable{
	int j=20;
	Dog12(){
	   System.out.println("No arg Dog constructor");
	}
}


public class Serialization_DeSerialization_Ex10 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog12 d=new Dog12();
		d.i=888;
		d.j=999;
		System.out.println("Serialization started");
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization ended");
		System.out.println("******************************");
		System.out.println("DeSerialization started");
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog12 d1=(Dog12)ois.readObject();
		System.out.println(d1.i+"====> "+d1.j);
		System.out.println("DeSerialization ended");	

	}
}
