package com.win.java.se.task1;

import com.win.java.se.task1.ByteCodeAnalyzer;
import org.junit.Test;

public class ByteCodeAnalyzerTest {

    @Test
    public void readTest() throws Exception {

        ByteCodeAnalyzer BCA = new ByteCodeAnalyzer("C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/test.txt");
        BCA.read();
        BCA.scan();

    }

}