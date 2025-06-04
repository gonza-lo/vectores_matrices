import java.util.Scanner;
public class metodo_insercion {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      int aux ,i,j,n=leer.nextInt();
      int v[]=new int [n];
      System.out.println("vector original");
        for (i=0;i<n;i++){
            v[i]=1+(int)(Math.random()*10);
            System.out.print(v[i]+"\t");
        }
        for(i=1;i<n;i++){
            aux=v[i];
            for(j=i;j>0&& aux<v[j-1];j--){
                v[j]=v[j-1];
            }
            v[j]=aux;//insercion
        }
        System.out.println("");
        System.out.println("vector ordenado");
        for(i=0;i<n;i++){
            System.out.print(v[i]+"\t");
        }
    }
    
}
