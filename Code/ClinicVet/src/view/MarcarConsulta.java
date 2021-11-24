/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AnimalDao;
import dao.ConsultaDao;
import dao.SecretariaDao;
import dao.VeterinarioDao;
import java.util.List;
import modelo.Animal;
import modelo.Cliente;
import modelo.Consulta;
import modelo.Atendente;
import modelo.Veterinario;

/**
 *
 * @author rafae
 */
public class MarcarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form MacarConsultaP1
     */
    public MarcarConsulta() {
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
        listaAnimais = new javax.swing.JComboBox();
        btnConsulta = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        txtSintomas = new javax.swing.JTextField();
        timeData = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaVet = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        listaSec = new javax.swing.JComboBox();
        btnConsulta1 = new javax.swing.JButton();
        dataConsulta = new com.toedter.calendar.JDateChooser();
        timeData1 = new javax.swing.JLabel();
        boxTurno = new javax.swing.JComboBox<>();
        JMenuV = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCadAnimal = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        marcarConsulta = new javax.swing.JMenu();
        jMenuItemMarcConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemExeConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marcar consulta");
        setPreferredSize(new java.awt.Dimension(1001, 1035));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Animal");

        listaAnimais.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaAnimaisAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listaAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAnimaisActionPerformed(evt);
            }
        });

        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsulta.setText("Confirmar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgIconeVerdeMenor.png"))); // NOI18N

        txtSintomas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSintomas.setToolTipText("Insira os sintomas do animal a ser consultado");
        txtSintomas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSintomasActionPerformed(evt);
            }
        });

        timeData.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeData.setText("Data da Consulta");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Sintomas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Veterinário");

        listaVet.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaVetAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listaVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaVetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Atendente");

        listaSec.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listaSecAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listaSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSecActionPerformed(evt);
            }
        });

        btnConsulta1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConsulta1.setText("Voltar");
        btnConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta1ActionPerformed(evt);
            }
        });

        timeData1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeData1.setText("Turno");

        boxTurno.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                boxTurnoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        boxTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTurnoActionPerformed(evt);
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

        jMenuItem2.setText("Cadastrar cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("Atualizar cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listaAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listaSec, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listaVet, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeData)
                                    .addComponent(dataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timeData1)
                                    .addComponent(boxTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(listaAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(listaVet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(listaSec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeData)
                    .addComponent(timeData1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsulta)
                            .addComponent(btnConsulta1))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaAnimaisAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaAnimaisAncestorAdded
        listaAnimais.removeAllItems(); //remove os itens do comboBox

        //dados do comboBox
        AnimalDao ani = new AnimalDao();
        
        List<Animal> lista = ani.listarAnimais();
        
        for(Animal a : lista){
            listaAnimais.addItem(a);
        }

    }//GEN-LAST:event_listaAnimaisAncestorAdded

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // botão marcar consulta
        
        Consulta novo = new Consulta();
        Animal ani = new Animal();
        
        novo.setSintomas(txtSintomas.getText());
        //novo.setData(dateData.getText());
        //pegar valor data da JCalendar
        novo.setData(dataConsulta.getDate());
        novo.setTurno(boxTurno.getSelectedItem().toString());
        
        //pegar valores da comboBox
        ani = (Animal) listaAnimais.getSelectedItem();
        novo.setAnimal(ani);
        novo.setSec((Atendente) listaSec.getSelectedItem());
        novo.setVeterinario((Veterinario) listaVet.getSelectedItem());
        //novo.setCliente(ani.getDono());
        //System.out.println("debug: id do Dono: "+novo.getAnimal().getDono().getId());
        
        ConsultaDao cons = new ConsultaDao();
        
        cons.cadastrar(novo);
        
        MarcarConsulta nT = new MarcarConsulta();
        nT.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnConsultaActionPerformed

    private void listaAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAnimaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAnimaisActionPerformed

    private void listaVetAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaVetAncestorAdded
        listaVet.removeAllItems(); //remove os itens do comboBox

        //dados do comboBox
        VeterinarioDao vet = new VeterinarioDao();
        
        List<Veterinario> lista = vet.listarVeterionarios();
        
        for(Veterinario v : lista){
            listaVet.addItem(v);
        }
    }//GEN-LAST:event_listaVetAncestorAdded

    private void listaVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaVetActionPerformed

    private void listaSecAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listaSecAncestorAdded
        listaSec.removeAllItems(); //remove os itens do comboBox

        //dados do comboBox
        SecretariaDao sec = new SecretariaDao();
        
        List<Atendente> lista = sec.listarSecretarias();
        
        for(Atendente s : lista){
            listaSec.addItem(s);
        }
    }//GEN-LAST:event_listaSecAncestorAdded

    private void listaSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaSecActionPerformed

    private void btnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsulta1ActionPerformed

    private void txtSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSintomasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSintomasActionPerformed

    private void jMenuItemMarcConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcConsultaActionPerformed
        MarcarConsulta tela = new MarcarConsulta();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemMarcConsultaActionPerformed

    private void jMenuItemExeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExeConsultaActionPerformed
        ConsultaVet tela = new ConsultaVet();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemExeConsultaActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAnimalActionPerformed
        CadastroAnimal tela = new CadastroAnimal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemCadAnimalActionPerformed

    private void boxTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxTurnoActionPerformed

    private void boxTurnoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_boxTurnoAncestorAdded
        //adicionar opções da comboBoxTurno
        boxTurno.addItem("Matutino");
        boxTurno.addItem("Vespertino");
        boxTurno.addItem("Noturno");
    }//GEN-LAST:event_boxTurnoAncestorAdded

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        AtualizarAnimal tela = new AtualizarAnimal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        CadastroCliente tela = new CadastroCliente();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        AtualizarCliente tela = new AtualizarCliente();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMenuV;
    private javax.swing.JComboBox<String> boxTurno;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnConsulta1;
    private com.toedter.calendar.JDateChooser dataConsulta;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemCadAnimal;
    private javax.swing.JMenuItem jMenuItemExeConsulta;
    private javax.swing.JMenuItem jMenuItemMarcConsulta;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JComboBox listaAnimais;
    private javax.swing.JComboBox listaSec;
    private javax.swing.JComboBox listaVet;
    private javax.swing.JMenu marcarConsulta;
    private javax.swing.JLabel timeData;
    private javax.swing.JLabel timeData1;
    private javax.swing.JTextField txtSintomas;
    // End of variables declaration//GEN-END:variables
}
