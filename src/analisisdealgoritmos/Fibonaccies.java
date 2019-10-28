/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos;

/**
 *
 * @author abam_
 */
public class Fibonaccies {
    
    //1 2 3 4 5 6 7 8  9  10 11 12 13  14  15  16  17  18
    //0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597
    
    
    public static long fiboRecursivo(long i){
        
        if(i<=0){
            System.out.println("Indice fuera de rango");
            return -1;
        }else if(i==1){
            return 0;
        }else if(i==2||i==3){
            return 1;
        }else{
            return fiboRecursivo(i-1)+fiboRecursivo(i-2);
        }
    }
    
    public static long fiboDinamicoRecursivo(long i){
        if(i<=0){
            System.out.println("Indice fuera de rango");
            return -1;
        } else if(i==1) {
            return 0;
        }else if(i==2||i==3){
            return 1;
        }else{
            long[] array = new long[(int)i];
            array[0]= 0;
            array[1]= 1;
            array[2]= 1;
        return DinRec(array,i-1);
        }
    }

    private static long DinRec(long[] array, long i) {
        //Caso Base
        if(array[(int)i]!=0)return array[(int)i];
        //Caso recursivo
        array[(int)i]=DinRec(array,i-1)+DinRec(array,i-2);
        
        return array[(int)i];
    }
    
}
