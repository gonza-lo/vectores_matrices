//multiplicacion de 2 matrices 
//introcucidos por teclado

import java.util.Scanner;
public class multiplicacion_de_2_matrices {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int k,i,j,s;
       int m[][]=new int[3][3];
       int n[][]=new int[3][3];
       int o[][]=new int[3][3];
        System.out.println("introduzca los valores de la ptimera matriz");
       for (i=0;i<3;i++){
           for(j=0;j<3;j++){
               m[i][j]=leer.nextInt();
           }
           System.out.println("");
       }
       System.out.println("introduzca los valores de la segunda matriz");
        for (i=0;i<3;i++){
           for(j=0;j<3;j++){
               n[i][j]=leer.nextInt();
           }
           System.out.println("");
       }
         for (i=0;i<3;i++){
           for(j=0;j<3;j++){
              s=0; 
              for (k=0;k<3;k++){
                  s=s+m[i][k]*n[k][j];
              }
               o[i][j]=s; 
             }
           }
         System.out.println("matriz resultado");
         for (i=0;i<3;i++){
           for(j=0;j<3;j++){
               System.out.print(o[i][j]+"\t");
           }
           System.out.println("");
       }
    }
    
}
