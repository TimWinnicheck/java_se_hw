package com.win.java.se.task1;

import java.io.File;

public class DirectoryCoordinator {

    private static String currentDirectory = System.getProperty("user.dir");

    public static String currentDir() {

        return currentDirectory;

    }

    public static void dir() {

        File mainFile = new File(currentDir());
        File[] mainFileList = mainFile.listFiles();

        for (File temp : mainFileList) {
            if (temp.isDirectory()) {
                System.out.println("dir " + temp.getName());
            } else {
                if (temp.isFile()) {
                    System.out.println(temp.getName());
                }
            }
        }

    }
}
