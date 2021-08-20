/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Compras;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
/**

/**
 *
 * @author EAN
 */
public class pantalla extends javax.swing.JFrame {

    /**
     * Creates new form pantalla
     */
    public pantalla() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnConsulta1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnConsulta2 = new javax.swing.JButton();
        btnConsulta3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelConsulta1 = new javax.swing.JLabel();
        jLabelConslta2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reto 5 - MisiónTIC");
        setName("Reto 5 - MisiónTIC 2022"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSTRUCTORA LOCAL DE VIVIENDA S.A.S.");

        jLabel2.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MisiónTic 2022 - UTP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ", " "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnConsulta1.setText("Consuta 1");
        btnConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta1ActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnConsulta2.setText("Consulta 2");
        btnConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta2ActionPerformed(evt);
            }
        });

        btnConsulta3.setText("Consulta3");
        btnConsulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai Light", 0, 10)); // NOI18N
        jLabel3.setText("Realizado por: Alvaro David Arévalo Salazar");

        jLabel4.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jLabel4.setText("¡Bienvenidx!");

        jLabelConsulta1.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabelConsulta1.setText("Su Consulta es:");

        jLabelConslta2.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabelConslta2.setText("Oprima un botón para mostrar su consulta. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnConsulta1)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta2)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta3)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConslta2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelConsulta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelConslta2)))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsulta1)
                    .addComponent(btnConsulta2)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta3))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta1ActionPerformed
        // TODO add your handling code here:
        
        //Objeto que vamos a insertar en el modelo
        //String[] fila = {"123", "Pedrito"};
        //modelo.addRow(fila);
        //ModeloDatos modelo2 = new ModeloDatos();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {},new String [] {"ID_COMPRA", "PROVEEDORES"}));
        jLabelConslta2.setText("id de las compras que si están pagadas");
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       final ControladorRequerimientos controlador = new ControladorRequerimientos();
        modelo.setRowCount(0);
        try {
            ArrayList <Compras> lista = controlador.consultarRequerimiento1(); //Aca tengo mi listado de compras
            Object matriz[][] =  new Object [lista.size()][2];//En esta CONSULTA LA MATRIZ va a tener lista.size flias y va a tener 2 columnas
            for(int i = 0 ; i < lista.size();i++){
                matriz[i][0] = lista.get(i).getID_Compra();
                matriz[i][1] = lista.get(i).getProveedor();
                modelo.addRow(matriz[i]);
            }
            //modelo2.datos = matriz;
            //modelo.addRow(matriz); 
            //JTable tabla = new JTable(modelo2);
            //JScrollPane scroll = new JScrollPane(tabla);
            //JOptionPane.showMessageDialog(null, scroll);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConsulta1ActionPerformed
    
    private void btnConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta2ActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {},new String [] {"ID_COMPRA", "PROVEEDORES"}));
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        jLabelConsulta1.setText("id de todas las compras cuyo precio por unidad de su material de construcción");
        jLabelConslta2.setText("es inferior a 1100");
        final ControladorRequerimientos controlador = new ControladorRequerimientos();
        modelo.setRowCount(0);
        try {
            ArrayList <Requerimiento_2> lista = controlador.consultarRequerimiento2(); //Aca tengo mi listado de compras
            Object matriz[][] =  new Object [lista.size()][2];//En esta CONSULTA LA MATRIZ va a tener lista.size flias y va a tener 2 columnas
            for(int i = 0 ; i < lista.size();i++){
                matriz[i][0] = lista.get(i).getID_Compra();
                matriz[i][1] = lista.get(i).getProveedor();
                modelo.addRow(matriz[i]);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConsulta2ActionPerformed

    private void btnConsulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta3ActionPerformed
        // TODO add your handling code here:
        jLabelConsulta1.setText("Su consulta es:");
        jLabelConslta2.setText("id de la compra y el año de las compras pagadas parcialmente y en el mes ‘02’");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {},new String [] {"ID COMPRA", "FECHA"}));
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        final ControladorRequerimientos controlador = new ControladorRequerimientos();
        modelo.setRowCount(0);
        try {
            ArrayList <Requerimiento_3> lista = controlador.consultarRequerimiento3(); //Aca tengo mi listado de compras
            Object matriz[][] =  new Object [lista.size()][2];//En esta CONSULTA LA MATRIZ va a tener lista.size flias y va a tener 2 columnas
            for(int i = 0 ; i < lista.size();i++){
                matriz[i][0] = lista.get(i).getID_Compra();
                matriz[i][1] = lista.get(i).getFecha();
                modelo.addRow(matriz[i]);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConsulta3ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jLabelConsulta1.setText("Su consulta es:");
        jLabelConslta2.setText("Oprima un botón para mostrar su consulta. ");
        jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {},new String [] {" ", " "}));
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta1;
    private javax.swing.JButton btnConsulta2;
    private javax.swing.JButton btnConsulta3;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelConslta2;
    private javax.swing.JLabel jLabelConsulta1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
