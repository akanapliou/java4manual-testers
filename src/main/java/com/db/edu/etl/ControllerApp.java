package com.db.edu.etl;

//Class for testing

public class ControllerApp {
    public static void main(String[] args) throws EtlException {
        new EtlController(
            new FileCsvExtractor(),
            new Loader[] {new FileXmlLoader(), new FileXmlLoader()}
        ).doEtl();
    }
}


