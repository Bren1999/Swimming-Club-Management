import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SearchMembersGUI extends javax.swing.JFrame {

    private String fileName = "customerlist.csv";
    private List<String[]> csvBody = new ArrayList<>();
    private HashMap<String, Integer> index = new HashMap<>();
    
    public SearchMembersGUI() {
        initComponents();
        readCSV();
    }
    
    //read the whole CSV file and add it to the List of Strings csvBody
    private void readCSV(){
        try (Scanner scanner = new Scanner(new File(fileName));) {
            while (scanner.hasNextLine()) {
                csvBody.add(scanner.nextLine().split(","));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setRequestFocusEnabled(false);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Members' Info");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        lName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lName.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");

        fName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        fName.setBorder(null);

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "First Name", "Last Name", "DOB", "Gender", "Address", "Mobile No.", "Allergies", "Health", "Member Type", "Start Date", "Payment Type", "Fees Paid", "Family Members"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        deleteBtn.setText("Delete Selected Row");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update Selected Row");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(490, 490, 490))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn)
                        .addGap(345, 345, 345))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(584, 584, 584)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        new DashboardGUI().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        boolean found = false;
        int[] csvRowIndex;
        String firstName = fName.getText();
        String lastName = lName.getText();
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        table.setRowCount(0);
        //iterate through all the rows in csvBody
        for(int i=0;i<csvBody.size();i++){
            //generate UID for rows with no UID
            String uID;
            if(csvBody.get(i)[0].equals("")){
                uID = String.format("%040d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16)).substring(0, Math.min(40, 6));
                csvBody.get(i)[0] = uID;
            }else{
                uID = csvBody.get(i)[0];
                
            }
            //adds the rows to the table based on the lenght of the array
            if(csvBody.get(i).length >=13){
                if(csvBody.get(i)[1].equals(firstName) && csvBody.get(i)[2].equals(lastName) && !csvBody.get(i)[9].equals("visitor")){ //not searching for visitors here
                    table.addRow(csvBody.get(i));
                    index.put(csvBody.get(i)[0], i+1); // adds the index of the row of the csv
                    found = true;
                }
            }else{
                if(csvBody.get(i)[1].equals(firstName) && csvBody.get(i)[2].equals(lastName)){
                    table.addRow(csvBody.get(i));
                    index.put(csvBody.get(i)[0], i+1);
                    found = true;
                }
            }
        }
        //if the record is not found
        if(!found){
            JOptionPane.showMessageDialog(this,"Sorry! Records not found..");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //delete the selected row
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        try{
            int selectedRow = jTable1.getSelectedRow();
            //search for that row in the csvBody and delete based on the selected row
            csvBody.remove(csvBody.get(index.get(table.getValueAt(selectedRow,0))-1));
            table.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this,"Record Deleted!");
            //write into the CSV file
            FileWriter writer = null;
            try {
                writer = new FileWriter(fileName);
                for(int i=0;i<csvBody.size();i++){
                    String row = String.join(",",csvBody.get(i));
                    if(i == 0){
                        writer.append(row);
                    }else{
                        writer.append("\n"+row);
                    }
                    
                }
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
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No row selected!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //get the row to be updated
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        try{
            int selectedRow = jTable1.getSelectedRow();
            //delete the row from csvBody as the row will be updated in the next page and added
            ArrayList <String> s = new ArrayList<>(Arrays.asList(csvBody.get(index.get(table.getValueAt(selectedRow,0))-1)));
            csvBody.remove(csvBody.get(index.get(table.getValueAt(selectedRow,0))-1));
            FileWriter writer = null;
            try {
                writer = new FileWriter(fileName);
                for(int i=0;i<csvBody.size();i++){
                    String row = String.join(",",csvBody.get(i));
                    if(i == 0){
                        writer.append(row);
                    }else{
                        writer.append("\n"+row);
                    }
                }
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
            while(s.size()!=14){
                s.add("");
            }    
            dispose();
            new UpdateMemberGUI(s).setVisible(true); //open the update page witht the row
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"No row selected!");
        }
       
    }//GEN-LAST:event_updateBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lName;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
