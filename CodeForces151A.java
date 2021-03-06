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
import java.util.StringTokenizer;

/**
 *
 * @author N203tx
 */
public class CodeForces151A {
    /************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
                    int n,k,l,c,d,p,nl,np;
                    n=s1.nextInt();
                    k=s1.nextInt();
                    l=s1.nextInt();
                    c=s1.nextInt();
                    d=s1.nextInt();
                    p=s1.nextInt();
                    nl=s1.nextInt();
                    np=s1.nextInt();
                    int min=(k*l)/nl;
                    if((c*d)<min)
                    {
                        min=c*d;
                    }
                    if(p<(np*min))
                    {
                        min=(p/np);
                    }
                    
                    out.println(min/n);
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
               
                
                public BigInteger nextBigInteger() {
                        return new BigInteger(next());
                }

	}

	/************************ TEMPLATE ENDS HERE ************************/
    
}
