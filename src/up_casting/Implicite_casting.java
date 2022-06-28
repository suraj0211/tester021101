package up_casting;

public class Implicite_casting {

	public static void main(String[] args) {
		 
		 int a=10;
		 long b = a;
		 System.out.println(b); // implicit casting is covert lower data type into higher data type
		 
		double d =12;
		int e =(int)d;
		System.out.println(e);
		
		long q =19;
		byte c = (byte)q;
		System.out.println(c);// explicir casting is coverting lower datatype value to higher 
		 
	}

}
