package spdvid.evtmallorca.panels;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import spdvid.evtmallorca.Main;
import spdvid.evtmallorca.dataaccess.DataAccess;
import spdvid.evtmallorca.dialogs.ComentariDialog;
import spdvid.evtmallorca.dto.Allotjament;
import spdvid.evtmallorca.dto.Municipi;
import spdvid.evtmallorca.dto.Servei;
import spdvid.garciajodar_tarea1.dto.Usuari;

/**
 *
 * @author Miguel
 */
public class PanelDetallAllotjament extends javax.swing.JPanel {

    private Allotjament allotjament = null;
    private DataAccess da = new DataAccess();
    private Main mainJFrame = null;
    Usuari user = null;

    /**
     * Creates new form PanelDetallAllotjament
     */
    public PanelDetallAllotjament(Allotjament allotjament, Main mainJPanel, Usuari user) {
        initComponents();
        this.user = user;
        this.allotjament = allotjament;
        this.mainJFrame = mainJPanel;
        setSize(780, 700);

        inicialitzaFields();

    }

    private void inicialitzaFields() {
        txtNom.setText(allotjament.getNom());
        txtAdressa.setText(allotjament.getAdresa());
        txtDescripcio.setText(allotjament.getDescripcio());
        initCmbMunicipis();
        spnNumPersones.setValue(allotjament.getNum_persones());
        spnPreu.setValue(allotjament.getNum_persones());
        initServeis();
        txtValoracio.setText(Float.toString(da.getValoracioAllotjamentAvg(allotjament.getId())));
    }

    private void initCmbMunicipis() {
        var municipis = da.getMunicipis();
        DefaultComboBoxModel<String> cbm = new DefaultComboBoxModel<>();
        for (Municipi m : municipis) {
            cbm.addElement(m.getNom());
        }
        cmbMunicipi.setModel(cbm);
        cmbMunicipi.setSelectedItem(allotjament.getMunicipi());
    }

    private void initServeis() {
        var serveis = da.getServeisAllotjament(allotjament.getId());
        for (Servei s : serveis) {
            switch (s.getDescripcio()) {
                case "Piscina":
                    chkPiscina.setSelected(true);
                    break;
                case "Aire condicionat":
                    chkAireAcondicionat.setSelected(true);
                    break;
                case "Wifi":
                    chkWifi.setSelected(true);
                    break;
                case "Aparcament":
                    chkAparcament.setSelected(true);
                    break;
                case "Admet mascotes":
                    chkMascotes.setSelected(true);
                    break;
                case "Ascensor":
                    chkAscensor.setSelected(true);
                    break;
            }
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
        btnBack = new javax.swing.JButton();
        btnPrevImage = new javax.swing.JButton();
        btnNextImage = new javax.swing.JButton();
        chkAutoMan = new javax.swing.JCheckBox();
        lblImageFileName = new javax.swing.JLabel();
        jLabelnom = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtAdressa = new javax.swing.JTextField();
        jLabelAdressa = new javax.swing.JLabel();
        txtDescripcio = new javax.swing.JTextField();
        jLabelDescripcio = new javax.swing.JLabel();
        jLabelMunicipi = new javax.swing.JLabel();
        txtValoracio = new javax.swing.JTextField();
        jLabelValoracio = new javax.swing.JLabel();
        jLabelPreu = new javax.swing.JLabel();
        jButtonActualitzar = new javax.swing.JButton();
        jLabelNumPers = new javax.swing.JLabel();
        spnNumPersones = new javax.swing.JSpinner();
        spnPreu = new javax.swing.JSpinner();
        cmbMunicipi = new javax.swing.JComboBox<>();
        pnlServeis = new javax.swing.JPanel();
        chkPiscina = new javax.swing.JCheckBox();
        chkMascotes = new javax.swing.JCheckBox();
        chkAscensor = new javax.swing.JCheckBox();
        chkAireAcondicionat = new javax.swing.JCheckBox();
        chkAparcament = new javax.swing.JCheckBox();
        chkWifi = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnComentaris = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 650));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imatges"));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        add(jPanel1);
        jPanel1.setBounds(40, 430, 410, 160);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-24 (1).png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setMaximumSize(new java.awt.Dimension(86, 23));
        btnBack.setMinimumSize(new java.awt.Dimension(86, 23));
        btnBack.setPreferredSize(new java.awt.Dimension(86, 23));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 20, 60, 30);

        btnPrevImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-24 (1).png"))); // NOI18N
        btnPrevImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnPrevImage);
        btnPrevImage.setBounds(350, 600, 40, 31);

        btnNextImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-adelante-24 (2).png"))); // NOI18N
        btnNextImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(btnNextImage);
        btnNextImage.setBounds(410, 600, 40, 31);

        chkAutoMan.setForeground(new java.awt.Color(255, 255, 255));
        chkAutoMan.setText("Auto");
        chkAutoMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAutoMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-play-24.png"))); // NOI18N
        chkAutoMan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-pausa-24 (1).png"))); // NOI18N
        add(chkAutoMan);
        chkAutoMan.setBounds(40, 600, 80, 28);

        lblImageFileName.setForeground(new java.awt.Color(255, 255, 255));
        lblImageFileName.setText("Nom del fitxer de imatge i tamany en KB");
        lblImageFileName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(lblImageFileName);
        lblImageFileName.setBounds(140, 600, 200, 30);

        jLabelnom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnom.setText("Nom:");
        add(jLabelnom);
        jLabelnom.setBounds(40, 130, 100, 16);

        txtNom.setForeground(new java.awt.Color(255, 255, 255));
        txtNom.setText("jTextField1");
        add(txtNom);
        txtNom.setBounds(40, 150, 137, 22);

        txtAdressa.setForeground(new java.awt.Color(255, 255, 255));
        txtAdressa.setText("jTextField1");
        add(txtAdressa);
        txtAdressa.setBounds(40, 210, 137, 22);

        jLabelAdressa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdressa.setText("Adressa:");
        add(jLabelAdressa);
        jLabelAdressa.setBounds(40, 190, 100, 16);

        txtDescripcio.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescripcio.setText("jTextField1");
        add(txtDescripcio);
        txtDescripcio.setBounds(40, 330, 410, 82);

        jLabelDescripcio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcio.setText("Descripcio: ");
        add(jLabelDescripcio);
        jLabelDescripcio.setBounds(40, 310, 100, 16);

        jLabelMunicipi.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMunicipi.setText("Municipi: ");
        add(jLabelMunicipi);
        jLabelMunicipi.setBounds(40, 250, 110, 16);

        txtValoracio.setForeground(new java.awt.Color(255, 255, 255));
        txtValoracio.setText("jTextField1");
        add(txtValoracio);
        txtValoracio.setBounds(200, 150, 71, 22);

        jLabelValoracio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValoracio.setText("Valoració:");
        add(jLabelValoracio);
        jLabelValoracio.setBounds(200, 130, 70, 16);

        jLabelPreu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreu.setText("Preu:");
        add(jLabelPreu);
        jLabelPreu.setBounds(290, 130, 60, 16);

        jButtonActualitzar.setFont(jButtonActualitzar.getFont().deriveFont(jButtonActualitzar.getFont().getStyle() | java.awt.Font.BOLD));
        jButtonActualitzar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualitzar.setText("Actualitzar");
        jButtonActualitzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonActualitzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualitzarActionPerformed(evt);
            }
        });
        add(jButtonActualitzar);
        jButtonActualitzar.setBounds(40, 90, 100, 30);

        jLabelNumPers.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumPers.setText("Nº de Personas:");
        add(jLabelNumPers);
        jLabelNumPers.setBounds(370, 130, 120, 16);
        add(spnNumPersones);
        spnNumPersones.setBounds(370, 150, 84, 22);
        add(spnPreu);
        spnPreu.setBounds(290, 150, 64, 22);

        cmbMunicipi.setForeground(new java.awt.Color(255, 255, 255));
        cmbMunicipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alaró", "Inca" }));
        add(cmbMunicipi);
        cmbMunicipi.setBounds(40, 270, 137, 22);

        pnlServeis.setBorder(javax.swing.BorderFactory.createTitledBorder("Serveis"));
        pnlServeis.setForeground(new java.awt.Color(255, 255, 255));

        chkPiscina.setForeground(new java.awt.Color(255, 255, 255));
        chkPiscina.setText("Piscina");

        chkMascotes.setForeground(new java.awt.Color(255, 255, 255));
        chkMascotes.setText("Mascotes");
        chkMascotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMascotesActionPerformed(evt);
            }
        });

        chkAscensor.setForeground(new java.awt.Color(255, 255, 255));
        chkAscensor.setText("Ascensor");

        chkAireAcondicionat.setForeground(new java.awt.Color(255, 255, 255));
        chkAireAcondicionat.setText("Aire Acondicionat");

        chkAparcament.setForeground(new java.awt.Color(255, 255, 255));
        chkAparcament.setText("Aparcament");

        chkWifi.setForeground(new java.awt.Color(255, 255, 255));
        chkWifi.setText("Wifi");

        javax.swing.GroupLayout pnlServeisLayout = new javax.swing.GroupLayout(pnlServeis);
        pnlServeis.setLayout(pnlServeisLayout);
        pnlServeisLayout.setHorizontalGroup(
            pnlServeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServeisLayout.createSequentialGroup()
                .addComponent(chkPiscina)
                .addGap(32, 32, 32)
                .addComponent(chkAireAcondicionat))
            .addGroup(pnlServeisLayout.createSequentialGroup()
                .addComponent(chkMascotes)
                .addGap(18, 18, 18)
                .addComponent(chkAparcament))
            .addGroup(pnlServeisLayout.createSequentialGroup()
                .addComponent(chkAscensor)
                .addGap(20, 20, 20)
                .addComponent(chkWifi))
        );
        pnlServeisLayout.setVerticalGroup(
            pnlServeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServeisLayout.createSequentialGroup()
                .addGroup(pnlServeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPiscina)
                    .addComponent(chkAireAcondicionat))
                .addGap(6, 6, 6)
                .addGroup(pnlServeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkMascotes)
                    .addComponent(chkAparcament))
                .addGap(6, 6, 6)
                .addGroup(pnlServeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAscensor)
                    .addComponent(chkWifi)))
        );

        add(pnlServeis);
        pnlServeis.setBounds(190, 190, 260, 110);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-información-del-hotel-48 (1).png"))); // NOI18N
        jLabel1.setText("Detalls de l'Allotjament");
        add(jLabel1);
        jLabel1.setBounds(100, 10, 290, 50);

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        add(jSeparator1);
        jSeparator1.setBounds(-20, 70, 850, 10);

        btnComentaris.setFont(btnComentaris.getFont().deriveFont(btnComentaris.getFont().getStyle() | java.awt.Font.BOLD));
        btnComentaris.setForeground(new java.awt.Color(255, 255, 255));
        btnComentaris.setText("Comentaris");
        btnComentaris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComentaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentarisActionPerformed(evt);
            }
        });
        add(btnComentaris);
        btnComentaris.setBounds(360, 90, 100, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainJFrame.showPnlLlistaAllotjaments();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButtonActualitzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualitzarActionPerformed
        // TODO add your handling code here:
        allotjament.setNom(txtNom.getText());
        allotjament.setAdresa(txtAdressa.getText());
        allotjament.setMunicipi(cmbMunicipi.getSelectedItem().toString());
        allotjament.setId_municipi(cmbMunicipi.getSelectedIndex() + 1);  // ERROR!!!
        allotjament.setDescripcio(txtDescripcio.getText());
        try {
            spnNumPersones.commitEdit();
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        allotjament.setNum_persones((Integer) spnNumPersones.getValue());
        float preuPerNit = Float.parseFloat(spnPreu.getValue().toString());
        allotjament.setPreu_per_nit(preuPerNit);

        da.updateAllojtament(allotjament);

        int[] serveis = new int[6];
        if (chkPiscina.isSelected()) {
            serveis[0] = 1;
        }
        if (chkMascotes.isSelected()) {
            serveis[1] = 1;
        }
        if (chkAireAcondicionat.isSelected()) {
            serveis[2] = 1;
        }
        if (chkAscensor.isSelected()) {
            serveis[3] = 1;
        }
        if (chkAparcament.isSelected()) {
            serveis[4] = 1;
        }
        if (chkWifi.isSelected()) {
            serveis[5] = 1;
        }
        da.updateServeisAllotjament(allotjament.getId(), serveis);

        JOptionPane.showMessageDialog(mainJFrame, "Allotjament actualitzat correctament.");
        mainJFrame.showPnlLlistaAllotjaments();

    }//GEN-LAST:event_jButtonActualitzarActionPerformed

    private void chkMascotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMascotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMascotesActionPerformed

    private void btnComentarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentarisActionPerformed
        // TODO add your handling code here:
        ComentariDialog comDialog = new ComentariDialog(mainJFrame, true, allotjament, user);
        comDialog.setVisible(true);
        comDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnComentarisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComentaris;
    private javax.swing.JButton btnNextImage;
    private javax.swing.JButton btnPrevImage;
    private javax.swing.JCheckBox chkAireAcondicionat;
    private javax.swing.JCheckBox chkAparcament;
    private javax.swing.JCheckBox chkAscensor;
    private javax.swing.JCheckBox chkAutoMan;
    private javax.swing.JCheckBox chkMascotes;
    private javax.swing.JCheckBox chkPiscina;
    private javax.swing.JCheckBox chkWifi;
    private javax.swing.JComboBox<String> cmbMunicipi;
    private javax.swing.JButton jButtonActualitzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdressa;
    private javax.swing.JLabel jLabelDescripcio;
    private javax.swing.JLabel jLabelMunicipi;
    private javax.swing.JLabel jLabelNumPers;
    private javax.swing.JLabel jLabelPreu;
    private javax.swing.JLabel jLabelValoracio;
    private javax.swing.JLabel jLabelnom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblImageFileName;
    private javax.swing.JPanel pnlServeis;
    private javax.swing.JSpinner spnNumPersones;
    private javax.swing.JSpinner spnPreu;
    private javax.swing.JTextField txtAdressa;
    private javax.swing.JTextField txtDescripcio;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtValoracio;
    // End of variables declaration//GEN-END:variables

}
