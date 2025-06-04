
import java.util.Scanner;
public class gusanitocon_do_while {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrece un numero par");
        int n=leer.nextInt();
        int m [][]=new int [n][n];
        int i,j,g=0;
        i=0;
        do{
            j=0;
            do{
                g++;
                m[i][j]=g;
                g++;
                m[i+1][j]=g;
                g++;
                m[i+1][j+1]=g;
                g++;
                m[i][j+1]=g;
                j=j+2;
            }while (j<n);
            i=i+2;
        } while (i<n);
        i=0;
        do{
            j=0;
            do{
                System.out.print(m[i][j]+"\t"); 
                j=j+1;
            }while (j<n);
            System.out.println("\n");
            i=i+1;
        }while (i<n);
    }
}
