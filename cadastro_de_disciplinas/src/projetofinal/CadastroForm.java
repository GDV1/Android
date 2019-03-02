/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class CadastroForm extends javax.swing.JFrame {

    /**
     * Creates new form CadastroForm
     */
    public CadastroForm() {
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

        Titulo = new javax.swing.JLabel();
        Disciplina = new javax.swing.JLabel();
        Carga = new javax.swing.JLabel();
        Curso = new javax.swing.JLabel();
        Vagas = new javax.swing.JLabel();
        Período = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        disciplina = new javax.swing.JTextField();
        carga = new javax.swing.JTextField();
        curso = new javax.swing.JTextField();
        vagas = new javax.swing.JTextField();
        período = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Titulo.setText("Cadastro de Disciplinas");

        Disciplina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Disciplina.setText("Disciplina");

        Carga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Carga.setText("Carga Horária");

        Curso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Curso.setText("Curso");

        Vagas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Vagas.setText("Vagas ");

        Período.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Período.setText("Período");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Cancelar.setText("Voltar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaActionPerformed(evt);
            }
        });

        período.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                períodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Carga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Disciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Curso)
                            .addComponent(Vagas)
                            .addComponent(Período))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(disciplina)
                            .addComponent(carga)
                            .addComponent(curso)
                            .addComponent(vagas)
                            .addComponent(período, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carga)
                    .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso)
                    .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vagas)
                    .addComponent(vagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Período)
                    .addComponent(período, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(Cancelar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaActionPerformed
       
    }//GEN-LAST:event_disciplinaActionPerformed

    private void períodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_períodoActionPerformed
       
    }//GEN-LAST:event_períodoActionPerformed

    // Volta a janela anterior
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        new Cadastro().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    // Cadastra as informações recebidas pela interface
    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
         // Verifica se os campos do formulário estão vazios
        if(
                 disciplina.getText().isEmpty() || 
                 carga.getText().isEmpty() || 
                 curso.getText().isEmpty() || 
                 vagas.getText().isEmpty() || 
                 período.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos do formulário.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            try {
                // Insere os dados do formulário no banco de dados
                String cmd = "insert into cadastrodisciplinas (nome, carga_horaria, curso, vagas, período) VALUES ('"+
                        disciplina.getText()+"', "+carga.getText()+", '"+curso.getText()+"', "
                        +vagas.getText()+", '"+período.getText()+"')";
                
                // Estabelece a conexão com o banco de dados 
                Connection con = ConexaoMySQL.getInstance().getConnection();
                con.createStatement().executeUpdate(cmd);
                
                
                JOptionPane.showMessageDialog(rootPane, "Cadastro concluído.", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

         }
        
    }//GEN-LAST:event_CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Carga;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Disciplina;
    private javax.swing.JLabel Período;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Vagas;
    private javax.swing.JTextField carga;
    private javax.swing.JTextField curso;
    private javax.swing.JTextField disciplina;
    private javax.swing.JTextField período;
    private javax.swing.JTextField vagas;
    // End of variables declaration//GEN-END:variables
}