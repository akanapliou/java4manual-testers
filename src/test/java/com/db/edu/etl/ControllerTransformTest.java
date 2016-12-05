package com.db.edu.etl;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Java_9 on 05.12.2016.
 */
public class ControllerTransformTest {
    @Test
    public void shouldGetTransformdedDataAndAverageWhenNonEmptyArray() {

        final DTO transformResult = Controller.transform(
                RecordType.EIS1_DATA_FILE,
                new String[] {"1", "2"}
        );

        
        assertEquals(1.5, transformResult.getAverage(), 0.01);



        //region Then



    }
}
