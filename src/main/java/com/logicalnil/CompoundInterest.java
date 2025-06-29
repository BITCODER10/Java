package com.logicalnil;

public class CompoundInterest {
    private  double principle;
    private  double rateOfInterest;
    private  int numberOfTimes;
    private int years;

    public CompoundInterest(){

    }

    public CompoundInterest(double principle, double rateOfInterest, int numberOfTimes, int years) {
        this.principle = principle;
        this.rateOfInterest = rateOfInterest/100;
        this.numberOfTimes = numberOfTimes;
        this.years = years;
    }

    public int getYears(){
        return years;
    }

    public int getNumberOfTimes() {
        return numberOfTimes;
    }

    public double getPrinciple() {
        return principle;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setYears(int years){
        this.years = years;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public void setNumberOfTimes(int numberOfTimes) {
        this.numberOfTimes = numberOfTimes;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest/100;
    }

    public double calculateCompundInterest(){
        return principle*
                Math.pow(
                        (1+rateOfInterest/numberOfTimes),(numberOfTimes*years)
                );
    }
}
