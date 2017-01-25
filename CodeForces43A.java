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
public class CodeForces43A {
 
    
	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
                int n=s1.nextInt();
                String a = null,b=null;
                int ctr1=0,ctr2=0;
                int i=1;
                while(i<=n)
                {
                   String s=s1.next();
                    if(i==1)
                    {
                        a=s;
                        ctr1++;
                    }
                    else 
                    { 
                        if(a.equalsIgnoreCase(s))
                        {
                            ctr1++;
                        }
                        else 
                        {
                            b=s;
                            ctr2++;
                        }
                        
                    }
                    
                    i++;
                }
                if(ctr1>ctr2)
                    out.println(a);
                else 
                    out.println(b);
        
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
                
                char[][] nextcharArray(int n) {
			char[][] arr = new char[n][n];
			for (int i = 0; i < n; i++) {
                            String s=next();
				for(int j=0;j<n;j++)
                                {
                                    arr[i][j]=s.charAt(j);
                                }
			}
			return arr;
		}

	}

	/************************ TEMPLATE ENDS HERE ************************/

}
