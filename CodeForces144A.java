/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeforces.beginner;
import java.util.Scanner;
/**
 *
 * @author N203tx
 */
public class CodeForces144A {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        int i=0;
        while(i<n)
        {
            a[i]=sc.nextInt();
            i++;
        }
        int max=0,max_i=0;
        int min=100,min_i=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                max_i=i;
            }
              if(a[i]<=min)
            {
                min=a[i];
                min_i=i;
            }
        }
        int sum=max_i+(n-1-min_i);
        if(max_i>min_i)
            sum--;
        System.out.println(sum);
        
    }
    
}
