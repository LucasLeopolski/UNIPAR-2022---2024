/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculoimpostoderenda;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class FrameImpostoRenda extends javax.swing.JFrame {

    /*
    
    
    QUESTIONAR PROFESSOR
    
        ALIQUOTA APRESENTADA NO EXERCICO ESTA CALCULADO 15% SOBRE O VALOR EXCEDENDE PORÉM SERIA 27.5%
        catch não eta funcionaodo quando coloco algo diferente de um numero 
    
    */
    
    public FrameImpostoRenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRendaMensal = new javax.swing.JLabel();
        tfRendaMensal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfDependentes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDeducoes = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        lbRendaAnual = new javax.swing.JLabel();
        lbBC = new javax.swing.JLabel();
        lbImpostoDevido = new javax.swing.JLabel();
        lbResultRenda = new javax.swing.JLabel();
        lbResultBC = new javax.swing.JLabel();
        lbResultImpDevi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLRendaMensal.setText("Renda Bruta Mensal:");

        jLabel1.setText("Dependentes:");

        tfDependentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependentesActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculo IR");
        jLabel2.setToolTipText("");

        jLabel3.setText("Total Deduções");

        jLabel4.setText("(saúde, educação, etc)");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        lbRendaAnual.setText("Renda Btuta Anual:");

        lbBC.setText("Base de Calculo:");

        lbImpostoDevido.setText("Imposto Devido:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDependentes)
                    .addComponent(tfRendaMensal)
                    .addComponent(tfDeducoes)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbImpostoDevido)
                            .addComponent(lbBC)
                            .addComponent(lbRendaAnual)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLRendaMensal)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbResultRenda, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbResultBC, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addComponent(lbResultImpDevi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCalcular)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLRendaMensal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRendaMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDependentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDeducoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCalcular)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRendaAnual)
                    .addComponent(lbResultRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBC)
                    .addComponent(lbResultBC, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbImpostoDevido)
                    .addComponent(lbResultImpDevi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDependentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependentesActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        
        String rendaMensal = tfRendaMensal.getText();
        String dependentes = tfDependentes.getText();
        String deducoes = tfDeducoes.getText();
        
        
    double rendMensal;
    double depend;
    double deduc;
    double rendaBrutaAnual ;
    double baseCalculo;
    double impostoDevido; 
    double valorDependentes;
    String resultBC;
    String resultRendaBrutaAnual;
    String valorImposto; 
        try{
        
             rendMensal = Double.parseDouble(rendaMensal);
             depend = Double.parseDouble(dependentes);
             deduc = Double.parseDouble(deducoes);
             
             rendaBrutaAnual = rendMensal * 12;
             valorDependentes = depend * 300 * 12;
             
              if(rendaBrutaAnual < 18000){
                    resultRendaBrutaAnual = String.valueOf(rendaBrutaAnual);
                    lbResultRenda.setText(resultRendaBrutaAnual);
                            
                    baseCalculo = rendaBrutaAnual - valorDependentes - deduc;
                    resultBC = String.valueOf(baseCalculo);
                    lbResultBC.setText(resultBC); 
                    
                    impostoDevido = 0;
                    valorImposto = String.valueOf(impostoDevido);
                    lbResultImpDevi.setText(valorImposto);

                 }
              else if(rendaBrutaAnual > 18000 & rendaBrutaAnual < 27000){
                  resultRendaBrutaAnual = String.valueOf(rendaBrutaAnual);
                    lbResultRenda.setText(resultRendaBrutaAnual);
                            
                    baseCalculo = rendaBrutaAnual - valorDependentes - deduc;
                    resultBC = String.valueOf(baseCalculo);
                    lbResultBC.setText(resultBC); 
                    
                    double porcentagem = 15.0;
                    impostoDevido = (double)((baseCalculo - 18000.0) * (porcentagem /100.0));
                    valorImposto = String.valueOf(impostoDevido);
                    lbResultImpDevi.setText(valorImposto);
              }
              else{
                  
                  resultRendaBrutaAnual = String.valueOf(rendaBrutaAnual);
                    lbResultRenda.setText(resultRendaBrutaAnual);
                            
                    baseCalculo = rendaBrutaAnual - valorDependentes - deduc;
                    resultBC = String.valueOf(baseCalculo);
                    lbResultBC.setText(resultBC); 
                    
                    double porcentagem = 27.5;
                    impostoDevido = (double)(((baseCalculo - 18000.0) * (porcentagem /100.0)) +1350.0) ;
                    valorImposto = String.valueOf(impostoDevido);
                    lbResultImpDevi.setText(valorImposto);
              }

             
        }
        catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(this,"Informe um numero valido!");
        }
        
    }//GEN-LAST:event_btCalcularActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JLabel jLRendaMensal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbBC;
    private javax.swing.JLabel lbImpostoDevido;
    private javax.swing.JLabel lbRendaAnual;
    private javax.swing.JLabel lbResultBC;
    private javax.swing.JLabel lbResultImpDevi;
    private javax.swing.JLabel lbResultRenda;
    private javax.swing.JTextField tfDeducoes;
    private javax.swing.JTextField tfDependentes;
    private javax.swing.JTextField tfRendaMensal;
    // End of variables declaration//GEN-END:variables
}
