/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codeforces.beginner;

/**
 *
 * @author N203tx
 */
public class ChefAndArray {
    int n;
  
    int ctr=0;
int block1(int n){
      int a[]=new int[n];
    int i=0;
    int j;
    for(i=0;i<n;i++){
        for( j=i+1;j<n;j++){
            if((a[i]+a[j])==(a[i]*a[j]))
            {
                ctr++;
            }
            
    
        }
    }   
    return ctr;
}

    @SuppressWarnings("empty-statement")
int block2(int n){
  int a[]=new int[n];
  int i=0,j=0,k;  
  for(i=0;i<n;i++){
        for( j=i+1;j<n;j++){
            
        for(k=j+1;k<n;k++){
            if((a[i]+a[j]+a[k])==(a[i]*a[j]*a[k]))
            {
                ctr++;
            }
        }    
        }
  }
  return ctr;
}
}

