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
public class ApacCountryLeader {
    
	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
            int t=s1.nextInt();
            for(int k=1;k<=t;k++)
            {
                String checkpoint=null;
                int n=s1.nextInt();
                int max_variables=0;
                int w=n;
                while(w>0)
                {
                    int[] a=new int[27];
                    String s=s1.nextLine();
                    int sum=0;
                    for(int i=0;i<s.length();i++)
                    {
                        int h= (int)s.charAt(i);
                        
                        if(h!=32) //eliminating the space as the character 
                        {
                        if(a[h-65]==0)
                        {
                            a[h-65]=1;
                            sum=sum+1;
                        }
                        }
                        
                        if(h==32)
                        {
                         a[26]=1;
                         sum=sum+1;
                        }                       
                        
                    }
                    
                    if(sum>max_variables)
                    {
                        max_variables=sum;
                        checkpoint=s;
                    }
                    
                    else if(sum==max_variables)
                    {
                        int ctr=0;
                      int len=(checkpoint.length())<(s.length())?checkpoint.length():s.length();
                      for(int i=0;i<len;i++)
                      {
                          if(checkpoint.charAt(i)<s.charAt(i))
                          {
                              checkpoint=checkpoint;
                              ctr=1;
                              break;
                          }
                          
                          else if(checkpoint.charAt(i)>s.charAt(i))
                          {
                              checkpoint=s;
                              ctr=1;
                              break;
                          }
                      }
                      if(ctr==0)
                      {
                        checkpoint=  (checkpoint.length())<(s.length())?checkpoint:s;
                      }
                    }
                    out.println(s+" ---------"+sum);
                    
                    w--;
                }
                out.println("Case #"+k+": "+checkpoint);
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
