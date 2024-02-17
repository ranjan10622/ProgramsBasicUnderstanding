package abc;

public class ReverseStringAll {

	public static void main(String[] args) {
	
		   String str = "RANJAN";
		   String rev = "";
		   
		   for(int i=str.length()-1;i>=0;i--)
		   {
			     rev= rev+str.charAt(i);
		   }

		   System.out.println("The reversed string is "+ rev);
	}

}
