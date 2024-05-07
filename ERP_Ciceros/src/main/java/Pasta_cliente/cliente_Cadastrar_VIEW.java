/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pasta_cliente;

import Pasta_Login.usuario_DTO;
import Pasta_pedidos.CadastroPedidosView;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vsant
 */
public class cliente_Cadastrar_VIEW extends javax.swing.JFrame {
    cliente_DTO objDTO = new cliente_DTO();
    cliente_DTO objDTO_Tela_Pedidos = new cliente_DTO();
    String nome_cliente,id_cliente;
    /**
     * Creates new form cliente_Cadastrar
     */
    public cliente_Cadastrar_VIEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCliNome = new javax.swing.JTextField();
        txtCliEndereco = new javax.swing.JTextField();
        txtCliFone = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtCliPesquisar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_pesquisar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        txtCliId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_pedido = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Endereço");

        jLabel3.setText("Telefone");

        jLabel4.setText("Clientes");

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Endereço"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Evento_clicar(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        jLabel5.setText("Telefone");

        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        txtCliId.setEditable(false);
        txtCliId.setEnabled(false);
        txtCliId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliIdActionPerformed(evt);
            }
        });

        jLabel9.setText("ID CLIENTE");

        btn_pedido.setText("Pedido");
        btn_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCliNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_pesquisar)
                                .addGap(24, 24, 24)
                                .addComponent(btn_alterar)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliEndereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_pedido)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addContainerGap(60, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtCliId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btn_pesquisar)
                            .addComponent(btn_alterar)
                            .addComponent(btn_excluir)
                            .addComponent(btn_pedido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        cliente_DTO objDTO = new cliente_DTO();
        cliente_DAO objDAO = new cliente_DAO();
        String nome, endereco, telefone;
        
        nome = txtCliNome.getText();
        endereco = txtCliEndereco.getText();
        telefone = txtCliFone.getText();
        
        objDTO.setNome(nome);
        objDTO.setEndereco(endereco);
        objDTO.setTelefone(telefone);
        
        objDAO.adicionar(objDTO);
        Limpar_Campos();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
            Pesquisar();
            Limpar_Campos();
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
           cliente_DAO objDAO = new cliente_DAO();
           String nome,endereco, telefone;
           int ID;
           ID =Integer.parseInt(txtCliId.getText());
           if(ID == 1){
                JOptionPane.showMessageDialog(null, "O ID número um não pode ser excluido, por fazer parte do controle do sistema.");
           }
           else if(ID > 1){
               objDTO.setChave_Primaria(Integer.parseInt(txtCliId.getText()));
               objDTO.setNome(txtCliNome.getText());
               objDTO.setTelefone(txtCliFone.getText());
               objDTO.setEndereco(txtCliEndereco.getText());
           
               objDAO.Alterar(objDTO);
               Pesquisar();
               Limpar_Campos();
           }
           
           
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void Evento_clicar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Evento_clicar
       String Pegar_ID_da_Tabela, Pegar_Nome_da_Tabela, Pegar_Telefone_da_Tabela, Pegar_Endereco_da_Tabela;
       int Linha_Clicada_Tabela,ID_Convertido_Int;
       
       Linha_Clicada_Tabela = tblClientes.getSelectedRow();
       
       Pegar_ID_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 0).toString());
       Pegar_Nome_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 1).toString());
       Pegar_Telefone_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 2).toString());
       Pegar_Endereco_da_Tabela = (tblClientes.getModel().getValueAt(Linha_Clicada_Tabela, 3).toString());
       
       txtCliId.setText(Pegar_ID_da_Tabela);
       txtCliNome.setText(Pegar_Nome_da_Tabela);
       txtCliFone.setText(Pegar_Telefone_da_Tabela);
       txtCliEndereco.setText(Pegar_Endereco_da_Tabela);
       
       id_cliente=Pegar_ID_da_Tabela;
       nome_cliente=Pegar_Nome_da_Tabela;
       
       objDTO_Tela_Pedidos.setChave_Primaria(Integer.parseInt(id_cliente));
       objDTO_Tela_Pedidos.setNome(nome_cliente);
    }//GEN-LAST:event_Evento_clicar

    private void txtCliIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliIdActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        cliente_DAO objDAO = new cliente_DAO();
        int ID;
        
        ID = Integer.parseInt(txtCliId.getText());
        if(ID == 1){
            JOptionPane.showMessageDialog(null, "O ID número um não pode ser excluido, por fazer parte do controle do sistema.");
        }
        else if(ID > 1){
            objDAO.Excluir(ID);
            Limpar_Campos();
            Pesquisar();
        }
        
        
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidoActionPerformed
            
        CadastroPedidosView telaCadastroPedido = new CadastroPedidosView();
        telaCadastroPedido.setLocationRelativeTo(null);
        telaCadastroPedido.setVisible(true);
     
        telaCadastroPedido.exportarDados_Cliente(objDTO_Tela_Pedidos);
    }//GEN-LAST:event_btn_pedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_Cadastrar_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente_Cadastrar_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pedido;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCliEndereco;
    private javax.swing.JTextField txtCliFone;
    private javax.swing.JTextField txtCliId;
    private javax.swing.JTextField txtCliNome;
    private javax.swing.JTextField txtCliPesquisar;
    // End of variables declaration//GEN-END:variables
    
    public void Limpar_Campos(){
        txtCliId.setText(null);
        txtCliNome.setText(null);
        txtCliEndereco.setText(null);
        txtCliFone.setText(null);
        
    
    }
    
    public void Pesquisar(){
        cliente_DTO objDTO = new cliente_DTO();
        cliente_DAO objDAO = new cliente_DAO();
        String filtro;
        
        filtro = txtCliPesquisar.getText();
        
        DefaultTableModel model = (DefaultTableModel)tblClientes.getModel();
        model.setNumRows(0);
        ArrayList<cliente_DTO> lista_DTO = objDAO.consultar(filtro);
        
         for (int num = 0; num < lista_DTO.size(); num++) {
                model.addRow(new Object[]{
                lista_DTO.get(num).getChave_Primaria(),
                lista_DTO.get(num).getNome(),
                lista_DTO.get(num).getTelefone(),
                lista_DTO.get(num).getEndereco()
                });

            }
    
    }

}

