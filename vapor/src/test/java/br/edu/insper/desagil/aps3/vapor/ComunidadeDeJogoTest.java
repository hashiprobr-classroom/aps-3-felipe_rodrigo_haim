package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComunidadeDeJogoTest {

    private ComunidadeDeJogo cj;
    private Usuario rodrigo;
    private Usuario felipe;
    private Jogo j;

    @BeforeEach
    void setUp(){

        j = new Jogo(1,"Overwatch");
        rodrigo = new Usuario("bunis123","Rodrigo");
        felipe = new Usuario("Menusoids","Felipe");

        List<Usuario> membros = new ArrayList<>();

        cj = new ComunidadeDeJogo(membros,j);
    }

    @Test
    void adicionaDoisInvalidos(){
        cj.adicionaMembro(felipe);
        cj.adicionaMembro(rodrigo);
        assertEquals(List.of(),cj.apelidosMembros());
    }

    @Test
    void adicionaUmInvalidoUmValido(){
        j.avalia("Menusoids",8);
        cj.adicionaMembro(felipe);
        cj.adicionaMembro(rodrigo);
        assertEquals(List.of("Menusoids"),cj.apelidosMembros());
    }

    @Test
    void adicionaDoisValidos(){
        j.avalia("Menusoids",8);
        cj.adicionaMembro(felipe);

        j.avalia("bunis123",7);
        cj.adicionaMembro(rodrigo);
        assertEquals(List.of("Menusoids","bunis123"),cj.apelidosMembros());
    }

}
