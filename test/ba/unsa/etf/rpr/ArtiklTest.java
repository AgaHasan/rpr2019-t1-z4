package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv(){
        Artikl a = new Artikl("Krpa", 15, "15");
        assertEquals("Krpa", a.getNaziv());
    }

    @Test
    void getCijena(){
        Artikl a = new Artikl("Korpa", 2000, "16");
        assertEquals(2000, a.getCijena());
    }

    @Test
    void getKod(){
        Artikl a = new Artikl("Hepek", 13, "12");
        assertEquals("12", a.getKod());
    }


}