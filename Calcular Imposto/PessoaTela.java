package imposto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PessoaTela {
    public static void main(String[] args) {
        // TELA
        JFrame janela = new JFrame("Calcular Imposto");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(250, 250);
        janela.setLayout(null);
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);

        // TEXTOS
        JLabel lblnome = new JLabel("Nome: ");
        lblnome.setBounds(30, 20, 120, 20);
        janela.add(lblnome);

        JLabel lblrenda = new JLabel("Renda: ");
        lblrenda.setBounds(30, 50, 120, 20);
        janela.add(lblrenda);

        JLabel lblbairro = new JLabel("Bairro: ");
        lblbairro.setBounds(30, 80, 120, 20);
        janela.add(lblbairro);

        JLabel lblpessoa =  new JLabel("Pessoa:");
        lblpessoa.setBounds(30, 110, 100, 20);
        janela.add(lblpessoa);

        JLabel lblcpf =  new JLabel("CPF/CNPJ:");
        lblcpf.setBounds(30, 140, 100, 20);
        janela.add(lblcpf);

        JLabel lblimposto = new JLabel("Imposto:");
        lblimposto.setBounds(30, 200, 100, 20);
        janela.add(lblimposto);

        JLabel txtimposto = new JLabel();
        txtimposto.setBounds(100, 200, 100, 20);
        janela.add(txtimposto);

        // CAMPOS DE TEXTOS
        JTextField txtnome = new JTextField();
        txtnome.setBounds(100, 20, 110, 20);
        janela.add(txtnome);

        JTextField txtrenda = new JTextField();
        txtrenda.setBounds(100, 50, 110, 20);
        janela.add(txtrenda);

        JTextField txtcpf = new JTextField();
        txtcpf.setBounds(100, 140, 110, 20);
        janela.add(txtcpf);

        // CAIXA BOX
        String opcao1[] = {"", "ALVORADA", "CENTRO", "RENDEÇÃO", "JAPIM"};
        JComboBox cbbairro = new JComboBox<>(opcao1);
        cbbairro.setBounds(100, 80, 110, 20);
        janela.add(cbbairro);

        String opcao2[] = {"", "Fisica", "Juridica"};
        JComboBox cbpessoa = new JComboBox<>(opcao2);
        cbpessoa.setBounds(100, 110, 110, 20);
        janela.add(cbpessoa);

        // BOTÕES
        JButton bttcalc = new JButton("Calcular");
        bttcalc.setBounds(75, 170, 100, 20);
        janela.add(bttcalc);

        // FUÇÃO DO BOTÃO

        bttcalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n = txtnome.getText();
                int ide = Integer.parseInt(txtcpf.getText());
                double resul, r = Double.parseDouble(txtrenda.getText());
                String b = (String) cbbairro.getSelectedItem();
                Bairro bairro = new Bairro(b);



                String pessoa = (String) cbpessoa.getSelectedItem();
                if (pessoa.equals("Fisica")){
                    PessoaFisica pessoaFisica = new PessoaFisica(n, r, bairro, ide);
                    resul = pessoaFisica.calcImposto();
                } else {
                    PessoaJuridica pessoaJuridica = new PessoaJuridica(n, r, bairro, ide);
                    resul = pessoaJuridica.calcImposto();
                }

                txtimposto.setText("R$" + Double.toString(resul));
            }
        });



        janela.setVisible(true);
    }
}
