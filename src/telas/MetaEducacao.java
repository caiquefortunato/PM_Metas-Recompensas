package telas;

import Entidades.Educacao;
import Entidades.OutrasMetas;
import Entidades.Usuario;
import OperacoesBancoSQL.SelecaoBanco;
import acao.TelaMetaEducacao;
import acao.TelaOutrasMetas;
import bancoSQL.ConexaoMySQL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class MetaEducacao extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2551893562403612602L;
	String metaTitulo;

    public MetaEducacao() {
        initComponents();
        ganharxp.setVisible(false);
        apagarMeta.setVisible(false);
    }

    public MetaEducacao(String metaNome) throws SQLException {
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

        OutrasMetas meta = SelecaoBanco.metasInfo(metaNome, 2, c);
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

        jPanel6 = new javax.swing.JPanel();
        botaoVoltar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dificuldade = new javax.swing.JTextField();
        painelInfo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        disciplina = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dedicacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cadastrar = new javax.swing.JButton();
        ganharxp = new javax.swing.JButton();
        apagarMeta = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        botaoVoltar3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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
                .addContainerGap(698, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoVoltar2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar meta educa��o");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/reading.png"))); // NOI18N
        jLabel3.setText("Educa��o");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informa��es gerais"));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel5.setText("T�tulo: *");

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel6.setText("Descricao: *");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        jLabel7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel7.setText("Dificuldade: *");

        jLabel8.setText("Note que a nota refere-se a dificuldade (1 a 5) de voc� alcan�ar a meta");

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N

        dificuldade.setToolTipText("A dificuldade deve estar entre 0 a 5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(dificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel11))
        );

        painelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informa��es espec�ficas"));

        jLabel13.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel13.setText("Nome do tema/disciplina: *");

        jLabel9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel9.setText("Dedica��o: *");

        jLabel10.setText("minutos por dia");

        javax.swing.GroupLayout painelInfoLayout = new javax.swing.GroupLayout(painelInfo);
        painelInfo.setLayout(painelInfoLayout);
        painelInfoLayout.setHorizontalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disciplina)
                    .addGroup(painelInfoLayout.createSequentialGroup()
                        .addComponent(dedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelInfoLayout.setVerticalGroup(
            painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfoLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ganharxp, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apagarMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ganharxp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(apagarMeta)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        botaoVoltar3.setText("Cancelar");
        botaoVoltar3.setActionCommand("voltar");
        botaoVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(botaoVoltar3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoVoltar3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("* Todos os campos s�o obrigat�rios");

        jButton2.setText("Criar/Editar notifica��es");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(407, 407, 407)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // TODO add your handling code here:

        if (dedicacao.getText().isEmpty() || descricao.getText().isEmpty()
                || disciplina.getText().isEmpty() || titulo.getText().isEmpty()
                || dificuldade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos");
        }else if(!dificuldade.getText().matches("^[0-9]*$") || !dedicacao.getText().matches("^[0-9]*$")) { 
            JOptionPane.showMessageDialog(null, "Por favor, digite um valor n�mero"
                    + " para o campos n�mericos.");       
        }else if (Integer.parseInt(dificuldade.getText()) < 1
                || Integer.parseInt(dificuldade.getText()) > 5) {
            JOptionPane.showMessageDialog(null, "A dificuldade deve estar entre"
                    + "o intervalo de 1 (Muito f�cil) a 5 (Muito dif�cil).");
        }else {
            Educacao edu = new Educacao(titulo.getText(), descricao.getText(),
                    Integer.parseInt(dificuldade.getText()), disciplina.getText(),
                    Integer.parseInt(dedicacao.getText()));

            TelaMetaEducacao tela;
            tela = new TelaMetaEducacao();
            tela.receberDados(edu);
            
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
            tela.ApagarMeta("META_EDUCACAO", "TITULO", metaTitulo);
            java.awt.EventQueue.invokeLater(() -> {
            new MinhasMetas().setVisible(true);
            });
        // Fecha a janela da aplica��o
        this.dispose();
        }
    }//GEN-LAST:event_apagarMetaActionPerformed

    private void ganharxpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ganharxpActionPerformed
        //GANHAR XP
        TelaOutrasMetas tela = new TelaOutrasMetas();
        try {
            tela.addXP(metaTitulo, 2, Usuario.getUsuarioAtivo());
        } catch (SQLException ex) {
            Logger.getLogger(MetaEducacao.class.getName()).log(Level.SEVERE, null, ex);
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

    private void botaoVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar3ActionPerformed
        // Passa para a tela de Menu
        java.awt.EventQueue.invokeLater(() -> {
            new Perfil().setVisible(true);
        });

        // Fecha a janela da aplica��o
        this.dispose();
    }//GEN-LAST:event_botaoVoltar3ActionPerformed

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
            java.util.logging.Logger.getLogger(MetaEducacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetaEducacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetaEducacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetaEducacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetaEducacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagarMeta;
    private javax.swing.JButton botaoVoltar2;
    private javax.swing.JButton botaoVoltar3;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField dedicacao;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField dificuldade;
    private javax.swing.JTextField disciplina;
    private javax.swing.JButton ganharxp;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menu;
    private javax.swing.JPanel painelInfo;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
