/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import DTO.LibroDTO;
import DTO.TablaVentaLibroDTO;

import data.HistorialVentasPorLibro;
import excepciones.HistorialVentasExcepciones;
import guardado.Guardado;

import interfaz.IHistorialVentasService;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ConsultarVentasLibrosForm extends javax.swing.JFrame {

    private IHistorialVentasService ventas;

    public ConsultarVentasLibrosForm() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.ventas = new HistorialVentasPorLibro();
        metodosInicales();
    }

    private void metodosInicales() {
        llenarCampos();
        llenarTabla();
    }

    private void llenarCampos() {
        LibroDTO libroDTO;
        try {
            libroDTO = ventas.consultarLibro(Guardado.getIsbn());
            ImageIcon icon = new ImageIcon(libroDTO.getPortadaDTO());
            Image scaledImage = icon.getImage().getScaledInstance(195, 242, Image.SCALE_SMOOTH);
            imagenBoton.setIcon(new ImageIcon(scaledImage));
            TituloLabel.setText(libroDTO.getTituloDTO());
            AutorLabel.setText(libroDTO.getAutorDTO());
            GeneroLabel.setText(libroDTO.getGeneroDTO());
            EditorialLabel.setText(libroDTO.getEditorialDTO());

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormateada = formato.format(libroDTO.getFechaDTO().getTime());
            FechaLabel.setText(fechaFormateada);
        } catch (HistorialVentasExcepciones ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarTabla() {
        DefaultTableModel model = (DefaultTableModel) VentasTable.getModel();
        String[] columnNames = {"Nombre Usuario", "Fecha Realizacion", "Precio Venta"};
        model.setColumnIdentifiers(columnNames);
        model.setRowCount(0); // Limpiar la tabla antes de llenarla
        List<TablaVentaLibroDTO> listalibros;
        try {
            listalibros = ventas.consultarVentasPorISBN(Guardado.getIsbn());
            for (TablaVentaLibroDTO libro : listalibros) {
                Object[] fila = {libro.getNombreUsuarioDTO(), libro.getFechaVentaDTO(), libro.getPrecioVenta()};
                model.addRow(fila);
            }
        } catch (HistorialVentasExcepciones ex) {
            JOptionPane.showMessageDialog(this, "Error al obtener la lista de libros: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

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
        imagenBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VentasTable = new javax.swing.JTable();
        TituloLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EditorialLabel = new javax.swing.JLabel();
        AutorLabel = new javax.swing.JLabel();
        GeneroLabel = new javax.swing.JLabel();
        FechaLabel = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel4.setText("Autor");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 94, -1, -1));

        jPanel2.setBackground(new java.awt.Color(88, 138, 135));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        jLabel1.setText("Ventas");

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-pequena-izquierda.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 721, -1));

        imagenBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenBotonActionPerformed(evt);
            }
        });
        getContentPane().add(imagenBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 94, 143, 189));

        VentasTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(VentasTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 125, 418, 326));

        TituloLabel.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        TituloLabel.setText("Titulo");
        getContentPane().add(TituloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel6.setText("Autor: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 331, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel7.setText("Genero: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel8.setText("Editorial: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel9.setText("Fecha de Publicacion:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        EditorialLabel.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        EditorialLabel.setText("Editorial Libro");
        getContentPane().add(EditorialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        AutorLabel.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        AutorLabel.setText("Autor Libro");
        getContentPane().add(AutorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        GeneroLabel.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        GeneroLabel.setText("Genero Libro");
        getContentPane().add(GeneroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        FechaLabel.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        FechaLabel.setText("Fecha Libro");
        getContentPane().add(FechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagenBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imagenBotonActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ConsultarLibrosVentaForm regresar=new ConsultarLibrosVentaForm();
        this.dispose();
        regresar.show();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutorLabel;
    private javax.swing.JLabel EditorialLabel;
    private javax.swing.JLabel FechaLabel;
    private javax.swing.JLabel GeneroLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JTable VentasTable;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton imagenBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
