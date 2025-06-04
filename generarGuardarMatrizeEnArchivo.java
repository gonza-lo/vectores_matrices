// ingresamos datos por teclado a una matriz
//intercambia la primera y ultima fila de la matriz
//dicha matriz se guardara en un archivo .txt ne la direccion que indiques

import java.io.*; 
import java.util.*;
public class generarGuardarMatrizeEnArchivo{
static int m[][]=new int [100][100];
static int aux;
static File archivo=new File("d:infor21.txt");

    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
        System.out.println("ingrece la dimencion de la matriz ");
        Scanner leer=new Scanner (System.in);
        int n=leer.nextInt();
        for(int f=0;f<n;f++)
            for(int c=0;c<n;c++)
                m[f][c]=leer.nextInt();
        int i=0;
        for(int c=0;c<n;c++){
            aux=m[i][c];
            m[i][c]=m[n-1][c];
            m[n-1][c]=aux;
        }
        for(int f=0;f<n;f++){
            for(int c=0;c<n;c++)
                bw.write(m[f][c]+"\t");
            bw.newLine();
            
        }
        bw.close();
    }
    
}

