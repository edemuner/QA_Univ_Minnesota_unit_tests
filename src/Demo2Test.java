import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
public class Demo2Test {

    @Test
    public void mainTestInput1(){
        String input = "1\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke
        String[] args = {};
        Demo2.main(args);

        //expected output
        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 1.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 6.283185307179586" + System.getProperty("line.separator");
        consoleOutput += " and the area is 3.141592653589793." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    //radius 3
    @Test
    public void mainTestInput3(){
        String input = "3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke
        String[] args = {};
        Demo2.main(args);

        //expected output
        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 3.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 18.84955592153876" + System.getProperty("line.separator");
        consoleOutput += " and the area is 28.274333882308138." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }


    //radius 0
    @Test
    public void mainTestInput0(){
        String input = "0\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke
        String[] args = {};
        Demo2.main(args);

        //expected output
        String consoleOutput = "Enter the radius: " + System.getProperty("line.separator");
        consoleOutput += "For a circle with radius 0.0," + System.getProperty("line.separator");
        consoleOutput += " the circumference is 0.0" + System.getProperty("line.separator");
        consoleOutput += " and the area is 0.0" + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }


    //radius -1, error
    @Test
    public void mainTestInputMinus1(){
        String input = "-1\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke
        String[] args = {};
        Demo2.main(args);

        //expected output
        String consoleOutput = "Error - You should provide a positive number" + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }


    // radius "abc"
    @Test
    public void mainTestInputAbc(){
        String input = "abc";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke
        String[] args = {};
        Demo2.main(args);

        //expected output
        String consoleOutput = "Error - You should provide a positive number" + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }


}
