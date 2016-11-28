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

        for(RecordType currentType : RecordType.values()) {

            final String[] extractResult = Controller.extract(RecordType.EIS1_DATA_FILE);
            final String[] transformResult = Controller.transform(RecordType.EIS1_DATA_FILE, extractResult);
            Controller.load(transformResult);

            //Inline variant
            /*
            load(
                    transform(
                            currentType,
                            extract(currentType)
                    )
            );
            */


        }
    }
}
