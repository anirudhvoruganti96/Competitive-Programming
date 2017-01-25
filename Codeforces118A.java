/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeforces.beginner;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author N203tx
 */
public class Codeforces118A {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String s = br.readLine();        
        s=s.toLowerCase();
        StringBuilder build=new StringBuilder(s);
       for(int i=0,length = s.length();i<length;i++)
       {
           if(build.charAt(i)!='a' && build.charAt(i)!='e'&& build.charAt(i)!='i'&& build.charAt(i)!='o'&& build.charAt(i)!='u'&& build.charAt(i)!='y' )
           {
               out.print(".");
               out.print(build.charAt(i));
           }
       }
       out.close();
       br.close();
    }
    
}
