/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeforces.beginner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author N203tx
 */
public class CodeChefCoins {

    public static void main(String[] args) {
        
        Scanner s1=new Scanner(System.in);
                while(s1.hasNext())
                {
                    long dollar,n,sum=0;
                    n=s1.nextLong();
                    sum=(n/2)+(n/3)+(n/4);
                    dollar =sum;
                    if(dollar>n)
                        System.out.println(dollar);
                    else 
                        System.out.println(n);
                }
               
	}

	/************************ SOLUTION ENDS HERE ************************/
}


