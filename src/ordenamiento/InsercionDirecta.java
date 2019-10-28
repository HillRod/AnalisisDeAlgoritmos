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
public class InsercionDirecta implements AlgoritmoOrdenamiento,Runnable{
    
    private double[] arreglo;
    private double tt;
    private boolean thread;

    public InsercionDirecta() {
        this.thread = false;
        this.arreglo = null;
    }
    
    public InsercionDirecta(boolean thread) {
        this.thread = thread;
        this.arreglo = null;
    }
    
    
    
    
    @Override
    public void definirDatos(double[] arreglo) {
        this.arreglo = arreglo;
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
        return tt;
    }

    @Override
    public void run() {
          //Tiempo de inicio
        double ti = System.currentTimeMillis();
        //Algoritmo
        for (int i = 1; i < arreglo.length; i++) {
            double k = arreglo[i];
            int ind = i-1;
            while((ind>-1) && (arreglo[ind]>k)){
                arreglo[ind+1]=arreglo[ind];
                ind--;
            }
            arreglo[ind+1]=k;
        }
        tt=System.currentTimeMillis()-ti;
    }
    
    
    
}
