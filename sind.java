import java.lang.*;
// import java.util.*;
class sind{
	public static void main(String arg[])
	 {
	   try{
                            // Stringbuffer
	               StringBuffer s=new StringBuffer("sha shaju");
		System.out.println(s.indexOf("s"));
		System.out.println(s.indexOf("h",3));
		// lastindex
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s.lastIndexOf("h",3));
	          // stringbuilder
		StringBuilder s1=new StringBuilder("Thar thara");
		System.out.println(s1.indexOf("h"));
		System.out.println(s1.indexOf("th",3));
		//li
		System.out.println(s.lastIndexOf("t"));
		System.out.println(s.lastIndexOf("h",3));
	          }
	        catch(Exception e)
	          { 
	             System.out.println(e);
	           }
	}
}