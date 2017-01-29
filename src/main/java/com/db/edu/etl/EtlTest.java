package com.db.edu.etl;

public class EtlTest {
    public static void main(String[]args){
        new EtlController(
            new FileCsvExtractor(),
            new Loader[] {}
        ).doEtl();
    }
}