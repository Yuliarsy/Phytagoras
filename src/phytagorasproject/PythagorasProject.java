/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phytagorasproject;
import java.util.Scanner;
/**
 *
 * @author Yulia Rakhmah
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int inp;
        double a,b,c,d,e,f,x,y;
        System.out.println("---- Program Pythagoras ----");
        System.out.println("1.Cek triple pythagoras");
        System.out.println("2.Menentukan sisi miring segitiga");
        System.out.println("3.Menentukan sisi siku-siku segitiga");
        System.out.println("4.Exit");
        
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Pilih Program (nomer)= ");
        inp = input.nextInt();
        
        switch (inp) {
            case 1:
                program1 r = new program1();
                r.one();
                break;
                
            case 2:
                program2 p = new program2();
                p.two();
                break;
                
            case 3:
                program3 q = new program3();
                q.three();
                break;
                
            case 4:
                System.exit(0);
        }
    }
}