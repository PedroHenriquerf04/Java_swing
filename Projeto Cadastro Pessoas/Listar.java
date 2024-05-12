package cadrastro_pessoas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Listar {
    private static ArrayList<CadastroPessoas> list = new ArrayList<>();

   public void adicionar(CadastroPessoas p){
       list.add(p);

   }

    public ArrayList<CadastroPessoas> getList() {
        return list;
    }

    public void setList(ArrayList<CadastroPessoas> list) {
        this.list = list;
    }

    // TELA
    public static void TelaListar() {
        JFrame janela = new JFrame("Cadrastro"); // Criar um objeto ( ou tela)
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(250,200); // Tamanho da tela
        janela.setLocationRelativeTo(null); // Faz com que a tela aparece no meio do monitor
        janela.setResizable(false); // Faz com que a tela nao seja redimensionada
        janela.setLayout(null);

        String[] colunas = {"NOME", "IDADE", "SEXO"};
        Object[][] dados = list.stream()
                .map(p -> new Object[]{p.getNome(), p.getIdade(), p.getSexo()})
                .toArray(Object[][]::new);
        /*
        * Map é usado para transformar cada objeto CadastroPessoas em um array de Object.
        * ToArray é usado para coletar esses arrays em um único array bidimensional.
        */


        DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
        JTable tabela = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setBounds(25,30,200,150);
        janela.add(scrollPane);

        JButton btvoltar = new JButton("Voltar");
        btvoltar.setBounds(10,0,80,20);
        janela.add(btvoltar);

        btvoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.dispose();
            }
        });

        janela.setVisible(true);
    }
}
