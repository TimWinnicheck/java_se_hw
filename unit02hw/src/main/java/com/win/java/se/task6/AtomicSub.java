package main.java.com.win.java.se.task6;

public class AtomicSub {

    private boolean swimming;
    private Engine engine = new Engine();

    public AtomicSub() {
        this.swimming = false;
    }

    public void StartSwimming() {
        engine.Start();
        if (engine.engineon == true) {
            this.swimming = true;
        }
    }

    public boolean isSwimming() {
        if (this.swimming == true) {
            return true;
        }
        else return false;
    }

    static class Engine {

        private boolean engineon;

        Engine()
        {
            this.engineon = false;
        }

        void Start() {

            this.engineon = true;

        }
    }
}
