package exercises.technology.test;

import exercises.technology.main.AbstractEntity;
import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    private Computer myComputer;

    @Before
    public void beforeTest() {
        myComputer = new Computer(3000, 5000, "2021");

    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals(5000, this.myComputer.getScreenHeight());
        assertEquals(3000, this.myComputer.getScreenWidth());
        assertEquals("2021", this.myComputer.getManufatureYear());
    }

    @Test
    public void twoPlusTwoReturnsFour() {
        int result = myComputer.processTwoPlusTwo();
        assertEquals(4, result);
    }
}
