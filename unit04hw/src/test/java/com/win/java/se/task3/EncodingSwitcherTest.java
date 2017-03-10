package com.win.java.se.task3;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class EncodingSwitcherTest {

    @Test
    public void Test() throws IOException {
        EncodingSwitcher ES = new EncodingSwitcher("C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/task3in.txt", "C:/Users/Void/Java/Projects/java_se_hw/unit04hw/src/main/resources/task3out.txt");
        ES.switchEncoding();
    }

}