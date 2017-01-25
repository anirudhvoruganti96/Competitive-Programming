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
public class CodeForces236A {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        String sorted =new String(chars);
        //System.out.println(sorted);
        int n=s.length();
        int ctr=0,i=0;
        for(i=1;i<n;i++)
        {
            if(chars[i]==chars[i-1])
            {
                ctr++;
            }
        }
        int k=n-ctr;
        if(k%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else if(k%2==1)
        {
            System.out.println("IGNORE HIM!");
        }
        
    }
    
}
