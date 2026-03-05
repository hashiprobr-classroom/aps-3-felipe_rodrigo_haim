package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Comunidade {

    private List<Usuario> membros;

    public Comunidade(List<Usuario> membros) {
        this.membros = membros;
    }

    public void adicionaMembro(Usuario u){
        membros.add(u);
    }
}
