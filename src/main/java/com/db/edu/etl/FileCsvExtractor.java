package com.db.edu.etl;

import java.io.IOException;

public class FileCsvExtractor implements Extractor {
    @Override
    public  User[] extract() throws EtlFormatException, IOException {
        if (true) throw new EtlFormatException("Illegal Format");
        return null;
        //return new User[0];
    }
}
