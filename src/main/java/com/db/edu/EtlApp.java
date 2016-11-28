package com.db.edu;

import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.Controller.extract;
import static com.db.edu.etl.Controller.transform;
import static com.db.edu.etl.Controller.load;

public class EtlApp {
    private static final Logger logger = LoggerFactory.getLogger(EtlApp.class);
    private EtlApp() {}     //closing EtlApp constructor in order to use only class, not its instances


    public static void main(String... args) {
        logger.debug("Entering main method with args {}", args);

        Controller.transform(
                RecordType.EIS1_DATA_FILE,
                new int[] {1,2,3,4,5,45,100}
                //new int[] {}      //test example for empty array
        );

        /*
        //Variant 1
        for(RecordType currentType : RecordType.values()) {

            final String[] extractResult = Controller.extract(RecordType.EIS1_DATA_FILE);
            final String[] transformResult = Controller.transform(RecordType.EIS1_DATA_FILE, extractResult);
            Controller.load(transformResult);

            //Variant 2. Inline variant
            /*
            load(
                    transform(
                            currentType,
                            extract(currentType)
                    )
            );
            */


        //}
    }
}