/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Pessoa;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 0030481713030
 */
public class GuiInstrutor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GuiInstrutor() {
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

        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        mtxtCpf = new javax.swing.JFormattedTextField();
        chcbxSexo = new javax.swing.JComboBox<>();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        mtxtRg = new javax.swing.JFormattedTextField();
        txtFormacao = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        chcbxEstado = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        mtxtDataNasc = new javax.swing.JFormattedTextField();
        chcbxEstaCivil = new javax.swing.JComboBox<>();
        txtNumero = new javax.swing.JTextField();
        mtxtCep = new javax.swing.JFormattedTextField();
        mtxtTelResidencial = new javax.swing.JFormattedTextField();
        mtxtTelCelular = new javax.swing.JFormattedTextField();
        txtAreaAtuacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Instrutor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Sexo");

        jLabel4.setText("Endereço");

        jLabel5.setText("Bairro");

        jLabel6.setText("Cidade");

        jLabel7.setText("RG");

        jLabel8.setText("Formação");

        jLabel9.setText("Email");

        txtNome.setEnabled(false);

        try {
            mtxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        chcbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        chcbxSexo.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtBairro.setEnabled(false);

        txtCidade.setEnabled(false);
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        try {
            mtxtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        mtxtRg.setEnabled(false);

        txtFormacao.setEnabled(false);
        txtFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormacaoActionPerformed(evt);
            }
        });

        txtEmail.setEnabled(false);

        jLabel10.setText("Data Nascimento");

        jLabel11.setText("Estado Civil");

        jLabel12.setText("Nº");

        jLabel13.setText("CEP");

        jLabel15.setText("Estado");

        chcbxEstado.setEnabled(false);

        jLabel14.setText("Tel. Res");

        jLabel16.setText("Celular");

        jLabel17.setText("Area de Atuação");

        mtxtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        mtxtDataNasc.setToolTipText("");
        mtxtDataNasc.setEnabled(false);

        chcbxEstaCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", "Separado" }));
        chcbxEstaCivil.setEnabled(false);

        txtNumero.setEnabled(false);

        try {
            mtxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        mtxtCep.setEnabled(false);

        try {
            mtxtTelResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        mtxtTelResidencial.setEnabled(false);
        mtxtTelResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtxtTelResidencialActionPerformed(evt);
            }
        });

        try {
            mtxtTelCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        mtxtTelCelular.setEnabled(false);
        mtxtTelCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtxtTelCelularActionPerformed(evt);
            }
        });

        txtAreaAtuacao.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNome)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                            .addComponent(txtEmail))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel14)))
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mtxtDataNasc)
                                    .addComponent(chcbxEstaCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNumero)
                                    .addComponent(mtxtCep)
                                    .addComponent(mtxtTelResidencial)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mtxtTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(chcbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFormacao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mtxtRg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chcbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAreaAtuacao)))))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnInserir)
                        .addGap(30, 30, 30)
                        .addComponent(btnAlterar)
                        .addGap(28, 28, 28)
                        .addComponent(btnExcluir)
                        .addGap(36, 36, 36)
                        .addComponent(btnSair)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mtxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(mtxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chcbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(chcbxEstaCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(mtxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(chcbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(mtxtTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mtxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(mtxtTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mtxtTelResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtxtTelResidencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtxtTelResidencialActionPerformed

    private void mtxtTelCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtxtTelCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtxtTelCelularActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormacaoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String formatedCpf = mtxtCpf.getText().replace(".", "");
        formatedCpf = formatedCpf.replace("-", "");
        //System.err.print(formatedCpf);
        if (Pessoa.validarCPF(formatedCpf) == false) {
            JOptionPane.showMessageDialog(null, "CPF Inválido", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } else {

            instrutor = null;
            instrutor = daoInstrutor.consultar(formatedCpf);

            if (instrutor == null) {
                mtxtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                mtxtDataNasc.setEnabled(true);
                chcbxSexo.setEnabled(true);
                chcbxEstaCivil.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtBairro.setEnabled(true);
                mtxtCep.setEnabled(true);
                txtCidade.setEnabled(true);
                chcbxEstado.setEnabled(true);
                mtxtTelResidencial.setEnabled(true);
                mtxtTelCelular.setEnabled(true);
                txtFormacao.setEnabled(true);
                txtAreaAtuacao.setEnabled(true);
                txtEmail.setEnabled(true);
                mtxtRg.setEnabled(true);
                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            } else {

                mtxtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                mtxtDataNasc.setEnabled(true);
                chcbxSexo.setEnabled(true);
                chcbxEstaCivil.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtBairro.setEnabled(true);
                mtxtCep.setEnabled(true);
                txtCidade.setEnabled(true);
                chcbxEstado.setEnabled(true);
                mtxtTelResidencial.setEnabled(true);
                mtxtTelCelular.setEnabled(true);
                txtFormacao.setEnabled(true);
                txtAreaAtuacao.setEnabled(true);
                txtEmail.setEnabled(true);
                
                instrutor.setDataNasc((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_data_nascimento")));
                mtxtDataNasc.setEnabled(true);
                mtxtDataNasc.setText(instrutor.getDataNasc());
                
                instrutor.setSexo((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_sexo")));
                chcbxSexo.setEnabled(true);
                //chcbxSexo.setModel(instrutor.getSexo());
                
                instrutor.setEstadoCivil((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_estado_civil")));
                chcbxSexo.setEnabled(true);
                //chcbxSexo.setModel(instrutor.getEstadoCivil());
                
                instrutor.setEndereco((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_endereco")));
                txtEndereco.setEnabled(true);
                txtEndereco.setText(instrutor.getEndereco());
                
                instrutor.setNome((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_nome")));
                txtNome.setEnabled(true);
                txtNome.setText(instrutor.getNome());
                
                instrutor.setNumero((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_numero")));
                txtNumero.setEnabled(true);
                txtNumero.setText(instrutor.getNumero());
                
                instrutor.setBairro((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_bairro")));
                txtBairro.setEnabled(true);
                txtBairro.setText(instrutor.getBairro());
                
                instrutor.setCEP((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_cep")));
                mtxtCep.setEnabled(true);
                mtxtCep.setText(instrutor.getCEP());
                
                instrutor.setCidade((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_cidade")));
                txtCidade.setEnabled(true);
                txtCidade.setText(instrutor.getCidade());
                
                instrutor.setEstado((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_estado")));
                chcbxEstado.setEnabled(true);
                ArrayList<String> lsEstado = new ArrayList();
                lsEstado.add("AC");
                lsEstado.add("AL");
                lsEstado.add("AM");
                lsEstado.add("AP");
                lsEstado.add("BA");
                lsEstado.add("CE");
                lsEstado.add("DF");
                lsEstado.add("ES");
                lsEstado.add("GO");
                lsEstado.add("MA");
                lsEstado.add("MG");
                lsEstado.add("MS");
                lsEstado.add("MT");
                lsEstado.add("PA");
                lsEstado.add("PB");
                lsEstado.add("PE");
                lsEstado.add("PI");
                lsEstado.add("PR");
                lsEstado.add("RJ");
                lsEstado.add("RN");
                lsEstado.add("RO");
                lsEstado.add("RR");
                lsEstado.add("RS");
                lsEstado.add("SC");
                lsEstado.add("SE");
                lsEstado.add("SP");
                lsEstado.add("TO");
                
                System.err.println(instrutor.getEstado());
                chcbxEstado.setSelectedItem(daoInstrutor.retornaAtibuto(formatedCpf, instrutor.getEstado()));
                
                instrutor.setTelefone((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_tel_residencial")));
                mtxtTelResidencial.setEnabled(true);
                mtxtTelResidencial.setText(instrutor.getTelefone());
                
                instrutor.setRG((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_rg")));
                mtxtRg.setEnabled(true);
                mtxtRg.setText(instrutor.getRG());
                
                instrutor.setCelular((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_celular")));
                mtxtTelCelular.setEnabled(true);
                mtxtTelCelular.setText(instrutor.getCelular());
                
                instrutor.setFormacao((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_formacao")));
                txtFormacao.setEnabled(true);
                txtFormacao.setText(instrutor.getFormacao());
                
                instrutor.setAreAtuacao((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_area_atuacao")));
                txtAreaAtuacao.setEnabled(true);
                txtAreaAtuacao.setText(instrutor.getAreAtuacao());
                
                instrutor.setEmail((String) (daoInstrutor.retornaAtibuto(formatedCpf, "instrutor_email")));
                txtEmail.setEnabled(true);
                txtEmail.setText(instrutor.getEmail());
                
                
                

//                txtNome.setText(instrutor.getNome());
//                mtxtCpf.setText(instrutor.getCPF());
//                mtxtDataNasc.setText(instrutor.getDataNasc());
//                //chcbxSexo.setText(instrutor.getSexo());
//                //chcbxEstaCivil.setText(instrutor.getEstadoCivil());
//                txtEndereco.setText(instrutor.getEndereco());
//                txtNumero.setText(instrutor.getNumero());
//                txtBairro.setText(instrutor.getBairro());
//                mtxtCep.setText(instrutor.getCEP());
//                txtCidade.setText(instrutor.getCidade());
//                //chcbxEstado.setText(instrutor.getEstado());
//                mtxtTelResidencial.setText(instrutor.getTelefone());
//                mtxtTelCelular.setText(instrutor.getCelular());
//                txtFormacao.setText(instrutor.getFormacao());
//                txtAreaAtuacao.setText(instrutor.getAreAtuacao());
//                txtEmail.setText(instrutor.getEmail());

                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        }
//        
//        if (Pessoa.validarCPF(mtxtCpf.getText()) == false){
//            JOptionPane.showMessageDialog (null, "CPF Inválido", "Erro", JOptionPane.INFORMATION_MESSAGE);
//            mtxtCpf.requestFocus();
//        }
//        else{
//            DaoInstrutor.consultar(mtxtCpf.getText());
//        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD1523042", "BD1523042");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoInstrutor = new DaoInstrutor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInserirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> chcbxEstaCivil;
    private javax.swing.JComboBox<String> chcbxEstado;
    private javax.swing.JComboBox<String> chcbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField mtxtCep;
    private javax.swing.JFormattedTextField mtxtCpf;
    private javax.swing.JFormattedTextField mtxtDataNasc;
    private javax.swing.JFormattedTextField mtxtRg;
    private javax.swing.JFormattedTextField mtxtTelCelular;
    private javax.swing.JFormattedTextField mtxtTelResidencial;
    private javax.swing.JTextField txtAreaAtuacao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
    private DaoInstrutor daoInstrutor = null;
    private Instrutor instrutor = null;
    private Conexao conexao = null;
}
