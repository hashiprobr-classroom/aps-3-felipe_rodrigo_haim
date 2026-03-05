package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    private Loja l;
    private Usuario rodrigo;

    @BeforeEach
    void setUp(){
        List<Jogo> jogos = new ArrayList<>();

        jogos.add(new Jogo(1,"Hollow Knight"));
        jogos.add(new Jogo(2,"Elden Ring"));
        jogos.add(new Jogo(3,"Control"));

        rodrigo = new Usuario("bunis123","Rodrigo");

        l = new Loja(rodrigo, jogos);
    }

    @Test
    void constroi(){
        assertEquals(rodrigo,l.getDono());
        assertEquals(0,l.numeroAvaliados(rodrigo));
    }

}
