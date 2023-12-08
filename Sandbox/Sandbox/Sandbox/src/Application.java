import nl.saxion.app.SaxionApp;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
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

            menu();
            char select = SaxionApp.readChar();
            if (select == '2'){
                menu = false;
            } else if (select == '1') {
                SaxionApp.clear();
                board1();
                
            }

        }
    public void menu(){
        String text = "cyberpunk";
        String menu1 = "1.start";
        String menu2 = "2.quit";
        int i = 0;
        int x = 250;

        while (i < text.length()) {
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
        SaxionApp.drawText("1. start", 250,300,50);
        SaxionApp.sleep(0.5);
        SaxionApp.drawText("2. quit", 250,400,50);

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

        while (i < text.length()) {
            SaxionApp.print(String.valueOf(text.charAt(i)));

            try {

                Thread.sleep(SaxionApp.getRandomValueBetween(0, 800));//pause between letterprint

            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            i++;
            x = x + 50;

        }
        SaxionApp.printLine();
        SaxionApp.printLine();
        SaxionApp.printLine();
        SaxionApp.printLine("1. story option a");
        SaxionApp.printLine();
        SaxionApp.printLine("2. story option b");
        char option = SaxionApp.readChar();

        if (option == '1'){
            SaxionApp.clear();
            SaxionApp.printLine("skibidi fortnite");

        }
        else{
            SaxionApp.clear();
            SaxionApp.printLine("fortnite!!!!");
        }

    }
}





