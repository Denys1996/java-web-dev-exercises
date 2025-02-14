package exercises.technology.test;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LaptopTest {

    Laptop myLaptop;

    @Before
    public void beforeTest() {
        myLaptop = new Laptop(3000, 5000, "2021", true);

    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, this.myLaptop.getScreenHeight());
        assertEquals(5000, this.myLaptop.getScreenWidth());
        assertEquals("2021", this.myLaptop.getManufatureYear());
        assertTrue(this.myLaptop.getIsIntelliJOpened());
    }

    @Test
    public void openIntelliJTest() {
        this.myLaptop.setIsIntelliJOpened();
        assertFalse(this.myLaptop.getIsIntelliJOpened());
        this.myLaptop.openIntelliJ();
        assertTrue(this.myLaptop.getIsIntelliJOpened());

    }
}
