package View;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Agendamento extends javax.swing.JFrame {

    public Agendamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelAgendamento = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMedico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFThora = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMotivo = new javax.swing.JTextArea();
        jDateChooserData = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        btnBuscarMedico = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        btnBuscarPaciente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelId = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 1, 36)); // NOI18N
        jLabel7.setText("Agendamento");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(520, 20, 270, 50);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(290, 370, 120, 31);

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNovo.setText("Novo");
        getContentPane().add(btnNovo);
        btnNovo.setBounds(30, 370, 110, 31);

        btnAgendar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgendar);
        btnAgendar.setBounds(160, 370, 110, 31);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(1140, 370, 79, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_login.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 360, 1220, 50);

        jPanelAgendamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelAgendamento.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Paciente:");
        jPanelAgendamento.add(jLabel2);
        jLabel2.setBounds(10, 10, 86, 22);
        jPanelAgendamento.add(txtMedico);
        txtMedico.setBounds(110, 50, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Médico:");
        jPanelAgendamento.add(jLabel3);
        jLabel3.setBounds(20, 50, 71, 22);
        jPanelAgendamento.add(txtPaciente);
        txtPaciente.setBounds(110, 10, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Data:");
        jPanelAgendamento.add(jLabel4);
        jLabel4.setBounds(40, 90, 50, 30);

        try {
            jFThora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelAgendamento.add(jFThora);
        jFThora.setBounds(340, 90, 42, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Horário:");
        jPanelAgendamento.add(jLabel5);
        jLabel5.setBounds(250, 90, 75, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Motivo:");
        jPanelAgendamento.add(jLabel6);
        jLabel6.setBounds(20, 140, 70, 22);

        jTextAreaMotivo.setColumns(20);
        jTextAreaMotivo.setRows(5);
        jTextAreaMotivo.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaMotivo);

        jPanelAgendamento.add(jScrollPane1);
        jScrollPane1.setBounds(110, 140, 270, 100);
        jPanelAgendamento.add(jDateChooserData);
        jDateChooserData.setBounds(110, 90, 120, 30);

        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Especialidade", "CPF"
            }
        ));
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMedicos);

        jPanelAgendamento.add(jScrollPane2);
        jScrollPane2.setBounds(880, 50, 330, 190);

        btnBuscarMedico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarMedico.setText("Buscar");
        jPanelAgendamento.add(btnBuscarMedico);
        btnBuscarMedico.setBounds(390, 50, 120, 30);

        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG"
            }
        ));
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePacientes);

        jPanelAgendamento.add(jScrollPane3);
        jScrollPane3.setBounds(530, 50, 330, 190);

        btnBuscarPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscarPaciente.setText("Buscar");
        jPanelAgendamento.add(btnBuscarPaciente);
        btnBuscarPaciente.setBounds(390, 10, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Médicos");
        jPanelAgendamento.add(jLabel9);
        jLabel9.setBounds(880, 20, 90, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Pacientes");
        jPanelAgendamento.add(jLabel10);
        jLabel10.setBounds(530, 20, 90, 22);

        jPanelId.setLayout(null);

        jPanelAgendamento.add(jPanelId);
        jPanelId.setBounds(340, 10, 40, 70);

        getContentPane().add(jPanelAgendamento);
        jPanelAgendamento.setBounds(10, 90, 1220, 260);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_login.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 11, 1220, 67);

        setSize(new java.awt.Dimension(1256, 457));
        setLocationRelativeTo(null);
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {
         if (jTableMedicos.getSelectedRow() != -1){
             txtMedico.setText(jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 0).toString());
         }
    }
    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {
        if (jTablePacientes.getSelectedRow() != -1){
            txtPaciente.setText(jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 0).toString());
        }
    }

    private void txtPacienteIdActionPerformed(java.awt.event.ActionEvent evt) {

    }
   
    public JButton getBtnAgendar() {
        return btnAgendar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnNovo() {
        return btnNovo;
    }

    public JButton getBtnSair() {
        return btnSair;
    }

    public JDateChooser getjDateChooserData() {
        return jDateChooserData;
    }

    public JFormattedTextField getjFThora() {
        return jFThora;
    }

    public JTable getjTablePacientes() {
        return jTablePacientes;
    }

    public JTable getjTableMedicos() {
        return jTableMedicos;
    }

    public JTextArea getjTextAreaMotivo() {
        return jTextAreaMotivo;
    }

    public JTextField getTxtMedico() {
        return txtMedico;
    }

    public JTextField getTxtPaciente() {
        return txtPaciente;
    }

    public JPanel getjPanelAgendamento() {
        return jPanelAgendamento;
    }

    public JButton getBtnBuscarMedico() {
        return btnBuscarMedico;
    }

    public JButton getBtnBuscarPaciente() {
        return btnBuscarPaciente;
    }

    public JPanel getjPanelId() {
        return jPanelId;
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
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnBuscarMedico;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private com.toedter.calendar.JDateChooser jDateChooserData;
    private javax.swing.JFormattedTextField jFThora;
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
    private javax.swing.JPanel jPanelAgendamento;
    private javax.swing.JPanel jPanelId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTable jTablePacientes;
    private javax.swing.JTextArea jTextAreaMotivo;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtPaciente;
}
