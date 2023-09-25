package universidadgrupo15.vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo15.accesoaDatos.*;
import universidadgrupo15.entidades.*;

public class ManejoInscripcionesView extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int fila, int columna){
            return false;
        }
    };
    /**
     * Creates new form ManejoInscripcionesView
     */
    AlumnoData al = new AlumnoData();
    InscripcionData ind = new InscripcionData();

    public ManejoInscripcionesView() {
        initComponents();
        bGroup();
        crearCabecera();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgMaterias = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnosInsc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jrbMateriasInsc = new javax.swing.JRadioButton();
        jrbMateriasNoInsc = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbDesinscribir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        panel.setBackground(new java.awt.Color(0, 153, 153));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Listado de Materias");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, 509, 10));

        jLabel2.setText("Seleccione un alumno:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 80, -1, -1));

        jcbAlumnosInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosInscActionPerformed(evt);
            }
        });
        panel.add(jcbAlumnosInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 75, 252, -1));

        jLabel3.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 24)); // NOI18N
        jLabel3.setText("Formulario de Inscripción");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jrbMateriasInsc.setText("Materias inscriptas");
        jrbMateriasInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscActionPerformed(evt);
            }
        });
        panel.add(jrbMateriasInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 167, -1, -1));

        jrbMateriasNoInsc.setText("Materias no inscriptas");
        jrbMateriasNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasNoInscActionPerformed(evt);
            }
        });
        panel.add(jrbMateriasNoInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 167, -1, -1));

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtMaterias);

        panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 201, 465, 154));

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        panel.add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jbDesinscribir.setText("Anular Inscripción");
        jbDesinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesinscribirActionPerformed(evt);
            }
        });
        panel.add(jbDesinscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMateriasInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscActionPerformed
        // TODO add your handling code here:
        jbDesinscribir.setEnabled(true);
        jbInscribir.setEnabled(false);
        listarMaterias(true);
    }//GEN-LAST:event_jrbMateriasInscActionPerformed

    private void jrbMateriasNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasNoInscActionPerformed
        // TODO add your handling code here:
        jbDesinscribir.setEnabled(false);
        jbInscribir.setEnabled(true);
        listarMaterias(false);
    }//GEN-LAST:event_jrbMateriasNoInscActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        int matSelec = jtMaterias.getSelectedRow();
        if (matSelec != -1) {
            Inscripcion inscripcion = new Inscripcion();
            Alumno alumno = (Alumno) jcbAlumnosInsc.getSelectedItem();
            Materia materia = new Materia();
            materia.setIdMateria((Integer) jtMaterias.getValueAt(matSelec, 0));
            materia.setNombre((String) jtMaterias.getValueAt(matSelec, 1));
            materia.setAño((Integer) jtMaterias.getValueAt(matSelec, 2));

            inscripcion.setAlumno(alumno);
            inscripcion.setMateria(materia);

            ind.guardarInscripcion(inscripcion);
        }
        listarMaterias(false);
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbDesinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesinscribirActionPerformed
        // TODO add your handling code here:
        int matSelec = jtMaterias.getSelectedRow();
        if (matSelec != -1) {
            Alumno al = (Alumno) jcbAlumnosInsc.getSelectedItem();
            int idMat=(Integer) jtMaterias.getValueAt(matSelec, 0);
            ind.borrarInscripcionMateriaAlumno(al.getIdAlumno(), idMat);
        }
        listarMaterias(true);
    }//GEN-LAST:event_jbDesinscribirActionPerformed

    private void jcbAlumnosInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosInscActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
    }//GEN-LAST:event_jcbAlumnosInscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbDesinscribir;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JComboBox<Alumno> jcbAlumnosInsc;
    private javax.swing.JRadioButton jrbMateriasInsc;
    private javax.swing.JRadioButton jrbMateriasNoInsc;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    
    private void cargarCombo() {
        List<Alumno> alumnos = al.ListarAlumnos();
        for (Alumno alum : alumnos) {

            jcbAlumnosInsc.addItem(alum);
        }
    }

    private void bGroup() {
        bgMaterias.add(jrbMateriasInsc);
        bgMaterias.add(jrbMateriasNoInsc);
    }
    
    private void crearCabecera() {
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Año");
        jtMaterias.setModel(tabla);
    }

    private void limpiarTabla() {
        int f = jtMaterias.getRowCount()-1;
        
        for(;f>=0;f--){
            tabla.removeRow(f);
        }
    }
    
    private void listarMaterias(boolean cursadas){
        limpiarTabla();
        Alumno alumno = (Alumno) jcbAlumnosInsc.getSelectedItem();
        List<Materia> materias;
        if(cursadas){
            materias = ind.obtenerMateriasCursadas(alumno.getIdAlumno());
        } else {
            materias = ind.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        }
        
        for (Materia m : materias) {
            tabla.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAño()});
        }
    }

}