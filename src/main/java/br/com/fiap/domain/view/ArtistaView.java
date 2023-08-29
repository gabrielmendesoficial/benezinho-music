package br.com.fiap.domain.view;
import br.com.fiap.domain.entity.Artista;
import javax.swing.*;

public class ArtistaView {
    public Artista form(){
        String nome = null;
        do {
            nome = JOptionPane.showInputDialog("Nome do Artista: ");
        } while (nome == null);
        return new Artista(nome, null);
    }
}