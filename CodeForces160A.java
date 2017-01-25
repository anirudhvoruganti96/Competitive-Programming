/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeforces.beginner;
import java.util.*;

/**
 *
 * @author N203tx
 */
public class CodeForces160A {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] coins= new int[n];
        int sum=0;
        int i;
        for(i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
            sum=sum+coins[i];
        }
        
        Arrays.sort(coins);
        int ctr=0,twinsum=0;
        for(i=n-1;i>=0;i--)
        {
            twinsum=twinsum+coins[i];
            sum=sum-coins[i];
            ctr++;
            if(twinsum>sum)
            {
                break;
            }
        }
        System.out.println(ctr);
        
    
            }
}
