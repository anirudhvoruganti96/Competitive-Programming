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
public class CHAHG {

	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
            int t=s1.nextInt();
            while(t>0)
            {
                int n=s1.nextInt();
                long[] h=new long[n];
                long[] m=new long[n];
                h=s1.nextLongArray(n);
                m=s1.nextLongArray(n);
                int day=0,count=1;
                boolean decision=false;
                
                if(h[0]>h[1])
                {
                    while(decision==false)
                    {
                        long smallest=h[0],largest=h[0];
                        for(int i=2;i<n-1;i++)
                        {
                            if(i%2==0)
                            {
                                if(i!=n-2)
                                {
                                if(h[i-1]>h[i] && h[i]<h[i+1])
                                {
                                    decision=false;
                                    break;
                                }
                                else 
                                {
                                 count +=2;   
                                 if(h[i]<smallest)
                                 {
                                     smallest=h[i];
                                 }
                                 
                                 if(h[i]>largest)
                                 {
                                     largest=h[i];
                                 }
                                 
                                 if(h[i]== Integer.MAX_VALUE)
                                 {
                                     largest=h[i];
                                 }
                                }
                                }
                                
                                else if(i==n-2) 
                                {
                                if(h[i-1]>h[i] && h[i]<h[i+1])
                                {
                                    decision=false;
                                    break;
                                }
                                else 
                                {
                                 count +=1;   
                                }                                    
                                }
                            }
                            
                            decision=true;
                        }
                        
                        if(decision==false)
                        {
                        day++;
                        for(int i=0;i<n;i++)
                        {
                            h[i]=h[i]+m[i];
                        }
                        }
                        
                    }
                }
                
  ///check the code once again because the heights might change after the increment of the day /              
                if(h[0]<h[1])
                {
                    while(decision==false)
                    {
                        long smallest=h[0],largest=h[0];
                        for(int i=2;i<n-1;i++)
                        {
                            if(i%2==0)
                            {
                                if(i!=n-2)
                                {
                                if(h[i-1]<h[i] && h[i]>h[i+1])
                                {
                                    decision=false;
                                    break;
                                }
                                else 
                                {
                                 count +=2;   
                                 if(h[i]<smallest)
                                 {
                                     smallest=h[i];
                                 }
                                 
                                 if(h[i]>largest)
                                 {
                                     largest=h[i];
                                 }
                                 
                                 if(h[i]== Integer.MAX_VALUE)
                                 {
                                     largest=h[i];
                                 }
                                }
                                }
                                
                                else if(i==n-2) 
                                {
                                if(h[i-1]<h[i] && h[i]>h[i+1])
                                {
                                    decision=false;
                                    break;
                                }
                                else 
                                {
                                 count +=1;   
                                }                                    
                                }
                            }
                            
                            decision=true;
                        }
                        
                        if(decision==false)
                        {
                        day++;
                        for(int i=0;i<n;i++)
                        {
                            h[i]=h[i]+m[i];
                        }
                        }
                        
                    }
                }
                
                
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
