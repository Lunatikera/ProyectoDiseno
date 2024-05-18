/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import DTO.AlumnoAdeudoDTO;
import data.HistorialAdeudoPorAlumno;
import excepciones.HistorialAlumnoExcepciones;
import interfaz.IHistorialAdeudoService;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class ConsultarAlumnosForm extends javax.swing.JFrame {

    private IHistorialAdeudoService adeudoALumno;

    public ConsultarAlumnosForm() {
        initComponents();
        metodosIniciales();
        this.adeudoALumno = new HistorialAdeudoPorAlumno();
        llenarTabla();
        setSize(840, 600);
        setResizable(false);
        iniciarFiltros();

    }

    private void iniciarFiltros() {
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtro();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtro();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtro();
            }
        };

        nomUsuarioTextField.getDocument().addDocumentListener(documentListener);

    }

    private void metodosIniciales() {
        tablaAlumnos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Configurar el resaltado de la fila seleccionada
        tablaAlumnos.setRowSelectionAllowed(true);

        // Deshabilitar la edición directa de las celdas
        tablaAlumnos.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomUsuarioTextField = new javax.swing.JTextField();
        AdeudoButton = new javax.swing.JRadioButton();

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel4.setText("Filtros de Consulta");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca");

        jPanel1.setBackground(new java.awt.Color(88, 88, 95));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(88, 138, 135));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        jLabel1.setText("Consultar Alumnos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 510, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-pequena-izquierda.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 80));

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAlumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 530, 360));

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel3.setText("Filtros de Consulta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel5.setText("Nombre de Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(nomUsuarioTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 30));

        AdeudoButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdeudoButton.setText("Solo mostrar alumnos con adeudo");
        AdeudoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdeudoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AdeudoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdeudoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdeudoButtonActionPerformed
        this.filtro();
    }//GEN-LAST:event_AdeudoButtonActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaAlumnos.getModel();
        String[] columnNames = {"Nombre Usuario", "Correo Electronico", "Adeudo"};
        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0); // Limpiar la tabla antes de llenarla

        try {
            List<AlumnoAdeudoDTO> listaAlumnos = adeudoALumno.listaAlumnosAdeudo();
            for (AlumnoAdeudoDTO alumno : listaAlumnos) {
                Object[] fila = {alumno.getNombreUsuarioDTO(), alumno.getCorreoElectronicoDTO(), alumno.getAdeudo()};
                model.addRow(fila);
            }
        } catch (HistorialAlumnoExcepciones ex) {
            JOptionPane.showMessageDialog(this, "Error al obtener la lista de alumnos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void filtro() {
        String nomUsuario = nomUsuarioTextField.getText().trim().toLowerCase(); // Convertir a minúsculas

        DefaultTableModel modelo = (DefaultTableModel) tablaAlumnos.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        tablaAlumnos.setRowSorter(sorter);

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        if (!nomUsuario.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + Pattern.quote(nomUsuario), 0)); // 0 es el índice de la columna en tu modelo de tabla para el ISBN
        }
        if (AdeudoButton.isSelected()) {
            filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, 0.0, 2)); // 2 es el índice de la columna en tu modelo de tabla para el adeudo
        }

        RowFilter<Object, Object> compoundRowFilter = RowFilter.andFilter(filters);
        sorter.setRowFilter(compoundRowFilter);
    }

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
            java.util.logging.Logger.getLogger(ConsultarAlumnosForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarAlumnosForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarAlumnosForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarAlumnosForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarAlumnosForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdeudoButton;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomUsuarioTextField;
    private javax.swing.JTable tablaAlumnos;
    // End of variables declaration//GEN-END:variables
}
