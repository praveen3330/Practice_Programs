class Suhas{
	private int cost;
	private String name;
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCost() {
		return cost;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}


public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suhas h = new Suhas();
		h.setCost(10000);
		System.out.println(h.getCost());
		
		h.setName("Harish");
		System.out.println(h.getName());
		

	}

}
