package br.com.fiap.domain.view;
import br.com.fiap.domain.entity.Estilo;
import javax.swing.*;

public class EstiloView {
    public Estilo form(){
        String nome = null;
        do {
            nome = JOptionPane.showInputDialog("Nome do Estilo: ");
        } while (nome == null);
        return new Estilo(nome, null);
    }
}

