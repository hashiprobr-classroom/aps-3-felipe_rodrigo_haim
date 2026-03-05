package br.edu.insper.desagil.aps3.vapor;
import java.util.List;

public class Loja {
    private Usuario dono;
    private List<Jogo> jogos;

    public Loja(Usuario dono, List<Jogo> jogos) {
        this.dono = dono;
        this.jogos = jogos;
    }
    public Usuario getDono() {return dono;}


    public int numeroAvaliados(Usuario u){
        String apel = u.getApelido();
        int s = 0;
        for (Jogo j:jogos){
            if (j.avaliado(apel)){
                s++;
            }
        }
        return s;
    }
}
