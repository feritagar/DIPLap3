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
public class BartenderServiceTipCalculator1 implements TipCalculator {

    private double amtPerDrink;
    private int drinkCount;

    //to make sure pass in Constructor.
    public BartenderServiceTipCalculator1(double amtPerDrink, int drinkCount) {
        this.amtPerDrink = amtPerDrink;

        this.drinkCount = drinkCount;
    }

    public double getAmtPerDrink() {
        return amtPerDrink;
    }

    public void setAmtPerDrink(double amtPerDrink) {
        this.amtPerDrink = amtPerDrink;
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

    //query method - return something
    //dont pass in the method.
    @Override
    public double getTip() {

        return amtPerDrink * drinkCount;
    }

    @Override
    public ServiceQuality getQ() {
        return ServiceQuality.GOOD;
    }

    @Override
    public void setServiceQuality(ServiceQuality serviceQuality) {

    }

    @Override
    public double getGoodTip() {
        return 0;
    }

    @Override
    public void setGoodTip(double goodTip) {

    }

    @Override
    public double getFairTip() {
        return 0;
    }

    @Override
    public void setFairTip(double fairTip) {

    }

    @Override
    public double getPoorTip() {
        return 0;
    }

    @Override
    public void setPoorTip(double poorTip) {

    }

    public int getBagCount() {
        return 0;
    }

    public void setBagCount(int bagCount) {

    }

}
