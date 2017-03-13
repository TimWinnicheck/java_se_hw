package com.win.java.se.task1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCoordinator {

    private static String currentDirectory = System.getProperty("user.dir");

    public static String currentDir() {

        return currentDirectory;

    }

    public static void dir() {

        File mainFile = new File(currentDir());
        File[] mainFileList = mainFile.listFiles();

        for (File temp : mainFileList)
            if (temp.isDirectory())
                System.out.println("/" + temp.getName());
        for (File temp2 : mainFileList) {
            if (temp2.isFile()) {
                System.out.println(temp2.getName());
            }
        }

    }

    public static void cd(String targetDirectory) throws IllegalDirectoryException {

        Path targetPath = setPath(targetDirectory);

        if (!Files.exists(targetPath) || !Files.isDirectory(targetPath)) {
            throw new IllegalDirectoryException(targetPath.toString());
        } else {
            currentDirectory = targetPath.toString();
        }

        System.setProperty("user.dir", currentDirectory);

    }

    private static Path setPath(String targetDirectory) {
        Path output;
        if (targetDirectory == "..") {
            output = Paths.get(currentDirectory).getParent();
        } else {
            output = Paths.get(currentDirectory + "/" + targetDirectory);
        }
        return output;
    }
}
