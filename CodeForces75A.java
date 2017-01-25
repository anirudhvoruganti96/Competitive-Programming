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
public class CodeForces75A {
    
	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
               long a=s1.nextLong();
               long b=s1.nextLong();
               long m=0;
               int ctr=1;
               while(a>0 && b>0)
               {
                   long k,l;
                   k=a%10;
                   l=b%10;
                   if(k==0 && l==0)
                   {
                       if(m>9)
                       {
                         //  out.println("NO");
                           ctr=0;
                           break;
                       }
                   }
                   if((k==0 && l!=0) || (l==0 && k!=0) )
                   {
                       //out.println("NO");
                       ctr=0;
                       break;
                   }
                   a=a/10;
                   b=b/10;
                   m=k+l; 
                if(m==10)
               {
                ctr=0;
               }
               }
               if(ctr==1)
                   out.println("YES");
               if( ctr==0)
               {
                   out.println("NO");
               }
        }
        
        private static void solve2(FastScanner s1, PrintWriter out){
            long a=s1.nextLong();
            long b=s1.nextLong();
            long c=a+b;
            long A=0,B=0,C=0,d=c;
            long i=0,j=0,k=0;
            while (a>0)
            {
                if(a%10!=0)
                {
                  A=A+((a%10)*(long)Math.pow(10,i));
                  i++;
                }   
                a=a/10;
            }
              while (b>0)
            {
                if(b%10!=0)
                {
                  B=B+((b%10)*(long)Math.pow(10,j));
                  j++;
                }   
                b=b/10;
            }
              
              while (c>0)
            {
                if(c%10!=0)
                {
                  C=C+((c%10)*(long)Math.pow(10,k));
                  k++;
                }   
                c=c/10;
            }
              
              if(C==A+B)
              {
                  out.println("YES");
              }
              else
                  out.println("NO");
        }

	/************************ SOLUTION ENDS HERE ************************/

        
        /************************ TEMPLATE STARTS HERE ************************/

	public static void main(String []args) throws IOException {
		FastScanner in  = new FastScanner(System.in);
		PrintWriter out = 
                    new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
		solve2(in, out);
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
