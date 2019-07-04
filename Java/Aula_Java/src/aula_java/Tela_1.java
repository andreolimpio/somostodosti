package aula_java;

import javax.swing.JOptionPane;

/* @author andre_olimpio */
public class Tela_1 extends javax.swing.JFrame {
    
    public void Limpar_Objetos()
    {
        Txt_N1.setText("");
        Txt_N2.setText("");
        Lbl_Resultado.setText("0");
        Txt_N1.requestFocus();
    }
    
    public Tela_1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrp_1 = new javax.swing.ButtonGroup();
        Lbl_N1 = new javax.swing.JLabel();
        Lbl_N2 = new javax.swing.JLabel();
        Lbl_Result = new javax.swing.JLabel();
        Lbl_Resultado = new javax.swing.JLabel();
        Btn_Calcular = new javax.swing.JButton();
        Txt_N1 = new javax.swing.JTextField();
        Txt_N2 = new javax.swing.JTextField();
        Btn_Limpar = new javax.swing.JButton();
        Btn_Sair = new javax.swing.JButton();
        RB_Adicao = new javax.swing.JRadioButton();
        RB_Subtracao = new javax.swing.JRadioButton();
        RB_Multiplicacao = new javax.swing.JRadioButton();
        RB_Divisao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lbl_N1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lbl_N1.setText("Primeiro número:");

        Lbl_N2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lbl_N2.setText("Segundo número:");

        Lbl_Result.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lbl_Result.setText("Resultado:");

        Lbl_Resultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lbl_Resultado.setText("0");

        Btn_Calcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn_Calcular.setText("Calcular");
        Btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CalcularActionPerformed(evt);
            }
        });

        Txt_N1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Txt_N2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Btn_Limpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn_Limpar.setText("Limpar");
        Btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimparActionPerformed(evt);
            }
        });

        Btn_Sair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn_Sair.setText("Sair");
        Btn_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SairActionPerformed(evt);
            }
        });

        BtnGrp_1.add(RB_Adicao);
        RB_Adicao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB_Adicao.setText("Adição");

        BtnGrp_1.add(RB_Subtracao);
        RB_Subtracao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB_Subtracao.setText("Subtração");

        BtnGrp_1.add(RB_Multiplicacao);
        RB_Multiplicacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB_Multiplicacao.setText("Multiplicação");

        BtnGrp_1.add(RB_Divisao);
        RB_Divisao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RB_Divisao.setText("Divisão");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Btn_Calcular)
                .addGap(33, 33, 33)
                .addComponent(Btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Btn_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_N1)
                    .addComponent(Txt_N1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_N2)
                    .addComponent(Txt_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lbl_Result)
                        .addGap(51, 51, 51)
                        .addComponent(Lbl_Resultado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB_Subtracao)
                    .addComponent(RB_Adicao)
                    .addComponent(RB_Multiplicacao)
                    .addComponent(RB_Divisao))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Lbl_N1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_N1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Lbl_N2)
                        .addGap(11, 11, 11)
                        .addComponent(Txt_N2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lbl_Result)
                            .addComponent(Lbl_Resultado))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RB_Adicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB_Subtracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB_Multiplicacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RB_Divisao)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Calcular)
                    .addComponent(Btn_Limpar)
                    .addComponent(Btn_Sair))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CalcularActionPerformed
        if (Txt_N1.getText().equals("")|| (Txt_N2.getText().equals("")))
        {
            JOptionPane.showMessageDialog(this, "Número(s) não digitado(s)");
        }
        else
        {
            int n1 = Integer.parseInt(Txt_N1.getText());
            int n2 = Integer.parseInt(Txt_N2.getText());
            
            if (RB_Adicao.isSelected())
            {
                int soma = n1 + n2;
                Lbl_Resultado.setText(Integer.toString(soma));
            }
            
            if (RB_Subtracao.isSelected())
            {
                int subtracao = n1 - n2;
                Lbl_Resultado.setText(Integer.toString(subtracao));
            }
            
            if (RB_Multiplicacao.isSelected())
            {
                int multiplicacao = n1 * n2;
                Lbl_Resultado.setText(Integer.toString(multiplicacao));
            }
            
            if (RB_Divisao.isSelected())
            {
                double divisao = n1 / n2;
                Lbl_Resultado.setText(Double.toString(divisao));
            }
        }
    }//GEN-LAST:event_Btn_CalcularActionPerformed

    private void Btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimparActionPerformed
        Limpar_Objetos();
    }//GEN-LAST:event_Btn_LimparActionPerformed

    private void Btn_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SairActionPerformed
        int confirma = JOptionPane.showConfirmDialog(this,"Deseja encerrar a execução do sistema?","Aula Java",JOptionPane.YES_NO_OPTION);
        
        if (confirma == 0)
        {
            System.exit(0);
        }
        else
        {
            Limpar_Objetos();  
        }
    }//GEN-LAST:event_Btn_SairActionPerformed

    /* @param args the command line arguments */
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
            java.util.logging.Logger.getLogger(Tela_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnGrp_1;
    private javax.swing.JButton Btn_Calcular;
    private javax.swing.JButton Btn_Limpar;
    private javax.swing.JButton Btn_Sair;
    private javax.swing.JLabel Lbl_N1;
    private javax.swing.JLabel Lbl_N2;
    private javax.swing.JLabel Lbl_Result;
    private javax.swing.JLabel Lbl_Resultado;
    private javax.swing.JRadioButton RB_Adicao;
    private javax.swing.JRadioButton RB_Divisao;
    private javax.swing.JRadioButton RB_Multiplicacao;
    private javax.swing.JRadioButton RB_Subtracao;
    private javax.swing.JTextField Txt_N1;
    private javax.swing.JTextField Txt_N2;
    // End of variables declaration//GEN-END:variables
}
