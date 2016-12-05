package com.db.edu;

import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.Object;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

//TODO Refactor to OOP testable design.
public class ArrayListTest {
    private ArrayList<String> sut;


    @Before
    public void setUp() {
        sut = new ArrayList<>();
    }


    @Test
    public void shouldSizeIncrementedWhenElementAdd() {
        //region Given
        //ArrayList sut = new ArrayList();          //can accept any objects
        ArrayList<String> sut = new ArrayList<>();  //can accept only string objects
        String dummy = new String();
        //endregion

        //region When
        sut.add(dummy);
        //endregion

        //region Then
        assertEquals(1, sut.size());
        //endregion


    }
}