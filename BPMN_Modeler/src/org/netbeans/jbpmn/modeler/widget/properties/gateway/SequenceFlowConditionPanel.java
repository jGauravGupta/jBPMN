/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jbpmn.modeler.widget.properties.gateway;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.ComboBoxValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.Entity;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.RowValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.internal.EntityComponent;
import org.netbeans.jbpmn.spec.extend.LanguageManager;

public class SequenceFlowConditionPanel extends EntityComponent {

    /**
     * Creates new form OutputParameterPanel
     */
    public SequenceFlowConditionPanel() {
        this(null, true);
        scriptType_ComboBox.setEditable(true);
    }

    @Override
    public void init() {
        constraint_TextArea.setText("");
        defaultFlow_CheckBox.setSelected(false);
        initScriptTypeComboBox();
        scriptType_ComboBox.setSelectedItem(LanguageManager.getLanguage(null));
    }

    @Override
    public void createEntity(Class/*<? extends Entity>*/ entityWrapperType) {
        JOptionPane.showMessageDialog(this, "Cannot create new set here", "Invalid Call", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void updateEntity(Entity entityValue) {
        this.setTitle("SequenceFlow Settings");
        if (entityValue.getClass() == RowValue.class) {
            this.setEntity(entityValue);
            Object[] row = ((RowValue) entityValue).getRow();
            Boolean _default = (Boolean) row[2];
            defaultFlow_CheckBox.setSelected(_default);
            if (defaultFlow_CheckBox.isSelected()) {
                enableConditionPanel(false);
            } else {
                enableConditionPanel(true);
                String condition = (String) row[3];

                constraint_TextArea.setText(condition);
                scriptType_ComboBox.setSelectedItem((ComboBoxValue<String>) row[4]);
            }
        }
    }

    void initScriptTypeComboBox() {
        scriptType_ComboBox.removeAllItems();
        for (ComboBoxValue<String> language : LanguageManager.getLanguageList()) {
            scriptType_ComboBox.addItem(language);
        }
    }

    private SequenceFlowConditionPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        layeredPane = new javax.swing.JLayeredPane();
        defaultFlowPanel = new javax.swing.JLayeredPane();
        defaultFlowInnerPanel = new javax.swing.JLayeredPane();
        defaultFlow_Label = new javax.swing.JLabel();
        defaultFlow_CheckBox = new javax.swing.JCheckBox();
        conditionPanel = new javax.swing.JLayeredPane();
        scriptTypePanel = new javax.swing.JLayeredPane();
        scriptType_Label = new javax.swing.JLabel();
        scriptType_ComboBox = new javax.swing.JComboBox();
        constraintPanel = new javax.swing.JLayeredPane();
        constraint_Label = new javax.swing.JLabel();
        constraint_ScrollPane = new javax.swing.JScrollPane();
        constraint_TextArea = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        cancel_Button = new javax.swing.JButton();
        save_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        defaultFlowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Default", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        defaultFlowInnerPanel.setPreferredSize(new java.awt.Dimension(400, 35));

        defaultFlow_Label.setText("Is Default Flow :");

        defaultFlow_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultFlow_CheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout defaultFlowInnerPanelLayout = new javax.swing.GroupLayout(defaultFlowInnerPanel);
        defaultFlowInnerPanel.setLayout(defaultFlowInnerPanelLayout);
        defaultFlowInnerPanelLayout.setHorizontalGroup(
            defaultFlowInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultFlowInnerPanelLayout.createSequentialGroup()
                .addComponent(defaultFlow_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(defaultFlow_CheckBox)
                .addContainerGap())
        );
        defaultFlowInnerPanelLayout.setVerticalGroup(
            defaultFlowInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultFlowInnerPanelLayout.createSequentialGroup()
                .addGroup(defaultFlowInnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(defaultFlow_CheckBox)
                    .addComponent(defaultFlow_Label))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        defaultFlowInnerPanel.setLayer(defaultFlow_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        defaultFlowInnerPanel.setLayer(defaultFlow_CheckBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout defaultFlowPanelLayout = new javax.swing.GroupLayout(defaultFlowPanel);
        defaultFlowPanel.setLayout(defaultFlowPanelLayout);
        defaultFlowPanelLayout.setHorizontalGroup(
            defaultFlowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultFlowPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(defaultFlowInnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62))
        );
        defaultFlowPanelLayout.setVerticalGroup(
            defaultFlowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultFlowPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(defaultFlowInnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        defaultFlowPanel.setLayer(defaultFlowInnerPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conditionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Condition", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        conditionPanel.setPreferredSize(new java.awt.Dimension(535, 110));

        scriptTypePanel.setPreferredSize(new java.awt.Dimension(400, 30));

        scriptType_Label.setText("Script Type :");
        scriptType_Label.setPreferredSize(new java.awt.Dimension(50, 15));

        javax.swing.GroupLayout scriptTypePanelLayout = new javax.swing.GroupLayout(scriptTypePanel);
        scriptTypePanel.setLayout(scriptTypePanelLayout);
        scriptTypePanelLayout.setHorizontalGroup(
            scriptTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scriptTypePanelLayout.createSequentialGroup()
                .addComponent(scriptType_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scriptType_ComboBox, 0, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        scriptTypePanelLayout.setVerticalGroup(
            scriptTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scriptTypePanelLayout.createSequentialGroup()
                .addGroup(scriptTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scriptType_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scriptType_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        scriptTypePanel.setLayer(scriptType_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        scriptTypePanel.setLayer(scriptType_ComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        constraintPanel.setName(""); // NOI18N
        constraintPanel.setPreferredSize(new java.awt.Dimension(400, 30));

        constraint_Label.setText("Constraint :");
        constraint_Label.setPreferredSize(new java.awt.Dimension(50, 15));

        constraint_TextArea.setColumns(20);
        constraint_TextArea.setRows(5);
        constraint_ScrollPane.setViewportView(constraint_TextArea);

        javax.swing.GroupLayout constraintPanelLayout = new javax.swing.GroupLayout(constraintPanel);
        constraintPanel.setLayout(constraintPanelLayout);
        constraintPanelLayout.setHorizontalGroup(
            constraintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(constraintPanelLayout.createSequentialGroup()
                .addComponent(constraint_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(constraint_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        constraintPanelLayout.setVerticalGroup(
            constraintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(constraintPanelLayout.createSequentialGroup()
                .addGroup(constraintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(constraintPanelLayout.createSequentialGroup()
                        .addComponent(constraint_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, constraintPanelLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(constraint_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        constraintPanel.setLayer(constraint_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        constraintPanel.setLayer(constraint_ScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout conditionPanelLayout = new javax.swing.GroupLayout(conditionPanel);
        conditionPanel.setLayout(conditionPanelLayout);
        conditionPanelLayout.setHorizontalGroup(
            conditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, conditionPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(conditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scriptTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(constraintPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        conditionPanelLayout.setVerticalGroup(
            conditionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conditionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scriptTypePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(constraintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
        conditionPanel.setLayer(scriptTypePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        conditionPanel.setLayer(constraintPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cancel_Button.setText("Cancel");
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });

        save_Button.setText("Save");
        save_Button.setToolTipText("");
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(save_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel_Button))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(save_Button)
                .addComponent(cancel_Button))
        );
        jLayeredPane1.setLayer(cancel_Button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(save_Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneLayout = new javax.swing.GroupLayout(layeredPane);
        layeredPane.setLayout(layeredPaneLayout);
        layeredPaneLayout.setHorizontalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(defaultFlowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conditionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layeredPaneLayout.setVerticalGroup(
            layeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defaultFlowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conditionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layeredPane.setLayer(defaultFlowPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(conditionPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPane.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateField() {
        if (!defaultFlow_CheckBox.isSelected()) {
            if (this.constraint_TextArea.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
                JOptionPane.showMessageDialog(this, "Constraint can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
                return false;
            }//I18n
        }
//        if (this.sourceDataType_TextField.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
//            JOptionPane.showMessageDialog(this, "Parameter datatype can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
//            return false;
//        }//I18n
//        if (expression_RadioButton.isSelected()) {
//            if (this.script_TextArea.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
//                JOptionPane.showMessageDialog(this, "Script can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
//                return false;
//            }//I18n
//        } else {
//            String targetRefName = (String) targetRef_ComboBox.getSelectedItem();
//            if (targetRefName.trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
//                JOptionPane.showMessageDialog(this, "Target can't be blank", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
//                return false;
//            }//I18n

//        }
        return true;
    }

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        RowValue rowValue = (RowValue) this.getEntity();
        Object[] row = rowValue.getRow();

        if (!validateField()) {
            return;
        }

        row[2] = (Boolean) defaultFlow_CheckBox.isSelected();
        if (defaultFlow_CheckBox.isSelected()) {
            row[3] = null;
            row[4] = null;
            Component component = this.getRootComponent();
            if (component instanceof JTable) {
                DefaultTableModel tableModel = (DefaultTableModel) ((JTable) component).getModel();
                int defaultFlow_Column = 2;
                for (int i = 0; i < tableModel.getRowCount(); i++) { // only one default sequence flow exist ; so set false to all
                    tableModel.setValueAt(false, i, defaultFlow_Column);
                }
            }
        } else {
            ComboBoxValue<String> comboBoxValue;
            if (scriptType_ComboBox.getSelectedItem() instanceof String) {
                comboBoxValue = new ComboBoxValue<String>((String) scriptType_ComboBox.getSelectedItem(), (String) scriptType_ComboBox.getSelectedItem());
            } else {
                comboBoxValue = (ComboBoxValue<String>) scriptType_ComboBox.getSelectedItem();
            }
            row[3] = constraint_TextArea.getText();
            row[4] = comboBoxValue;
        }

        saveActionPerformed(evt);
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        cancelActionPerformed(evt);
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    private void defaultFlow_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultFlow_CheckBoxActionPerformed
        if (defaultFlow_CheckBox.isSelected()) {
            enableConditionPanel(false);
        } else {
            enableConditionPanel(true);
        }
    }//GEN-LAST:event_defaultFlow_CheckBoxActionPerformed

    void enableConditionPanel(boolean enable) {
        conditionPanel.setEnabled(enable);
        constraintPanel.setEnabled(enable);
        constraint_Label.setEnabled(enable);
        constraint_ScrollPane.setEnabled(enable);
        constraint_TextArea.setEnabled(enable);
        scriptType_ComboBox.setEnabled(enable);
        scriptTypePanel.setEnabled(enable);
        scriptType_Label.setEnabled(enable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLayeredPane conditionPanel;
    private javax.swing.JLayeredPane constraintPanel;
    private javax.swing.JLabel constraint_Label;
    private javax.swing.JScrollPane constraint_ScrollPane;
    private javax.swing.JTextArea constraint_TextArea;
    private javax.swing.JLayeredPane defaultFlowInnerPanel;
    private javax.swing.JLayeredPane defaultFlowPanel;
    private javax.swing.JCheckBox defaultFlow_CheckBox;
    private javax.swing.JLabel defaultFlow_Label;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JButton save_Button;
    private javax.swing.JLayeredPane scriptTypePanel;
    private javax.swing.JComboBox scriptType_ComboBox;
    private javax.swing.JLabel scriptType_Label;
    // End of variables declaration//GEN-END:variables

}
/*
 Pane  400 30      10 10 0
 Label 80
 TextField 300

 */
