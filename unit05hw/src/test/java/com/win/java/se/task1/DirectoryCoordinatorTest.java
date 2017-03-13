package com.win.java.se.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectoryCoordinatorTest {
    @Test
    public void currentDirTest() throws Exception {

        assertEquals(DirectoryCoordinator.currentDir(), System.getProperty("user.dir"));

    }

    @Test
    public void dirTest() throws Exception {

        DirectoryCoordinator.dir();

    }

    @Test
    public void cdTest() throws Exception, IllegalDirectoryException {

        String startDir = System.getProperty("user.dir");
        DirectoryCoordinator.cd("src");
        assertNotEquals(DirectoryCoordinator.currentDir(), startDir);
        DirectoryCoordinator.cd("..");
        assertEquals(startDir, DirectoryCoordinator.currentDir());

    }

    @Test
    public void touchTest() throws Exception {

        DirectoryCoordinator.touch("test.tst");
        DirectoryCoordinator.dir();
        DirectoryCoordinator.rm("test.tst");

    }

    @Test
    public void rmTest() throws Exception {

        DirectoryCoordinator.touch("test.tst");
        DirectoryCoordinator.dir();
        DirectoryCoordinator.rm("test.tst");
        DirectoryCoordinator.dir();

    }

    @Test
    public void writeTest() throws Exception, IllegalFilenameException {

        DirectoryCoordinator.touch("test.tst");
        DirectoryCoordinator.write("test.tst", "content");
        DirectoryCoordinator.dir();

    }

}