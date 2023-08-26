 class PassingArrayInMethod {
	
	public void min(int a[]) {
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("minimum value in given array is " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,5,6,3,1};
		PassingArrayInMethod arr = new PassingArrayInMethod();
		arr.min(a);

	}

}
