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
 *368035402/*/
public class CodeChefAprilChallenge_4 {
/************************ SOLUTION STARTS HERE ************************/
 
	//DONT FORGET TO COMMIT AND PUSH TO GITHUB
 
	private static void solve(FastScanner s1, PrintWriter out){
                
            int  t;
            t=s1.nextInt();
            while(t>0)
            {
                long n,k;
                double sum=1;
                n=s1.nextLong();
                k=s1.nextLong();
                
                  for(long i=1;i<n;i++)
                  {
                      sum=sum*(k-1);
                      sum=sum%((long)Math.pow(10,9)+7);
                             
                  }
                  sum=sum*k;
                  sum=sum%((long)Math.pow(10,9)+7);
                  
               out.println((int)sum);
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
 
//        private BigInteger nextBigInteger() {
//            return BigInteger.parseBigInteger(next());
//        
//        }
	}
 
	/************************ TEMPLATE ENDS HERE ************************/
    
} 