//metodo burbuja de ordenamientode un vector

import java.util.Scanner;
public class metodo_burbuja {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     int aux,i,j,n;
     System.out.println("introduce el tamaño del vector");
     n=leer.nextInt();
     int v[]=new int [n];
     
     for(i=0;i<n;i++){
         v[i]=1+(int)(Math.random()*10);
     }
     
      System.out.println("matriz original ");
        for(i=0;i<n;i++){
            System.out.print(v[i]+"\t");
      }
        
     for(i=1;i<n;i++){
         for(j=0;j<n-i;j++){      
             if(v[j]>v[j+1]){
                 aux=v[j];
                 v[j]=v[j+1];
                 v[j+1]=aux;
                 }
         } 
     }
        System.out.println("matriz ordenado ");
        for(i=0;i<n;i++){
            System.out.print(v[i]+"\t");
      }
     }
    }
    
