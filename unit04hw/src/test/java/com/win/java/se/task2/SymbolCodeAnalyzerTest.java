package com.win.java.se.task2;

import com.win.java.se.task2.SymbolCodeAnalyzer;
import org.junit.Test;

public class SymbolCodeAnalyzerTest {

    @Test
    public void Test() throws Exception {

        SymbolCodeAnalyzer SCA = new SymbolCodeAnalyzer("C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/test.txt");
        SCA.scan();
        SCA.endTally();

    }

}