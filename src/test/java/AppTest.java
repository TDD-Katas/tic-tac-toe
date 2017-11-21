import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class AppTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void writesTextToSystemOut() {
        System.out.print("hello world");
        assertEquals("hello world", systemOutRule.getLog());
    }

    @Test
    public void X() throws Exception {
        assertThat(1, equalTo(1));
    }
}