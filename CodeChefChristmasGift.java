/*https://www.codechef.com/problems/KOL1502*/

package codeforces.beginner;
import java.util.*;
/**
 *
 * @author N203tx
 */
public class CodeChefChristmasGift {
    public static void main(String[] args) {
        int t,n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int sum=0,sum1=0,sum2=0,ctr=0;
            for(int i=0;i<n-1;i++)
            {
                int k=0;
                while(k<=i)
                {
                    sum1=sum1+a[k];
                    k++;
                }
                
                for(int j=i+1;j<n;j++)
                {
                    int w=j;
                    while(w<n)
                    {
                        sum2=sum2+a[w];
                        w++;
                    }
                    
                }
            }
        }
    }
    
}
