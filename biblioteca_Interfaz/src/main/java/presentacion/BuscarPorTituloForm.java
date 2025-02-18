/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import DTO.LibroDTO;
import data.FiltrarTitulo;
import excepciones.FlitroException;
import guardado.Guardado;
import interfaces.IFiltrarTituloServices;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Rios
 */
public class BuscarPorTituloForm extends javax.swing.JFrame {

    private IFiltrarTituloServices filtrarTitulo;
    private int pagina = 0;
    private int contadorPagina = 1;
    private final int LIMITE = 4;
    private JButton[] botones;
    private JLabel[] labels;
    private int totalPaginas;
    private List<LibroDTO> librosCargados;

    /**
     * Creates new form Menu
     */
    public BuscarPorTituloForm() {
        initComponents();
        this.librosCargados = new ArrayList<>();
        this.setSize(1119, 639);
        this.setResizable(false);
        this.filtrarTitulo = new FiltrarTitulo();
        this.setLocationRelativeTo(this);
        this.botones = new JButton[4];
        botones[0] = btnLibro1;
        botones[1] = btnLibro2;
        botones[2] = btnLibro3;
        botones[3] = btnLibro4;
        this.labels = new JLabel[4];
        labels[0] = txtLibro1;
        labels[1] = txtLibro2;
        labels[2] = txtLibro3;
        labels[3] = txtLibro4;
        this.cargarMetodosIniciales();

    }

    private void cargarMetodosIniciales() {
        this.cargarLibros();
        btnAtras.setEnabled(false);
        TituloField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                // Llamar al método cargarLibros() cada vez que se inserte texto en el campo de texto
                cargarLibros();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // Llamar al método cargarLibros() cada vez que se elimine texto del campo de texto
                cargarLibros();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Este método se llama cuando ocurre un cambio en los atributos del documento, 
                // como un cambio en el estilo del texto, pero no necesitamos hacer nada en este caso
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        brnUsuario5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtLibro1 = new javax.swing.JLabel();
        txtLibro2 = new javax.swing.JLabel();
        txtLibro3 = new javax.swing.JLabel();
        txtLibro4 = new javax.swing.JLabel();
        btnLibro1 = new javax.swing.JButton();
        btnLibro2 = new javax.swing.JButton();
        btnLibro3 = new javax.swing.JButton();
        btnLibro4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        contPagina = new javax.swing.JLabel();
        btnBuscar5 = new javax.swing.JButton();
        TituloField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca");
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel9.setBackground(new java.awt.Color(88, 138, 135));

        brnUsuario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-pequena-izquierda.png"))); // NOI18N
        brnUsuario5.setContentAreaFilled(false);
        brnUsuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnUsuario5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(brnUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1050, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(brnUsuario5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(88, 88, 95));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLibro1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLibro1.setText("EL PODER DE ESTAR SOLO");
        txtLibro1.setToolTipText("");
        jPanel1.add(txtLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 170, -1));

        txtLibro2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLibro2.setText("EL PAIS DE UN SOLO HOMBRE");
        jPanel1.add(txtLibro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 370, 180, -1));

        txtLibro3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLibro3.setText("PERCY JACKSON");
        jPanel1.add(txtLibro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 170, -1));

        txtLibro4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLibro4.setText("ORGULLO Y PREJUICIO");
        jPanel1.add(txtLibro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 170, 50));

        btnLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibro1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 167, 217));

        btnLibro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibro2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLibro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 167, 217));

        btnLibro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibro3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLibro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 167, 217));

        btnLibro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibro4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLibro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 167, 217));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 400, 458, -1));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/angulo-derecho.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 50, 30));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/angulo-izquierdo.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 50, 30));

        contPagina.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        contPagina.setText("1");
        jPanel1.add(contPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 50, -1));

        btnBuscar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/busqueda.png"))); // NOI18N
        btnBuscar5.setContentAreaFilled(false);
        jPanel1.add(btnBuscar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 69, 72));
        jPanel1.add(TituloField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1152, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brnUsuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnUsuario5ActionPerformed
        BuscarForm buscar = new BuscarForm();
        buscar.setVisible(true);
        dispose();    }//GEN-LAST:event_brnUsuario5ActionPerformed

    private void btnLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibro1ActionPerformed
        LibroDTO libro = librosCargados.get(0);
        Guardado.setIsbn(libro.getISBNDTO());
        LibroPresentacionForm libroForm = new LibroPresentacionForm();
        libroForm.setVisible(true);
    }//GEN-LAST:event_btnLibro1ActionPerformed

    private void btnLibro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibro2ActionPerformed

        LibroDTO libro = librosCargados.get(1);
        Guardado.setIsbn(libro.getISBNDTO());
        LibroPresentacionForm libroForm = new LibroPresentacionForm();
        libroForm.setVisible(true);
    }//GEN-LAST:event_btnLibro2ActionPerformed

    private void btnLibro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibro3ActionPerformed
        LibroDTO libro = librosCargados.get(2);
        Guardado.setIsbn(libro.getISBNDTO());
        LibroPresentacionForm libroForm = new LibroPresentacionForm();
        libroForm.setVisible(true);
    }//GEN-LAST:event_btnLibro3ActionPerformed

    private void btnLibro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibro4ActionPerformed
        LibroDTO libro = librosCargados.get(3);
        Guardado.setIsbn(libro.getISBNDTO());
        LibroPresentacionForm libroForm = new LibroPresentacionForm();
        libroForm.setVisible(true);
    }//GEN-LAST:event_btnLibro4ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        contadorPagina++;
        contPagina.setText(String.valueOf(contadorPagina));
        if (this.pagina < this.totalPaginas - 1) {
            this.pagina++;
            this.cargarLibros();
            this.verificarBotonesNavegacion();
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        contadorPagina--;
        contPagina.setText(String.valueOf(contadorPagina));
        if (this.pagina > 0) {
            this.pagina--;
            this.cargarLibros();
            this.verificarBotonesNavegacion();
        }
    }//GEN-LAST:event_btnAtrasActionPerformed
    private void cargarLibros() {
        String titulo = TituloField.getText();

        try {
            this.totalPaginas = (int) Math.ceil((double) this.filtrarTitulo.listaLibrosTitulo(titulo).size() / this.LIMITE);
            // Calcular el índice inicial del libro para esta página
            int startIndex = this.pagina * this.LIMITE;

            if (!filtrarTitulo.listaLibrosTitulo(titulo).isEmpty()) {
                int endIndex = Math.min(startIndex + this.LIMITE, this.filtrarTitulo.listaLibrosTitulo(titulo).size());

                // Obtener la sublista de libros para esta página
                List<LibroDTO> libroLista = this.filtrarTitulo.listaLibrosTitulo(titulo).subList(startIndex, endIndex);

                librosCargados.clear();
                librosCargados.addAll(libroLista);
                System.out.println(libroLista.size());

                this.llenarCampos(libroLista);
            } else {
                librosCargados.clear();
                for (int i = 0; i < LIMITE; i++) {
                    ImageIcon icono = new ImageIcon(getClass().getResource("/images/soon.jpg"));
                    Image scaledImage = icono.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                    botones[i].setIcon(new ImageIcon(scaledImage));
                    labels[i].setText(""); // Limpiar texto
                    botones[i].setEnabled(false); // Desactivar botón
                }
                this.verificarBotonesNavegacion();

            }
        } catch (FlitroException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void llenarCampos(List<LibroDTO> libroLista) throws FlitroException {
        if (libroLista.isEmpty()) {
            throw new FlitroException("Ningun Libro");
        }
        for (int i = 0; i < libroLista.size(); i++) {
            botones[i].setVisible(true);
            labels[i].setVisible(true);
            botones[i].setEnabled(true);
            ImageIcon icon = new ImageIcon(libroLista.get(i).getPortadaDTO());
            Image scaledImage = icon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            botones[i].setIcon(new ImageIcon(scaledImage));
            labels[i].setText(libroLista.get(i).getTituloDTO());
        }
        // Limpiar botones y etiquetas restantes
        for (int i = libroLista.size(); i < LIMITE; i++) {
            ImageIcon icono = new ImageIcon(getClass().getResource("/images/soon.jpg"));
            Image scaledIcono = icono.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            botones[i].setIcon(new ImageIcon(scaledIcono));
            labels[i].setText("");
            botones[i].setEnabled(false);

        }

        this.verificarBotonesNavegacion();

    }

    private void verificarBotonesNavegacion() {
        btnAtras.setEnabled(this.pagina > 0);
        btnSiguiente.setEnabled(this.botones[3].isEnabled());
        TituloField.setEnabled(contadorPagina <= 1);

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
            java.util.logging.Logger.getLogger(BuscarPorTituloForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPorTituloForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPorTituloForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPorTituloForm.class
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPorTituloForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TituloField;
    private javax.swing.JButton brnUsuario;
    private javax.swing.JButton brnUsuario1;
    private javax.swing.JButton brnUsuario2;
    private javax.swing.JButton brnUsuario3;
    private javax.swing.JButton brnUsuario4;
    private javax.swing.JButton brnUsuario5;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnBuscar4;
    private javax.swing.JButton btnBuscar5;
    private javax.swing.JButton btnLibro1;
    private javax.swing.JButton btnLibro2;
    private javax.swing.JButton btnLibro3;
    private javax.swing.JButton btnLibro4;
    private javax.swing.JButton btnLibro5;
    private javax.swing.JButton btnLibro6;
    private javax.swing.JButton btnLibro7;
    private javax.swing.JButton btnLibro8;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel contPagina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel txtLibro1;
    private javax.swing.JLabel txtLibro2;
    private javax.swing.JLabel txtLibro3;
    private javax.swing.JLabel txtLibro4;
    private javax.swing.JLabel txtLibro5;
    private javax.swing.JLabel txtLibro6;
    private javax.swing.JLabel txtLibro7;
    private javax.swing.JLabel txtLibro8;
    // End of variables declaration//GEN-END:variables
}
