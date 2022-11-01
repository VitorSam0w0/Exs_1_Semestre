package A1.A1_Ex_1;

import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

import org.w3c.dom.Text; 

public class Menu extends JFrame {


        int codigo = 1;
    
        ImageIcon icon;
	Image image;

/*//////////// Texto ////////////// */


        JLabel cliente = new JLabel("");
        JLabel produto = new JLabel("");

/*//////////// Janela ////////////// */

        JMenuBar Menu = new JMenuBar();

/*//////////// Menus ////////////// */

        JMenu cadastroCliente = new JMenu("Cadastro de Cliente");
        JMenu cadastroProduto = new JMenu("Cadastro de Produto");
        JMenu Clientes_cadastrados = new JMenu("Clientes Cadastrados");
        JMenu Produtos_cadastrados = new JMenu("Produtos Cadastrados");


/*//////////// Botão Cliente ////////////// */

        JButton cliente1 = new JButton("Cadastrar Cliente");

        
/*//////////// Botão Produto ////////////// */


        JButton produto1 = new JButton("Cadastrar Produto");


/*//////////// Botão Produtos Cadastrados ////////////// */

        JButton PRODUTO1 = new JButton("Produtos");

    


    public Menu() {


/*//////////// Add Janela ////////////// */

        setJMenuBar(Menu);

/*//////////// Add Menus ////////////// */

        Menu.add(cadastroCliente);
        Menu.add(cadastroProduto);
        Menu.add(Clientes_cadastrados);
        Menu.add(Produtos_cadastrados);

/*//////////// Add Itens do Menu Cadastro Cliente ////////////// */

        cadastroCliente.add(cliente1);


/*//////////// Add Itens do Menu Cadastro Produto ////////////// */

        cadastroProduto.add(produto1);


/*//////////// Cadastro de Cliente ////////////// */

        String[] codigo_cliente;
        String[] nome, CPF, RG, telefone, endereço, email, UF, pais, cidade ;

        nome = new String[5];
        CPF = new String[5];
        RG = new String[5];
        telefone = new String[5];
        email = new String[5];
        UF = new String[5];
        pais = new String[5];
        cidade = new String[5];

        

        cliente1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int valor = 1;

                for (int i = 0; i < valor; i++) {

                        nome[i] = JOptionPane.showInputDialog(null, "Digite o Nome Do Cliente" );
                        CPF[i] = JOptionPane.showInputDialog(null, "Digite o CPF do Cliente " + nome[i]);
                        RG[i] = JOptionPane.showInputDialog(null, "Digite o RG do Cliente " + nome[i]);
                        telefone[i] = JOptionPane.showInputDialog(null, "Digite o Numero de Telefone Do Cliente " + nome[i]);
                        email[i] = JOptionPane.showInputDialog(null, "Digite o Email do Cliente " + nome[i]);
                        UF[i] = JOptionPane.showInputDialog(null, "Digite o Estado que o Cliente " + nome[i] + " Reside");
                        pais[i] = JOptionPane.showInputDialog(null, "Digite o País que o Cliente " + nome[i] + " Reside");
                        cidade[i] = JOptionPane.showInputDialog(null, "Digite a Cidade Que o Cliente " + nome[i] + " Reside");
                } 
                

                JButton CLIENTE1 = new JButton(nome[0]);
                Clientes_cadastrados.add(CLIENTE1);

                for (int i = 0; i < 1; i++) {

                        

                }


            /*//////////// CLIENTES ////////////// */

                CLIENTE1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        

                        JOptionPane.showMessageDialog(null,  "Cliente " + nome[0] + "\n CPF: " + CPF[0] + "\n RG: " + RG[0] + "\n Telefone: " + telefone[0] + "\n Email: " + email[0] + "\n Estado: " + UF[0] + "\n País: " + pais[0] + "\n Cidade: " + cidade[0]);


                    }
                });

                    }
                });


/*//////////// Cadastro do Produto ////////////// */

        String[] codigo_produto;
        String[] nome_produto, codigo_de_barras, descricao, lote, validade, valor_custo, valor_venda;

                nome_produto = new String[5];
                codigo_de_barras = new String[5];
                descricao = new String[5];
                lote = new String[5];
                validade = new String[5];
                valor_custo = new String[5];
                valor_venda = new String[5];

                String[] Produtos_get = new String[100];


        produto1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    nome_produto[0] = JOptionPane.showInputDialog(null, "Digite o Nome do Produto");
                    codigo_de_barras[0] = JOptionPane.showInputDialog(null, "Digite o Codigo de Barras Do Produto " + nome_produto[0]);
                    descricao[0] = JOptionPane.showInputDialog(null, "Descrição do Produto " + nome_produto[0]);
                    lote[0] = JOptionPane.showInputDialog(null, "Digite o Lote Do Produto " + nome_produto[0]);
                    validade[0] = JOptionPane.showInputDialog(null, "Digite A validade Do Produto " + nome_produto[0]);
                    valor_custo[0] = JOptionPane.showInputDialog(null, "Digite o Valor de Compra do Produto " + nome_produto[0]);
                    valor_venda[0] = JOptionPane.showInputDialog(null, "Digite o Valor de Venda do Produto " + nome_produto[0]);

                    JButton PRODUTO1 = new JButton(nome_produto[0]);
                    Produtos_cadastrados.add(PRODUTO1);

            
                  /*//////////// PRODUTOS ////////////// */
            
                    PRODUTO1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
            
                            JOptionPane.showMessageDialog(null, "Produto " + nome_produto[0] + "\n Codigo de Barras: " + codigo_de_barras[0] + "\n Descrição: " + descricao[0] + "\n lote: " + lote[0] + "\n Validade: " + validade[0] + "\n Custo de Compra: " + valor_custo[0] + "\n Valor de Venda: " + valor_venda[0]);
                                

                        }
                    });


            }
        });



/*//////////// Configs da Janela ////////////// */

        setTitle("Menu");
        setResizable(false);
        setSize(720, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);

    }

    public static void main (String[] args) {
        new Menu();
    }



    }

