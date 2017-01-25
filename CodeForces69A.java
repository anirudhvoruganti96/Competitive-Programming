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
public class CodeForces69A {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sum_x=0,sum_y=0,sum_z=0;
        while(n>0)
        {
            int x,y,z;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            sum_x=x+sum_x;
            sum_y=y+sum_y;
            sum_z=z+sum_z;
        n--;
        }
        if(sum_x==0 && sum_y==0 && sum_z==0)
        {
            System.out.println("YES");
        }
        else
             System.out.println("NO");
    }
    
}
