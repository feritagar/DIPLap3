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
public class FoodServiceTipCalculator implements TipCalculator {

    private double billAmt;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;

    @Override
    public ServiceQuality getQ() {
        return serviceQuality;
    }

    @Override
    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
    
    //to make sure pass in Constructor.
    public FoodServiceTipCalculator(double billAmt, ServiceQuality q) {
        this.billAmt = billAmt;
        this.serviceQuality = serviceQuality;
    }

    //query method - return something
    //dont pass in the method.
    @Override
    public double getTip() {
        double tip = 0;
        switch(serviceQuality){
            case GOOD:
                tip = billAmt* goodTip;
                break;
            case FAIR:
                tip = billAmt * fairTip;
                break;
            case POOR:
                tip = billAmt * poorTip;
                break;
        }
        return tip;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }

    @Override
    public double getGoodTip() {
        return goodTip;
    }

    @Override
    public void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public double getFairTip() {
        return fairTip;
    }

    @Override
    public void setFairTip(double fairTip) {
        this.fairTip = fairTip;
    }

    @Override
    public double getPoorTip() {
        return poorTip;
    }

    @Override
    public void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }

   

}
