package exercises.technology.test;

import exercises.technology.main.Laptop;
import exercises.technology.main.Smartphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartphoneTest {

   Smartphone mySmartPhone;
    @Before
    public void beforeTests(){
        mySmartPhone = new Smartphone("2023", 256, 8, true);
    }

    @Test
    public void constructorSetsValueTest(){
        assertEquals("2023", this.mySmartPhone.getYear());
        assertEquals(256, this.mySmartPhone.getStorage());
        assertEquals(8, this.mySmartPhone.getScreenSize());
        assertEquals(true, this.mySmartPhone.getConnectedToWifi());
    }
}
