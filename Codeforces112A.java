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
public class Codeforces112A {
    public static void main(String[] args) {
        String a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.next();
        b=sc.next();
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("0");
        }
        int i;
        for(i=0;i<a.length();i++)
        {
            if((int)a.charAt(i)<(int)b.charAt(i))
            {
                System.out.println("-1");
                break;
            }
            else if((int)a.charAt(i)>(int)b.charAt(i))
            {
                System.out.println("1");
                break;
            }
        }
    }
}
