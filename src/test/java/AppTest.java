import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.IOException;
import java.util.Scanner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

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
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.print("Press any key");


        System.out.print("hello world!");

        assertEquals("hello world!", systemOutRule.getLog());
    }

    @Test
    public void X() throws Exception {
        assertThat(1, equalTo(1));
    }
}