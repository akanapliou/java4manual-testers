package com.db.edu.etl;

public class EtlController {
    //private Extractor extractor = new FileCsvExtractor();  //creator example
    //private Extractor extractor = ExtractorFactory.create();    //factory example

    private Extractor extractor;
    private Loader[] loaders;

    public EtlController(Extractor extractor, Loader[] loaders) {
        this.extractor = extractor;
        this.loaders = loaders;
    }


    public void doEtl() {
        EtlException etlException = null;
        try {
            final User[] extractedUsers = extractor.extract();
            for (Loader loader : loaders) {
                loader.load(extractedUsers);
            }

        } catch (RuntimeException e) {
            //e.printStackTrace();   //output to console, not used in Prod
            etlException = new EtlException("Etl problem", e);
            //throw new EtlException("Etl problem, don't panic!!!", e, 5);
            throw etlException;
        } catch (Exception e) {

        } finally {
            final RuntimeException runtimeException = new RuntimeException("3");
            if (etlException != null) runtimeException.addSuppressed(etlException);
            throw runtimeException;
        }
    }
}

