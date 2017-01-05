package Presentacion;

import Logica.conexion;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class catalogo extends javax.swing.JFrame {

    // Se instancia una conexion de la clase conecta
    conexion con = new conexion();
    // se asigna la conexion a la base de datos con la variable cn
    Connection cn = con.conectar();
    // asignamos la primera tabla
    DefaultTableModel manipulacion;

    public catalogo() {
        initComponents();
        this.setLocationRelativeTo(null);
        asignarAutocompletado();
        asignarAutocompletadoMaquila();
        asignarAutocompletado1();
        asignarAutocompletadoMaquila1();
        asignarAutocompletado2();
        asignarAutocompletadoMaquila2();
        btnIntegrar.setEnabled(false);
        btnIntegrarCostura.setEnabled(false);
        btnIntegrarInyeccion.setEnabled(false);
        btnIntegrarTotal.setEnabled(false);
        btnImagen.setEnabled(false);
    }

    // iniciamos autocompletado de los 3 campos dobles
    public void asignarAutocompletado() {
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txtPredecible);
        textAutoCompleter.setMode(0); // infijo
        textAutoCompleter.setCaseSensitive(false); //No sensible a mayúsculas

        //iniciamos
        try {
            String sql = "SELECT * FROM inventario";
            Statement completar;
            completar = cn.createStatement();
            ResultSet rs = completar.executeQuery(sql);
            while (rs.next()) {
                textAutoCompleter.addItem(rs.getString("nombre"));

            }

        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla1");
        }

    }

    public void asignarAutocompletadoMaquila() {
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txtMaquila);
        textAutoCompleter.setMode(0); // infijo
        textAutoCompleter.setCaseSensitive(false); //No sensible a mayúsculas

        //iniciamos
        try {
            String sql = "SELECT * FROM maquila";
            Statement completar;
            completar = cn.createStatement();
            ResultSet rs = completar.executeQuery(sql);
            while (rs.next()) {
                textAutoCompleter.addItem(rs.getString("nombre"));

            }

        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla2");
        }

    }
    
    public void asignarAutocompletado1() {
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txtPredecible1);
        textAutoCompleter.setMode(0); // infijo
        textAutoCompleter.setCaseSensitive(false); //No sensible a mayúsculas

        //iniciamos
        try {
            String sql = "SELECT * FROM inventario";
            Statement completar;
            completar = cn.createStatement();
            ResultSet rs = completar.executeQuery(sql);
            while (rs.next()) {
                textAutoCompleter.addItem(rs.getString("nombre"));

            }

        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla1");
        }

    }
    
    public void asignarAutocompletado2() {
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txtPredecible2);
        textAutoCompleter.setMode(0); // infijo
        textAutoCompleter.setCaseSensitive(false); //No sensible a mayúsculas

        //iniciamos
        try {
            String sql = "SELECT * FROM inventario";
            Statement completar;
            completar = cn.createStatement();
            ResultSet rs = completar.executeQuery(sql);
            while (rs.next()) {
                textAutoCompleter.addItem(rs.getString("nombre"));

            }

        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla1");
        }

    }
public void asignarAutocompletadoMaquila1() {
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txtMaquila1);
        textAutoCompleter.setMode(0); // infijo
        textAutoCompleter.setCaseSensitive(false); //No sensible a mayúsculas

        //iniciamos
        try {
            String sql = "SELECT * FROM maquila";
            Statement completar;
            completar = cn.createStatement();
            ResultSet rs = completar.executeQuery(sql);
            while (rs.next()) {
                textAutoCompleter.addItem(rs.getString("nombre"));

            }

        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla2");
        }

    }
public void asignarAutocompletadoMaquila2() {
        TextAutoCompleter textAutoCompleter = new TextAutoCompleter(txtMaquila2);
        textAutoCompleter.setMode(0); // infijo
        textAutoCompleter.setCaseSensitive(false); //No sensible a mayúsculas

        //iniciamos
        try {
            String sql = "SELECT * FROM maquila";
            Statement completar;
            completar = cn.createStatement();
            ResultSet rs = completar.executeQuery(sql);
            while (rs.next()) {
                textAutoCompleter.addItem(rs.getString("nombre"));

            }

        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla2");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLinea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        chkActivo = new javax.swing.JCheckBox();
        panel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPredecible = new javax.swing.JTextField();
        btnIntegrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMan = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSubManipulacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMaquila = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();
        btnActMaquila = new javax.swing.JButton();
        btnNuevaMaquila = new javax.swing.JButton();
        btnActInventario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPredecible1 = new javax.swing.JTextField();
        btnIntegrarCostura = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMan1 = new javax.swing.JTable();
        btnBorrar1 = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPar1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSubManipulacion1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMaquila1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrecio3 = new javax.swing.JTextField();
        btnActMaquila1 = new javax.swing.JButton();
        btnNuevaMaquila1 = new javax.swing.JButton();
        btnActInventario1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtPredecible2 = new javax.swing.JTextField();
        btnIntegrarInyeccion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMan2 = new javax.swing.JTable();
        btnBorrar2 = new javax.swing.JButton();
        btnActualizar2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtPar2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPrecio4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtSubManipulacion2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMaquila2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPrecio5 = new javax.swing.JTextField();
        btnActMaquila2 = new javax.swing.JButton();
        btnNuevaMaquila2 = new javax.swing.JButton();
        btnActInventario2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtPredecible3 = new javax.swing.JTextField();
        btnIntegrarTotal = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMan3 = new javax.swing.JTable();
        btnBorrar3 = new javax.swing.JButton();
        btnActualizar3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtPar3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPrecio6 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtSubManipulacion3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtMaquila3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtPrecio7 = new javax.swing.JTextField();
        btnActMaquila3 = new javax.swing.JButton();
        btnNuevaMaquila3 = new javax.swing.JButton();
        btnActInventario3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnImagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Catalogo"));

        jLabel1.setText("Linea");

        jLabel2.setText("Modelo");

        jLabel3.setText("Articulo");

        jLabel4.setText("Color");

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/editar.png"))); // NOI18N
        btnEditar.setText("Editar");

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/nuevo.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        chkActivo.setSelected(true);
        chkActivo.setText("Activo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(chkActivo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrear)
                    .addComponent(btnEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear)
                            .addComponent(chkActivo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Especificacion");

        btnIntegrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/grabar.png"))); // NOI18N
        btnIntegrar.setText("Integrar");
        btnIntegrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrarActionPerformed(evt);
            }
        });

        tablaMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Material", "Unidad", "Consumo", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaMan);

        btnBorrar.setText("Borrar");

        btnActualizar.setText("Actualizar");

        jLabel6.setText("Consumo por par");

        jLabel7.setText("Precio");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel10.setText("SubTotal");

        jLabel11.setText("Maquila");

        jLabel13.setText("Costo");

        txtPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio1ActionPerformed(evt);
            }
        });

        btnActMaquila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActMaquila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActMaquilaActionPerformed(evt);
            }
        });

        btnNuevaMaquila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/maquila.png"))); // NOI18N
        btnNuevaMaquila.setText("Nuevo");
        btnNuevaMaquila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMaquilaActionPerformed(evt);
            }
        });

        btnActInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActInventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(39, 39, 39)
                                .addComponent(btnBorrar)
                                .addGap(435, 435, 435)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(txtSubManipulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPredecible, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtMaquila))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActMaquila, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnActInventario)
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevaMaquila))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIntegrar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIntegrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(txtPredecible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnActInventario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtMaquila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActMaquila)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevaMaquila)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnActualizar)
                    .addComponent(jLabel10)
                    .addComponent(txtSubManipulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.addTab("Manipulacion", jPanel2);

        jLabel8.setText("Especificacion");

        btnIntegrarCostura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/grabar.png"))); // NOI18N
        btnIntegrarCostura.setText("Integrar");
        btnIntegrarCostura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrarCosturaActionPerformed(evt);
            }
        });

        tablaMan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Material", "Unidad", "Consumo", "Precio", "Total"
            }
        ));
        jScrollPane2.setViewportView(tablaMan1);

        btnBorrar1.setText("Borrar");

        btnActualizar1.setText("Actualizar");

        jLabel9.setText("Consumo por par");

        jLabel12.setText("Precio");

        txtPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio2ActionPerformed(evt);
            }
        });

        jLabel14.setText("SubTotal");

        jLabel15.setText("Maquila");

        jLabel16.setText("Costo");

        txtPrecio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio3ActionPerformed(evt);
            }
        });

        btnActMaquila1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActMaquila1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActMaquila1ActionPerformed(evt);
            }
        });

        btnNuevaMaquila1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/maquila.png"))); // NOI18N
        btnNuevaMaquila1.setText("Nuevo");
        btnNuevaMaquila1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMaquila1ActionPerformed(evt);
            }
        });

        btnActInventario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActInventario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActInventario1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnActualizar1)
                                .addGap(39, 39, 39)
                                .addComponent(btnBorrar1)
                                .addGap(435, 435, 435)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(txtSubManipulacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPredecible1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtMaquila1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActMaquila1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnActInventario1)
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevaMaquila1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIntegrarCostura)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIntegrarCostura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtPredecible1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnActInventario1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtMaquila1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActMaquila1)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtPrecio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtPar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevaMaquila1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar1)
                    .addComponent(btnActualizar1)
                    .addComponent(jLabel14)
                    .addComponent(txtSubManipulacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panel.addTab("Costura-Pespunte", jPanel3);

        jLabel17.setText("Especificacion");

        btnIntegrarInyeccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/grabar.png"))); // NOI18N
        btnIntegrarInyeccion.setText("Integrar");
        btnIntegrarInyeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrarInyeccionActionPerformed(evt);
            }
        });

        tablaMan2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Material", "Unidad", "Consumo", "Precio", "Total"
            }
        ));
        jScrollPane3.setViewportView(tablaMan2);

        btnBorrar2.setText("Borrar");

        btnActualizar2.setText("Actualizar");

        jLabel18.setText("Consumo por par");

        jLabel19.setText("Precio");

        txtPrecio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio4ActionPerformed(evt);
            }
        });

        jLabel20.setText("SubTotal");

        jLabel21.setText("Maquila");

        jLabel22.setText("Costo");

        txtPrecio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio5ActionPerformed(evt);
            }
        });

        btnActMaquila2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActMaquila2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActMaquila2ActionPerformed(evt);
            }
        });

        btnNuevaMaquila2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/maquila.png"))); // NOI18N
        btnNuevaMaquila2.setText("Nuevo");
        btnNuevaMaquila2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMaquila2ActionPerformed(evt);
            }
        });

        btnActInventario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActInventario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActInventario2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnActualizar2)
                                .addGap(39, 39, 39)
                                .addComponent(btnBorrar2)
                                .addGap(435, 435, 435)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(txtSubManipulacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPredecible2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtMaquila2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActMaquila2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnActInventario2)
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPar2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevaMaquila2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIntegrarInyeccion)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIntegrarInyeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(txtPredecible2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnActInventario2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtMaquila2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActMaquila2)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txtPrecio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtPrecio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtPar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevaMaquila2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar2)
                    .addComponent(btnActualizar2)
                    .addComponent(jLabel20)
                    .addComponent(txtSubManipulacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panel.addTab("Inyeccion y Terminacion", jPanel4);

        jLabel23.setText("Especificacion");

        btnIntegrarTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/grabar.png"))); // NOI18N
        btnIntegrarTotal.setText("Integrar");
        btnIntegrarTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrarTotalActionPerformed(evt);
            }
        });

        tablaMan3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Material", "Unidad", "Consumo", "Precio", "Total"
            }
        ));
        jScrollPane4.setViewportView(tablaMan3);

        btnBorrar3.setText("Borrar");

        btnActualizar3.setText("Actualizar");

        jLabel24.setText("Consumo por par");

        jLabel25.setText("Precio");

        txtPrecio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio6ActionPerformed(evt);
            }
        });

        jLabel26.setText("SubTotal");

        jLabel27.setText("Maquila");

        jLabel28.setText("Costo");

        txtPrecio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio7ActionPerformed(evt);
            }
        });

        btnActMaquila3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActMaquila3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActMaquila3ActionPerformed(evt);
            }
        });

        btnNuevaMaquila3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/maquila.png"))); // NOI18N
        btnNuevaMaquila3.setText("Nuevo");
        btnNuevaMaquila3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMaquila3ActionPerformed(evt);
            }
        });

        btnActInventario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/actmaquila.png"))); // NOI18N
        btnActInventario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActInventario3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnActualizar3)
                                .addGap(39, 39, 39)
                                .addComponent(btnBorrar3)
                                .addGap(435, 435, 435)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(txtSubManipulacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPredecible3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtMaquila3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActMaquila3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(btnActInventario3)
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPar3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnNuevaMaquila3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIntegrarTotal)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIntegrarTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(txtPredecible3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnActInventario3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(txtMaquila3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActMaquila3)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtPrecio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28)
                                    .addComponent(txtPrecio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtPar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevaMaquila3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar3)
                    .addComponent(btnActualizar3)
                    .addComponent(jLabel26)
                    .addComponent(txtSubManipulacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panel.addTab("Total", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagen"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        btnImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graficos/imagen.png"))); // NOI18N
        btnImagen.setText("Actualizar Imagen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void integraTabla(String proceso){
        System.out.println(proceso);
        //verificamos si es maquila o inventario a integrar el modelo

        //checamos que no tengan ambos campos con texto
        if (txtPredecible.getText().length() > 1 && txtMaquila.getText().length() > 1) {
            JOptionPane.showMessageDialog(this, "Solo integra un elemento a la vez");
        } // vericamos que ambos no esten vacios
        else if (txtPredecible.getText().length() == 0 && txtMaquila.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Agrega un material o una maquila");
        } else if (txtPredecible.getText().length() > 1) {
            //aqui integramos un material del inventario

            //primero verificamos que si este en la base de datos de inventario
            int contador = 0;
            try {
                String checar = "SELECT * FROM inventario WHERE nombre='" + txtPredecible.getText() + "'";
                Statement repetido;
                repetido = cn.createStatement();
                ResultSet buscar = repetido.executeQuery(checar);
                while (buscar.next()) {
                    contador = 1;

                }
            } catch (SQLException ex) {
                Logger.getLogger(frminventario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (contador == 1) {
                //revisamos que no este repetido el material en el calzado

                int material = 0;
                try {
                    String checar = "SELECT * FROM calzado WHERE nombre='" + txtPredecible.getText() + "' and modelo='"
                            + txtModelo.getText() + "' and articulo='" + txtArticulo.getText() + "'";
                    Statement repetido;
                    repetido = cn.createStatement();
                    ResultSet buscar = repetido.executeQuery(checar);
                    while (buscar.next()) {
                        material++;
                        JOptionPane.showMessageDialog(this, "El material ya esta en la hoja de especificacion");

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frminventario.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (material == 0) {
                    // como si existe el material en la bd de datos de inventario, procedemos a integrarlo a Calzado
                    if (txtPar.getText().length() == 0) {
                        JOptionPane.showMessageDialog(this, "Falta agregar el costo");
                    } else if (txtPrecio.getText().length() == 0) {
                        JOptionPane.showMessageDialog(this, "Falta agregar el Precio");
                    } else {
                        //Asignamos variables a la especificacion
                        String Linea = txtLinea.getText().toUpperCase();
                        String Modelo = txtModelo.getText().toUpperCase();
                        String Articulo = txtArticulo.getText().toUpperCase();
                        String Color = txtColor.getText().toUpperCase();
                        String Nombre = txtPredecible.getText();
                        String Consumo = txtPar.getText();
                        String Precio = txtPrecio.getText();
                        String Codigo = null;
                        String Pieza = null;
                        String Medida = null;
                        String Activo = "1";
                        //calculamos el costo
                        String txtResultado = redondeo();
                        // verificamos si esta seleccionado
                        if (!chkActivo.isSelected()) {
                            Activo = "0";
                        }
                        String sql = "SELECT * FROM inventario WHERE nombre='" + txtPredecible.getText() + "'";

                        //buscamos en la base de datos Inventario las especificaciones faltantes
                        try {
                            Statement completar;
                            completar = cn.createStatement();
                            ResultSet rs = completar.executeQuery(sql);
                            while (rs.next()) {
                                Codigo = rs.getString("codigo");
                                Pieza = rs.getString("pieza");
                                Medida = rs.getString("medida");
                            }
                        } catch (SQLException ex) {
                            System.out.println("Sin poder ejecutar el query para asignar valores");
                        }

                        //ya teniendo todos los valores integramos la especificacion a la BD calzado
                        try {
                            Statement stmt = cn.createStatement();
                            String grabar = "INSERT INTO calzado (modelo,codigo,linea,articulo,color,pieza,nombre,medida,consumo,precio,resultado,estado,proceso) "
                                    + "VALUES ('"
                                    + Modelo + "','"
                                    + Codigo + "','"
                                    + Linea + "','"
                                    + Articulo + "','"
                                    + Color + "','"
                                    + Pieza + "','"
                                    + Nombre + "','"
                                    + Medida + "','"
                                    + Consumo + "','"
                                    + Precio + "','"
                                    + txtResultado + "','"
                                    + Activo + "','"+proceso+"');";
                            stmt.executeUpdate(grabar);

                            stmt.close();
                            txtSubManipulacion.setText("0.00");
                            mostrarTabla();
                        } catch (SQLException ex) {
                            Logger.getLogger(frminventario.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    
                }
            }if (contador == 0) {
                        JOptionPane.showMessageDialog(this, "No modifiques la ventana de materiales");
                        txtPredecible.setText("");
                        txtPar.setText("");
                        txtPrecio.setText("");
                    }
        } else if (txtMaquila.getText().length()>0){
            // ********** Inicia Captura de Maquila
            
            
            //primero verificamos que si este en la base de datos de maquila
            int contador = 0;
            try {
                String checar = "SELECT * FROM maquila WHERE nombre='" + txtMaquila.getText() + "'";
                Statement repetido;
                repetido = cn.createStatement();
                ResultSet buscar = repetido.executeQuery(checar);
                while (buscar.next()) {
                    contador = 1;

                }
            } catch (SQLException ex) {
                Logger.getLogger(frminventario.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (contador == 1) {
                //revisamos que no este repetido la maquila en el calzado

                int maquila = 0;
                try {
                    String checar = "SELECT * FROM calzado WHERE nombre='" + txtMaquila.getText() + "' and modelo='"
                            + txtModelo.getText() + "' and articulo='" + txtArticulo.getText() + "'";
                    Statement repetido;
                    repetido = cn.createStatement();
                    ResultSet buscar = repetido.executeQuery(checar);
                    while (buscar.next()) {
                        maquila++;
                        JOptionPane.showMessageDialog(this, "La maquila ya esta en la hoja de especificacion");

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frminventario.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (maquila == 0) {
                    // como si existe el material en la bd de datos de inventario, procedemos a integrarlo a Calzado
                    if (txtPrecio1.getText().length() == 0) {
                        JOptionPane.showMessageDialog(this, "Falta agregar el Precio de la maquila");
                    } else {
                        //Asignamos variables a la especificacion
                        String Linea = txtLinea.getText().toUpperCase();
                        String Modelo = txtModelo.getText().toUpperCase();
                        String Articulo = txtArticulo.getText().toUpperCase();
                        String Color = txtColor.getText().toUpperCase();
                        String Nombre = txtMaquila.getText();
                        String Precio = txtPrecio1.getText();
                        String Codigo = null;
                        String Pieza = null;
                        String Activo = "1";
                        //Asignamos el precio como resultado
                        String txtResultado = Precio;
                        // verificamos si esta seleccionado
                        if (!chkActivo.isSelected()) {
                            Activo = "0";
                        }
                        String sql = "SELECT * FROM maquila WHERE nombre='" + txtMaquila.getText() + "'";

                        //buscamos en la base de datos Maquila las especificaciones faltantes
                        try {
                            Statement completar;
                            completar = cn.createStatement();
                            ResultSet rs = completar.executeQuery(sql);
                            while (rs.next()) {
                                Codigo = rs.getString("codigo");
                                Pieza = rs.getString("pieza");
                            }
                        } catch (SQLException ex) {
                            System.out.println("Sin poder ejecutar el query para asignar valores de maquila");
                        }

                        //ya teniendo todos los valores integramos la especificacion a la BD calzado
                        try {
                            Statement stmt = cn.createStatement();
                            String grabar = "INSERT INTO calzado (modelo,codigo,linea,articulo,color,pieza,nombre,precio,resultado,estado,proceso) "
                                    + "VALUES ('"
                                    + Modelo + "','"
                                    + Codigo + "','"
                                    + Linea + "','"
                                    + Articulo + "','"
                                    + Color + "','"
                                    + Pieza + "','"
                                    + Nombre + "','"
                                    + Precio + "','"
                                    + txtResultado + "','"
                                    + Activo + "','"+proceso+"');";
                            stmt.executeUpdate(grabar);

                            stmt.close();
                            txtSubManipulacion.setText("0.00");
                            txtPrecio1.setText("");
                            txtMaquila.setText("");
                            mostrarTabla();
                        } catch (SQLException ex) {
                            Logger.getLogger(frminventario.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    
                }
            }if (contador == 0) {
                        JOptionPane.showMessageDialog(this, "No modifiques la ventana de maquila");
                        txtPredecible.setText("");
                        txtPar.setText("");
                        txtPrecio.setText("");
                    }
            
            
            // ********** Termina captura de maquila
        }
    }
    private void btnIntegrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrarActionPerformed
        
        // preparamos la funcion de integracion a "manipulacion"        
        integraTabla("manipulacion");


        
    }//GEN-LAST:event_btnIntegrarActionPerformed

    public void mostrarTabla() {
        String sql = "SELECT * FROM CALZADO where modelo='" + txtModelo.getText() + "' AND proceso='manipulacion' AND articulo='"
                + txtArticulo.getText() + "'";
        String[] cabecera = {"Codigo", "Pieza", "Nombre", "Medida", "Consumo", "Precio", "total"};
        // se definen los registros que llevara la tabla
        String[] registros = new String[7];
        // se hace el llamado sql de todos los usuarios

        System.out.println(sql);
        //establecemos los anchos en pixeles de las columnas
        int[] anchos = {80, 250, 700, 80, 80, 80, 80};
        manipulacion = new DefaultTableModel(null, cabecera);

        try {

            Statement tablaManipulacion;
            tablaManipulacion = cn.createStatement();
            ResultSet rs = tablaManipulacion.executeQuery(sql);
            while (rs.next()) {

                registros[0] = rs.getString("codigo");
                registros[1] = rs.getString("pieza");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("medida");
                registros[4] = rs.getString("consumo");
                registros[5] = rs.getString("precio");
                registros[6] = rs.getString("resultado");

                manipulacion.addRow(registros);
                // calculamos el subtotal de Manipulacion
                Double subtotal = Double.parseDouble(txtSubManipulacion.getText());
                Double agregar = Double.parseDouble(rs.getString("resultado"));
                Double resultado = subtotal + agregar;
                BigDecimal SubTotal = BigDecimal.valueOf(resultado);
                SubTotal = SubTotal.setScale(2, RoundingMode.HALF_UP);
                txtSubManipulacion.setText(String.valueOf(SubTotal));
            }
            tablaMan.setModel(manipulacion);
            for (int i = 0; i < cabecera.length; i++) {
                tablaMan.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                tablaMan.setFont(new java.awt.Font("Tahoma", 0, 12));
                txtPredecible.setText("");
                txtPar.setText("");
                txtPrecio.setText("");
            }

        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla");
        }

    }

    public String redondeo() {
        Double par = Double.parseDouble(txtPar.getText());
        Double precio = Double.parseDouble(txtPrecio.getText());
        Double Resultado = par * precio;
        BigDecimal resultado = BigDecimal.valueOf(Resultado);
        resultado = resultado.setScale(2, RoundingMode.HALF_UP);
        String txtResultado = resultado.toString();
        return txtResultado;
    }
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        // verificamos que no esten los campos vacios
        if (txtLinea.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Escribe la linea del calzado");
        } else if (txtModelo.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Escribe el modelo del calzado");
        } else if (txtArticulo.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Escribe el articulo del calzado");
        } else if (txtColor.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Escribe el color del calzado");
        } else {

            //verificamos que el modelo no exista previamente
            int repetido = 0;
            try {
                String checar = "SELECT * FROM calzado WHERE articulo='" + txtArticulo.getText()
                        + "' and linea='" + txtLinea.getText() + "'";
                Statement verificar;
                verificar = cn.createStatement();
                ResultSet buscar = verificar.executeQuery(checar);
                while (buscar.next()) {
                    repetido++;
                    JOptionPane.showMessageDialog(null, "El articulo " + txtArticulo.getText()
                            + " ya existe\n en la linea " + txtLinea.getText(), "Alerta", 0);
                }
            } catch (Exception e) {
            }
            if (repetido == 0) {
                int respuesta = JOptionPane.showConfirmDialog(this, "se va a crear el siguiente calzado\nLinea:"
                        + txtLinea.getText() + "\nModelo: "
                        + txtModelo.getText() + "\nArticulo: "
                        + txtArticulo.getText() + "\n Color: "
                        + txtColor.getText(), "Confirmacion", 2);
                //verificamos que informacion se va a agregar y si lo acepta se integra a la BD
                if (respuesta == 0) {
                    //en caso que si, cancelamos los botones y activamos integrar
                    txtLinea.setEnabled(false);
                    txtModelo.setEnabled(false);
                    txtArticulo.setEnabled(false);
                    txtColor.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnCrear.setEnabled(false);
                    btnIntegrar.setEnabled(true);
                    btnIntegrarCostura.setEnabled(true);
                    btnIntegrarInyeccion.setEnabled(true);
                    btnIntegrarTotal.setEnabled(true);
                    btnImagen.setEnabled(true);
                    chkActivo.setEnabled(false);
                    txtSubManipulacion.setEnabled(false);
                    txtSubManipulacion.setText("0.00");
                } else {
                    //si se cancela la creacion de zapata dejamos limpio todo
                    txtLinea.setText("");
                    txtModelo.setText("");
                    txtArticulo.setText("");
                    txtColor.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio1ActionPerformed

    private void btnNuevaMaquilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMaquilaActionPerformed
        maquila frm = new maquila();
        frm.setVisible(true);
        frm.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnNuevaMaquilaActionPerformed

    private void btnActMaquilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActMaquilaActionPerformed
        //actualizamos Autocompletar maquila
        asignarAutocompletadoMaquila();
    }//GEN-LAST:event_btnActMaquilaActionPerformed

    private void btnActInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActInventarioActionPerformed
        //actualizamos autocompletar inventario
        asignarAutocompletado();
    }//GEN-LAST:event_btnActInventarioActionPerformed

    private void btnIntegrarCosturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrarCosturaActionPerformed
        // preparamos la funcion de integracion a "Costura"
        
        integraTabla("costura");
    }//GEN-LAST:event_btnIntegrarCosturaActionPerformed

    private void txtPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio2ActionPerformed

    private void txtPrecio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio3ActionPerformed

    private void btnActMaquila1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActMaquila1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActMaquila1ActionPerformed

    private void btnNuevaMaquila1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMaquila1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaMaquila1ActionPerformed

    private void btnActInventario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActInventario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActInventario1ActionPerformed

    private void btnIntegrarInyeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrarInyeccionActionPerformed
         // preparamos la funcion de integracion a "Inyeccion"
        
        integraTabla("inyeccion");
    }//GEN-LAST:event_btnIntegrarInyeccionActionPerformed

    private void txtPrecio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio4ActionPerformed

    private void txtPrecio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio5ActionPerformed

    private void btnActMaquila2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActMaquila2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActMaquila2ActionPerformed

    private void btnNuevaMaquila2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMaquila2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaMaquila2ActionPerformed

    private void btnActInventario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActInventario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActInventario2ActionPerformed

    private void btnIntegrarTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrarTotalActionPerformed
        // preparamos la funcion de integracion a "manipulacion"
        
        integraTabla("total");
    }//GEN-LAST:event_btnIntegrarTotalActionPerformed

    private void txtPrecio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio6ActionPerformed

    private void txtPrecio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio7ActionPerformed

    private void btnActMaquila3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActMaquila3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActMaquila3ActionPerformed

    private void btnNuevaMaquila3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMaquila3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaMaquila3ActionPerformed

    private void btnActInventario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActInventario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActInventario3ActionPerformed

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
            java.util.logging.Logger.getLogger(catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActInventario;
    private javax.swing.JButton btnActInventario1;
    private javax.swing.JButton btnActInventario2;
    private javax.swing.JButton btnActInventario3;
    private javax.swing.JButton btnActMaquila;
    private javax.swing.JButton btnActMaquila1;
    private javax.swing.JButton btnActMaquila2;
    private javax.swing.JButton btnActMaquila3;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnActualizar3;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBorrar2;
    private javax.swing.JButton btnBorrar3;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImagen;
    private javax.swing.JButton btnIntegrar;
    private javax.swing.JButton btnIntegrarCostura;
    private javax.swing.JButton btnIntegrarInyeccion;
    private javax.swing.JButton btnIntegrarTotal;
    private javax.swing.JButton btnNuevaMaquila;
    private javax.swing.JButton btnNuevaMaquila1;
    private javax.swing.JButton btnNuevaMaquila2;
    private javax.swing.JButton btnNuevaMaquila3;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JTable tablaMan;
    private javax.swing.JTable tablaMan1;
    private javax.swing.JTable tablaMan2;
    private javax.swing.JTable tablaMan3;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMaquila;
    private javax.swing.JTextField txtMaquila1;
    private javax.swing.JTextField txtMaquila2;
    private javax.swing.JTextField txtMaquila3;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPar;
    private javax.swing.JTextField txtPar1;
    private javax.swing.JTextField txtPar2;
    private javax.swing.JTextField txtPar3;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtPrecio3;
    private javax.swing.JTextField txtPrecio4;
    private javax.swing.JTextField txtPrecio5;
    private javax.swing.JTextField txtPrecio6;
    private javax.swing.JTextField txtPrecio7;
    private javax.swing.JTextField txtPredecible;
    private javax.swing.JTextField txtPredecible1;
    private javax.swing.JTextField txtPredecible2;
    private javax.swing.JTextField txtPredecible3;
    private javax.swing.JTextField txtSubManipulacion;
    private javax.swing.JTextField txtSubManipulacion1;
    private javax.swing.JTextField txtSubManipulacion2;
    private javax.swing.JTextField txtSubManipulacion3;
    // End of variables declaration//GEN-END:variables
}
