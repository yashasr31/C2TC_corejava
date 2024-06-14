package edu.atria.b94java.finalkeyword;

public class FinalVariable {
		//final int x;//not initialized
		final int x=100;
		
		final static int y;
		final static int z=10;
		
		void change() {
			//x=30;//final variables can't be 
			//y=200
			
		}

		//@Override
		//public String toString() {
			//return "FinalVariable [x=" + x + ",y="+y+"]";
		static {
			y=20;
			//z=100;
			System.out.println("value of y:"+y);
		
}
}
