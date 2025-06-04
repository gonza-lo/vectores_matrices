import java.util.Scanner;
public class metodoshell {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i,j,k,n,aux;
        System.out.println("introduzca el tamaño de la matriz");
        n=leer.nextInt();
        int v[]=new int[n];
        for(i=0;i<n;i++){
            v[i]=1+(int)(Math.random()*20);
        }
        System.out.println("vector original");
        for(i=0;i<n;i++){
            System.out.print(v[i]+"\t");
        }
        k=n/2;
        while(k>=1){
            for(i=k;i<n;i++){
                aux=v[i];
                j=i-k;
                while(j>=0&&v[j]>aux){
                    v[j+k]=v[j];
                    j=j-k;
                }
                v[j+k]=aux;
            }
            k=k/2;
        }
        
        System.out.println("");
        System.out.println("vector ordenada");
        
        for(i=0;i<n;i++){
            System.out.print(v[i]+"\t");
        }
    }
    
}
