package productos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ver extends javax.swing.JFrame {

    productosDao product = new productosDao();
    DefaultTableModel modelo = new DefaultTableModel();
    Agrega add = new Agrega();

    public Ver() {
        initComponents();
        ListarProductos();
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 240, 213));

        jPanel2.setBackground(new java.awt.Color(120, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Ver producto");

        btnAtras.setBackground(new java.awt.Color(120, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos/cerrar-sesion.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Serie", "Color", "Fecha Adquisicion", "Tipo Adquisicion", "Observaciones", "Areas"
            }
        ));
        TableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableProductos);

        btnEditar.setBackground(new java.awt.Color(102, 155, 188));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 155, 188));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        menuProductos venMenu = new menuProductos();
        venMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = TableProductos.getSelectedRow();
        if (filaSeleccionada != -1) {
            String id = TableProductos.getValueAt(filaSeleccionada, 0).toString();
            if (!"".equals(id)) {
                int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
                if (pregunta == 0) {
                    add.setID(Integer.parseInt(id));
                    product.eliminarproducto(add);
                    ((DefaultTableModel) TableProductos.getModel()).removeRow(filaSeleccionada);
                    JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
                    
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProductosMouseClicked
        // TODO add your handling code here:
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_TableProductosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filaSeleccionada = TableProductos.getSelectedRow();

        if (filaSeleccionada != -1) {
            String id = TableProductos.getValueAt(filaSeleccionada, 0).toString();
            String nombre = TableProductos.getValueAt(filaSeleccionada, 1).toString();
            String descripcion = TableProductos.getValueAt(filaSeleccionada, 2).toString();
            String serie = TableProductos.getValueAt(filaSeleccionada, 3).toString();
            String color = TableProductos.getValueAt(filaSeleccionada, 4).toString();
            String fechaTexto = TableProductos.getValueAt(filaSeleccionada, 5) != null ? TableProductos.getValueAt(filaSeleccionada, 5).toString().trim() : "";
            String tipo = TableProductos.getValueAt(filaSeleccionada, 6).toString();
            String observaciones = TableProductos.getValueAt(filaSeleccionada, 7).toString();
            String area = TableProductos.getValueAt(filaSeleccionada, 8).toString();

            Date fechaConvertida = null;
            if (!fechaTexto.isEmpty()) {
                try {
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); 
                    fechaConvertida = formato.parse(fechaTexto);
                    System.out.println("Fecha convertida correctamente: " + fechaConvertida);
                } catch (ParseException e) {
                    JOptionPane.showMessageDialog(this, "Error al convertir la fecha: " + e.getMessage());
                    return;
                }
            }

            Agregar venAgregar = new Agregar(id, nombre, serie, color, tipo, descripcion, observaciones, fechaConvertida, area);

            venAgregar.ocultarBotonGuardar();

            venAgregar.setVisible(true);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un producto para editar.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableProductos;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void ListarProductos() {
        List<Agrega> Listarproducts = product.ListarProductos();
        modelo = (DefaultTableModel) TableProductos.getModel();
        Object[] ob = new Object[9];
        for (int i = 0; i < Listarproducts.size(); i++) {
            ob[0] = Listarproducts.get(i).getID();
            ob[1] = Listarproducts.get(i).getNombre();
            ob[2] = Listarproducts.get(i).getDescripcion();
            ob[3] = Listarproducts.get(i).getSerie();
            ob[4] = Listarproducts.get(i).getColor();
            ob[5] = Listarproducts.get(i).getFecha();
            ob[6] = Listarproducts.get(i).getTipo();
            ob[7] = Listarproducts.get(i).getObservacion();
            ob[8] = Listarproducts.get(i).getArea();
            modelo.addRow(ob);
        }
        TableProductos.setModel(modelo);
    }

}
