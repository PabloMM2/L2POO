/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2poo;

/**
 *
 * @author xmpz
 */
public class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int entrada) {
        
        int divisor = 1; 
        int sumatoria = 0;
        String resultado = "";
        
        while(divisor <= entrada) {           
            if (entrada % divisor == 0) {
                sumatoria += divisor;
                
                if(entrada == divisor) {
                   resultado += divisor + "=" + sumatoria; 
                }else {
                   resultado += divisor + "+";      
                }
                
            }                 
            divisor++;
        }
        System.out.println("I implemented: AdvancedArithmetic.");
        System.out.println(sumatoria);
        System.out.println("Explicación:");
        System.out.println(resultado); 
        return sumatoria;
    }
    
}
