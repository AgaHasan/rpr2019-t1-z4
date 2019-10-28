package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    Artikl a = new Artikl("Stolica", 15, "20");


    @Test
    void getArtikli(){
        ArrayList<Artikl> artikliTest =  new ArrayList<>();
        artikliTest.add(a);
        Korpa korpa = new Korpa(new ArrayList<Artikl>(artikliTest));
        assertEquals(1, korpa.getArtikli().length);
    }

    @Test
    void dodajArtikl(){
        Artikl b = new Artikl("Sto", 100, "21");
        ArrayList<Artikl> artikliTest =  new ArrayList<>();
        artikliTest.add(a);
        Korpa korpa = new Korpa(new ArrayList<Artikl>(artikliTest));

        assertEquals(true, korpa.dodajArtikl(b));
        //assertEquals(korpa.getArtikli().length, 2);
    }

    @Test
    void izbaciArtiklSaKodom(){
        Artikl b = new Artikl("Sto", 100, "21");
        ArrayList<Artikl> artikliTest =  new ArrayList<>();
        artikliTest.add(a);
        artikliTest.add(b);
        Korpa korpa = new Korpa(new ArrayList<Artikl>(artikliTest));

        Artikl izbaci = korpa.izbaciArtiklSaKodom(a.getKod());
        assertEquals(a.getKod(), izbaci.getKod());
        assertEquals( 1, korpa.getArtikli().length);
    }

    @Test
    void dajUkupnuCijenuArtikla(){
        Artikl b = new Artikl("Sto", 100, "21");
        ArrayList<Artikl> artikliTest =  new ArrayList<>();
        artikliTest.add(a);
        artikliTest.add(b);
        Korpa korpa = new Korpa(new ArrayList<Artikl>(artikliTest));
        assertEquals( 115, korpa.dajUkupnuCijenuArtikala());
    }
}