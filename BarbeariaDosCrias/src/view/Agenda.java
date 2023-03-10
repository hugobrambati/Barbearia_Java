/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controle.AgendaControle;
import javax.swing.JTable;

/**
 *
 * @author Brambati
 */
public class Agenda extends javax.swing.JFrame {
    private final AgendaControle controle;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controle = new AgendaControle(this);
        iniciar();
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
        Txtobservação = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        agenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        JLabelCliente = new javax.swing.JLabel();
        cliente = new javax.swing.JComboBox();
        jLabelServiço = new javax.swing.JLabel();
        servico = new javax.swing.JComboBox();
        jLabelValor = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabelData1 = new javax.swing.JLabel();
        valor2 = new javax.swing.JTextField();
        AgendaPrincipal = new javax.swing.JLabel();
        FundoAgenda = new javax.swing.JLabel();
        PainelAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 1140, 260));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txtobservação.setViewportView(jTextArea1);

        getContentPane().add(Txtobservação, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 520, 240));

        agenda.setBackground(new java.awt.Color(204, 204, 0));
        agenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agenda.setText("Agendar");
        agenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 520, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Observação");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        jLabelID.setBackground(new java.awt.Color(255, 255, 255));
        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("Id");
        getContentPane().add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        id.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 430, 30));

        JLabelCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        JLabelCliente.setText("Cliente");
        getContentPane().add(JLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 430, 30));

        jLabelServiço.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelServiço.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServiço.setText("Serviço");
        getContentPane().add(jLabelServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        servico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 430, 30));

        jLabelValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        valor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 430, 30));

        jLabelData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Hora");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        hora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 430, 30));

        jLabelData1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelData1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData1.setText("Data");
        getContentPane().add(jLabelData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        valor2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 430, 30));

        AgendaPrincipal.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        AgendaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        AgendaPrincipal.setText("Agenda");
        getContentPane().add(AgendaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, 70));

        FundoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Agenda-PainelFundo.png"))); // NOI18N
        FundoAgenda.setText("jLabel1");
        getContentPane().add(FundoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 840));

        PainelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/AgendaFundo.png"))); // NOI18N
        getContentPane().add(PainelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgendaPrincipal;
    private javax.swing.JLabel FundoAgenda;
    private javax.swing.JLabel JLabelCliente;
    private javax.swing.JLabel PainelAgenda;
    private javax.swing.JScrollPane Txtobservação;
    private javax.swing.JButton agenda;
    private javax.swing.JComboBox cliente;
    private javax.swing.JTextField hora;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelData1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelServiço;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox servico;
    private javax.swing.JTextField valor;
    private javax.swing.JTextField valor2;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controle.atualizaTabela();
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

   
    
    
}
