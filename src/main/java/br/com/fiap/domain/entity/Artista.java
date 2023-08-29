package br.com.fiap.domain.entity;

import java.util.Set;
import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.repository.Repository;

public class Artista {

    private long id;
    private String nome;
    public Artista() {
    }
    public Artista(long id, String nome, Set<Musica> musicas) {
        this.id = id;
        this.nome = nome;

    }

    public Artista(String nome, Object o) {
    }

    public long getId() {
        return id;
    }

    public Artista setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Artista setNome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
