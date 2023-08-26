
public class MethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Virat");
		//methodchaining
		sb.append("Kohli").insert(10,"Anushka").reverse().append("IND").insert(sb.length(),"RCB").reverse().delete(0, 6);
		System.out.println(sb);
		

	}

}
