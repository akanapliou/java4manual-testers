package com.db.edu.etl;

public class FileCsvExtractor implements Extractor {
    @Override
    public  User[] extract() {
        if (true) throw new RuntimeException("Illegal Format");
        return null;
        //return new User[0];
    }
}
