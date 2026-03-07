package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    private Loja l;
    private Usuario rodrigo;
    private Usuario felipe;
    private Jogo j1;
    private Jogo j2;
    private Jogo j3;

    @BeforeEach
    void setUp(){
        List<Jogo> jogos = new ArrayList<>();

        j1 = new Jogo(1,"Hollow Knight");
        j2 = new Jogo(2,"Elden Ring");
        j3 = new Jogo(3,"Control");

        jogos.add(j1);
        jogos.add(j2);
        jogos.add(j3);

        rodrigo = new Usuario("bunis123","Rodrigo");
        felipe = new Usuario("Menusoids","Felipe");

        l = new Loja(rodrigo, jogos);
    }

    @Test
    void constroi(){
        assertEquals(rodrigo,l.getDono());
        assertEquals(0,l.numeroAvaliados(rodrigo));
    }

    @Test
    void umUsuarioAvaliaUmJogo(){
        j3.avalia("bunis123",9);
        assertEquals(1,l.numeroAvaliados(rodrigo));
    }

    @Test
    void umUsuarioAvaliaDoisJogos(){
        j2.avalia("bunis123",10);
        j3.avalia("bunis123",9);
        assertEquals(2,l.numeroAvaliados(rodrigo));
    }

    @Test
    void doisUsuariosAvaliamUmJogo(){
        j1.avalia("bunis123",7);
        j1.avalia("Menusoids",10);

        assertEquals(1,l.numeroAvaliados(rodrigo));
        assertEquals(1,l.numeroAvaliados(felipe));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos(){
        j1.avalia("bunis123",7);
        j3.avalia("Menusoids",10);

        assertEquals(1,l.numeroAvaliados(rodrigo));
        assertEquals(1,l.numeroAvaliados(felipe));
    }
}
