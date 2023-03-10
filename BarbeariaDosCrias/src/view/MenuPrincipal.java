/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controle.MenuPrincipalControle;

/**
 *
 * @author Brambati
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private final MenuPrincipalControle controle;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.controle = new MenuPrincipalControle(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuTopo = new javax.swing.JMenuBar();
        jMenu1Cadastro = new javax.swing.JMenu();
        jMenuCadastro = new javax.swing.JMenuItem();
        jMenuServiço = new javax.swing.JMenuItem();
        jMenuUsuario = new javax.swing.JMenuItem();
        jMenuOperacao = new javax.swing.JMenu();
        jMenuAgenda = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1064, 664));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Menuprincipal.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(4, 4, 1020, 640);

        jMenu1Cadastro.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1Cadastro.setText("Cadastro");
        jMenu1Cadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/cliente-icon.png"))); // NOI18N
        jMenuCadastro.setText("Cliente");
        jMenu1Cadastro.add(jMenuCadastro);

        jMenuServiço.setIcon(new javax.swing.ImageIcon("C:\\Users\\Brambati\\Pictures\\BarberShop Material\\View\\imagens\\icons\\tesoura-icon.png")); // NOI18N
        jMenuServiço.setText("Serviço");
        jMenu1Cadastro.add(jMenuServiço);

        jMenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/usuario-icon.png"))); // NOI18N
        jMenuUsuario.setText("Usuario");
        jMenu1Cadastro.add(jMenuUsuario);

        jMenuTopo.add(jMenu1Cadastro);

        jMenuOperacao.setText("Operação");
        jMenuOperacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/agenda-icon.png"))); // NOI18N
        jMenuAgenda.setText("Agenda");
        jMenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendaActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuAgenda);

        jMenuTopo.add(jMenuOperacao);

        jMenuRelatorio.setText("Relatório");
        jMenuRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setText("jMenuItem1");
        jMenuRelatorio.add(jMenuItem1);

        jMenuTopo.add(jMenuRelatorio);

        setJMenuBar(jMenuTopo);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendaActionPerformed
        this.controle.navegarParaAgenda();
    }//GEN-LAST:event_jMenuAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1Cadastro;
    private javax.swing.JMenuItem jMenuAgenda;
    private javax.swing.JMenuItem jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuOperacao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem jMenuServiço;
    private javax.swing.JMenuBar jMenuTopo;
    private javax.swing.JMenuItem jMenuUsuario;
    // End of variables declaration//GEN-END:variables
}
