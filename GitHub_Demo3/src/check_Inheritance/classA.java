package check_Inheritance;

public class classA {
	int a=10;
	int b=20;
	
	public int getA(){
		return a;
		
	}
	
	public int getB(){
		return b;
		
	}
	
}

class classB extends classA{
	int a=40;
	int b=50;
	
	public int getc(){
		return a;
		
	}
	
	public int getd(){
		return b;
		
	}
	
}

class classC{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classA ca = new classB();
		System.out.println("value is "+ca.getA());
	}

}