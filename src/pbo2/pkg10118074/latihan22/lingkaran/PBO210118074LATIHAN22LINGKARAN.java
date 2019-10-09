/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan22.lingkaran;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author ASUS
 */
public class PBO210118074LATIHAN22LINGKARAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       System.out.println("======PERHITUNGAN LINGKARAN======");
        System.out.print("Masukkan nilai diameter lingkaran(cm): ");
        String Diameter = input.next();
        
        //validasi
        while(!(Diameter.matches("[0-9]*"))){
            System.out.println("Nilai Diameter tidak sesuai");
            System.out.println("");
            System.out.print("Masukkan nilai diameter lingkaran(cm): ");
            Diameter = input.next();
        }
        System.out.println("");
        System.out.println("-----Hasil Perhitungan Lingkaran------");
        int d = Integer.parseInt(Diameter);
        int jariJari;
        float luasLingkaran , kelilingLingkaran;
        jariJari = d/2;
        luasLingkaran = (int) (3.14*jariJari*jariJari);
        kelilingLingkaran = (int)(2*3.14*jariJari);
        
        System.out.println("Jari - jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luasLingkaran + " cm");
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran + " cm");
        System.out.println("");
        System.out.println("(Developed by Fikri)");
        
       
        
        
        
    }
    
}
