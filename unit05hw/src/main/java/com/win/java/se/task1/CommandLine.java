package com.win.java.se.task1;

import java.util.Scanner;

public class CommandLine {

    public static void Start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String currentCommand = scanner.nextLine();

            CommandLine.coordinator(currentCommand);

        }
    }

    private static void coordinator(String currentCommand) {

        String[] splitCommand = currentCommand.split(" ");

        if (splitCommand[0].compareTo("curdir") == 0) {
            curdir();
        } else {
            if (splitCommand[0].compareTo("dir") == 0) {
                dir();
            } else {
                if (splitCommand[0].compareTo("cd") == 0) {
                    cd(splitCommand[1]);
                } else {

                }
            }
        }

    }

    private static void curdir() {

        System.out.println(DirectoryCoordinator.currentDir());

    }

    private static void dir() {

        DirectoryCoordinator.dir();

    }

    private static void cd(String targetDirectory) {

        try {
            DirectoryCoordinator.cd(targetDirectory);
        } catch (IllegalDirectoryException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Start();
    }

}
