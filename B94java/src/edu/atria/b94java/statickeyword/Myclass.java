package edu.atria.b94java.statickeyword;

public class Myclass {
		private static int section;
		private static int srNo;
		
		static {
			System.out.println("within the static block........");
			srNo=1000;
		}
		Myclass(){
			System.out.println("within default constructor......");
			srNo++;
		}
		public static void display() {
			System.out.println(srNo);
			//System.out.println(section);
		}
		@Override
		public String toString() {
			return "Myclass [section="+section+",srNo="+srNo+"]";
		}
		
}
