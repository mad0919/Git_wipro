/* Reverse Sting */

import java.util.*;

class Reverse{

  public static void main (String[] args) {
      
     
       
       String str="wipro";
 		 String reve=" "; 
 		 char ch;
		

     for(int i=0;i<str.length(); i++)
    {
	  	ch=str.charAt(i);
	  	reve=ch+reve;
    }

   System.out.println("String is " +reve);

   }

}
