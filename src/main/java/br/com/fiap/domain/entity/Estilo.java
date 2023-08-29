package br.com.fiap.domain.entity;

public class Estilo {
    private long id;
    private String nome;
    public Estilo() {
    }
    public Estilo(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Estilo(String nome, Object nome1) {
    }

    public long getId() {
        return id;
    }
    public Estilo setId(long id) {
        this.id = id;
        return this;
    }
    public String getNome() {
        return nome;
    }
    public Estilo setNome(String nome) {
        this.nome = nome;
        return this;
    }
    @Override
    public String toString() {
        return "Estilo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
