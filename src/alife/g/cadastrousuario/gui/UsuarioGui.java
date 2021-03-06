/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alife.g.cadastrousuario.gui;

import alife.g.cadastrousuario.dao.domain.Usuario;
import alife.g.cadastrousuario.to.UsuarioController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class UsuarioGui extends javax.swing.JInternalFrame {

    private UsuarioController controller;
    
    

    public UsuarioGui() {
        this.controller = new UsuarioController();
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

        jPanel1 = new javax.swing.JPanel();
        jbtNovo = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtListar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfLogin = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jckAtivo = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpwSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jpwConfirmacao = new javax.swing.JPasswordField();
        jtbScroll = new javax.swing.JScrollPane();
        jtbLista = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cadastro de Usuário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

        jbtNovo.setText("Novo Usuario");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtListar.setText("Listar");
        jbtListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbtListar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtCancelar, jbtExcluir, jbtListar, jbtSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbtNovo)
                .addComponent(jbtSalvar)
                .addComponent(jbtExcluir)
                .addComponent(jbtCancelar)
                .addComponent(jbtListar))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbtCancelar, jbtExcluir, jbtListar, jbtNovo, jbtSalvar});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Login:");

        jLabel4.setText("Tipo:");

        jtfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lostFocus(evt);
            }
        });

        jtfLogin.setEnabled(false);

        jtfNome.setEnabled(false);

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECIONE>", "ADMINISTRADOR", "USUARIO " }));
        jcbTipo.setEnabled(false);

        jLabel5.setText("Ativo/Inativo:");

        jckAtivo.setEnabled(false);
        jckAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jckAtivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jckAtivo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jcbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 168, Short.MAX_VALUE)
                        .addComponent(jtfLogin, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jckAtivo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        jLabel6.setText("Senha");

        jpwSenha.setEnabled(false);
        jpwSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwSenhaActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirmação");

        jpwConfirmacao.setEnabled(false);
        jpwConfirmacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpwConfirmacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jpwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jpwConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpwSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpwConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jtbScroll.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de usuários"));

        jtbLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ));
        jtbScroll.setViewportView(jtbLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtbScroll, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtbScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jckAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jckAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jckAtivoActionPerformed

    private void jpwSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpwSenhaActionPerformed

    private void jpwConfirmacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpwConfirmacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpwConfirmacaoActionPerformed

    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed
        habilitarCampos();
        this.controller.novo();
        this.limparCampos();
    }//GEN-LAST:event_jbtNovoActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        if (!(this.controller.getUsuarioManipulado() == null)) {        
        
            try {
                    this.ValidarForm();
                    enviarForm();
                this.controller.salvar();
                this.limparCampos();
                this.desabilitarCampos();
                this.jbtListarActionPerformed(evt);
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!!!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!!!" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nao ha nada para salvar!!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.desabilitarCampos();
        this.limparCampos();
        this.controller.setUsuarioManipulado(null);
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        if (
                (!(this.controller.getUsuarioManipulado() == null))
                &&
                (this.controller.getUsuarioManipulado().getCodigo()!=null)
                )    {
              if (JOptionPane.showConfirmDialog(null, "Deseja realmente remover este registro?", "Excluir registro",
                JOptionPane.YES_NO_OPTION)
              ==JOptionPane.YES_OPTION) {
                this.controller.excluir();
                this.limparCampos();
                this.desabilitarCampos();
                this.jbtListarActionPerformed(evt);
                
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nao ha nada para excluir!!!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListarActionPerformed
        this.controller.pesquisar();
        DefaultTableModel model = (DefaultTableModel) jtbLista.getModel();
        model.setRowCount(0);
        for (int i = 0; i < this.controller.getLista().size(); i++) {
            model.addRow(new Object[]{
                this.controller.getLista().get(i).getCodigo().toString(),
                this.controller.getLista().get(i).getNome()
            });
    }//GEN-LAST:event_jbtListarActionPerformed
    }
    private void lostFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lostFocus
        if (!jtfCodigo.getText().equals("")){    //exclamacao é uma negacao
            try {
                int parseInt = Integer.parseInt(jtfCodigo.getText());
                this.controller.pesquisar();
                List<Usuario> lista = this.controller.getLista();
                
                if (lista.size()>0) {
                    //percorrer
                    for (int i = 0; i < lista.size(); i++) {
                       if (lista.get(i).getCodigo().equals(parseInt) ) { //equals ele compara
                           this.controller.setUsuarioManipulado(lista.get(i));
                           this.recebeForm();
                           this.habilitarCampos();
                           break;
                       }                    
                    }
                } else {
                     JOptionPane.showMessageDialog(this , "Não a nada a listar!");
                }
                 
                 
            }catch (Exception e) {
                JOptionPane.showMessageDialog(this , "Numero inválido!");
                jtfCodigo.requestFocus();
            }
        }        
    }//GEN-LAST:event_lostFocus
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtListar;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JCheckBox jckAtivo;
    private javax.swing.JPasswordField jpwConfirmacao;
    private javax.swing.JPasswordField jpwSenha;
    private javax.swing.JTable jtbLista;
    private javax.swing.JScrollPane jtbScroll;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables

    private void habilitarCampos() {
        jtfNome.setEnabled(true);
        jtfLogin.setEnabled(true);
        jcbTipo.setEnabled(true);
        jckAtivo.setEnabled(true);
        jpwSenha.setEnabled(true);
        jpwConfirmacao.setEnabled(true);
        jtfCodigo.setEditable(false);
    }

    private void desabilitarCampos() {
        jtfNome.setEnabled(false);
        jtfLogin.setEnabled(false);
        jcbTipo.setEnabled(false);
        jckAtivo.setEnabled(false);
        jpwSenha.setEnabled(false);
        jpwConfirmacao.setEnabled(false);
        jtfCodigo.setEditable(true);
    }

    private void enviarForm() {
        if (this.jtfCodigo.getText().equals("")) {
            this.controller.getUsuarioManipulado().setCodigo(null);
        } else {
            this.controller.getUsuarioManipulado().setCodigo(Integer.parseInt(this.jtfCodigo.getText()));
        }
        this.controller.getUsuarioManipulado().setNome(this.jtfNome.getText());
        this.controller.getUsuarioManipulado().setLogin(this.jtfLogin.getText());
        this.controller.getUsuarioManipulado().setSenha(new String ( this.jpwSenha.getPassword() ));       
        this.controller.getUsuarioManipulado().setTipo(jcbTipo.getSelectedIndex());
        if (jckAtivo.isSelected()) {
            this.controller.getUsuarioManipulado().setStatus(1);
        }

    }

    private void setEnable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limparCampos() {
        jtfLogin.setText("");
        jtfNome.setText("");
        jtfCodigo.setText("");
        jcbTipo.setSelectedIndex(0);
        jckAtivo.setSelected(false);
        jpwConfirmacao.setText("");
        jpwSenha.setText("");
    }

    private void recebeForm() {
      jtfCodigo.setText (this.controller.getUsuarioManipulado().getCodigo().toString());
      jtfNome.setText(this.controller.getUsuarioManipulado().getNome());
      jtfLogin.setText(this.controller.getUsuarioManipulado().getLogin());
      jcbTipo.setSelectedIndex(this.controller.getUsuarioManipulado().getTipo());
    
      if (this.controller.getUsuarioManipulado().getStatus()==1) {
          jckAtivo.setSelected(true);
      } else {
          jckAtivo.setSelected(false);
      }
      jpwSenha.setText(this.controller.getUsuarioManipulado().getSenha());
      jpwConfirmacao.setText(this.controller.getUsuarioManipulado().getSenha());
    }

    private void ValidarForm() throws Exception {
        if ( new String(jpwSenha.getPassword()).equals("")) {
            throw new Exception("A senha nao pode ser vazia!");            
        }
        if ( !new String(jpwSenha.getPassword()).equals(new String(jpwConfirmacao.getPassword())) )
        {
            throw new Exception("A senha é diferente da Confirmação!");
        }
        if ( jtfNome.getText().equals("")) {
            throw new Exception("O campo nome nao pode ser vazio!");
        }      
         if ( jtfLogin.getText().equals("")) {
            throw new Exception("O campo login nao pode ser vazio!");
         }
         if (jcbTipo.getSelectedIndex()==0) {
             throw new Exception("É necessario escolher ao menos um tipo!");
             
         }
    }
}
