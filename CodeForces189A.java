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
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author N203tx
 */
public class CodeForces189A {
    
	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
            int N=s1.nextInt();
            int[] x=new int[3];
            x=s1.nextIntArray(3);
            Arrays.sort(x);
            int[] ctr=new int[3];
            int n=N;
            int k=N;
            for(int i=0;i<3;i++)
            {
                ctr[i]=n/x[i];
             // out.println(ctr[i]+" "+i);
//                out.println(n);
               n=n-(x[i]*ctr[i]);
//                out.println(n);
//                out.println(n%x[i]);
                if(n%x[i]!=0)
                { if(i>2)
                {
                    
                
                    while(n<x[i+1])
                    {
                      ctr[i]--;
                       n=N-(x[i]*ctr[i]);
                       
                       //out.println(n+" while loop");
                    }
                }    
                }
            }
           if((ctr[0]*x[0])+(ctr[1]*x[1])+(ctr[2]*x[2])==N)
           {
                //out.println("corect");
                out.println(ctr[0]+ctr[1]+ctr[2]);
            
           }
             
            else 
           {
                //out.println("wrong"+ (ctr[0]*x[0])+(ctr[1]*x[1])+(ctr[2]*x[2]));
                int max=0;
               // out.println(N);
                for(int i=0;i<3;i++)
                { //out.println(x[i]);
                 
                    if(k%x[i]==0)
                    {
                        if(k/x[i]>max)
                            max=k/x[i];
                    }
                }
                out.println(max);
           }
               
            
            out.println(ctr[0]+ctr[1]+ctr[2]); 
            
        }

	/************************ SOLUTION ENDS HERE ************************/
//p158wvw
        
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
