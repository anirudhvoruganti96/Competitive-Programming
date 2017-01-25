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
public class CodeForces58A_2 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int a=0;
        int ctr=0;
        a=s.indexOf('h',a);
        if(a<s.indexOf('e', a))
        {
            ctr++;
            a=s.indexOf('e', a);
        }
         if(a<s.indexOf('l', a))
        {
            ctr++;
         a=s.indexOf('l', a);
        }
          if(a<s.indexOf('l', a+1))
        {
            ctr++;
            a=s.indexOf('l', a);
        }
           if(a<s.indexOf('o', a))
        {
            ctr++;
            a=s.indexOf('o', a);
        }
        
           if(ctr==4)
           {
               System.out.println("YES");
           }
           else 
               System.out.println("NO");
    }
    
}
