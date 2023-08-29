package br.com.fiap.domain.view;
import br.com.fiap.domain.entity.Musica;
import javax.swing.*;

public class MusicaView {
    public Musica form(){
        String nome = null;
        do {
            nome = JOptionPane.showInputDialog("Nome da Musica: ");
        } while (nome == null);
        return new Musica(nome, null);
    }
}
