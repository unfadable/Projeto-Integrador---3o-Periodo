/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import entidade.Atendimento;
import entidade.Midia;
import entidade.Titulo;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import persistencia.AtendimentoDAO;
import persistencia.ClienteDAO;
import persistencia.DependenteDAO;
import persistencia.FuncionarioDAO;
import persistencia.MidiaDAO;
import persistencia.TituloDAO;

/**
 *
 * @author rafael
 */
public class CadLocacao extends javax.swing.JInternalFrame {

    JDesktopPane painelPrincipal;

    /**
     * Creates new form CadReserva
     */
    public CadLocacao() throws ParseException {
        initComponents();

        LocalDate dataManipulacao = LocalDate.now();
        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        txtData.setText(dataManipulacao.format(formatadorBarra));
        txtStatus.setText("Ativo");
        
        FuncionarioDAO persistencia = new FuncionarioDAO();

        DefaultComboBoxModel defaultComboBox;

        try {
            defaultComboBox = new DefaultComboBoxModel(persistencia.comboBox().toArray());
            defaultComboBox.setSelectedItem("< Selecione um atendente >");
            comboBoxAtendente.setModel(defaultComboBox);
        } catch (SQLException ex) {
            Logger.getLogger(CadDependente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public CadLocacao(JDesktopPane parametro) throws ParseException {
        this();
        painelPrincipal = parametro;
    }

    public CadLocacao(JDesktopPane parametro, Atendimento atendimento) throws ParseException {
        this();
        painelPrincipal = parametro;

        //carregarTela(atendimento);
    }

    public CadLocacao(JDesktopPane parametro, Titulo titulo) throws ParseException {
        this();
        painelPrincipal = parametro;

        carregarTelaTitulo(titulo);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtTipoMidia = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        radioCliente = new javax.swing.JRadioButton();
        radioDependente = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxAtendente = new javax.swing.JComboBox<>();
        comboBoxNome = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();

        setTitle("Locação");

        jLabel1.setText("ID");

        jLabel2.setText("Título");

        jLabel3.setText("Data");

        jLabel4.setText("Tipo da Mídia");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnPesquisa.setText("Pesquisa");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnLimpar.setText("Limpar");

        btnFechar.setText("Fechar");

        jLabel5.setText("Quantidade");

        jLabel6.setText("Nome");

        radioCliente.setText("Cliente");
        radioCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioClienteMouseClicked(evt);
            }
        });
        radioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioClienteActionPerformed(evt);
            }
        });

        radioDependente.setText("Dependente");
        radioDependente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioDependenteMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Atendente"));

        jLabel7.setText("Selecione o atendente");

        comboBoxAtendente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Selecione uma opção >" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboBoxAtendente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Status");

        jLabel9.setText("Duração");

        jLabel10.setText("Valor Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDuracao)
                            .addComponent(txtValorTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisa))
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioDependente))
                            .addComponent(comboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDuracao, txtTipoMidia, txtValorTotal});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCliente)
                    .addComponent(radioDependente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisa))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipoMidia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:

        try {

            PesquisaTituloLocacao janela = new PesquisaTituloLocacao(painelPrincipal);
            painelPrincipal.add(janela);
            janela.setVisible(true);
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void radioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioClienteActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_radioClienteActionPerformed

    private void radioClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioClienteMouseClicked
        // TODO add your handling code here:

        DefaultComboBoxModel defaultComboBox;
        ClienteDAO persistenciaCliente = new ClienteDAO();

        try {
            defaultComboBox = new DefaultComboBoxModel(persistenciaCliente.comboBox().toArray());
            defaultComboBox.setSelectedItem("< Selecione o Cliente >");
            comboBoxNome.setModel(defaultComboBox);
        } catch (SQLException ex) {
            Logger.getLogger(CadDependente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        radioDependente.setSelected(false);

    }//GEN-LAST:event_radioClienteMouseClicked

    private void radioDependenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioDependenteMouseClicked
        // TODO add your handling code here:

        DefaultComboBoxModel defaultComboBox;
        DependenteDAO persistenciaCliente = new DependenteDAO();

        try {
            defaultComboBox = new DefaultComboBoxModel(persistenciaCliente.comboBox().toArray());
            defaultComboBox.setSelectedItem("< Selecione o Dependente >");
            comboBoxNome.setModel(defaultComboBox);
        } catch (SQLException ex) {
            Logger.getLogger(CadDependente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        radioCliente.setSelected(false);
    }//GEN-LAST:event_radioDependenteMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:

        try {

            Atendimento atendimento = new Atendimento();
            
            //tratativa do ID
            if (!txtId.getText().equals("")) {
                atendimento.setId(Integer.parseInt(txtId.getText()));
            }
            
            //Se for atendimento para cliente, setar ID do cliente.
            if(radioCliente.isSelected()){
                atendimento.setCliente_id(new ClienteDAO().pegaId(comboBoxNome.getSelectedItem().toString()));
            }
            
            //Se for atendimento para dependente, setar ID do dependente.
            if(radioDependente.isSelected()){
                atendimento.setDependente_id(new DependenteDAO().pegaId(comboBoxNome.getSelectedItem().toString()));
            }
            
            atendimento.setFuncionario_id(new FuncionarioDAO().pegaId(comboBoxAtendente.getSelectedItem().toString()));
            atendimento.setTitulo_id(new TituloDAO().pegaId(txtTitulo.getText()));
            atendimento.setQuantidadeMidias(Integer.parseInt(txtQuantidade.getText()));
            
            if(txtStatus.getText().equalsIgnoreCase("ativo")){
                atendimento.setStatus(true);
            }else{
                atendimento.setStatus(false);
            }
            
            atendimento.setDuracao(Integer.parseInt(txtDuracao.getText()));
            
            
            //Manipulação da mídias
            Midia midia = new MidiaDAO().consultarPeloTitulo(new TituloDAO().pegaId(txtTitulo.getText()), txtTipoMidia.getText());
            midia.setId(midia.getId());
            midia.setQuantidade((midia.getQuantidade() - Integer.parseInt(txtQuantidade.getText())));
            new MidiaDAO().alterar(midia);
            
            atendimento.setMidia_id(midia.getId());

            //Tratamento da Data
            String data = txtData.getText();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date dataReserva = formato.parse(data);
            atendimento.setDataEntrada(dataReserva);
            
            Double valorTotal;
            
            valorTotal = atendimento.getQuantidadeMidias() * midia.getPreco();
            
            txtValorTotal.setText(valorTotal + "");
            
            atendimento.setValorTotal(valorTotal);
            
            
            if(radioCliente.isSelected()){
                new AtendimentoDAO().incluirLocacaoCliente(atendimento);
            }else{
                new AtendimentoDAO().incluirLocacaoDependente(atendimento);
            }

            JOptionPane.showMessageDialog(this, "Operação efetuada com sucesso!");

            //limpar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro" + e.getMessage());
        }

    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboBoxAtendente;
    private javax.swing.JComboBox<String> comboBoxNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioCliente;
    private javax.swing.JRadioButton radioDependente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTipoMidia;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables

    private void carregarTelaTitulo(Titulo titulo) throws ParseException {

        txtTitulo.setText(titulo.getNome());

        btnExcluir.setEnabled(true);

    }

}
