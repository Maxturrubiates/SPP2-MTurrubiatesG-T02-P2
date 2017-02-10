/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.t02.p2;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Maximiliano Turrubiates González
        //A01410410
        //IDA
    Scanner Teclado = new Scanner (System.in);
        int valinf, valsup;
        double res;
        
        System.out.println("Porfavor introduzca un numero entero inferior");
        valinf = Teclado.nextInt();
        System.out.println("Porfavor introduzca un numero entero superior");
        valsup = Teclado.nextInt();
        
        do {
            valinf ++;
            
            res = valinf % 2;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 2");
            }
            else {
                System.out.println(valinf + " es divisible entre 2");
            }
            
            res = valinf % 3;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 3");
            }
            else {
                System.out.println(valinf + " es divisible entre 3");
            }
            
            res = valinf % 5;
            if (res > 0 || res < 0){
                System.out.println(valinf + " no es divisible entre 5");
                
            }
            else {
                System.out.println(valinf + " es divisible entre 5");
            }
        }
        while(valinf < valsup);
    }
}