/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro2;

/**
 *
 * @author ASUS
 */
public class fibo {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int sum = 0;
        int even=0;
        while (sum<=2000000){
            sum = first + second;
            first = second;
            second = sum;
            if (sum %2==0){
                even = even + sum;
                
            }
        }
                System.out.println(even);
                
    }
}
