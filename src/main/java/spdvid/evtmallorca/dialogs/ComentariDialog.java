package spdvid.evtmallorca.dialogs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import spdvid.evtmallorca.dataaccess.DataAccess;
import spdvid.evtmallorca.dto.Allotjament;
import spdvid.evtmallorca.dto.Comentari;
import spdvid.garciajodar_tarea1.dto.Usuari;

/**
 *
 * @author Miguel
 */
public class ComentariDialog extends javax.swing.JDialog {

    DataAccess da;
    Allotjament allotjament;
    ArrayList<Comentari> comentaris = new ArrayList<>();
    Usuari user;
    int idComentari;

    /**
     * Creates new form LoginDialog
     */
    public ComentariDialog(java.awt.Frame parent, boolean modal, Allotjament allotjament, Usuari user) {
        super(parent, modal);
        initComponents();
        this.allotjament = allotjament;
        this.user = user;
        setLocationRelativeTo(null);
        setSize(new java.awt.Dimension(370, 450));
        da = new DataAccess();
        comentaris = da.getComentaris(allotjament.getId());
        JComboBox<Comentari> comboComentari = new JComboBox<>(comentaris.toArray(new Comentari[0]));
        initComentaris();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtResposta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaComentaris = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaResposta = new javax.swing.JTextArea();
        comboComentari = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        btnLogin.setText("Contestar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(70, 360, 180, 30);

        jLabel1.setText("Comentaris:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 100, 180, 16);

        txtResposta.setText("Resposta:");
        getContentPane().add(txtResposta);
        txtResposta.setBounds(30, 230, 60, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 80, 510, 20);

        txtTitle.setFont(txtTitle.getFont().deriveFont(txtTitle.getFont().getStyle() | java.awt.Font.BOLD, 18));
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-burbuja-de-diálogo-con-puntos-48.png"))); // NOI18N
        txtTitle.setText("Comentaris");
        getContentPane().add(txtTitle);
        txtTitle.setBounds(0, 0, 290, 70);

        txaComentaris.setColumns(20);
        txaComentaris.setRows(5);
        jScrollPane1.setViewportView(txaComentaris);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 270, 86);

        txaResposta.setColumns(20);
        txaResposta.setRows(5);
        jScrollPane2.setViewportView(txaResposta);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 260, 270, 86);

        comboComentari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboComentari);
        comboComentari.setBounds(230, 100, 72, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        
        da.insertComentari(txaResposta.getText(), user.getId(), allotjament.getId(), idComentari);
        
        System.out.println("Comentario insertado con exito.");
        setVisible(false);
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(ComentariDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComentariDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComentariDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComentariDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
    }

    private void initComentaris() {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (Comentari comentari : comentaris) {
            comboBoxModel.addElement(Integer.toString(comentari.getId()));
        }
        comboComentari.setModel(comboBoxModel);

        comboComentari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboComentari.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < comentaris.size()) {
                    Comentari selectedComentari = comentaris.get(selectedIndex);
                    idComentari = selectedComentari.getId();
                    txaComentaris.setText(selectedComentari.getText());
                }
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> comboComentari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txaComentaris;
    private javax.swing.JTextArea txaResposta;
    private javax.swing.JLabel txtResposta;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
