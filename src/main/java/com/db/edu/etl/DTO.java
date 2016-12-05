package com.db.edu.etl;

/**
 * Created by Java_9 on 05.12.2016.
 */
public class DTO {
    private int[] transformationResult;
    private double average;


    public DTO(int[] transformationResult, double average) {
        this.transformationResult = transformationResult;
        this.average = average;
    }

    public int[] getTransformationResult() {
        return transformationResult;
    }

    public double getAverage() {
        return average;
    }
}




