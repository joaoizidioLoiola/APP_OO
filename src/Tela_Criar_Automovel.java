/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author cg3023087
 */
public class Tela_Criar_Automovel extends javax.swing.JFrame {
    private String Email_Usuario_Logado;
   
    public Tela_Criar_Automovel() {
        initComponents();
    }
    
    public Tela_Criar_Automovel(String Email_Usuario_Logado) {
        initComponents();
        this.Email_Usuario_Logado = Email_Usuario_Logado;
    }

    public String getEmail_Usuario_Logado() {
        return Email_Usuario_Logado;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastrarA_Button = new javax.swing.JButton();
        Modelo_Field = new javax.swing.JTextField();
        Placa_Field = new javax.swing.JTextField();
        Quilometragem_Field = new javax.swing.JTextField();
        Tela_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastrarA_Button.setBorderPainted(false);
        CadastrarA_Button.setContentAreaFilled(false);
        CadastrarA_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarA_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarA_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CadastrarA_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 370, 110));

        Modelo_Field.setBackground(new java.awt.Color(245, 245, 245));
        Modelo_Field.setDisabledTextColor(new java.awt.Color(245, 245, 245));
        getContentPane().add(Modelo_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 280, 30));

        Placa_Field.setBackground(new java.awt.Color(245, 245, 245));
        getContentPane().add(Placa_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 280, 30));

        Quilometragem_Field.setBackground(new java.awt.Color(245, 245, 245));
        getContentPane().add(Quilometragem_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 280, 30));

        Tela_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/Tela_Cadastro_Add_Carro.jpg"))); // NOI18N
        Tela_Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Tela_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarA_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarA_ButtonActionPerformed
        this.setVisible(false);
        Tela_Listar_Carros t_c_l = new Tela_Listar_Carros();
        t_c_l.setVisible(true);
    }//GEN-LAST:event_CadastrarA_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Criar_Automovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Criar_Automovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Criar_Automovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Criar_Automovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Criar_Automovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarA_Button;
    private javax.swing.JTextField Modelo_Field;
    private javax.swing.JTextField Placa_Field;
    private javax.swing.JTextField Quilometragem_Field;
    private javax.swing.JLabel Tela_Background;
    // End of variables declaration//GEN-END:variables
}
