//file name should be named as J.java
package claass;
import java.util.*;
public class J {
private int small;
private int n=0;
private int t;

 void get()
 {
	 int i;
	 Scanner ni=new Scanner(System.in);
	 System.out.printf("\nHow many Number Should you compare?");
	 n=ni.nextInt();
	 
	 
	 for(i=1;i<=n;i++)
	 {
		 
		 System.out.printf("\nEnter Numbers :");
		 t=ni.nextInt();
		 
		 if(i==1)
		 {
			 small=t;
		 }
		 else
		 {
			 if(small>t)
			 {
				 small=t;
			 }
		 }
	 }
	 
	 System.out.printf("\n%d",small);
	 
	 ni=null;
	 
 }

	

	
}
