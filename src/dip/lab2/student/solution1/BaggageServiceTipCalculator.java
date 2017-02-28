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
public class BaggageServiceTipCalculator implements TipCalculator {

    private double baseRate;
    private int bagCount;
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
    public BaggageServiceTipCalculator(double baseRate,int bagCount, ServiceQuality serviceQuality) {
        this.baseRate = baseRate;
        this.serviceQuality = serviceQuality;
        this.bagCount = bagCount;
    }

    //query method - return something
    //dont pass in the method.
    @Override
    public double getTip() {
        double tip = 0;
        switch(serviceQuality){
            case GOOD:
                tip = baseRate*bagCount* goodTip;
                break;
            case FAIR:
                tip = baseRate *bagCount* fairTip;
                break;
            case POOR:
                tip = baseRate *bagCount* poorTip;
                break;
        }
        return tip;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
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

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

   

}
