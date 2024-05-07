/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pasta_menu;

import Pasta_Login.cadastrar_Login_VIEW;
import Pasta_cliente.cliente_Cadastrar_VIEW;
import Pasta_estoque.Estoque_consulta_VIEW;
import Pasta_pagamento.view_pagamento;
import Pasta_pedidos.CadastroPedidosView;

/**
 *
 * @author vsant
 */
public class menu_VIEW extends javax.swing.JFrame {

    /**
     * Creates new form menu_VIEW
     */
    public menu_VIEW() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_cadastrar_usuario = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_cardapio = new javax.swing.JButton();
        btn_pedidos = new javax.swing.JButton();
        btn_pagamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Menu");

        btn_cadastrar_usuario.setText("Usuario");
        btn_cadastrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_usuarioActionPerformed(evt);
            }
        });

        btn_cliente.setText("Cliente");
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_cardapio.setText("Cardapio");
        btn_cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cardapioActionPerformed(evt);
            }
        });

        btn_pedidos.setText("Pedidos");
        btn_pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidosActionPerformed(evt);
            }
        });

        btn_pagamento.setText("Pagamento");
        btn_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cadastrar_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_pedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_pagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                .addContainerGap(524, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cadastrar_usuario)
                .addGap(28, 28, 28)
                .addComponent(btn_cliente)
                .addGap(32, 32, 32)
                .addComponent(btn_cardapio)
                .addGap(18, 18, 18)
                .addComponent(btn_pedidos)
                .addGap(18, 18, 18)
                .addComponent(btn_pagamento)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_usuarioActionPerformed
       //Esta chamando a tela cadastrar usuario
       cadastrar_Login_VIEW objCadastrarLogin = new cadastrar_Login_VIEW();
       objCadastrarLogin.setLocationRelativeTo(null);
       objCadastrarLogin.setVisible(true);
       
    }//GEN-LAST:event_btn_cadastrar_usuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
       cliente_Cadastrar_VIEW telacliente_Cadastrar= new cliente_Cadastrar_VIEW();
       telacliente_Cadastrar.setLocationRelativeTo(null);
       telacliente_Cadastrar.setVisible(true);
    
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_cardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cardapioActionPerformed
       Estoque_consulta_VIEW telaEstoque_consulta = new Estoque_consulta_VIEW();
       telaEstoque_consulta.setLocationRelativeTo(null);
       telaEstoque_consulta.setVisible(true);
    
    }//GEN-LAST:event_btn_cardapioActionPerformed

    private void btn_pedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidosActionPerformed
         CadastroPedidosView telaCadastroPedidos = new CadastroPedidosView();
         telaCadastroPedidos.setLocationRelativeTo(null);
         telaCadastroPedidos.setVisible(true);
   
    }//GEN-LAST:event_btn_pedidosActionPerformed

    private void btn_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagamentoActionPerformed
         view_pagamento telaview_pagamento= new view_pagamento();
         telaview_pagamento.setLocationRelativeTo(null);
         telaview_pagamento.setVisible(true);
    
    }//GEN-LAST:event_btn_pagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(menu_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_VIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_VIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar_usuario;
    private javax.swing.JButton btn_cardapio;
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_pagamento;
    private javax.swing.JButton btn_pedidos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
