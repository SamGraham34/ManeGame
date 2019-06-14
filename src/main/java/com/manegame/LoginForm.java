/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manegame;

/**
 *  This class executes when the player selects login from the New User Form.
 *  Returning players must submit valid information for a successful login.
 * @author Sam
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        lblLoginTitle = new javax.swing.JLabel();
        lblLoginEmail = new javax.swing.JLabel();
        lblLoginPassword = new javax.swing.JLabel();
        txtLoginEmail = new javax.swing.JTextField();
        txtLoginPassword = new javax.swing.JTextField();
        btnUserLogin = new javax.swing.JButton();

        lblLoginTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Return User Login");

        lblLoginEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLoginEmail.setText("Email:");

        lblLoginPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLoginPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLoginPassword.setText("Password:");

        txtLoginEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtLoginPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        btnUserLogin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnUserLogin.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLoginTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLoginEmail)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblLoginPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnUserLogin)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblLoginTitle)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginEmail)
                    .addComponent(txtLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginPassword)
                    .addComponent(txtLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnUserLogin)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JLabel lblLoginEmail;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JTextField txtLoginEmail;
    private javax.swing.JTextField txtLoginPassword;
    // End of variables declaration//GEN-END:variables
}
