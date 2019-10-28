/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasRecursividad;

/**
 *
 * @author abam_
 */
public  class sumarecursiva {
    public static int sumita(int a,int b){
        if(b==0)
            return a;
        else
            return sumita(a,b-1)+1;
    }
}
