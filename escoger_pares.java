//gerara numeros aleatorios entre 1 y 10 en un vector
//y guarda solo los numeros pares 

import java.util.Scanner;
public class escoger_pares {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int i,n;
       n=leer.nextInt();
       int a[]=new int [n];
       int b[]=new int [n];
       int c[]=new int [n*2];
       //llenamos los vectores 
       i=1;
       do{
           a[i]=1+(int)(Math.random()*10);
           i=i+1;
       }while(i<n);
       i=1;
       do{
           b[i]=1+(int)(Math.random()*10);
           i=i+1;
       }while(i<n);
       i=1;
       do{
           System.out.print(a[i]+"\t");
            System.out.print(b[i]+"\t");
            i=i+1;
       }while(i<n);
       //escoje el vector par
       
       i=1;
      do{
          if(a[i]%2==0){
              c[i*2-1]=a[i];
          }
          else{}
          if(b[i]%2==0){
              c[i*2]=b[i];
          }
          else{}
          i=i+1;
        }while(i<n);
        System.out.println("");
       i=1;
       do{
           System.out.print(c[i]+"\t");
           i=i+1;
       }while(i<n*2);
    }
    
}
