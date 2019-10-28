/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author abam_
 */
public class QuickSort  implements AlgoritmoOrdenamiento,Runnable{

    private double[] array;
    private double tt,number;
    private boolean thread;

    public QuickSort(boolean thread) {
        this.thread = thread;
    }
    
    
    
    @Override
    public void definirDatos(double[] arreglo) {
        this.array=arreglo;
    }

    @Override
    public void ordenarDatos() {
        if (this.thread){
             Thread hilo = new Thread(this);
             hilo.start();
         
         }else{
             run();
         }
    }

    @Override
    public double getTt() {
        return this.tt;
    }

    @Override
    public void run() {
        double ti = System.currentTimeMillis();
        this.sort(array);
        double tf = System.currentTimeMillis();
        this.tt = tf - ti;
    }
    

    public void sort(double[] values) {
        if (values ==null || values.length==0){
            return;
        }
        this.array = values;
        number = values.length;
        quicksort(0, (int)number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        double pivot = array[low + (high-low)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
