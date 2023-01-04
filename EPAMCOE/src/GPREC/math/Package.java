package GPREC.math;
import java.util.*;
public class Package {
 public int reverse(int num)
 {
	 int s=0;
	 while(num>0)
	 {
		 int d=num%10;
		  s=s*10+d;
		  num=num/10;
	 }
	 return s;
 }
 public String palindrome(int num)
 {
	 int m=num;
	 int s=0;
	 while(num>0)
	 {
		 int d=num%10;
		  s=s*10+d;
		  num=num/10;
	 }
	 if(s==m)
			 {
		 return "TRUE";
			 }
	 else {
		 return "FAlSE";
	 }
 }
}
