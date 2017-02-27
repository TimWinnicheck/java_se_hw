package main.java.com.win.java.se.task7;

public class AtomicSub {

    @Annot (Comment = "Base Fields")
    private boolean swimming;
    private Engine engine = new Engine();

    @Annot(Comment = "Constructor for AtomicSub. Makes sure that the default param for swimming is false")
    public AtomicSub() {
        this.swimming = false;
    }

    @Annot(Comment = "Method that starts the engine and makes the AtomicSub swim")
    public void StartSwimming() {
        engine.Start();
        if (engine.engineon == true) {
            this.swimming = true;
        }
    }

    @Annot(Comment = "Method that checks whether or not the sub is swimming right now")
    public boolean isSwimming() {
        if (this.swimming == true) {
            return true;
        }
        else return false;
    }

    @Annot(Comment = "Inner class which represents the engine for the sub")
    static class Engine {

        private boolean engineon;

        @Annot(Comment = "Constructor of the inner class")
        Engine()
        {
            this.engineon = false;
        }

        @Annot(Comment = "Method that starts the engine")
        void Start() {

            this.engineon = true;

        }
    }
}
