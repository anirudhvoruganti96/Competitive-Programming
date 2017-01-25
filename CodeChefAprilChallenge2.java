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
import java.util.StringTokenizer;

/**
 *
 * @author N203tx
 */
public class CodeChefAprilChallenge2 {
/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
                int t;
                t=s1.nextInt();
                while(t>0)
                {
                    long a,b,c,k;
                    a=s1.nextLong();
                    b=s1.nextLong();
                    c=s1.nextLong();
                    k=s1.nextLong();
                    long w=0;/*if k is less than all  of three*/
                    /* if k is more */
                   
                   /* if(a<k)
                    {
                        w=2*(k-1)+a;
                    }
                    if(c<k)
                    {
                        w=2*(k-1)+c;
                    }
                    if(b<k)
                    {
                        w=2*(k-1)+b;
                    }
                    if(b<k && a<k)
                    {
                        w=(k-1)+b+a;
                    }
                    if(b<k && c<k)
                    {
                        w=(k-1)+c+b;
                    }
                    if(a<k && c<k)
                    {
                        w=(k-1)+c+a;
                    }
                    else
                        w=3*(k-1);*/
                    
                     w=(a<(k-1)?a:(k-1))+(b<(k-1)?b:(k-1))+(c<(k-1)?c:(k-1));     
                     w=w+1;
                    out.println(w);
                    t--;
                }
                
        
        }

	/************************ SOLUTION ENDS HERE ************************/

        
        /************************ TEMPLATE STARTS HERE ************************/

	public static void main(String []args) throws IOException {
		FastScanner in  = new FastScanner(System.in);
		PrintWriter out = 
                    new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
		solve(in, out);
		in.close();
		out.close();
	}    

	static class FastScanner{
		public BufferedReader reader;
		public StringTokenizer st;
		public FastScanner(InputStream stream){
			reader = new BufferedReader(new InputStreamReader(stream));
			st = null;
		}
		public String next(){
			while(st == null || !st.hasMoreTokens()){
				try{
					String line = reader.readLine();
					if(line == null) return null;
					st = new StringTokenizer(line);
				}catch (Exception e){
					throw (new RuntimeException());
				}
			}
			return st.nextToken();
		}
		public String nextLine(){
			String str = null;
			try {
				str = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		public int nextInt(){
			return Integer.parseInt(next());
		}
		public long nextLong(){
			return Long.parseLong(next());
		}
		public double nextDouble(){
			return Double.parseDouble(next());
		}
		int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}
//int arr[] = s1.nextIntArray(len);
		long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}
		public void close(){	
			try{ reader.close(); } catch(IOException e){e.printStackTrace();}
		}
	}
    
}
