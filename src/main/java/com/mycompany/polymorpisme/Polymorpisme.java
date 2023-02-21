/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.polymorpisme;

/**
 *
 * @author ASUS
 */
public class Polymorpisme {

    public static void main(String[] args) {
        Hewan hw = new Hewan();
        ayam ay = new ayam();
        Kucing kc = new Kucing();
        Kuda kd = new Kuda();
        
        hw.tampilSuara();
        ay.tampilSuara();
        kc.tampilSuara();
        kd.tampilSuara();
    }
}
