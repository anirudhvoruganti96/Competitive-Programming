package codeforces.beginner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CodeChefAprilChallenge4 {
/************************ SOLUTION STARTS HERE ************************/

	//DONT FORGET TO COMMIT AND PUSH TO GITHUB

	private static void solve(FastScanner s1, PrintWriter out){
                
            int  t;
            t=s1.nextInt();
            while(t>0)
            {
                long n,k;
                n=s1.nextLong();
                k=s1.nextLong();
                double sum=1;
                /*int w=(int)Math.sqrt(n-1);
                out.println(w);
                for(int i=1;i<=w;i++)
                {
                    sum=sum*(k-1);
                    sum=sum%((long)Math.pow(10,9)+7);
                }
                long o=(int) ((long)((n-1)-w)/w);
                out.println(o);
                sum=(long)Math.pow(sum,o);
              sum=sum%((long)Math.pow(10,9)+7);
                if((w+w+1)<(n-1))
                {
                    sum=sum*(k-1);
                }
               sum=sum%((long)Math.pow(10,9)+7);
                sum=sum*k;
                sum=sum%((long)Math.pow(10,9)+7); */
                 /* out.println((long)Math.log(k)+"k");
                  out.println(Math.log(k-1)+"k-1");
                  long w=((long)(n-1)*(long)Math.log((double)k-1)+(long)Math.log((double)k));
                  out.println(w);
                  long s;
                  s = (long)Math.exp(w);
                  out.println(Math.exp(w));*/
                    long s=1;
                    for(int i=1;i<=(int)Math.sqrt(n);i++)
                    {
                        s=s*(k-1);
                        s=s%((long)Math.pow(10,9)+7);
                    }
                    sum=(long)Math.pow(s,(int)Math.sqrt(n));
                    out.println(sum);
                     sum=sum%((long)Math.pow(10,9)+7);
                    out.println((int)Math.sqrt(n)+"(int)Math.sqrt(n)");
                    long w=(n-1)-((long)Math.pow((int)Math.sqrt(n),2));
                    out.println(w);
                    sum=sum*(long)Math.pow((k-1),w);
                    out.println(sum);
                  sum=sum%((long)Math.pow(10,9)+7);
                    sum=sum*k;
                  sum=sum%((long)Math.pow(10,9)+7);
                  out.println((int)sum);
                t--;
                
            }
        
// 331888259   (500)134575840
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
        
	}

	/************************ TEMPLATE ENDS HERE ************************/
    
}
