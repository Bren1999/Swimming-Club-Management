import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;


public class NewMemberGUI extends javax.swing.JFrame {


    public NewMemberGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        day_dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        mobNo = new javax.swing.JTextField();
        month_dob = new javax.swing.JTextField();
        year_dob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        addressInp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        allergies = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        health = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        otherGender = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        individualMembership = new javax.swing.JRadioButton();
        familyMembership = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        day_startDate = new javax.swing.JTextField();
        year_startDate = new javax.swing.JTextField();
        month_startDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        quaterlyPayment = new javax.swing.JRadioButton();
        monthlyPayment = new javax.swing.JRadioButton();
        yearlyPayment = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        familyMemLabel = new javax.swing.JLabel();
        familyMembersInp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sports Club");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Membership Details");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");

        day_dob.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        day_dob.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");

        lName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lName.setBorder(null);
        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mobile No:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth:");

        fName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fName.setBorder(null);

        mobNo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        mobNo.setBorder(null);

        month_dob.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        month_dob.setBorder(null);

        year_dob.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        year_dob.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Allergies Info:");

        addressInp.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        addressInp.setBorder(null);
        addressInp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressInpActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender:");

        allergies.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        allergies.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Health Info:");

        health.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        health.setBorder(null);

        buttonGroup2.add(male);
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup2.add(female);
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        buttonGroup2.add(otherGender);
        otherGender.setForeground(new java.awt.Color(255, 255, 255));
        otherGender.setText("Other");
        otherGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherGenderActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Membership Start Date:");

        buttonGroup1.add(individualMembership);
        individualMembership.setForeground(new java.awt.Color(255, 255, 255));
        individualMembership.setText("Individual(£36)");
        individualMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualMembershipActionPerformed(evt);
            }
        });

        buttonGroup1.add(familyMembership);
        familyMembership.setForeground(new java.awt.Color(255, 255, 255));
        familyMembership.setText("Family(£60)");
        familyMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyMembershipActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Membership Type:");

        day_startDate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        day_startDate.setBorder(null);

        year_startDate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        year_startDate.setBorder(null);

        month_startDate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        month_startDate.setBorder(null);
        month_startDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month_startDateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Payment:");

        buttonGroup3.add(quaterlyPayment);
        quaterlyPayment.setForeground(new java.awt.Color(255, 255, 255));
        quaterlyPayment.setText("Quaterly");
        quaterlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaterlyPaymentActionPerformed(evt);
            }
        });

        buttonGroup3.add(monthlyPayment);
        monthlyPayment.setForeground(new java.awt.Color(255, 255, 255));
        monthlyPayment.setText("Monthly");
        monthlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyPaymentActionPerformed(evt);
            }
        });

        buttonGroup3.add(yearlyPayment);
        yearlyPayment.setForeground(new java.awt.Color(255, 255, 255));
        yearlyPayment.setText("Yearly");
        yearlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyPaymentActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitBtn.setText("CREATE MEMBERSHIP");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        familyMemLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        familyMemLabel.setForeground(new java.awt.Color(255, 255, 255));
        familyMemLabel.setText("Family Member Names:");

        familyMembersInp.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        familyMembersInp.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(female)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(otherGender)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(day_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(year_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(30, 30, 30)
                                .addComponent(individualMembership)
                                .addGap(18, 18, 18)
                                .addComponent(familyMembership))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(familyMemLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(familyMembersInp, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(health, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(allergies, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthlyPayment)
                                .addGap(18, 18, 18)
                                .addComponent(quaterlyPayment))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addComponent(addressInp, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(407, 407, 407)
                                .addComponent(jLabel12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(day_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(year_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearlyPayment))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitBtn)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(day_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addressInp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(otherGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(allergies, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(health, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(individualMembership)
                    .addComponent(familyMembership))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyMemLabel)
                    .addComponent(familyMembersInp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(day_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(monthlyPayment)
                    .addComponent(quaterlyPayment)
                    .addComponent(yearlyPayment))
                .addGap(36, 36, 36)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        familyMemLabel.setVisible(false);
        familyMembersInp.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private String memberType, gender, paymentType;
    private String fileName = "customerlist.csv";
    
    
    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void addressInpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressInpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressInpActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        new DashboardGUI().setVisible(true); //takes to the dashboard
        
    }//GEN-LAST:event_backBtnActionPerformed

   
    //on click of submit button
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //get all vales from the GUI
        String uID = String.format("%040d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16)).substring(0, Math.min(40, 6));
        String firstName = fName.getText();
        String lastName = lName.getText();
        Date dob = new Date(Integer.parseInt(day_dob.getText()),Month.of(Integer.parseInt(month_dob.getText())),
                Integer.parseInt(year_dob.getText()));
        String address = addressInp.getText().replace(",",";");
        String allergiesInfo = allergies.getText().replace(",",";");
        String healthInfo = health.getText().replace(",",";");
        String mobileNo = mobNo.getText();
        Date startDate = new Date(Integer.parseInt(day_startDate.getText()),Month.of(Integer.parseInt(month_startDate.getText())),Integer.parseInt(year_startDate.getText()));
        Membership membership = new Membership(paymentType,startDate);
        String row = "";
        //end of getting UI values
        boolean writeCSV = true; //flag to checkif needed to write into CSV
        if(memberType.equals("individual")){
            IndividualMember member; //create object of the member
            member = new IndividualMember(uID,firstName,lastName,dob,gender,address,allergiesInfo,healthInfo,mobileNo,membership);
            if(member.verifyAge()){
                //append all data to 'row' variable to be added into CSV
                row = member.getcID()+","+member.getFirstName()+","+member.getLastName()+","+
                            member.getDob().toString()+","+member.getGender()+","+member.getAddress()+
                            ","+member.getMobileNo()+","+member.getAllergiesDescription()+","+
                            member.getHealthDescription()+","+memberType+","+member.getMembership().getStartDate()+","+
                            member.getMembership().getPaymentType()+","+member.totalFees();
            }else{
                JOptionPane.showMessageDialog(this,"Sorry!"+
                        "\n"+member.getFirstName()+"'s age is "+member.calculateAge()+", and is too young to be a member(must be above 12)");
                writeCSV = false; //can't write into CSV
            }
        }else if (memberType.equals("family")){
            String familyMembers = familyMembersInp.getText().replace(",",";"); // replace , with ; (helps to write into CSV)
            FamilyMember member;
            member = new FamilyMember(uID,firstName,lastName,dob,gender,address,allergiesInfo,healthInfo,mobileNo,membership,familyMembers);
            if(member.verifyAge()){
                //append all data to 'row' variable to be added into CSV
                row = member.getcID()+","+member.getFirstName()+","+member.getLastName()+","+
                            member.getDob().toString()+","+member.getGender()+","+member.getAddress()+
                            ","+member.getMobileNo()+","+member.getAllergiesDescription()+","+
                            member.getHealthDescription()+","+memberType+","+member.getMembership().getStartDate()+","+
                            member.getMembership().getPaymentType()+","+member.totalFees()+","+member.getFamilyMembers();

            }else{
                JOptionPane.showMessageDialog(this,"Sorry!"+
                        "\n"+member.getFirstName()+"'s age is "+member.calculateAge()+", and is too young to be a member(must be above 18)");
                writeCSV = false;
            }
        }
        //checks if the member already exists
        try (Scanner scanner = new Scanner(new File(fileName));) {
            while (scanner.hasNextLine()) {
                List<String> rowCSV = new ArrayList<>(Arrays.asList(scanner.nextLine().split(",")) );
                List<String> rowEntered = new ArrayList<>(Arrays.asList(row.split(",")));
                rowCSV.remove(0);
                rowEntered.remove(0);
                if(rowCSV.equals(rowEntered)){
                    JOptionPane.showMessageDialog(this,"Sorry! Member "+rowEntered.get(0)+" already exists!");
                    writeCSV = false;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        //writes row into CSV 
        if(writeCSV){
            FileWriter writer = null;
            try {
                writer = new FileWriter(fileName,true);
                writer.append("\n"+row);
                JOptionPane.showMessageDialog(this,"Successfully Registered!"+
                    "\n"+firstName+"'s subscription ends on: "+
                    membership.endDate().toString());
                dispose();
                new DashboardGUI().setVisible(true);
             } catch (IOException e) {
                e.printStackTrace();
             } finally {
                    try {
                        writer.flush();
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender = "male";
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender = "female";
    }//GEN-LAST:event_femaleActionPerformed

    private void otherGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherGenderActionPerformed
        gender = "other";
    }//GEN-LAST:event_otherGenderActionPerformed

    private void month_startDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month_startDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_month_startDateActionPerformed

    private void yearlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyPaymentActionPerformed
        paymentType = "yearly";
    }//GEN-LAST:event_yearlyPaymentActionPerformed

    private void quaterlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaterlyPaymentActionPerformed
        paymentType = "quaterly";
    }//GEN-LAST:event_quaterlyPaymentActionPerformed

    private void monthlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyPaymentActionPerformed
        paymentType = "monthly";
    }//GEN-LAST:event_monthlyPaymentActionPerformed

    private void familyMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyMembershipActionPerformed
        memberType = "family";
        familyMemLabel.setVisible(true);
        familyMembersInp.setVisible(true); //makes the input field visible to enter family members
    }//GEN-LAST:event_familyMembershipActionPerformed

    private void individualMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_individualMembershipActionPerformed
        memberType = "individual";
        familyMemLabel.setVisible(false);
        familyMembersInp.setVisible(false); //invisibles the input field if its individual
    }//GEN-LAST:event_individualMembershipActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressInp;
    private javax.swing.JTextField allergies;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField day_dob;
    private javax.swing.JTextField day_startDate;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel familyMemLabel;
    private javax.swing.JTextField familyMembersInp;
    private javax.swing.JRadioButton familyMembership;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField health;
    private javax.swing.JRadioButton individualMembership;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lName;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobNo;
    private javax.swing.JTextField month_dob;
    private javax.swing.JTextField month_startDate;
    private javax.swing.JRadioButton monthlyPayment;
    private javax.swing.JRadioButton otherGender;
    private javax.swing.JRadioButton quaterlyPayment;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField year_dob;
    private javax.swing.JTextField year_startDate;
    private javax.swing.JRadioButton yearlyPayment;
    // End of variables declaration//GEN-END:variables
}
