import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.time.Month;
import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

public class NewVisitorGUI extends javax.swing.JFrame {

    public NewVisitorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        day_dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        month_dob = new javax.swing.JTextField();
        year_dob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        day_startDate = new javax.swing.JTextField();
        year_startDate = new javax.swing.JTextField();
        month_startDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        swimmingCB = new javax.swing.JCheckBox();
        gymCB = new javax.swing.JCheckBox();
        yogaCB = new javax.swing.JCheckBox();
        aerobicsCB = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mFirstName = new javax.swing.JTextField();
        mLastName = new javax.swing.JTextField();
        individualMembership = new javax.swing.JRadioButton();
        familyMembership = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        otherGender = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sports Club");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visitor Entry Details");

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

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth:");

        fName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fName.setBorder(null);

        month_dob.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        month_dob.setBorder(null);

        year_dob.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        year_dob.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender:");

        buttonGroup1.add(male);
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Visitor's Entry Date:");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Facilities needed");

        day_startDate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        day_startDate.setBorder(null);

        year_startDate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        year_startDate.setBorder(null);

        month_startDate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        month_startDate.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        submitBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submitBtn.setText("REGISTER VISITOR");
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

        swimmingCB.setForeground(new java.awt.Color(255, 255, 255));
        swimmingCB.setText("Swimming Pool (£1)");
        swimmingCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swimmingCBActionPerformed(evt);
            }
        });

        gymCB.setForeground(new java.awt.Color(255, 255, 255));
        gymCB.setText("Gym (£0.50)");
        gymCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gymCBActionPerformed(evt);
            }
        });

        yogaCB.setForeground(new java.awt.Color(255, 255, 255));
        yogaCB.setText("Yoga (£0.25)");
        yogaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yogaCBActionPerformed(evt);
            }
        });

        aerobicsCB.setForeground(new java.awt.Color(255, 255, 255));
        aerobicsCB.setText("Aerobics Lessons (£0.25)");
        aerobicsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aerobicsCBActionPerformed(evt);
            }
        });

        jPanel2.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Enter Member's Details");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Last Name:");

        buttonGroup2.add(individualMembership);
        individualMembership.setText("Individual");
        individualMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualMembershipActionPerformed(evt);
            }
        });

        buttonGroup2.add(familyMembership);
        familyMembership.setText("Family");
        familyMembership.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyMembershipActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("Membership Type:");

        jPanel2.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(familyMembership)
                    .addComponent(individualMembership))
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(individualMembership)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(familyMembership)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        otherGender.setForeground(new java.awt.Color(255, 255, 255));
        otherGender.setText("Other");
        otherGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitBtn)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(swimmingCB)
                                    .addComponent(gymCB))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yogaCB)
                                    .addComponent(aerobicsCB)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(female)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(otherGender)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backBtn)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(day_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(otherGender))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(swimmingCB)
                    .addComponent(aerobicsCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gymCB)
                    .addComponent(yogaCB))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(day_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
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

    //CSVfile name
    String fileName = "customerlist.csv";
    
    //instance variables
    String gender, memberType;
    HashMap<String,Facility> facilities = new HashMap<String,Facility>();
    
    
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        new DashboardGUI().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        //get values from input fields in GUI
        String uID = String.format("%040d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16)).substring(0, Math.min(40, 6));
        String firstName = fName.getText();
        String lastName = lName.getText();
        Date dob = new Date(Integer.parseInt(day_dob.getText()),Month.of(Integer.parseInt(month_dob.getText())),
                Integer.parseInt(year_dob.getText()));
        Date entryDate = new Date(Integer.parseInt(day_startDate.getText()),Month.of(Integer.parseInt(month_startDate.getText())),Integer.parseInt(year_startDate.getText()));
        Visitor visitor = new Visitor(uID,firstName,lastName,dob,gender,facilities,entryDate);
        //end of getting vales
        boolean writeCSV = false; //flag to write into CSV
        if(jPanel2.isEnabled()){ //will be enabled if visitor's age is <12
            String memberFirstName = mFirstName.getText();
            String memberLastName = mLastName.getText();
            boolean memberExist = false;
            String[] row;
            //checks if member exists 
            try (Scanner scanner = new Scanner(new File(fileName));) {
                while (scanner.hasNextLine()) {
                    row = scanner.nextLine().split(",");
                    try{
                        if(row[1].equals(memberFirstName)&&row[2].equals(memberLastName)&&(row[9].equals("individual")||row[9].equals("family"))){
                            memberExist = true;
                            writeCSV = true;
                            JOptionPane.showMessageDialog(this,"Visitor Entered!"+
                            "\n"+visitor.getFirstName()+" can use the Club for free!!");
                        }
                    }catch(IndexOutOfBoundsException e){
                        e.printStackTrace();
                    }
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
            if(!memberExist){
                JOptionPane.showMessageDialog(this,"Sorry!"+memberFirstName+" is not a member and so Visitor "+visitor.getFirstName()+" cannot enter the Club.");
            }
        }else{ //if age is >12
            if(visitor.verifyAge()){
            writeCSV = true;
            JOptionPane.showMessageDialog(this,"Visitor Entered!"+
                        "\n"+visitor.getFirstName()+"'s total fees are: £"+visitor.totalFees());
            }else{
                jPanel2.setVisible(true); //if age <12 make the member's input section visible
                jPanel2.setEnabled(true);
                JOptionPane.showMessageDialog(this,"Visitor "+visitor.getFirstName()+" is too young to enter the club. Must enter with a member.");
            }
        }
        //writes into CSV
        if(writeCSV){
            FileWriter writer = null;
            try {
                writer = new FileWriter(fileName,true);
                writer.append(
                        "\n"+visitor.getcID()+","+visitor.getFirstName()+","+visitor.getLastName()+","+
                        visitor.getDob().toString()+","+visitor.getGender()+",,,,,visitor,"+visitor.getEntryDate().toString() +",,"+visitor.totalFees()
                    );
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

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender = "female";
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender = "male";
    }//GEN-LAST:event_maleActionPerformed

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameActionPerformed

    private void swimmingCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swimmingCBActionPerformed
        Facility swimming = new Facility("Swimming Pool",1);
        if(swimmingCB.isSelected()){
            facilities.put("swimming",swimming); //adds this facility to the list of facilities the visitor needs
        }else{
            facilities.remove("swimming"); //removes this facility if unselected
        }
    }//GEN-LAST:event_swimmingCBActionPerformed

    private void aerobicsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aerobicsCBActionPerformed
        Facility aerobics = new Facility("Aerobics Lessons",0.25);
        if(aerobicsCB.isSelected()){
            facilities.put("aerobics",aerobics); //adds this facility to the list of facilities the visitor needs
        }else {
            facilities.remove("aerobics"); //removes this facility if unselected
        }
    }//GEN-LAST:event_aerobicsCBActionPerformed

    private void gymCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gymCBActionPerformed
        Facility gym = new Facility("Gym",0.50);
        if(gymCB.isSelected()){
            facilities.put("gym",gym); //adds this facility to the list of facilities the visitor needs
        }else {
            facilities.remove("gym"); //removes this facility if unselected
        }
    }//GEN-LAST:event_gymCBActionPerformed

    private void yogaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yogaCBActionPerformed
        Facility yoga = new Facility("Yoga",0.25);
        if(yogaCB.isSelected()){
            facilities.put("yoga",yoga); //adds this facility to the list of facilities the visitor needs
        }else if(!yogaCB.isSelected()){
            facilities.remove("yoga"); //removes this facility if unselected
        }
    }//GEN-LAST:event_yogaCBActionPerformed

    private void individualMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_individualMembershipActionPerformed
        memberType = "individual";
    }//GEN-LAST:event_individualMembershipActionPerformed

    private void familyMembershipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyMembershipActionPerformed
        memberType = "family";
    }//GEN-LAST:event_familyMembershipActionPerformed

    private void otherGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherGenderActionPerformed
        gender = "other";
    }//GEN-LAST:event_otherGenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aerobicsCB;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField day_dob;
    private javax.swing.JTextField day_startDate;
    private javax.swing.JTextField fName;
    private javax.swing.JRadioButton familyMembership;
    private javax.swing.JRadioButton female;
    private javax.swing.JCheckBox gymCB;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField mFirstName;
    private javax.swing.JTextField mLastName;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField month_dob;
    private javax.swing.JTextField month_startDate;
    private javax.swing.JRadioButton otherGender;
    private javax.swing.JButton submitBtn;
    private javax.swing.JCheckBox swimmingCB;
    private javax.swing.JTextField year_dob;
    private javax.swing.JTextField year_startDate;
    private javax.swing.JCheckBox yogaCB;
    // End of variables declaration//GEN-END:variables
}
