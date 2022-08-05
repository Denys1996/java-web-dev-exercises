package exercises.technology.test;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmarthPhoneTest {

    SmartPhone mySmarthPhone;

    @Before
    public void beforeTest() {
        mySmarthPhone = new SmartPhone(3000, 5000, "2021", true);

    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, this.mySmarthPhone.getScreenHeight());
        assertEquals(5000, this.mySmarthPhone.getScreenWidth());
        assertEquals("2021", this.mySmarthPhone.getManufatureYear());
        assertTrue(this.mySmarthPhone.getIsConnectedTo5G());
    }
}