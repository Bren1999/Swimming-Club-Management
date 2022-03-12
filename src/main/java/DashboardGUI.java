public class DashboardGUI extends javax.swing.JFrame {

    public DashboardGUI() {
        initComponents(); //creates the layout of the page
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newMembershipBtn = new javax.swing.JButton();
        renewMembershipBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        visitorBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sports Club");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Palatino", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DASHBOARD");

        newMembershipBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        newMembershipBtn.setText("New Membership");
        newMembershipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMembershipBtnActionPerformed(evt);
            }
        });

        renewMembershipBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        renewMembershipBtn.setText(" Search Members");
        renewMembershipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewMembershipBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        visitorBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        visitorBtn.setText("Visitor Entry");
        visitorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setText("Check Income");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(logoutBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(renewMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(visitorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logoutBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(newMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(renewMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(visitorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        dispose();
        new LoginPageGUI().setVisible(true); //redirects to the login page if clicked logout
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void newMembershipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMembershipBtnActionPerformed
        dispose();
        new NewMemberGUI().setVisible(true); //opens the new member form page
    }//GEN-LAST:event_newMembershipBtnActionPerformed

    private void visitorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorBtnActionPerformed
        dispose();
        new NewVisitorGUI().setVisible(true); // opens the visitor's page
    }//GEN-LAST:event_visitorBtnActionPerformed

    private void renewMembershipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewMembershipBtnActionPerformed
        dispose();
        new SearchMembersGUI().setVisible(true); // opens the search page
    }//GEN-LAST:event_renewMembershipBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new IncomeGUI().setVisible(true); //opens the income page
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton newMembershipBtn;
    private javax.swing.JButton renewMembershipBtn;
    private javax.swing.JButton visitorBtn;
    // End of variables declaration//GEN-END:variables
}
