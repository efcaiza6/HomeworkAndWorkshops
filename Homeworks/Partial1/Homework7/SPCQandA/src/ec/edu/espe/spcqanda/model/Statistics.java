/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.spcqanda.model;

/**
 *
 * @author Edwin
 */
public class Statistics {
    private float highGrade;
    private float lowGrade;
    private float minimumGrade;
    private float average;

    public Statistics(float highGrade, float lowGrade, float minimumGrade, float average) {
        this.highGrade = highGrade;
        this.lowGrade = lowGrade;
        this.minimumGrade = minimumGrade;
        this.average = average;
    }
    
    public float getHighGrade() {
        return highGrade;
    }

    public void setHighGrade(float highGrade) {
        this.highGrade = highGrade;
    }

    public float getLowGrade() {
        return lowGrade;
    }

    public void setLowGrade(float lowGrade) {
        this.lowGrade = lowGrade;
    }

    public float getMinimumGrade() {
        return minimumGrade;
    }

    public void setMinimumGrade(float minimumGrade) {
        this.minimumGrade = minimumGrade;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
     
}
