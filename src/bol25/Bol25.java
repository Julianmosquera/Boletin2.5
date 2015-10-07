
package bol25;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol25 {
    
    static final int MILLAS=1852;

   
    public static void main(String[] args) {
        
        Scanner obx=new Scanner (System.in);
        System.out.println("Introduzca las millas:");
       float millas=obx.nextFloat();
       
          float metros=millas*MILLAS;
        System.out.println("Metros:="+metros);
  
    
    }
    
}
