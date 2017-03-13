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

    }

    private static void dir() {

        System.out.println(DirectoryExplorer.getCurrentDirectoryList());

    }

}
