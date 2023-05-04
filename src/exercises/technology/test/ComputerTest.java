package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    @Test
    public void constructorSetsValueTest(){
        Computer myComputer = new Computer("2021", 256, 15);
        assertEquals("2021", myComputer.getYear());
        assertEquals(256, myComputer.getStorage());
        assertEquals(15, myComputer.getScreenSize());
    }

    @Test
    public void addNumbersTest(){
        Computer myComputer = new Computer("2021", 256, 15);
        int result = myComputer.addNumbers();
        assertEquals(2, result);
    }
}
