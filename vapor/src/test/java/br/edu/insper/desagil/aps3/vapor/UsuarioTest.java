package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private Usuario u;

    @BeforeEach
    void setUp(){
        u = new Usuario("Menusoids","Felipe");
    }

    @Test
    void constroi(){
        assertEquals("Menusoids",u.getApelido());
        assertEquals("Felipe",u.getNome());
    }

    @Test
    void mudaNome(){
        u.setNome("Lucas");
        assertEquals("Lucas",u.getNome());
    }

}
