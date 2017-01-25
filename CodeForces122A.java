
package codeforces.beginner;
import java.util.*;

public class CodeForces122A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a==4 || a==7 ||a==77 ||a==47 ||a==44 ||a==74 ||a==444 ||a==447 ||a==474 ||a==447 ||a==477 ||a==747 ||a==744 ||a==774 ||a==777 )
        {
            System.out.println("YES");
        }
        else if(a%4==0 || a%7==0 ||a%77==0 ||a%47==0 ||a%44==0 ||a%74==0 ||a%444==0 ||a%474==0 ||a%447==0 ||a%477==0 ||a%747==0 ||a%744==0 ||a%774==0 ||a%777==0)
       {
           System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }

}
}