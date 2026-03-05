package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JogoTest {

    private Jogo j;

    @BeforeEach
    void setUp(){
        j = new Jogo(1,"Hollow Knight");
    }

    @Test
    void constroi(){
        assertEquals(1,j.getId());
        assertEquals("Hollow Knight",j.getNome());
    }

    @Test
    void avaliaUmaVez(){
        j.avalia("SilksongHater",3);

        assertTrue(j.avaliado("SilksongHater"));
        assertEquals(3,j.media());
    }

    @Test
    void avaliaDuasVezes(){
        j.avalia("SilksongHater",3);
        j.avalia("Hornet",4);

        assertTrue(j.avaliado("SilksongHater"));
        assertTrue(j.avaliado("Hornet"));

        assertEquals(3.5,j.media());
    }

    @Test
    void avaliaTresVezes(){
        j.avalia("SilksongHater",3);
        j.avalia("Hornet",4);
        j.avalia("SilksongHater",5);

        assertEquals(4.5,j.media());
    }

}
