/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeforces.beginner;

import java.io.IOException;
import java.io.PrintWriter;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author N203tx
 */
public class CodeChefMovieWkn {

	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
                int t,n;
                t=s1.nextInt();
                while (t>0)
                {
                    int index=0,max=0,R=0;
                    n=s1.nextInt();
                    int[] l=new int[n];
                    int[] r=new int[n];
                    for(int i=0;i<n;i++)
                    {
                        l[i]=s1.nextInt();
                    }
                    
                    for(int i=0;i<n;i++)
                    {
                        r[i]=s1.nextInt();
                    }
//                    
//                    for(int i=0;i<n;i++)
//                    {
//                        out.print(l[i]);
//                    }
//                    out.println();
//                    for(int i=0;i<n;i++)
//                    {
//                        out.print(r[i]);
//                    }
                    
                    for(int i=0;i<n;i++)
                    {   int sum;
                        sum=l[i]*r[i];
                        //out.println(sum+" "+i);
                        if(sum>max)
                        {
                            max=sum;
                            index=i;
                            R=r[i];
                        }
                        if(sum==max)
                        {
                            if(r[i]>R)
                            {
                                index=i;
                                R=r[i];
                            }
                            
                            if(r[i]==R)
                            {
                                if(index<i)
                                {
                                    index=index;
                                }
                                 
                                else 
                                {
                                    index=i;
                                    R=r[i];
                                }
                            }
                        }
                    }
                    
                  out.println(index+1);
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
