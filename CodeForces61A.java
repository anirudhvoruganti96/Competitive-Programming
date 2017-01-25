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
public class CodeForces61A {
    public static void main(String[] args) {
        String a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        b=sc.next();
        int[] w=new int[a.length()];
        for(int i=0;i<a.length();i++)
        {
            if((a.charAt(i)=='1' && b.charAt(i)=='0')||b.charAt(i)=='1' && a.charAt(i)=='0')
            {
                w[i]=1;
            }
            else 
                   w[i]=0;
        }
        for(int i=0;i<a.length();i++)
        {
            System.out.print(w[i]);
        }
    }
}
