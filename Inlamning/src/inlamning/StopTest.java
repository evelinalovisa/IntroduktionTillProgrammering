package inlamning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StopTest {

    @Test
    public void testNoText() {
        Stop stop = new Stop();
        assertEquals(0, stop.getAntalTecken());
        assertEquals(0, stop.getAntalRader());

    }

    @Test
    public void testFleraRaderUtanStop() {
        Stop stop = new Stop();
        stop.laggTillRad("Första raden");
        stop.laggTillRad("Andra raden");

        assertEquals(23, stop.getAntalTecken());
        assertEquals(2, stop.getAntalRader());
    }

    @Test
    public void testRadInnehallandeStop() {
        Stop stop = new Stop();
        stop.laggTillRad("Det här är inte ett stop.");

        assertEquals(23, stop.getAntalTecken()); // 23 tecken i strängen
        assertEquals(1, stop.getAntalRader());   // En rad inlagd
    }
}
