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
public class TipCalculatorService {

    // important to use interface class and its portable.
    private TipCalculator tipCalculator;

    public TipCalculatorService(TipCalculator tipCalculator) {
        //make it final (open /close princ.)
        setTipCalculator(tipCalculator);
    }
    
    
public double getCalculateTip(){
    //component doing this.dont forget to add method to worker object.
    return tipCalculator.getTip();
}
    
    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public final void setTipCalculator(TipCalculator tipCalculator) {
        
        this.tipCalculator = tipCalculator;
    }

}
