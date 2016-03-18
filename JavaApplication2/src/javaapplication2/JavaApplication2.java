/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author User
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0;
		for(int i = 1; i <1000; i++){
			if((double)Math.sqrt(i) % 1 == 0){
				a++;
			}
		}
		System.out.println(a);
    }
    
}
