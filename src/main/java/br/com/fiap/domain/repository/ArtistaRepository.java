package br.com.fiap.domain.repository;
import br.com.fiap.domain.entity.Artista;
import java.util.List;

public class ArtistaRepository implements Repository<Artista, Long> {
    List<Artista> artistas;
    @Override
    public List<Artista> findAll() {
        return artistas;
    }
    @Override
    public Artista findById(Long id) {
        return null;
    }
    @Override
    public List<Artista> findByName(String texto) {
        return null;
    }
    @Override
    public Artista persist(Artista artista) {
        return null;
    }
}
