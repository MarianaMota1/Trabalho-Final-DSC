/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psc_apresentacao_desktop;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import psc_aplicacao.ClienteRepositorio;
import psc_aplicacao.FornecedorRepositorio;
import psc_aplicacao.FuncionarioRepositorio;

/**
 *
 * @author Mary
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal2
     */
    public TelaPrincipal() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuGerenciar = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemFornecedor = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        mnuRelatorioCliente = new javax.swing.JMenuItem();
        mnuRelatorioFuncionario = new javax.swing.JMenuItem();
        mnuRelatorioFornecedor = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja Lamendz Store");
        setExtendedState(6);

        jMenuGerenciar.setText("Gerenciar");

        jMenuItemClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemClientes.setText("Cliente");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuItemClientes);

        jMenuItemFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuItemFuncionario);

        jMenuItemFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemFornecedor.setText("Fornecedor");
        jMenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuItemFornecedor);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuItemProduto);

        jMenuItemVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVenda.setText("Venda");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuItemVenda);

        jMenuBar1.add(jMenuGerenciar);

        jMenuRelatorio.setText("Relatório");

        mnuRelatorioCliente.setText("Cliente");
        mnuRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioClienteActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(mnuRelatorioCliente);

        mnuRelatorioFuncionario.setText("Funcionário");
        mnuRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioFuncionarioActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(mnuRelatorioFuncionario);

        mnuRelatorioFornecedor.setText("Fornecedor");
        mnuRelatorioFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioFornecedorActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(mnuRelatorioFornecedor);

        jMenuBar1.add(jMenuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        TelaListarCliente tela = new TelaListarCliente();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void mnuRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioClienteActionPerformed
        // TODO add your handling code here:
        ClienteRepositorio dao = GerenciadorReferencias.getCliente();
        exibeRelatorioJasper("Cliente.jasper", dao.Buscar(null));
    }//GEN-LAST:event_mnuRelatorioClienteActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        TelaListarFuncionario tela = new TelaListarFuncionario();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorActionPerformed
        TelaListarFornecedor tela = new TelaListarFornecedor();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemFornecedorActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        TelaListarProduto tela = new TelaListarProduto();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed
        TelaListarVenda tela = new TelaListarVenda();
        this.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendaActionPerformed

    private void mnuRelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioFuncionarioActionPerformed
        // TODO add your handling code here:
        FuncionarioRepositorio dao = GerenciadorReferencias.getFuncionario();
        exibeRelatorioJasper("Funcionario.jasper", dao.Buscar(null));
    }//GEN-LAST:event_mnuRelatorioFuncionarioActionPerformed

    private void mnuRelatorioFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioFornecedorActionPerformed
        // TODO add your handling code here:
        FornecedorRepositorio dao = GerenciadorReferencias.getFornecedor();
        exibeRelatorioJasper("Fornecedor.jasper", dao.Buscar(null));
    }//GEN-LAST:event_mnuRelatorioFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    private void exibeRelatorioJasper(String caminhoRelatorio, List dados) {

        try {
            // Parâmetros
            Map<String, Object> parametros = (Map) new HashMap();

            // Pega o caminho do arquivo do relatório
            URL arquivo = getClass().getResource(caminhoRelatorio);

            // Carrega o relatório na memória
            JasperReport relatorio = (JasperReport) JRLoader.loadObject(arquivo);

            JRDataSource fontededados = new JRBeanCollectionDataSource(dados, true);
            JasperPrint jasperPrint = JasperFillManager.fillReport(relatorio, parametros, fontededados);

            // Visualiza o relatório
            JasperViewer jrviewer = new JasperViewer(jasperPrint, false);

            jrviewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(JasperReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGerenciar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemFornecedor;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemVenda;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenuItem mnuRelatorioCliente;
    private javax.swing.JMenuItem mnuRelatorioFornecedor;
    private javax.swing.JMenuItem mnuRelatorioFuncionario;
    // End of variables declaration//GEN-END:variables
}
