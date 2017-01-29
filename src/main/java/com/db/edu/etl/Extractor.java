package com.db.edu.etl;

import java.io.IOException;

public interface Extractor {
    User[] extract() throws EtlFormatException, IOException;
}
