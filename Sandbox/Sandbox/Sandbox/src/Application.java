import nl.saxion.app.SaxionApp;
import nl.saxion.app.audio.MediaPlayer;

import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        //menu
        boolean menu = true;
        SaxionApp.playSound("Sandbox/Sandbox/Sandbox/src/nightcall2.wav");

        menu();


        char select = SaxionApp.readChar();
        SaxionApp.stopSound("Sandbox/Sandbox/Sandbox/src/nightcall2.wav");
        if (select == '2') {
            menu = false;
        } else if (select == '1') {

            SaxionApp.clear();
            board1();
            char option = SaxionApp.readChar();
            if (option == '1') {
                SaxionApp.clear();

                board2();

            } else {
                SaxionApp.clear();
                board3();

            }

        }
        boolean egg = true;
        while(egg){
            String eastereggs = SaxionApp.readString();
            if (eastereggs.equalsIgnoreCase("edgerunner")){
                SaxionApp.playSound("Sandbox/Sandbox/Sandbox/src/easteregg.wav");
            }else{
                egg = false;
            }

        }
    }

    public void menu() {
        SaxionApp.drawImage("C:\\Users\\Damien\\Documents\\slayergame\\text_adventure\\Sandbox\\Sandbox\\Sandbox\\src\\HD-wallpaper-cyberpunk-city-pixel-art.jpg",0,0,1024,768);
        String text = "cyberpunk";
        String menu1 = "1.start";
        String menu2 = "2.quit";
        int i = 0;
        int x = 250;

        while (i < text.length()) {
            SaxionApp.setTextDrawingColor(SaxionApp.createColor(253,237,10));
            //121,222,209 cyberpunk text blue
            SaxionApp.drawText(String.valueOf(text.charAt(i)), x, 150, 100);

            try {

                Thread.sleep(SaxionApp.getRandomValueBetween(100, 300));//0.5s pause between characters

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            i++;
            x = x + 50;
        }
        SaxionApp.sleep(0.5);
        SaxionApp.drawText("1. start", 250, 300, 50);
        SaxionApp.sleep(0.5);
        SaxionApp.drawText("2. quit", 250, 400, 50);

    }

    public void board1() {
        String text = """
                In the dystopian expanse of Neo-Tokyo, Cipher, a skilled hacker,
                stumbles upon a message revealing GenSyndicate's plot for mass mind control. Pursued by cybernetic enforcers
                led by Razor, Cipher navigates the city's neon-lit chaos. A final confrontation atop a skyscraper exposes
                the conspiracy, triggering a rebellion. The revelation fuels an uprising against GenSyndicate's oppression.
                The corporation crumbles as citizens, armed with the truth, reclaim their freedom. Cipher, a digital ghost,
                retreats into the shadows, leaving behind a city forever changed by the hacker's defiance in the cyberpunk night.""";

        int i = 0;
        int x = 250;
        SaxionApp.print("V:",SaxionApp.createColor(237,109,97));
        while (i < text.length()) {
            SaxionApp.print(String.valueOf(text.charAt(i)),SaxionApp.createColor(121,222,209));

            try {

                Thread.sleep(SaxionApp.getRandomValueBetween(0, 80));//pause between letterprint

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            i++;
            x = x + 50;

        }
        SaxionApp.printLine();
        SaxionApp.printLine();
        SaxionApp.printLine();
        SaxionApp.printLine("1. story option a",SaxionApp.createColor(237,109,97));
        SaxionApp.printLine();
        SaxionApp.printLine("2. story option b",SaxionApp.createColor(237,109,97));
    }
    public void board2() {
        String text = """
                you chose 1! well done""";
        int i = 0;
        int x = 250;

        while (i < text.length()) {
            SaxionApp.print(String.valueOf(text.charAt(i)));

            try {

                Thread.sleep(SaxionApp.getRandomValueBetween(100, 300));//0.5s pause between characters

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            i++;
            x = x + 50;
        }

    }
    public void board3(){
        String text = """
                    you chose 2! well done.
                    """;
        int i = 0;
        int x = 250;

        while (i < text.length()) {
            SaxionApp.print(String.valueOf(text.charAt(i)));

            try {

                Thread.sleep(SaxionApp.getRandomValueBetween(100, 300));//0.5s pause between characters

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            i++;
            x = x + 50;
        }

    }


}