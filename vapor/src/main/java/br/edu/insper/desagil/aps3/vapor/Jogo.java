package br.edu.insper.desagil.aps3.vapor;

import java.util.HashMap;

public class Jogo {

    private int id;
    private String nome;
    private HashMap<String,Integer> avaliacoes;

    public Jogo(int id, String nome) {
        this.id = id;
        this.nome = nome;
        avaliacoes = new HashMap<>();
    }
    public int getId() {return id;}
    public String getNome() {return nome;}

    public void avalia(String apel, int aval){
        avaliacoes.put(apel,aval);
    }
    public boolean avaliado(String apel){
        return (avaliacoes.containsKey((apel)));
    }

    public double media(){
        double s= 0;
        for (double x:avaliacoes.values()){
            s += x;
        }
        return s/avaliacoes.size();
    }
}
