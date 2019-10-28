/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import mochila.Mochila;
import ordenamiento.AlgoritmoOrdenamiento;
import ordenamiento.Burbuja;
import ordenamiento.Grafica;
import ordenamiento.Herramientas;
import ordenamiento.InsercionDirecta;
import ordenamiento.Manager;
import ordenamiento.MergeSortR;
import ordenamiento.Optimizado;
import ordenamiento.QuickSort;
import pruebasRecursividad.sumarecursiva;
import KnightsTourProblem.ChessBoard;

/**
 *
 * @author abam
 */
public class AnalisisDeAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       // Mochila.generadorInstancias(500, 100, 120);
//        File abre = new File("filename.txt");
//        Mochila m = new Mochila();
//        m.guardarInstancias(abre);
//        System.out.println("");
        
        
//        String[][] matriz = {
//{"0","a","b","c","d","e","f","g","h","i","j"},
//{"a","0","13","33","28","37","7","32","40","80","26"},
//{"b","13","0","39","83","50","68","16","98","81","55"},
//{"c","33","39","0","80","88","49","53","75","63","55"},
//{"d","28","83","80","0","94","4","20","6","59","76"},
//{"e","37","50","88","94","0","81","87","85","4","19"},
//{"f","7","68","49","4","81","0","96","53","40","37"},
//{"g","32","16","53","20","87","96","0","80","57","68"},
//{"h","40","98","75","6","85","53","80","0","65","41"},
//{"i","80","81","63","59","4","40","57","65","0","97"},
//{"j","26","55","55","76","19","37","68","41","97","0"}};
        
//        System.out.println(Arrays.toString(tspGreedy(matriz, "a")));
        
        
//       Burbuja  b = new Burbuja(false);
//       Optimizado  b1 = new Optimizado(false);
//       InsercionDirecta id1 = new InsercionDirecta(false);
//       MergeSortR A = new MergeSortR(false);
//       QuickSort qs = new QuickSort(false);
//        ArrayList<AlgoritmoOrdenamiento> lista = new ArrayList<>();
//        lista.add(b);
//        lista.add(b1);
//        lista.add(id1);
//        lista.add(A);
//        lista.add(qs);
//        
//       
//        Manager m = new Manager(lista);
//        m.ejecutarPrueba(3000,45, 500, true);
//        System.out.println("");        
        //System.out.println(sumarecursiva.sumita(5, 10));
   // double[] actual = { 5, 1, 6, 2, 3, 4 };
    //double[] expected = { 1, 2, 3, 4, 5, 6 };
//    MergeSortR ms = new MergeSortR(false);
//    ms.definirDatos(actual);
//    ms.ordenarDatos();

//        QuickSort qs = new QuickSort(false);
//        double[] actual = { 5, 1, 6, 2, 3, 4 };
//        qs.definirDatos(actual);
//        qs.ordenarDatos();
//        System.out.println(Arrays.toString(actual));
//        System.out.println(qs.getTt()); 
//        serieFibonacci(15);
//        System.out.println("");
//        double ti=0,tf=0;
//        long i=1;
//        while(i<=92){
//            ti=System.currentTimeMillis();
//            System.out.println(Fibonaccies.fiboRecursivo(i));
//            tf=System.currentTimeMillis()-ti;
//            System.out.println("Tiempo de ejecución para fibonacci recursivo con i="+i+": "+tf);
//            ti=System.currentTimeMillis();
//            System.out.println(Fibonaccies.fiboDinamicoRecursivo(i));
//            tf=System.currentTimeMillis()-ti;
//            System.out.println("Tiempo de ejecución para fibonacci recursivo dinámico con i="+i+": "+tf);
//            ti=System.currentTimeMillis();
//            Fibonaccies.fiboRecursivo(i);
//            tf=System.currentTimeMillis()-ti;
//            System.out.println(i+" "+tf);
//            i++;
//        }
//          System.out.println("olv");
        int chessboardsize=20;
        ChessBoard cb;// = new ChessBoard(5);
        for (int i = 0; i < chessboardsize; i++) {
            for (int j = 0; j < chessboardsize; j++) {
                cb = new ChessBoard(chessboardsize);
                cb.SolveProblem(i, j);
                cb.PrintChessBoard();
                System.out.println("------------------------------");                
            }  
        }
        

        
    }
    
    
    public static int Nsumatoria(int n){
        int ret=0;
        for (int i = 1; i <= n; i++) {
            ret+=i;
        }
        return ret;
    }
    
    public static void serieFibonacci(int n){
        if(n!=0){
            int[] array = new int[n];//1
            for (int i = 1; i <= n; i++) {//2 por ciclo
                if(i==1)array[i-1]=1;//1-2
                else if(i==2)array[i-1]=1;//1-2
                else
                {
                    array[i-1]=array[i-2]+array[i-3];//4
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static String[] tspGreedy(String[][] matrix,String inicio){
        String[] caminoCorto= new String[matrix.length];
        int ipos=0,largo=50000000,total=0;
        for (int i = 0; i < matrix.length; i++) {
            if(inicio.equals(matrix[0][i])) ipos =i;
        }
        
        //System.out.println(matrix.length);
        int i,j,jpos=0;
        ArrayList<String> A = new ArrayList();
        for (i = 1; i < matrix.length; i++) {
            
            for (j = 1; j < matrix.length; j++) {
                if(Integer.valueOf(matrix[ipos][j])<largo&&Integer.valueOf(matrix[ipos][j])!=0&&!A.contains(matrix[j][0]))
                {
                    largo=Integer.valueOf(matrix[ipos][j]);
                    jpos=j;   
                }
            }
            //System.out.println(A);
            if(largo!=500000)total+=largo;
            largo=500000;
            if(!A.contains(matrix[ipos][0]))A.add(matrix[ipos][0]);
            caminoCorto[i-1]=matrix[ipos][0];        
            ipos=jpos;   
        }
        caminoCorto[matrix.length-1]=""+total;
        return caminoCorto;
    }
    
}
