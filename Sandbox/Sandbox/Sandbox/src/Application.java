import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        //menu
        SaxionApp.printLine("1. start");
        SaxionApp.printLine("2. settings");
        SaxionApp.printLine("3.exit");
    }
}





