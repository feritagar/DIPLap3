/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author aferit
 */
public class Startup {
    public static void main(String[] args) {
        // Always perform initialization of worker object first
        
        TipCalculator calc = new BaggageServiceTipCalculator(1,5, ServiceQuality.GOOD);
        
        TipCalculator calc2 = new FoodServiceTipCalculator(100.00, ServiceQuality.GOOD);
        
        TipCalculatorService service = new TipCalculatorService(calc);
        
        //never talk low level object directly
        double tip = service.getCalculateTip();
        System.out.println(tip);
    }
            
           
}
