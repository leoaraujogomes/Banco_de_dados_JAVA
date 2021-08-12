/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.sql.SQLException;

/**
 *
 * @author leoar
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form Janela
     */
    public Janela() {
        initComponents();
    }
    
    public Aluno montaAluno()
    {
        Aluno aluno = new Aluno();
        aluno.setRgm(txtRGM.getText());
        aluno.setNome(txtNome.getText());
        aluno.setNota1(Float.parseFloat(txtNota1.getText()));
        aluno.setNota2(Float.parseFloat(txtNota2.getText()));
        return aluno;
    }
    public void limpar(){
        txtRGM.setText("");
        txtNome.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNota1 = new javax.swing.JTextField();
        txtRGM = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnMedia = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");
        getContentPane().setLayout(null);

        jLabel1.setText("RGM:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 40, 16);

        jLabel2.setText("NOTA1:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 50, 16);

        jLabel3.setText("NOME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 50, 16);
        getContentPane().add(txtNota1);
        txtNota1.setBounds(70, 80, 130, 24);
        getContentPane().add(txtRGM);
        txtRGM.setBounds(70, 20, 130, 24);
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 50, 130, 24);

        jLabel4.setText("NOTA2:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 50, 16);
        getContentPane().add(txtNota2);
        txtNota2.setBounds(70, 110, 130, 24);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensagem)
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensagem)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 160, 380, 50);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnMedia.setText("Média");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnMedia))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnSair))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedia)
                    .addComponent(btnSair))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 230, 382, 80);

        setSize(new java.awt.Dimension(416, 363));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
        String resp = "";
        Aluno aluno = montaAluno();
        resp = new AlunoDAO().gravarAluno(aluno);
        if (resp.equals("OK"))
        {
            limpar();
            lblMensagem.setText("Aluno gravado com sucesso");
        }else{
        lblMensagem.setText(resp);
        }
        
        }catch(SQLException ex)
        {
                
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try{
        if (!"".equals(txtRGM.getText()))
        {
        Aluno aluno = new Aluno();
        aluno.setRgm(txtRGM.getText());
        
        String resp = new AlunoDAO().pesquisarAluno(aluno);
        if (resp.equals("OK"))
        {
            txtNome.setText(aluno.getNome());
            txtNota1.setText(String.valueOf(aluno.getNota1()));
            txtNota2.setText(String.valueOf(aluno.getNota2()));
            lblMensagem.setText("Informações exibidas com sucesso!!!");
        }else{
        lblMensagem.setText(resp);
        }
        }
        else
        {
            lblMensagem.setText("Preencha o RGM!!!");
        }
        }catch(SQLException ex)
        {
                
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
        if (!"".equals(txtRGM.getText()) && !"".equals(txtNome.getText()) && !"".equals(txtNota1.getText()) && !"".equals(txtNota2.getText()))
        {
            
        Aluno aluno = new Aluno();
        aluno.setRgm(txtRGM.getText());
        aluno.setNome(txtNome.getText());
        aluno.setNota1(Float.parseFloat(txtNota1.getText()));
        aluno.setNota2(Float.parseFloat(txtNota2.getText()));
        
        String resp = new AlunoDAO().alterarAluno(aluno);
        if (resp.equals("OK"))
        {
            lblMensagem.setText("Informações alteradas com sucesso!!!");
            limpar();
        }else{
        lblMensagem.setText(resp);
        }
        }
        else
        {
            lblMensagem.setText("Preencha as informações!!!");
        }
        }catch(SQLException ex)
        {
                
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
        if (!"".equals(txtRGM.getText()))
        {
            
        Aluno aluno = new Aluno();
        aluno.setRgm(txtRGM.getText());
        String ver = new AlunoDAO().verificaexistenciaAluno(aluno);
        if (ver.equals("OK"))
        {
        String resp = new AlunoDAO().excluirAluno(aluno);
        if (resp.equals("OK"))
        {
            lblMensagem.setText("Aluno excluido com sucesso!!!");
            limpar();
        }else{
        lblMensagem.setText(resp);
        }
        }
        else
        {
            lblMensagem.setText(ver);
        }
        }
        else
        {
            lblMensagem.setText("Preencha o RGM!!!");
        }
        }catch(SQLException ex)
        {
                
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        if (!"".equals(txtNota1.getText()) && !"".equals(txtNota2.getText()))
        {
        float resultado;
        float nota1 = Float.parseFloat(txtNota1.getText());
        float nota2 = Float.parseFloat(txtNota2.getText());
        resultado = (nota1+nota2)/2;
        lblMensagem.setText("A média é: "+ resultado);
        }
        else
        {
            lblMensagem.setText("Preencha as notas corretamente!!!");
        }
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtRGM;
    // End of variables declaration//GEN-END:variables
}