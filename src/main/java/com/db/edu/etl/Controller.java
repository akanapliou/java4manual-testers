package com.db.edu.etl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Math.round;


public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    private static double average;  //automatically initialized to 0.0

    /**
     * EXTRACT class is used for extracting string of arrays from the source files
     * @param recordType - one of the formats, taken from the 'RecordType' enumeration
     * @return array of strings - the extracted data of the certain format
     */
    public static String[] extract(RecordType recordType) {

        return null;
    }


    /**
     * TRANSFORM class is used for converting the extracted array of strings to ... format
     * @param recordType - one of the formats, taken from the 'RecordType' enumeration
     * @param rawDataRecord - array of extracted strings
     * @return array of strings - the parsed and converted array
     */
    public static String[] transform(RecordType recordType, String[] rawDataRecord)   {
        switch (recordType) {
            case EIS1_DATA_FILE:
                System.out.println("Using EIS1 algorithm");
                //return rawDataRecord.split(",");
                return new String[]{"Using EIS1 algorithm"};
                //break;
            case EIS2_DATA_FILE:
                System.out.println("Using EIS2 algorithm");
                //return rawDataRecord.split(";");
                break;
            default:
                System.out.println("Using default algorithm");
                break;
        }
        return null;
    }


    //Overloaded TRANSFORM method
    public static int[] transform(RecordType recordType, int[] rawDataRecord) {
        if (rawDataRecord.length == 0) {
            logger.error("Input array is empty!");
        }

        int sum = 0;

        for( int i : rawDataRecord) {
            sum = sum + i;
        }

        double average = (double)sum / rawDataRecord.length;
        logger.info("Average salary            : {}", average);
        logger.info("Average salary (rounded)  : {}", round(average));
        logger.info("Average salary (truncated): {}", String.format("%4.2f", average));

        return rawDataRecord;
    }

    public static double getAverage() {
        return average;
    }


    /**
     * LOAD class is used for saving data to files of the certain format
     */
    public static void load(String[] structureToSave) {

    }

}