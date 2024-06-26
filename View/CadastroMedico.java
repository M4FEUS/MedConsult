package View;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Model.MedicoModel;

public class CadastroMedico extends javax.swing.JFrame {

    public CadastroMedico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanelDadosMedico = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxEspecialidade = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jFTcrm = new javax.swing.JFormattedTextField();
        jFTcpf = new javax.swing.JFormattedTextField();
        jFTrg = new javax.swing.JFormattedTextField();
        jFTtelefone = new javax.swing.JFormattedTextField();
        jFTcelular = new javax.swing.JFormattedTextField();
        jPanelPesquisaMedico = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jCheckBoxFeminino = new javax.swing.JCheckBox();
        jCheckBoxMasculino = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cadastro de médicos");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 20, 400, 40);

        btnSair.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(1020, 470, 130, 30);

        btnExcluir.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(440, 470, 130, 30);

        btnNovo.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(20, 470, 130, 30);

        btnCancelar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(300, 470, 130, 30);

        btnCadastrar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(160, 470, 130, 30);

        jPanelDadosMedico.setBackground(new java.awt.Color(153, 204, 255));
        jPanelDadosMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CRM:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("RG:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Celular:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Especialidade:");

        jComboBoxEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologia", "Cirurgia Geral", "Dermatologia", "Gastroenterologia", "Ginecologia", "Obstetrícia", "Infectologia", "Mastologia", "Neurocirurgia", "Oftalmologia", "Ortopedia", "Pediatria", "Radiologia", "Urologia" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Email:");

        try {
            jFTcrm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanelPesquisaMedico.setBackground(new java.awt.Color(102, 204, 255));
        jPanelPesquisaMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPesquisar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CRM", "CPF", "RG", "Especialidade", "Telefone", "Celular", "Email", "Sexo"
            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        javax.swing.GroupLayout jPanelPesquisaMedicoLayout = new javax.swing.GroupLayout(jPanelPesquisaMedico);
        jPanelPesquisaMedico.setLayout(jPanelPesquisaMedicoLayout);
        jPanelPesquisaMedicoLayout.setHorizontalGroup(
            jPanelPesquisaMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisaMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisaMedicoLayout.createSequentialGroup()
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPesquisaMedicoLayout.setVerticalGroup(
            jPanelPesquisaMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jCheckBoxFeminino.setBackground(new java.awt.Color(153, 204, 255));
        jCheckBoxFeminino.setText("Feminino");

        jCheckBoxMasculino.setBackground(new java.awt.Color(153, 204, 255));
        jCheckBoxMasculino.setText("Masculino");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Sexo:");

        javax.swing.GroupLayout jPanelDadosMedicoLayout = new javax.swing.GroupLayout(jPanelDadosMedico);
        jPanelDadosMedico.setLayout(jPanelDadosMedicoLayout);
        jPanelDadosMedicoLayout.setHorizontalGroup(
            jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDadosMedicoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxEspecialidade, 0, 247, Short.MAX_VALUE))
                    .addGroup(jPanelDadosMedicoLayout.createSequentialGroup()
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(87, 87, 87)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(jFTcrm)
                            .addComponent(jFTcpf, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jFTrg)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosMedicoLayout.createSequentialGroup()
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDadosMedicoLayout.createSequentialGroup()
                                .addComponent(jCheckBoxFeminino)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxMasculino))
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jFTtelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFTcelular, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPesquisaMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDadosMedicoLayout.setVerticalGroup(
            jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPesquisaMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDadosMedicoLayout.createSequentialGroup()
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosMedicoLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosMedicoLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jFTcrm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jFTcpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jFTrg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jFTtelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(txtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelDadosMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxFeminino)
                            .addComponent(jCheckBoxMasculino)
                            .addComponent(jLabel2))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanelDadosMedico);
        jPanelDadosMedico.setBounds(10, 80, 1150, 370);

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_login.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 460, 1150, 50);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_login.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 10, 1150, 60);

        setSize(new java.awt.Dimension(1182, 563));
        setLocationRelativeTo(null);
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {
        if (jTableMedicos.getSelectedRow() != -1){
            txtNome.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 1).toString());
            jFTcrm.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 2).toString());
            jFTcpf.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 3).toString());
            jFTrg.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 4).toString());
            jComboBoxEspecialidade.setSelectedItem(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 5).toString());
            jFTtelefone.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 6).toString());
            jFTcelular.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 7).toString());
            txtEmail.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 8).toString());            
        }
    }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {
            
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    public JButton getBtnNovo() {
        return btnNovo;
    }

    public JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    public JButton getBtnSair() {
        return btnSair;
    }

    public JComboBox<String> getjComboBoxEspecialidade() {
        return jComboBoxEspecialidade;
    }

    public JFormattedTextField getjFTcelular() {
        return jFTcelular;
    }

    public JFormattedTextField getjFTcpf() {
        return jFTcpf;
    }

    public JFormattedTextField getjFTcrm() {
        return jFTcrm;
    }

    public JFormattedTextField getjFTrg() {
        return jFTrg;
    }

    public JFormattedTextField getjFTtelefone() {
        return jFTtelefone;
    }

    public JPanel getjPanelDadosMedico() {
        return jPanelDadosMedico;
    }

    public JTable getjTableMedicos() {
        return jTableMedicos;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtPesquisa() {
        return txtPesquisa;
    }

    public JCheckBox getjCheckBoxFeminino() {
        return jCheckBoxFeminino;
    }

    public JCheckBox getjCheckBoxMasculino() {
        return jCheckBoxMasculino;
    }

    public JPanel getjPanelPesquisaMedico() {
        return jPanelPesquisaMedico;
    }
    
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMedico().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JCheckBox jCheckBoxFeminino;
    private javax.swing.JCheckBox jCheckBoxMasculino;
    private javax.swing.JComboBox<String> jComboBoxEspecialidade;
    private javax.swing.JFormattedTextField jFTcelular;
    private javax.swing.JFormattedTextField jFTcpf;
    private javax.swing.JFormattedTextField jFTcrm;
    private javax.swing.JFormattedTextField jFTrg;
    private javax.swing.JFormattedTextField jFTtelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDadosMedico;
    private javax.swing.JPanel jPanelPesquisaMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
}
