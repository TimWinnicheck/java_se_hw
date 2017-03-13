package com.win.java.se.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        Path targetPath = getPath(targetDirectory);

        if (!Files.exists(targetPath) || !Files.isDirectory(targetPath)) {
            throw new IllegalDirectoryException(targetPath.toString());
        } else {
            currentDirectory = targetPath.toString();
        }

        System.setProperty("user.dir", currentDirectory);

    }

    private static Path getPath(String targetDirectory) {
        Path output;
        if (targetDirectory == "..") {
            output = Paths.get(currentDirectory).getParent();
        } else {
            output = Paths.get(currentDirectory + "/" + targetDirectory);
        }
        return output;
    }

    public static void touch(String targetFilename) throws IOException {

        File fileToCreate = new File(DirectoryCoordinator.currentDir() + "/" + targetFilename);
        fileToCreate.createNewFile();

    }

    public static void rm(String targetFilename) {

        if (Files.exists(Paths.get(DirectoryCoordinator.currentDirectory + "/" + targetFilename)) == true) {
            File fileToDelete = new File(DirectoryCoordinator.currentDir() + "/" + targetFilename);
            fileToDelete.delete();
        }

    }

    public static void write(String targetFilename, String content) throws IOException, IllegalFilenameException {

        if (Files.exists(getPath(targetFilename)) != true) {
            throw new IllegalFilenameException(getPath(targetFilename));
        }
        FileWriter FW = new FileWriter(getPath(targetFilename).toString());
        FW.write(content);
        FW.close();


    }
}
