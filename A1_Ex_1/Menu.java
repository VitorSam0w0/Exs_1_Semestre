package A1_Ex_1;

import java.awt.event.*;

import javax.swing.*; 

public class Menu extends JFrame {

/* ////////////////Janela///////////////////// */

    JMenuBar cadastro = new JMenuBar();

/* ///////////////Cadastros//////////////////// */
    
    JMenu cadastroCliente = new JMenu("Cadastro de Cliente");

    JMenu cadastroPruduto = new JMenu("Cadastro de Produto");

/* ///////////////Cadastrados/////////////////// */

    JMenu clientesCadastrados = new JMenu("Clientes Cadastrados");

    JMenu produtosCadastrados = new JMenu("Produtos Cadastrados");

/* ///////////////Ação Items Do Menu/////////////////// */

    JMenuItem item1 = new JMenuItem("CadastroCliente");


    JMenuItem teste = new JMenuItem("Cliente Cadastrado");

    public Menu() {

        setJMenuBar(cadastro);

        cadastro.add(cadastroCliente);
        cadastro.add(cadastroPruduto);
        cadastro.add(clientesCadastrados);
        cadastro.add(produtosCadastrados);

        cadastroCliente.add(item1);

            item1.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String cliente;
                    cliente = JOptionPane.showInputDialog(rootPane, "Digite O Nome do Cliente");
                }
            });

        clientesCadastrados.add(teste);

        teste.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, item1.getClientProperty(e));
            }
        });

        setTitle("Menu");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setBackground(getForeground());                                       /* veri como colocar gif de wallpeper */
        setResizable(false);


    }
    
}
