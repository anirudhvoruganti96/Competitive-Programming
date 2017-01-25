/*http://a2oj.com/p?ID=24*/

package codeforces.beginner;
import java.util.Scanner;

public class ArabicandEnglish {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        int k=-1;
      
        t=sc.nextInt();
        while(t>0)
        {
            int w=0;
             int n;
             n=sc.nextInt();
           
                 String[] s=new String[n];
                 for(int i=0;i<n;i++)
                 {
                     s[i]=sc.next();
                     
                     
                 }
                 
                 for(int i=0;i<n;i++)
                 {
                     if(s[i].charAt(0)!='#')
                     {
                          k=i;
                          w++;
                     }                    
                    
                 }
                 
                 if(w!=0)
                 {
                 for(int i=k+1;i<n;i++)
                 {
                     System.out.print(s[i]);
                     System.out.print(" ");
                 }
                  System.out.print(s[k]);
                  System.out.print(" ");
                  
                  for(int i=0;i<k;i++)
                  {
                      System.out.print(s[i]);
                        System.out.print(" ");
                  }
                          System.out.println("");
                 }
                 if(w==0) 
                 {
                     for(int i=0;i<n;i++)
                     {
                         System.out.print(s[i]);
                         System.out.print(" ");
                         
                     }
                     
                 }
                 System.out.println("");
            t--;
        }
    }
    
}
