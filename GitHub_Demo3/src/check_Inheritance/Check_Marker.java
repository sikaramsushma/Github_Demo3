package check_Inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Check_Marker implements marker_Sample {

	/**
	 * @param args
	 */
	String name = "sai";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Check_Marker().name);
	}
	@Override
	public void geta() {
		// TODO Auto-generated method stub
		
	}

}
