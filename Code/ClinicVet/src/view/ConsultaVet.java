package view;

import dao.ConsultaDao;
import dao.ExameDao;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Consulta;

public class ConsultaVet extends javax.swing.JFrame {

    public ConsultaVet() {
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

        imgLogo = new javax.swing.JLabel();
        timeData = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        boxSim = new javax.swing.JCheckBox();
        boxNao = new javax.swing.JCheckBox();
        btnEncerrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        listaConsulta = new javax.swing.JComboBox();
        JMenuV = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCadAnimal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        marcarConsulta = new javax.swing.JMenu();
        jMenuItemMarcConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemExeConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1001, 925));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgIconeVerdeMenor.png"))); // NOI18N
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        timeData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeData.setText("Marcar exame?");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Diagnóstico");

        txtDiagnostico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDiagnostico.setToolTipText("Insira o diagóstico do animal");
        txtDiagnostico.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiagnosticoActionPerformed(evt);
            }
        });

        boxSim.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        boxSim.setText("Sim");
        boxSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSimActionPerformed(evt);
            }
        });

        boxNao.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        boxNao.setText("Não");
        boxNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNaoActionPerformed(evt);
            }
        });

        btnEncerrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEncerrar.setText("Encerrar consulta");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Selecionar consulta");

        listaConsulta.setToolTipText("Consultas agendadas são listadas aqui");
        listaConsulta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaConsultaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaConsultaActionPerformed(evt);
            }
        });

        jMenu3.setText("Animal");

        jMenuItemCadAnimal.setText("Cadastrar animal");
        jMenuItemCadAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAnimalActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCadAnimal);

        jMenuItem1.setText("Atualizar cadastro de animal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        JMenuV.add(jMenu3);

        marcarConsulta.setText("Consultas");

        jMenuItemMarcConsulta.setText("Marcar consulta");
        jMenuItemMarcConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcConsultaActionPerformed(evt);
            }
        });
        marcarConsulta.add(jMenuItemMarcConsulta);

        JMenuV.add(marcarConsulta);

        jMenu2.setText("Veterinario");

        jMenuItemExeConsulta.setText("Executar consulta");
        jMenuItemExeConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExeConsultaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemExeConsulta);

        JMenuV.add(jMenu2);

        jMenu4.setText("Adm");
        JMenuV.add(jMenu4);

        jMenu1.setText("Help");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        JMenuV.add(jMenu1);

        setJMenuBar(JMenuV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 333, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeData)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxSim, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(boxNao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(343, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(listaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxSim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxNao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(btnEncerrar)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiagnosticoActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        // botão encerrar consulta
        ConsultaDao cN = new ConsultaDao();
        String diag = txtDiagnostico.getText();
        Consulta alt = (Consulta) listaConsulta.getSelectedItem();
        int idC = alt.getId();
        int idV = alt.getVeterinario().getIdVet();
        
        cN.alterarDiagnostico(idC, diag);
        
        if(boxSim.isSelected()){
            String ex = JOptionPane.showInputDialog("Insira os nomes dos exames abaixo: ");
            
            ExameDao novo = new ExameDao();
            novo.addExame(ex, idV, idC);
        }
        
        ConsultaVet n = new ConsultaVet();
        n.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        CadastroAnimal tela = new CadastroAnimal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void boxNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNaoActionPerformed
        // TODO add your handling code here:
        boxSim.setSelected(false);
    }//GEN-LAST:event_boxNaoActionPerformed

    private void boxSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSimActionPerformed
        // TODO add your handling code here:
        boxNao.setSelected(false);
    }//GEN-LAST:event_boxSimActionPerformed

    private void jMenuItemMarcConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcConsultaActionPerformed
        MarcarConsulta tela = new MarcarConsulta();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemMarcConsultaActionPerformed

    private void jMenuItemExeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExeConsultaActionPerformed
        
    }//GEN-LAST:event_jMenuItemExeConsultaActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAnimalActionPerformed
        CadastroAnimal tela = new CadastroAnimal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemCadAnimalActionPerformed

    private void listaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaConsultaActionPerformed

    private void listaConsultaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaConsultaAncestorAdded
        listaConsulta.removeAllItems(); //remove os itens do comboBox

        //dados do comboBox
        ConsultaDao cons = new ConsultaDao();
        
        List<Consulta> lista = cons.listarConsultas();
        
        for(Consulta a : lista){
            listaConsulta.addItem(a);
        }
    }//GEN-LAST:event_listaConsultaAncestorAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AtualizarAnimal tela = new AtualizarAnimal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiImgLogolookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuV;
    private javax.swing.JCheckBox boxNao;
    private javax.swing.JCheckBox boxSim;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadAnimal;
    private javax.swing.JMenuItem jMenuItemExeConsulta;
    private javax.swing.JMenuItem jMenuItemMarcConsulta;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JComboBox listaConsulta;
    private javax.swing.JMenu marcarConsulta;
    private javax.swing.JLabel timeData;
    private javax.swing.JTextField txtDiagnostico;
    // End of variables declaration//GEN-END:variables
}
