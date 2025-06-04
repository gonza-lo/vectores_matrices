//ordena una matriz de n x n de menor a mayor
//generados aliatoriamente 
import java.util.Scanner;
public class ordenar_matriz_de_menor_a_mayor {

    public static void main(String[] args) {
           Scanner leer=new Scanner(System.in);
       int n,i,j,x,y,t;
        System.out.println("indroduce el tamaño de la matriz");
       n=leer.nextInt();
       int m[][]=new int[n][n];
       for (i=0;i<n;i++){
           for(j=0;j<n;j++){
               m[i][j]=1+(int)(Math.random()*10);
           }
           System.out.println("");
       }
        System.out.println("matriz original");
       for (i=0;i<n;i++){
           for(j=0;j<n;j++){
               System.out.print(m[i][j]+"\t");
           }
           System.out.println("");
       }
       for(i=0;i<n;i++){
           for(j=0;j<n;j++){
               for(x=0;x<n;x++){
                   for(y=0;y<n;y++){
                       if(m[i][j]<m[x][y]){
                           t=m[i][j];
                           m[i][j]=m[x][y];
                           m[x][y]=t;
                       }
                   }
               }
           }
       }
        System.out.println("matriz ordenada ");
       for (i=0;i<n;i++){
           for(j=0;j<n;j++){
               System.out.print(m[i][j]+"\t");
           }
           System.out.println("");
       }
    }
    
}
