package exercises.technology.test;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop myLaptop;
    @Before
    public void beforeTests(){
        myLaptop = new Laptop("2021", 256, 10, false);
    }

    @Test
    public void constructorSetsValueTest(){
        assertEquals("2021", this.myLaptop.getYear());
        assertEquals(256, this.myLaptop.getStorage());
        assertEquals(10, this.myLaptop.getScreenSize());
        assertEquals(true, this.myLaptop.getUsingBuiltInMouse());
    }
    @Test
    public void wirelessMouseTest() {
        this.myLaptop.setUsingBuiltInMouse(false);
        this.myLaptop.wirelessMouse();
        assertEquals(false, this.myLaptop.getUsingBuiltInMouse());
    }
}
