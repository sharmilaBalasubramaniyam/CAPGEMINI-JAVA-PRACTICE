package practice_Jun23;

interface empty_string
{
	String stri(String a);
}

public class Check_string_is_empty_or_not {
   public static void main(String args[])
   {
	   empty_string emstri = (a)->
	   {
		   if(a.isEmpty()) {
			   return "True";
		   }else {
			   return "False";
		   }
	   };
   
   System.out.println(emstri.stri(""));
   }
}
