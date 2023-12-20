package com.JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class letterGradeTest_main {

    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    @Test
    public void testMainFunction() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("85\n".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        // 執行main
        LetterGrade.main(new String[0]);

        assertEquals("Enter the score = The grade of 85 is B\r\n", out.toString());
    }
    @Test
    public void testNumberFormatExceptionHandling()  {
        ByteArrayInputStream in = new ByteArrayInputStream("abc\n".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(in);
        System.setOut(new PrintStream(out));

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            LetterGrade.main(new String[0]);
        } catch (NumberFormatException ex) {
            assertTrue(out.toString().contains("Not an integer!"));
        }
    }
    @Test
    public void testIOException() {
        System.setIn(new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Fake IOException for testing");
            }
        });
        LetterGrade.main(new String[]{});
    }

}
