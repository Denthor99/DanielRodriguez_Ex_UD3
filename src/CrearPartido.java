
import java.awt.event.KeyEvent;

/**
 * Clase de nombre CrearPartido con visibilidad publica, que hereda de javax.swing.JFrame
 * @author Daniel Alfonso Rodriguez Santos
 * @version 1.1
 */


public class CrearPartido extends javax.swing.JFrame
{
   
    /**
     * Composición de la clase Apuesta, con nombre v.
     */
    private Apuesta v;
    
   /**
    * Metodo constructor sin parametros
    */
    public CrearPartido() 
    {
        initComponents();
    }

   /**
    * Metodo constructor donde se añade un parametro de tipo objeto (composicion). Se le asigna el valor del campo v a ventana.
    * @param ventana 
    */
    public CrearPartido(Apuesta ventana) 
    {
        initComponents();
        v = ventana;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFuncionalidad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tPartido = new javax.swing.JTextField();
        bAgregarPartido = new javax.swing.JButton();
        pInformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFuncionalidad.setBackground(java.awt.Color.white);
        pFuncionalidad.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Partido:");
        pFuncionalidad.add(jLabel1, java.awt.BorderLayout.WEST);

        tPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPartidoActionPerformed(evt);
            }
        });
        tPartido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPartidoKeyPressed(evt);
            }
        });
        pFuncionalidad.add(tPartido, java.awt.BorderLayout.CENTER);

        bAgregarPartido.setText("Aceptar");
        bAgregarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarPartidoActionPerformed(evt);
            }
        });
        pFuncionalidad.add(bAgregarPartido, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pFuncionalidad, java.awt.BorderLayout.NORTH);

        pInformacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pInformacion.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Advertencia: ventana de subprograma");
        pInformacion.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pInformacion, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Metodo de tipo sin retorno (void) que nos permite introducir como parametro un tipo de dato Cadena de caracteres
     * @param p 
     */
    public void añadePartido(String p)
    {
        v.partidoNuevo(p);
        tPartido.setText("");
        tPartido.requestFocus();
    }
    /**
     * Metodo de tipo sin retorno (void), que nos permite introducir un parametro
     * @param evt 
     */
    private void bAgregarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarPartidoActionPerformed
        añadePartido(tPartido.getText());
    }//GEN-LAST:event_bAgregarPartidoActionPerformed

    /**
     * Metodo de tipo sin retorno (void) donde se introduce un parametro. Si se cumple la condición especificada se ejecutaria la instucción.
     * @param evt 
     */
    private void tPartidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPartidoKeyPressed
        if( evt.getKeyCode() == KeyEvent.VK_ENTER )
        {
            añadePartido(tPartido.getText());
        }
    }//GEN-LAST:event_tPartidoKeyPressed
    /**
     * Metodo de tipo sin retorno (void) donde se le debe pasar un parametro
     * @param evt 
     */
    private void tPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPartidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPartidoActionPerformed

    /**
     * Metodo Main de la clase CrearPartido
     * @param args 
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
            java.util.logging.Logger.getLogger(CrearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPartido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pFuncionalidad;
    private javax.swing.JPanel pInformacion;
    private javax.swing.JTextField tPartido;
    // End of variables declaration//GEN-END:variables
}
