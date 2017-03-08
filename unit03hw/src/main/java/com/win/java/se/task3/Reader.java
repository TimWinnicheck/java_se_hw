package com.win.java.se.task3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {

    private String pathname;
    private FileInputStream FIStream;


    public Reader(String pathname) throws FileNotFoundException{
        File file = new File(pathname);
        this.pathname = pathname;
        if (!file.exists() && file.isDirectory()) throw new FileNotFoundException();
    }

    public String toReadable() throws IOException{

        this.FIStream = new FileInputStream(pathname);
        InputStreamReader ISReader = new InputStreamReader(this.FIStream,"Cp1251");
        StringBuilder SBOut = new StringBuilder();
        int current = ISReader.read();

        while (current != -1){
            SBOut.append((char)current);
            current = ISReader.read();
        }

        FIStream.close();
        return SBOut.toString();

    }

    public String[] splitter(String text) {
        return text.toString().split("\n");
    }

    public void stringsOut(String[] strings){
        int i = 0;
        while (i < strings.length){
            System.out.println(strings[i]);
            i++;
        }
    }

    public String findPictures (String text){
        Pattern PSentence = Pattern.compile("[А-ЯA-Z].+[.!;?]");
        Matcher MSentence = PSentence.matcher(text);

        Pattern PPicture = Pattern.compile("(\\(Рис\\. \\d\\))+");
        Matcher MPicture = PPicture.matcher(text);

        StringBuilder SBOut = new StringBuilder();

        while (MSentence.find() != false){
            MPicture = PPicture.matcher(MSentence.group());
            if (MPicture.find() == true){
                SBOut.append(MSentence.group() + "\n");
            }
        }

        return SBOut.toString();
    }

}

