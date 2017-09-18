import java.io.*;
import java.util.*;

class vectorclassnew
{
 public static void main(String args[])
 {
  int n,i;
  String ch = "",choice = "";
  Scanner sc = new Scanner(System.in);
  Vector v = new Vector();
   
  do
  {
   System.out.println("1. Add Name ");
   System.out.println("2. Display ");
   System.out.println("Enter your choice: ");
   n = sc.nextInt();
   
   switch(n)
   { 
    case 1:{ 
           System.out.println("Enter your name: ");
           ch = sc.next();
           v.addElement(ch);
           break;
           }
    case 2:{
           System.out.println("Current List ");
           for(i=0;i<v.size();i++)
           {
             System.out.println(v.elementAt(i));
           }
           break; 
           }
   }
   System.out.println("Do you want to continue(y/n): ");
   choice = sc.next();
  }while(choice.equals("y")||choice.equals("Y"));
 }
}
/*
C:\Users\User\Desktop\srk>javac vectorclassnew.java
Note: vectorclassnew.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\User\Desktop\srk>java vectorclassnew
1. Add Name
2. Display
Enter your choice:
1
Enter your name:
Shubham
Do you want to continue(y/n):
y
1. Add Name
2. Display
Enter your choice:
1
Enter your name:
Yadav
Do you want to continue(y/n):
y
1. Add Name
2. Display
Enter your choice:
2
Current List
Shubham
Yadav
Do you want to continue(y/n):
n
*/