package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;
import java.util.List;

public class Comunidade {

    private List<Usuario> membros;

    public Comunidade(List<Usuario> membros) {
        this.membros = membros;
    }
    public void adicionaMembro(Usuario u){membros.add(u);}

    public List<String> apelidosMembros(){
        List<String> l = new ArrayList<>();
        for (Usuario u:membros){
            String a = u.getApelido();
            l.add(a);
        }
        return l;
    }
}
