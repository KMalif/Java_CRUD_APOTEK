
package App;


import java.awt.Frame;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLayeredPane1 = new javax.swing.JLayeredPane();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        jPanel8 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnLogin = new keeptoo.KButton();
        txtUsername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apoteker");

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 204, 204));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(51, 0, 204));
        rSPanelGradiente1.setLayout(new java.awt.GridBagLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 380, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 70, 70));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setkBorderRadius(45);
        btnLogin.setkEndColor(new java.awt.Color(51, 0, 204));
        btnLogin.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        btnLogin.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLogin.setkHoverStartColor(new java.awt.Color(51, 0, 204));
        btnLogin.setkSelectedColor(new java.awt.Color(0, 255, 255));
        btnLogin.setkStartColor(new java.awt.Color(0, 204, 204));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel8.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, 40));

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernametxtUsernameActionPerformed(evt);
            }
        });
        jPanel8.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 298, -1));

        txtpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel8.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 298, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 108;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 101, 58, 102);
        rSPanelGradiente1.add(jPanel8, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernametxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernametxtUsernameActionPerformed
        // TODO add your handling code here:
        if (txtpassword.getPassword().length == 0) {
            txtpassword.requestFocus();
        }else{
            prosesLogin();
        }
    }//GEN-LAST:event_txtUsernametxtUsernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
        if (txtUsername.getText().isEmpty()) {
            txtUsername.requestFocus();
        }else{
            prosesLogin();
        }
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        prosesLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            //                new Masuk().setVisible(true);
            Login L = new Login();
            L.setExtendedState(Frame.MAXIMIZED_BOTH);
            L.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnLogin;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator3;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables

     private void prosesLogin() {
        String user = txtUsername.getText();
        char[] pass = txtpassword.getPassword();
        
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username Harus Diisi");
            txtUsername.requestFocus();
        } else if (pass.length == 0){
            JOptionPane.showMessageDialog(this, "Password Harus Diisi");
            txtpassword.requestFocus();
        }else{
            String password = new String(pass);
            btnLogin.setEnabled(false);
            try {
                Connection c = Koneksi.MySQl();
                Statement st = c.createStatement();
                String q = "SELECT * FROM admin "
                        +"WHERE admin_username='"+user+"' "
                        +"AND admin_password=('"+password+"')";
                System.out.println(q);
                ResultSet rs = st.executeQuery(q);
                if (rs.next()) {
                    MainActivity h = new MainActivity();
                    h.setExtendedState(Frame.MAXIMIZED_BOTH);
                    this.setVisible(false);
                    h.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "Username dan Password Salah");
                    txtUsername.requestFocus();
                }
                btnLogin.setEnabled(true);
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }
}
