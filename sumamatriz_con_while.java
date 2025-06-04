//introduce los datos de 2 matrices por el teclado 
//la suma de matrices se almacenara en la tercera matriz

import java.util.Scanner;
public class sumamatriz_con_while {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      int n=leer.nextInt();
      int a[][]=new int [n][n];
      int b[][]=new int [n][n];
      int c[][]=new int [n][n];
      int i,j;
        System.out.println("matriz 1");
      i=0;
      while(i<n){
          j=0;
          while(j<n){
              a[i][j]=leer.nextInt();
              j=j+1;
              }
          i=i+1;
          }
        System.out.println("matriz 2");
      i=0;
      while(i<n){
          j=0;
          while(j<n){
              b[i][j]=leer.nextInt();
              j=j+1;
              }
          i=i+1;
          }
       i=0;
      while(i<n){
          j=0;
          while(j<n){
              c[i][j]=a[i][j]+b[i][j];
              j=j+1;
              }
          i=i+1;
          }
        System.out.println("suma de las matrices ");
         i=0;
      while(i<n){
          j=0;
          while(j<n){
              System.out.print(c[i][j]+"\t");
              j=j+1;
              }
          System.out.println("");
          i=i+1;
          }
    }  
}
