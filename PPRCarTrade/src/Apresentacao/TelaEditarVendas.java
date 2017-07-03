/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import EDA.Usuario;
import EDA.VendaVeiculo;
import Negocio.NegocioFacade;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author weiss
 */
public class TelaEditarVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendasEmAberto
     */
    
    private TelaNegocio tela;
    private ArrayList<VendaVeiculo> meusVeiculos;
    
    public TelaEditarVendas() {
        initComponents();
        
        meusVeiculos = new ArrayList<>();
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jtb_Veiculos.setDefaultRenderer(Object.class, centerRenderer);        
        
        jtb_Veiculos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel model = (DefaultTableModel)jtb_Veiculos.getModel();
        ArrayList<VendaVeiculo> aux = NegocioFacade.listaVeiculos();
        Usuario logado = NegocioFacade.getUsuarioLogado();
        for(VendaVeiculo a : aux){
            if(a.getProprietario().getCpf().equals(logado.getCpf())){
                model.addRow(new Object[]{ a.getVeiculo().getMarca(), a.getVeiculo().getModelo(), 
                                           a.getVeiculo().getCor(), a.getVeiculo().getAno(), a.getPreco()});
                meusVeiculos.add(a);
            }
        }
        jtb_Veiculos.setModel(model);
        
    }
    
    public TelaEditarVendas(TelaNegocio tela){
        this();
        this.tela = tela;
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
        btn_Editar = new javax.swing.JButton();
        btn_Visualizar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtb_Veiculos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Fechando(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setText("Editar vendas");

        btn_Editar.setText("Editar venda");

        btn_Visualizar.setText("Visualizar detalhes");
        btn_Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VisualizarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar venda");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });

        jtb_Veiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Cor", "Ano", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtb_Veiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Visualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Voltar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Editar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Visualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancelar)
                        .addGap(87, 87, 87))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void Fechando(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Fechando
        // TODO add your handling code here:
        tela.setEnabled(true);
    }//GEN-LAST:event_Fechando

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VisualizarActionPerformed
        // TODO add your handling code here:
        int index = jtb_Veiculos.getSelectedRow();
        if(index > -1){
            this.setEnabled(false);
            new TelaVisualizarVenda(this, meusVeiculos.get(index)).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Você precisa selecionar um carro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_VisualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Visualizar;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtb_Veiculos;
    // End of variables declaration//GEN-END:variables
}
