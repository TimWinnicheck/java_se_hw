package com.win.java.se.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ByteCodeAnalyzer {

    String path;
    String[] keywords = {"abstract","continue","for", "new", "switch"
            "assert","default","goto", "package", "synchronized" +
            "boolean \tdo \tif \tprivate \tthis\n" +
            "break \tdouble \timplements \tprotected \tthrow\n" +
            "byte \telse \timport \tpublic \tthrows\n" +
            "case \tenum**** \tinstanceof \treturn \ttransient\n" +
            "catch \textends \tint \tshort \ttry\n" +
            "char \tfinal \tinterface \tstatic \tvoid\n" +
            "class \tfinally \tlong \tstrictfp** \tvolatile\n" +
            "const* \tfloat \tnative \tsuper \twhile"}

    ByteCodeAnalyzer(String path){
        this.path = path;
    }

    public void read() throws IOException {
        FileInputStream FileIN = null;
        FileIN = new FileInputStream(this.path);
        int avail = FileIN.available();
        byte[] out = new byte[FileIN.available()];
        FileIN.read(out,0,FileIN.available());
        int i=0;
        while (i<avail) {
            System.out.print((char)out[i]);
            i++;
        }
    }

    public void scan() throws FileNotFoundException {
        FileInputStream FileIN = null;
        FileIN = new FileInputStream(this.path);
        Scanner scanner = new Scanner(FileIN);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }

    private boolean checkForKeyword(String stringToCheck) {

    }
}
