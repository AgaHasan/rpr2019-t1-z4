package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Artikl a = new Artikl("Stolica", 15, "20");

    @Test
    void izbaciArtiklSaKodom(){
        Artikl b = new Artikl("Sto", 100, "21");
        ArrayList<Artikl> artikliTest =  new ArrayList<>();
        artikliTest.add(a);
        artikliTest.add(b);
        Supermarket market = new Supermarket(new ArrayList<Artikl>(artikliTest));

        Artikl izbaci = market.izbaciArtiklSaKodom(a.getKod());
        assertEquals(a.getKod(), izbaci.getKod());
        assertEquals( 1, market.getArtikli().length);
    }

    @Test
    void dodajArtikl(){
        Artikl b = new Artikl("Sto", 100, "21");
        ArrayList<Artikl> artikliTest =  new ArrayList<>();
        artikliTest.add(a);
        Supermarket supermarket = new Supermarket(new ArrayList<Artikl>(artikliTest));
        supermarket.dodajArtikl(b);
        assertEquals(2, supermarket.getArtikli().length);
        //assertEquals(korpa.getArtikli().length, 2);
    }

}