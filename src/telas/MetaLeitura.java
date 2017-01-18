/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Entidades.Leitura;
import Entidades.OutrasMetas;
import Entidades.Usuario;
import OperacoesBancoSQL.SelecaoBanco;
import acao.TelaMetaLeitura;
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
public class MetaLeitura extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = -214556008825370092L;
	String metaTitulo;

    /**
     * Creates new form MetaLeitura
     */
    public MetaLeitura() {
        initComponents();
        ganharxp.setVisible(false);
        apagarMeta.setVisible(false);
    }
    
    MetaLeitura(String metaNome) throws SQLException {
        initComponents();
        cadastrar.setVisible(false);
        dificuldade.setEditable(false);
        descricao.setEditable(false);
        titulo.setEditable(false);
        painelInfo.setVisible(false);
        metaTitulo = metaNome;

        //Cria conex�o com o Banco de Dados
        ConexaoMySQL conn = ConexaoMySQL.getConexao();
        Connection c = conn.getConexaoMySQL();

        OutrasMetas meta = SelecaoBanco.metasInfo(metaNome, 4, c);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dificuldade = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        painelInfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeLivro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        assuntoLivro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        paginasLidas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dedicacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        apagarMeta = new javax.swing.JButton();
        ganharxp = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        botaoVoltar2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastra Leitura");

        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/menu.png"))); // NOI18N
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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/reading.png"))); // NOI18N
        jLabel2.setText("Leitura");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informa��es gerais"));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel5.setText("T�tulo: *");

        dificuldade.setToolTipText("A dificuldade deve estar entre 0 a 5");

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel6.setText("Descricao: *");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel7.setText("Dificuldade: *");

        jLabel8.setText("Note que a nota refere-se a dificuldade (1 a 5) de voc� alcan�ar a meta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                    .addComponent(titulo)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20))
        );

        painelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informa��es espec�ficas"));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel3.setText("Nome do livro: *");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel4.setText("Assunto do livro: *");

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel11.setText("Planejar p�ginas lidas: *");

        jLabel12.setText("P�ginas lidas por dia");

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel9.setText("Planejar minutos lidos: *");

        jLabel10.setText("minutos por dia");

        javax.swing.GroupLayout painelInfoLayout = new javax.swing.GroupLayout(painelInfo);
        painelInfo.setLayout(painelInfoLayout);
        painelInfoLayout.setHorizontalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addComponent(assuntoLivro)))
                    .addGroup(painelInfoLayout.createSequentialGroup()
                        .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paginasLidas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dedicacao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(0, 282, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelInfoLayout.setVerticalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(assuntoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paginasLidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cadastrar.setText("Cadastrar meta");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        apagarMeta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        apagarMeta.setText("Apagar Meta");
        apagarMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarMetaActionPerformed(evt);
            }
        });

        ganharxp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ganharxp.setText("Meta realizada!");
        ganharxp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ganharxpActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        botaoVoltar2.setText("Cancelar");
        botaoVoltar2.setActionCommand("voltar");
        botaoVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(botaoVoltar2)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoVoltar2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("* Campos obrigat�rios");

        jButton2.setText("Criar/Editar notifica��es");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ganharxp, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(apagarMeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel1)
                                    .addGap(104, 104, 104)
                                    .addComponent(jLabel13))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(painelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ganharxp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apagarMeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // Passa para a tela de Menu
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });

        // Fecha a janela da aplica��o
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if(assuntoLivro.getText().isEmpty() || cadastrar.getText().isEmpty() ||
                dedicacao.getText().isEmpty() || descricao.getText().isEmpty() ||
                dificuldade.getText().isEmpty() || nomeLivro.getText().isEmpty() ||
                paginasLidas.getText().isEmpty() || titulo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos");
        } else if(!dificuldade.getText().matches("^[0-9]*$") || 
                !dedicacao.getText().matches("^[0-9]*$") || 
                    !paginasLidas.getText().matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor n�mero"
                    + " para o campos n�mericos.");            
        } else if(Integer.parseInt(dificuldade.getText()) < 1 || 
                Integer.parseInt(dificuldade.getText()) > 5){
            JOptionPane.showMessageDialog(null, "A dificuldade deve estar entre"
                    + "o intervalo de 1 (Muito f�cil) a 5 (Muito dif�cil).");
        } else {
            Leitura leitura = new Leitura(titulo.getText(), descricao.getText(), 
                    Integer.parseInt(dificuldade.getText()), Integer.parseInt(dedicacao.getText()),
                    nomeLivro.getText(), assuntoLivro.getText(), Integer.parseInt(paginasLidas.getText()));
            
            TelaMetaLeitura tela = new TelaMetaLeitura();
            tela.receberDados(leitura);
            
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
        int dialogButton = 0;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voc� tem certeza que deseja excluir esta meta ?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            TelaOutrasMetas tela = new TelaOutrasMetas();
            tela.ApagarMeta("META_LEITURA", "TITULO", metaTitulo);
            java.awt.EventQueue.invokeLater(() -> {
            new MinhasMetas().setVisible(true);
            });
        }
    }//GEN-LAST:event_apagarMetaActionPerformed

    private void ganharxpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganharxpActionPerformed
     //GANHAR XP
TelaOutrasMetas tela = new TelaOutrasMetas();
        try {
            tela.addXP(metaTitulo, 4,Usuario.getUsuarioAtivo());
        } catch (SQLException ex) {
            Logger.getLogger(MetaLeitura.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MetaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetaLeitura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetaLeitura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarMeta;
    private javax.swing.JTextField assuntoLivro;
    private javax.swing.JButton botaoVoltar2;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField dedicacao;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField dificuldade;
    private javax.swing.JButton ganharxp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField nomeLivro;
    private javax.swing.JTextField paginasLidas;
    private javax.swing.JPanel painelInfo;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
