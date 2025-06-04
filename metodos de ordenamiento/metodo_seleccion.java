import java.util.Scanner;
public class metodo_seleccion {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int aux,i,j,n=leer.nextInt();
        int v[]=new int [n];
        System.out.println("vector original");
        for (i=0;i<n;i++){
            v[i]=1+(int)(Math.random()*10);
            System.out.print(v[i]+"\t");
        }
        System.out.println("");
        for(i=1;i<n;i++){
            int mayor=v[0];
            int pos=0;
            for(j=1;j<=n-i;j++){
                if(v[j]>mayor){
                    mayor=v[j];
                    pos=j;
                }
            }
            aux=v[n-i];
            v[n-i]=v[pos];
            v[pos]=aux;
        }
         System.out.println("vector ordenada");
        for(i=0;i<n;i++){
            System.out.print(v[i]+"\t");
        }
    }
}
