/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Entidades.OutrasMetas;
import Entidades.Usuario;
import OperacoesBancoSQL.SelecaoBanco;
import acao.TelaOutrasMetas;
import bancoSQL.ConexaoMySQL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caiqu
 */
public class Outras extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3075768953219025282L;
	String metaTitulo;

    /**
     * Creates new form OutrasMetas
     */
    public Outras() {
        initComponents();
        ganharxp.setVisible(false);
        apagarMeta.setVisible(false);
    }

    Outras(String metaNome) throws SQLException {
        initComponents();
        cadastrar.setVisible(false);
        dificuldade.setEditable(false);
        descricao.setEditable(false);
        titulo.setEditable(false);
        
        metaTitulo = metaNome;

        //Cria conex�o com o Banco de Dados
        ConexaoMySQL conn = ConexaoMySQL.getConexao();
        Connection c = conn.getConexaoMySQL();

        OutrasMetas meta = SelecaoBanco.metasInfo(metaNome, 5, c);
        //Atribui valores aos componentes
        titulo.setText(meta.getTitulo());
        descricao.setText(meta.getDescricao());
        dificuldade.setText(String.valueOf(meta.getDificuldade()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        dificuldade = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        vezesDias = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        botaoVoltar2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        ganharxp = new javax.swing.JButton();
        apagarMeta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Outras metas");

        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/menu.png"))); // NOI18N
        menu.setToolTipText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/goal.png"))); // NOI18N
        jLabel1.setText("Metas e Recompensas");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/others.png"))); // NOI18N
        jLabel2.setText("Outas Metas");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Informa��es gerais"));

        jLabel25.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel25.setText("T�tulo: *");

        dificuldade.setToolTipText("A dificuldade deve estar entre 0 a 5");

        jLabel26.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel26.setText("Descricao: *");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane6.setViewportView(descricao);

        jLabel27.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel27.setText("Dificuldade: *");

        jLabel28.setText("Note que a nota refere-se a dificuldade (1 a 5) de voc� alcan�ar a meta");

        jLabel30.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel30.setText("Dura��o do desafio em dias: *");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(titulo)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vezesDias, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 341, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(vezesDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        botaoVoltar2.setText("Cancelar");
        botaoVoltar2.setActionCommand("voltar");
        botaoVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar2ActionPerformed(evt);
            }
        });

        jButton2.setText("Criar/Editar notifica��es");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(botaoVoltar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(botaoVoltar2)
                .addComponent(jButton2))
        );

        cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cadastrar.setText("Cadastrar meta");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        ganharxp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ganharxp.setText("Meta realizada!");
        ganharxp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganharxpActionPerformed(evt);
            }
        });

        apagarMeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        apagarMeta.setText("Apagar Meta");
        apagarMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarMetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apagarMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ganharxp, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ganharxp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apagarMeta)
                .addGap(12, 12, 12))
        );

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("* Campos obrigat�rios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 152, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(138, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // Passa para a tela de Menu
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });

        // Fecha a janela da aplica��o
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if(titulo.getText().isEmpty() || descricao.getText().isEmpty() || 
                dificuldade.getText().isEmpty() ||
                vezesDias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos");
        } else if(!dificuldade.getText().matches("^[0-9]*$") || !vezesDias.getText().matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor n�mero"
                    + " para o campos n�mericos.");             
        }else if (Integer.parseInt(dificuldade.getText()) < 1 || 
                Integer.parseInt(dificuldade.getText()) > 5){
            JOptionPane.showMessageDialog(null, "A dificuldade deve estar entre"
                    + "o intervalo de 1 (Muito f�cil) a 5 (Muito dif�cil).");
        } else {
            OutrasMetas outrasMetas = new OutrasMetas(titulo.getText(), descricao.getText(),
                Integer.parseInt(dificuldade.getText()), 
                    Integer.parseInt(vezesDias.getText()));
            
            TelaOutrasMetas tela = new TelaOutrasMetas();
            tela.receberDados(outrasMetas);
            
            JOptionPane.showMessageDialog(null, "Meta cadastrada");
            
            // Passa para a tela de Perfil
            java.awt.EventQueue.invokeLater(() -> {
                new Perfil().setVisible(true);
            });

            // Fecha a janela da aplica��o
            this.dispose();            
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void apagarMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarMetaActionPerformed
        //APAGAR

int dialogButton = 0;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voc� tem certeza que deseja excluir esta meta ?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            TelaOutrasMetas tela = new TelaOutrasMetas();
            tela.ApagarMeta("META_OUTROS", "TITULO", metaTitulo);
            java.awt.EventQueue.invokeLater(() -> {
            new MinhasMetas().setVisible(true);
            });
        // Fecha a janela da aplica��o
        this.dispose();
        }    // TODO add your handling code here:        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_apagarMetaActionPerformed

    private void ganharxpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganharxpActionPerformed
        TelaOutrasMetas tela = new TelaOutrasMetas();
        try {
            tela.addXP(metaTitulo, 5, Usuario.getUsuarioAtivo());
        } catch (SQLException ex) {
            Logger.getLogger(Outras.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Passa para a tela de Perfil
        java.awt.EventQueue.invokeLater(() -> {
            new MinhasMetas().setVisible(true);
        });

        this.dispose();

    }//GEN-LAST:event_ganharxpActionPerformed

    private void botaoVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar2ActionPerformed
        // Passa para a tela de Menu
        java.awt.EventQueue.invokeLater(() -> {
            new Perfil().setVisible(true);
        });

        // Fecha a janela da aplica��o
        this.dispose();
    }//GEN-LAST:event_botaoVoltar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Outras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Outras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Outras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Outras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Outras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarMeta;
    private javax.swing.JButton botaoVoltar2;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField dificuldade;
    private javax.swing.JButton ganharxp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton menu;
    private javax.swing.JTextField titulo;
    private javax.swing.JTextField vezesDias;
    // End of variables declaration//GEN-END:variables
}
