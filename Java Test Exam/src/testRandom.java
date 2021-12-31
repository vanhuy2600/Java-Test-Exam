
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class testRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean v = rand.nextInt(10) == 0;
        System.out.println(v);

        boolean freeProduct = rand.nextInt(2) == 0; // 1/2 = 50%
        System.out.println("c2= " + freeProduct);


    } 
}
