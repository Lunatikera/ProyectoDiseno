/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import DTO.TablaLibroDTO;
import data.HistorialFiltrarLibros;
import excepciones.HistorialFiltrarLibrosExcepcion;
import guardado.Guardado;
import interfaz.IHistorialLibrosService;
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
public class ConsultarLibrosVentaForm extends javax.swing.JFrame {

    private IHistorialLibrosService ventaLibros;

    public ConsultarLibrosVentaForm() {
        initComponents();
        metodosIniciales();
        this.ventaLibros = new HistorialFiltrarLibros();
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

        ISBNTextField.getDocument().addDocumentListener(documentListener);
        TituloTextField.getDocument().addDocumentListener(documentListener);
        GeneroTextField.getDocument().addDocumentListener(documentListener);
        AutorTextField.getDocument().addDocumentListener(documentListener);

    }

    private void metodosIniciales() {
        tablaLibros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Configurar el resaltado de la fila seleccionada
        tablaLibros.setRowSelectionAllowed(true);

        // Deshabilitar la edición directa de las celdas
        tablaLibros.setDefaultEditor(Object.class, null);
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
        tablaLibros = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        GeneroTextField = new javax.swing.JTextField();
        ISBNTextField = new javax.swing.JTextField();
        AutorTextField = new javax.swing.JTextField();
        TituloTextField = new javax.swing.JTextField();

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel4.setText("Filtros de Consulta");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca");

        jPanel1.setBackground(new java.awt.Color(88, 88, 95));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(88, 138, 135));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 36)); // NOI18N
        jLabel1.setText("Consultar Ventas por Libro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 510, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-pequena-izquierda.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 80));

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 530, 360));

        jLabel2.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel2.setText("Autor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel3.setText("Filtros de Consulta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel5.setText("ISBN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel6.setText("Titulo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel7.setText("Genero");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        GeneroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(GeneroTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, 30));
        jPanel1.add(ISBNTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 30));

        AutorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(AutorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 30));

        TituloTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(TituloTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 30));

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
    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaLibros.getModel();
        String[] columnNames = {"ISBN", "Título", "Género", "Autor", "Editorial"};
        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0); // Limpiar la tabla antes de llenarla

        try {
            List<TablaLibroDTO> lislalibros = ventaLibros.TablaLibros();
            for (TablaLibroDTO libro : lislalibros) {
                Object[] fila = {libro.getISBNDTO(), libro.getTituloDTO(), libro.getGeneroDTO(), libro.getAutorDTO(), libro.getEditorialDTO()};
                model.addRow(fila);
            }
        } catch (HistorialFiltrarLibrosExcepcion ex) {
            JOptionPane.showMessageDialog(this, "Error al obtener la lista de libros: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void TituloTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloTextFieldActionPerformed

    private void GeneroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeneroTextFieldActionPerformed

    private void AutorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorTextFieldActionPerformed
    private void filtro() {
        String isbn = ISBNTextField.getText().trim().toLowerCase(); // Convertir a minúsculas
        String titulo = TituloTextField.getText().trim().toLowerCase(); // Convertir a minúsculas
        String genero = GeneroTextField.getText().trim().toLowerCase(); // Convertir a minúsculas
        String autor = AutorTextField.getText().trim().toLowerCase(); // Convertir a minúsculas

        DefaultTableModel modelo = (DefaultTableModel) tablaLibros.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        tablaLibros.setRowSorter(sorter);

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        if (!isbn.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + Pattern.quote(isbn), 0)); // 0 es el índice de la columna en tu modelo de tabla para el ISBN
        }
        if (!titulo.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + Pattern.quote(titulo), 1)); // 1 es el índice de la columna en tu modelo de tabla para el título
        }
        if (!genero.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + Pattern.quote(genero), 2)); // 2 es el índice de la columna en tu modelo de tabla para el género
        }
        if (!autor.isEmpty()) {
            filters.add(RowFilter.regexFilter("(?i)" + Pattern.quote(autor), 3)); // 3 es el índice de la columna en tu modelo de tabla para el autor
        }

        RowFilter<Object, Object> compoundRowFilter = RowFilter.andFilter(filters);
        sorter.setRowFilter(compoundRowFilter);
    }


    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked
        if (evt.getClickCount() == 2) {
            // Obtener la fila seleccionada
            int filaSeleccionada = tablaLibros.getSelectedRow();
            // Verificar si se seleccionó una fila válida
            if (filaSeleccionada != -1) {
                String isbn = (String) tablaLibros.getValueAt(filaSeleccionada, 0);
                Guardado.setIsbn(isbn);
                ConsultarVentasLibrosForm consultar = new ConsultarVentasLibrosForm();
                consultar.setVisible(true);


                // Crear una nueva ventana para mostrar los detalles del libro    }//GEN-LAST:event_tablaLibrosMouseClicked
            }
        }
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AutorTextField;
    private javax.swing.JTextField GeneroTextField;
    private javax.swing.JTextField ISBNTextField;
    private javax.swing.JTextField TituloTextField;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLibros;
    // End of variables declaration//GEN-END:variables
}
