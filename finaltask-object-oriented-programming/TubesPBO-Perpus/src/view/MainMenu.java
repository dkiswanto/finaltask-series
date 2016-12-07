/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author g40
 */
public class MainMenu extends javax.swing.JFrame {
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        getContentPane().setBackground(new Color(55,55,55));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSearch = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnLoginPetugas = new javax.swing.JButton();
        btnLoginAnggota = new javax.swing.JButton();
        btnListBuku = new javax.swing.JButton();
        btnRegistrasiAnggota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textFieldSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIstem Informasi Perpus - Main Menu");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        labelSearch.setForeground(new java.awt.Color(200, 200, 200));
        labelSearch.setText("Search Buku in Our Perpustakaan by \"ID\" or \" Judul\"");

        btnSearch.setBackground(new java.awt.Color(0, 153, 255));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.setText("Search");

        btnLoginPetugas.setBackground(new java.awt.Color(0, 153, 255));
        btnLoginPetugas.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginPetugas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        btnLoginPetugas.setText("Login Petugas");

        btnLoginAnggota.setBackground(new java.awt.Color(0, 153, 255));
        btnLoginAnggota.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        btnLoginAnggota.setText("Login Anggota");
        btnLoginAnggota.setPreferredSize(new java.awt.Dimension(125, 23));

        btnListBuku.setBackground(new java.awt.Color(0, 153, 255));
        btnListBuku.setForeground(new java.awt.Color(255, 255, 255));
        btnListBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/folder_full.png"))); // NOI18N
        btnListBuku.setText("List All Buku");

        btnRegistrasiAnggota.setBackground(new java.awt.Color(0, 153, 255));
        btnRegistrasiAnggota.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrasiAnggota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnRegistrasiAnggota.setText("Registrasi Anggota");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menutama.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoginPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(btnListBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoginAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrasiAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(labelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginPetugas)
                    .addComponent(btnLoginAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrasiAnggota)
                    .addComponent(btnListBuku))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListBuku;
    private javax.swing.JButton btnLoginAnggota;
    private javax.swing.JButton btnLoginPetugas;
    private javax.swing.JButton btnRegistrasiAnggota;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelSearch;
    private javax.swing.JTextField textFieldSearch;
    // End of variables declaration//GEN-END:variables

    // Action Listener
    public void addListener(ActionListener a){
        btnListBuku.addActionListener(a);
        btnLoginAnggota.addActionListener(a);
        btnLoginPetugas.addActionListener(a);
        btnRegistrasiAnggota.addActionListener(a);
        btnSearch.addActionListener(a);
        textFieldSearch.addActionListener(a);
    }
    
    // Setter and Getter Content View
    public String getStringTextFieldSearch(){
        return this.textFieldSearch.getText();
    }
   

    // Setter and Getter Object Pallete
    public JButton getBtnListBuku() {
        return btnListBuku;
    }

    public JButton getBtnLoginAnggota() {
        return btnLoginAnggota;
    }

    public JButton getBtnLoginPetugas() {
        return btnLoginPetugas;
    }

    public JButton getBtnRegistrasiAnggota() {
        return btnRegistrasiAnggota;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JLabel getLabelSearch() {
        return labelSearch;
    }

    public JTextField getTextFieldSearch() {
        return textFieldSearch;
    }


    
}
