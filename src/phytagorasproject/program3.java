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
public class program3 {
    double x,y;
    void three() {
        Scanner sisi = new Scanner(System.in);
        System.out.println("Masukan Sisi A = ");
        x = sisi.nextDouble();
        System.out.println("Masukan Sisi C = ");
        y = sisi.nextDouble();

        HitungSisi sisib = new HitungSisi();
        sisib.a = x;
        sisib.c = y;

        System.out.println("Panjang Sisi Segitiga (B) yg belum diketahui = " + sisib.hitungsisi());
    }
    
}