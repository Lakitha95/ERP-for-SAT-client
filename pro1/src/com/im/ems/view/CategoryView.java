/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.ems.view;

import com.im.ems.controller.CategoryController;
import com.im.ems.model.Category;
import javax.swing.JOptionPane;

/**
 *
 * @author Lakitha
 */
public class CategoryView extends javax.swing.JPanel {

    /**
     * Creates new form CategoryView
     */
    public CategoryView() {
        initComponents();
    }
    String id;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnCatNew = new javax.swing.JButton();
        btnCatSave = new javax.swing.JButton();
        btnCatFind = new javax.swing.JButton();
        btnCatUpdate = new javax.swing.JButton();
        btnCatDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCatName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jToolBar1.setRollover(true);

        btnCatNew.setText("New");
        btnCatNew.setFocusable(false);
        btnCatNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCatNew);

        btnCatSave.setText("Save");
        btnCatSave.setFocusable(false);
        btnCatSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCatSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCatSave);

        btnCatFind.setText("Find");
        btnCatFind.setFocusable(false);
        btnCatFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatFind.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCatFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatFindActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCatFind);

        btnCatUpdate.setText("Update");
        btnCatUpdate.setFocusable(false);
        btnCatUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCatUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatUpdateActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCatUpdate);

        btnCatDelete.setText("delete");
        btnCatDelete.setFocusable(false);
        btnCatDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCatDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCatDelete);

        jLabel1.setText("Name");

        txtCatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 721, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel2);

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category Name"
            }
        ));
        jScrollPane1.setViewportView(tblCategory);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatNameActionPerformed

    private void btnCatSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatSaveActionPerformed
        // Retrieve Data From Form
        String catname = txtCatName.getText();
        //model the data into a single object
        Category category = new Category();
        category.setName(catname);

        //pass object to the controller
        boolean done = CategoryController.create(category);
        if (done) {
            JOptionPane.showMessageDialog(this, "Saved Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Not Saved Successfully");
        }
    }//GEN-LAST:event_btnCatSaveActionPerformed

    private void btnCatFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatFindActionPerformed
        id = JOptionPane.showInputDialog("Enter ID");
        int categoryId = Integer.parseInt(id);
        Category category = CategoryController.retrievecat(categoryId);
        txtCatName.setText(category.getName());
    }//GEN-LAST:event_btnCatFindActionPerformed

    private void btnCatUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatUpdateActionPerformed
        // Retrieve Data From Form
        int catid = Integer.parseInt(id);
        //model the data into a single object
        Category category = new Category();
        category.setId(catid);
        String catname = txtCatName.getText();
        category.setName(catname);

        //pass object to the controller
        boolean done = CategoryController.create(category);
        if (done) {
            JOptionPane.showMessageDialog(this, "Updated Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Not Updated Successfully");
        }
    }//GEN-LAST:event_btnCatUpdateActionPerformed

    private void btnCatDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatDeleteActionPerformed
        String catname = txtCatName.getText();
        //model the data into a single object
        Category category = new Category();
        category.setName(catname);

        //pass object to the controller
        boolean done = CategoryController.create(category);
        if (done) {
            JOptionPane.showMessageDialog(this, "Deleted Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Not Deleted Successfully");
        }
    }//GEN-LAST:event_btnCatDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatDelete;
    private javax.swing.JButton btnCatFind;
    private javax.swing.JButton btnCatNew;
    private javax.swing.JButton btnCatSave;
    private javax.swing.JButton btnCatUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTextField txtCatName;
    // End of variables declaration//GEN-END:variables
}