import ge.edu.btu.Passenger;

import ge.edu.btu.Train;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StationSquareTest {
    @Test
    public void testing(){

        Passenger nika = new Passenger("ნიკა", true);
        Passenger gio = new Passenger("გიო", false);
        Passenger ana = new Passenger("ანა", false);
        Train train = new Train();
        assertEquals(true,train.addPassanger(nika));
        assertEquals(false,train.addPassanger(gio));
        assertEquals(true,train.addPassanger(ana));
    }
}

