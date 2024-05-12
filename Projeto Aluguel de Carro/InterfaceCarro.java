package aluguel_carro;

import aluguel_carro.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceCarro {
    public static void main(String[] args) {
        // CRIAÇÃO DA JANELA
        JFrame janela = new JFrame("Alugueal de Carro");
        janela.setSize(200,150);
        janela.setResizable(false); // Impede o redimensionamento da janela
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        janela.getContentPane().setLayout( new GridLayout(2,0));

        // PAINEl 1
        JPanel painel1 = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        janela.getContentPane().add(painel1);


        JLabel texto1 = new JLabel(" KM");
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel1.add(texto1, gbc);

        JTextField areatext1 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        painel1.add(areatext1, gbc);

        JLabel texto2 = new JLabel(" Dias");
        gbc.gridx = 0;
        gbc.gridy = 1;
        painel1.add(texto2, gbc);


        JTextField areatext2 = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        painel1.add(areatext2, gbc);


        //PAINEL 2
        JPanel painel2 = new JPanel( new GridBagLayout());
        janela.getContentPane().add(painel2);

        JButton botao = new JButton("Calcular Alugel");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        painel2.add(botao, gbc);

        //AÇÃO DO BOTÃO
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlguelCarro classe = new AlguelCarro();

                double km, dias, valor;

                km = Double.parseDouble(areatext1.getText());
                dias = Double.parseDouble(areatext2.getText());

                valor = classe.calcAluguel(km, dias);

                JOptionPane.showMessageDialog(null, "Valor do Aluguel R$" + valor);
            }
        });


        // VISIBILIDADE DA JANELA
        janela.setVisible(true);
    }
}
