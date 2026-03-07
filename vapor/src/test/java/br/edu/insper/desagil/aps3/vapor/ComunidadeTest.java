package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeTest {

    private Comunidade c;
    private Usuario rodrigo;
    private Usuario felipe;

    @BeforeEach
    void setUp(){

        List<Usuario> membros = new ArrayList<>();

        rodrigo = new Usuario("bunis123","Rodrigo");
        felipe = new Usuario("Menusoids","Felipe");

        c = new Comunidade(membros);
    }

    @Test
    void constroi(){
        assertEquals(List.of(),c.apelidosMembros());
    }

    @Test
    void adicionaUmMembro(){
        c.adicionaMembro(rodrigo);
        assertEquals(List.of("bunis123"),c.apelidosMembros());
    }
    @Test
    void adicionaDoisMembros(){
        c.adicionaMembro(rodrigo);
        c.adicionaMembro(felipe);
        assertEquals(List.of("bunis123","Menusoids"),c.apelidosMembros());
    }

}
