package test.etl;

import etl.EtlController;
import etl.User;
import etl.exceptions.*;
import etl.exceptions.extractorexceptions.dataexceptions.DataExtractorException;
import etl.exceptions.extractorexceptions.parseexceptions.ParseException;
import etl.exceptions.loaderexceptions.TargetLoaderException;
import etl.exceptions.loaderexceptions.TransformationLoaderException;
import etl.extractor.Extractor;
import etl.loader.Loader;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.mockito.Mockito.*;

public class EtlControllerTest {

    @Test
    public void shouldDoEtlOperationWhenNoIoProblem() throws EtlException, CsvFormatException, EtlFormatException, ParseException, SQLConnectionException, SQLException, FileGenerateException, IOException, DataExtractorException, TargetLoaderException, TransformationLoaderException {
        //region Given | Fixture
        final Extractor extractorStub = mock(Extractor.class);
        final User[] userDummy = {
                new User(1, "user01"),
                new User(2, "user02")
        };
        when(extractorStub.extract()).thenReturn(userDummy);

        final Loader loaderMock = mock(Loader.class);
        final EtlController etlController = new EtlController(
                extractorStub,
                new Loader[] { loaderMock }
        );
        //endregion

        //region When
        etlController.doEtl();
        //endregion

        //region Then
        verify(loaderMock, times(1)).load(userDummy);
    }



    @Test (expected = EtlException.class)
    public void shouldThrowExceptionWhenIoProblem() throws EtlException, CsvFormatException, EtlFormatException, ParseException, SQLConnectionException, SQLException, FileGenerateException, IOException, DataExtractorException {
        //region Given | Fixture
        final Extractor extractorStub = mock(Extractor.class);
        final User[] userDummy = {
                new User(1, "user01"),
                new User(2, "user02")
        };
        when(extractorStub.extract()).thenThrow(new DataExtractorException());
        //or
        //doThrow(new Exception()).when(mockedObject).methodReturningVoid(any());     //advanced

        final Loader loaderMock = mock(Loader.class);
        final EtlController etlController = new EtlController(
                extractorStub,
                new Loader[] { loaderMock }
        );

        //doThrow(new Exception()).when(etlController).doEtl();     //works somehow
        //endregion

        //region When
        etlController.doEtl();
        //endregion
    }

/*
    @Test (expected = EtlException.class)
    public void shouldThrowEtlExceptionWhenLoadError() throws ExtractorException, EtlException, EtlLoaderException, EtlFormatException, ParseException, DataExtractorException, SQLConnectionException, SQLException, FileGenerateException, IOException {
        //region Given
        final Extractor extractorStub = mock(Extractor.class);
        final User[] userDummy = {
                new User(1, "testName1"),
                new User(2, "testName2")
        };

        when(extractorStub.extract()).thenReturn(userDummy);

        final Loader loaderMock = mock(Loader.class);

//        when(loaderMock.load(any())).thenThrow(new EtlLoaderException());
//        when(loaderMock.load(userDummy)).thenAnswer();
        doThrow(new EtlLoaderException()).when(loaderMock).load(any());

        EtlController etlController = new EtlController(
                extractorStub,
                new Loader[] {loaderMock}
        );
        //endregion Given

        //region When
        etlController.doEtl();
        //endregion When

    }
*/
}