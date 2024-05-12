package cadrastro_pessoas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CadastroInterface {
    public static void main(String[] args) {
        Listar listar = new Listar();

        JFrame janela = new JFrame("Cadrastro"); // Criar um objeto ( ou tela)
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Faz com que quando clicar no X o programa fecha
        janela.setSize(250,200); // Tamanho da tela
        janela.setLocationRelativeTo(null); // Faz com que a tela aparece no meio do monitor
        janela.setResizable(false); // Faz com que a tela nao seja redimensionada
        janela.setLayout(null);

        JLabel lblnome = new JLabel("Nome:"); // Criar um objeto (label ou texto)
        lblnome.setBounds(50, 30, 100, 20); // Definir a posição (x, y) e largura e altura (width, height)
        janela.add(lblnome); // Adicionar na tela o label

        JTextField txtnome = new JTextField(); // Criar um objeto (campo de texto)
        txtnome.setBounds(100, 30, 100, 20);
        janela.add(txtnome);


        JLabel lblidade = new JLabel("Idade:");
        lblidade.setBounds(50, 60, 100, 20);
        janela.add(lblidade);

        JTextField txtidade = new JTextField();
        txtidade.setBounds(100, 60, 100, 20);
        janela.add(txtidade);

        JLabel lblsexo = new JLabel("Sexo:");
        lblsexo.setBounds(50, 90, 100, 20);
        janela.add(lblsexo);

        String opcao[] = {" ", "Masculino", "Feminino", "Outros"};
        JComboBox cbsexo = new JComboBox<>(opcao);
        cbsexo.setBounds(100, 90, 100, 20);
        janela.add(cbsexo);

        JButton bttsalvar = new JButton("Salvar"); // Criar um objeto (botão)
        bttsalvar.setBounds(30, 140, 80, 20);
        janela.add(bttsalvar);

        JButton bttlistar = new JButton("Listar");
        bttlistar.setBounds(140, 140, 80, 20);
        janela.add(bttlistar);


        bttsalvar.addActionListener(new ActionListener() { // Criar um evento de quando o botão for clicado
            public void actionPerformed(ActionEvent e) {
                String nome, sexo;
                int idade;
                nome = txtnome.getText();
                idade = Integer.parseInt(txtidade.getText());
                sexo = (String) cbsexo.getSelectedItem();

                CadastroPessoas pessoas = new CadastroPessoas(nome, sexo, idade);
                listar.adicionar(pessoas);

                JOptionPane.showMessageDialog(null, "Dados Salvos!!"); // Criar uma janela de dialogo com uma mensagem

            }
        });

        bttlistar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Listar.TelaListar();
            }
        });


        janela.setVisible(true); // Deixar a tela visivel 
    }

}