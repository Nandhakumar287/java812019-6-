import java.io.*;
import java.util.*;
  public class StrInt{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
	  int i,j,flag=0,Count=0;
      System.out.println("Enter A String");
      String str=sc.next();
      for(i=0;i<str.length();i++)
      {
        if(str.charAt(i)>='0'&& str.charAt(i)<='9')
        {
        flag++;
        }
        else
        {
          Count++;
        }
      }
	  //System.out.println("Flag:"+flag);
	  //System.out.println("Count:"+Count);

	  
      if(flag!=0 && Count==0)
      {
      System.out.println("yes");
      }
      else
      {
      System.out.println("No");
      }
    }
  }  
