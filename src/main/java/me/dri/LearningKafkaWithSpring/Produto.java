package me.dri.LearningKafkaWithSpring;

import java.io.Serializable;

public class Produto implements Serializable {


    private String nome;
    private Double valor;
    private String dono;

    public Produto() {

    }
    public Produto(String nome, Double valor, String dono) {
        this.nome = nome;
        this.valor = valor;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", dono='" + dono + '\'' +
                '}';
    }
}
