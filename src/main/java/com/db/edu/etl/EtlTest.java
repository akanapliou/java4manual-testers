package com.db.edu.etl;

public class EtlTest {
    public static void main(String[]args) throws TestFailException {
        try {

            new EtlController(
                    new FileCsvExtractor(),
                    new Loader[]{}
            ).doEtl();
        } catch (EtlException e) {
            return;
        }

        throw new TestFailException();
    }
}