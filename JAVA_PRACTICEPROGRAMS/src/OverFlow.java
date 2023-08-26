
public class OverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte a = 100;
        byte b = 100;
        byte c = (byte)(a+b);
        System.out.println(c);  //min value + (result - max value - 1)  -128+ (200-127-1)  = -56
	}

}
