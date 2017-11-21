import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AppTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    // Metric to optimize: time spent on site

    // What is interesting (business terms) about tic tac toe?
    // Interactive game ! passive (watching movie, codecast)
    // Variation: how different is a game from another
    // TDD Variation: the opponent player (human, human level, AI, other AI, etc)
    // Variation: the different starting point (seed)
    // Metric: Complexity of choice. (choosing between orthogonal, 3D, etc)
    // Keeps players playing
    //

    // Use complexity of choice, how varied the game is

    // We measure any type of interaction with the website (click, submit, type, etc)

    @Test
    public void writesTextToSystemOut() throws IOException {
        int complexity = 0;
        int interactions = 0;

        String newLine = "\r";
        InputStream in = new ByteArrayInputStream(("Adi" + newLine + "y" + newLine + "1" + newLine).getBytes());

        Scanner scanner = new Scanner(in);

        System.out.print("Your name" + newLine);
        String name = scanner.nextLine();
        interactions++; //one input
        complexity++; //one choice
        System.out.print(name + newLine);

        System.out.print("Are you ready to start? (y/n)" + newLine);
        scanner.nextLine();
        interactions++; //one input
        complexity += 2; //number of choices

        System.out.print("Place your token to get a line" + newLine);
        System.out.print("|X| |" + newLine);
        scanner.nextLine();
        interactions++; //one input
        complexity += 2; //number of choices

        System.out.print("|X|X|" + newLine);

        System.out.print("You won!" + newLine);

        String log = systemOutRule.getLog();
        String[] lines = log.split(newLine);
        assertEquals("Your name", lines[0]);
        assertEquals("Adi", lines[1]);
        assertEquals("Are you ready to start? (y/n)", lines[2]);
        assertEquals("Place your token to get a line", lines[3]);
        assertEquals("|X| | (press 0 or 1)", lines[4]);
        assertEquals("|X|X|", lines[5]);
        assertEquals("You won!", lines[6]);
        assertEquals(1 + 1 + 1, interactions);
        assertEquals(1 + 2 + 2, complexity);

        //TODO add a test for various inputs (token at 0, token at wrong number)
        //TODO add a test for losing
    }

    @Test
    public void X() throws Exception {
        assertThat(1, equalTo(1));
    }
}