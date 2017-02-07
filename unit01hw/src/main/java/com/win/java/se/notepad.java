package com.win.java.se;


public class notepad {

    note[] pad = new note[1];

    int size = 0;

    private note[] extend(note[] pad) {

        note[] padn = new note[pad.length + 1];
        System.arraycopy(pad,0,padn,0,pad.length);
        return padn;

    }

    public void add(String NoteToAdd){

        if (size >= pad.length)
        {
            pad = extend(pad);
        }

        pad[size] = new note(NoteToAdd);
        size++;
    }

    public void remove(int Number)
    {
        if (Number > size)
        {
            return;
        }
        if (Number <= 0)
        {
            return;
        }
        if (size == 0)
        {
            return;
        }
        if (size == 1)
        {
            pad[0] = new note("");
            size--;
            return;
        }
        if (Number == size)
        {
            size--;
            return;
        }
        int n = Number - 1;

        while (n <= size - 2){
            pad[n] = pad [n+1];
            n++;
        }
        size--;
        return;
    }

    public void list()
    {
        System.out.println("--------------Notepad-----------------");
        if (size == 0)
        {
            System.out.println("Notepad is empty. Try adding new notes using .add method");
        }
        int n=0;
        while (n < size)
        {
            System.out.println("Note# "+(n+1)+": "+ pad[n].content);
            n++;
        }
    }

    public void edit(int Number, String NoteToInsert)
    {
        if ((Number > size) || (Number <= 0))
        {
            return;
        }
        pad[Number-1] = new note(NoteToInsert);
    }

}
