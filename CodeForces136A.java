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
public class CodeForces136A {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n+1];
        for(int i=1;i<n+1;i++)
        {
            int k;
            k=sc.nextInt();
            a[k]=i;
        }
      for(int i=1;i<n+1;i++)
      {
          System.out.print(a[i]+" ");
      }
        
    }
}
