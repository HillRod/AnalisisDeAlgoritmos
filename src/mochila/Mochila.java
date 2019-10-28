/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author abam_
 */
public class Mochila {
    
    public ArrayList<Item> arraylist;

    public Mochila() {
        arraylist = new ArrayList<>();
    }
    
    
    
    public void guardarInstancias(File A) throws FileNotFoundException, IOException{
        
        FileReader reader = new FileReader(A);
        BufferedReader br = new BufferedReader(reader);
        String aux;
        StringTokenizer st;
        while((aux=br.readLine())!=null){
            //System.out.println(aux);
            st = new StringTokenizer(aux);
            
            String[] arraystring = {"0","0"};//aux.split(",");
            System.out.println(arraystring[0]+" "+arraystring[1]);
            arraylist.add(new Item(Integer.getInteger(arraystring[0]), Integer.getInteger(arraystring[1])));
            //System.out.println("");
        }
        System.out.println("");
    }

public static void generadorInstancias(int rP,int rG,int n) throws FileNotFoundException{
    
    String file="";
    Random rand = new Random();
    for (int i = 0; i < n; i++) {;
        file +=rand.nextInt(rP)+","+rand.nextInt(rG)+"\n";
    }
//    System.out.println(file);
    try (PrintWriter out = new PrintWriter("filename.txt")) {
    out.println(file);
}
    
}

    
}
