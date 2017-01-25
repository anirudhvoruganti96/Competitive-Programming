/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeforces.beginner;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author N203tx
 */
public class ChefandSister {
    
	/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
                int t=s1.nextInt();
                while(t>0)
                {
                    String s=s1.next();
                    int k=s1.nextInt();
                    int d1_ctr=0,d2_ctr=0;
                    int d2=0;
                    int[] arr=new int[26];
                    char[] chars=s.toCharArray();                        
                    for(int i=0;i<s.length();i++)
                    {
                        int g=(int)chars[i]-97;
                        arr[g]++;                       
                    }
                    for(int i=0;i<26;i++)
                    {
                        int w=arr[i];
                        d1_ctr=d1_ctr+(w/k);
                        d2=d2+(w%k);
                    }
                    d2_ctr= (d2%k==0) ?(d2/k):(d2/k)+1;
                    out.println(d1_ctr+d2_ctr);
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
                
                public boolean hasNext()
                {
                    while(st.nextElement()!=null)
                    {
                        return true;
                    }
                    return false;
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
