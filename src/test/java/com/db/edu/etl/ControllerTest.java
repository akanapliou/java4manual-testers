package com.db.edu.etl;

import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.Object;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

//TODO Refactor to OOP testable design.
public class ControllerTest {
    private Controller sut;


    @Before
    public void setUp() {
        //sut = new Controller();
    }


    @Test
    public void shouldReturnMessageEIS1WhenReceivingEIS1 () {
        //region Given
        String[] testArr = new String[] {"string1", "string2"};

        //endregion

        //region When
        String[] referenceArr = null;//TO FINISH
        Controller.transform(RecordType.EIS1_DATA_FILE, testArr);

        //endregion

        //region Then
        assertEquals("Using EIS1 algorithm", referenceArr);
        //endregion
    }

    @Test
    public void shoulGetAverageWhenTransform() {
        Controller.transform(
                RecordType.EIS1_DATA_FILE,
                new int[] {1,2,3}
        );

        assertEquals(2., Controller.getAverage(), 0.001);
    }


}

