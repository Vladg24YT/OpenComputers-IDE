/*
 * The MIT License
 *
 * Copyright 2021 Vladislav Gorskii.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ru.VladTheMountain.oclide.configurator.ocelot;

/**
 *
 * @author VladTheMountain
 */
public class ConfiguratorForm extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ConfiguratorForm
     */
    public ConfiguratorForm() {
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

        javax.swing.ButtonGroup eepromButtons = new javax.swing.ButtonGroup();
        javax.swing.JPanel controlPanel = new javax.swing.JPanel();
        javax.swing.JButton launchButton = new javax.swing.JButton();
        javax.swing.JButton cancelButton = new javax.swing.JButton();
        javax.swing.JPanel extensionsPanel = new javax.swing.JPanel();
        javax.swing.JPanel architecturePanel = new javax.swing.JPanel();
        javax.swing.JPanel eepromPanel = new javax.swing.JPanel();
        javax.swing.JRadioButton luaEEPROMButton = new javax.swing.JRadioButton();
        javax.swing.JRadioButton customEEPROMButton = new javax.swing.JRadioButton();
        javax.swing.JTextField customEEPROMField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JComboBox<String> floppyComboBox = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JComboBox<String> caseTierComboBox = new javax.swing.JComboBox<>();
        javax.swing.JPanel primaryPanel = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JComboBox<String> processingUnitComboBox = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JComboBox<String> memorySlot1ComboBox = new javax.swing.JComboBox<>();
        javax.swing.JComboBox<String> memorySlot2ComboBox = new javax.swing.JComboBox<>();
        javax.swing.JPanel secondaryPanel = new javax.swing.JPanel();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem clearConfigItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem importConfigItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem saveConfigItem = new javax.swing.JMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator1 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem exitConfigItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem helpItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OCEmu Configuration");
        setAlwaysOnTop(true);

        controlPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        launchButton.setText("Launch OCEmu");

        cancelButton.setText("Cancel");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(launchButton)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(launchButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        extensionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Additional Components", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        extensionsPanel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        extensionsPanel.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout extensionsPanelLayout = new javax.swing.GroupLayout(extensionsPanel);
        extensionsPanel.setLayout(extensionsPanelLayout);
        extensionsPanelLayout.setHorizontalGroup(
            extensionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        extensionsPanelLayout.setVerticalGroup(
            extensionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        architecturePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Architecture", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        architecturePanel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        architecturePanel.setMinimumSize(new java.awt.Dimension(200, 200));

        eepromPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EEPROM", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        eepromButtons.add(luaEEPROMButton);
        luaEEPROMButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        luaEEPROMButton.setSelected(true);
        luaEEPROMButton.setText("Lua BIOS");

        eepromButtons.add(customEEPROMButton);
        customEEPROMButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        customEEPROMButton.setText("Custom");

        customEEPROMField.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        customEEPROMField.setToolTipText("Path to custom EEPROM script");

        javax.swing.GroupLayout eepromPanelLayout = new javax.swing.GroupLayout(eepromPanel);
        eepromPanel.setLayout(eepromPanelLayout);
        eepromPanelLayout.setHorizontalGroup(
            eepromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customEEPROMField)
            .addComponent(customEEPROMButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(luaEEPROMButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        eepromPanelLayout.setVerticalGroup(
            eepromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eepromPanelLayout.createSequentialGroup()
                .addComponent(luaEEPROMButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customEEPROMButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customEEPROMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setLabelFor(floppyComboBox);
        jLabel2.setText("Floppy:");

        floppyComboBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        floppyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OpenOS", "OpenLoader", "OPPM" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setLabelFor(caseTierComboBox);
        jLabel3.setText("Case type:");
        jLabel3.setToolTipText("");

        caseTierComboBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        caseTierComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Case Tier 1", "Case Tier 2", "Case Tier 3", "Case Creative" }));

        javax.swing.GroupLayout architecturePanelLayout = new javax.swing.GroupLayout(architecturePanel);
        architecturePanel.setLayout(architecturePanelLayout);
        architecturePanelLayout.setHorizontalGroup(
            architecturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(architecturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(architecturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eepromPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(architecturePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(floppyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(architecturePanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(caseTierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        architecturePanelLayout.setVerticalGroup(
            architecturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, architecturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(architecturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caseTierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(architecturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(floppyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eepromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        primaryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Primary Components", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        primaryPanel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        primaryPanel.setMinimumSize(new java.awt.Dimension(200, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setLabelFor(processingUnitComboBox);
        jLabel1.setText("Processing Unit:");

        processingUnitComboBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        processingUnitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPU Tier 1", "CPU Tier 2", "CPU Tier 3", "APU Tier 2", "APU Tier 3", "APU Creative" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Memory Slot 1");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Memory Slot 2");

        memorySlot1ComboBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        memorySlot1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tier 1", "Tier 1.5", "Tier 2", "Tier 2.5", "Tier 3", "Tier 3.5" }));

        memorySlot2ComboBox.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        memorySlot2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tier 1", "Tier 1.5", "Tier 2", "Tier 2.5", "Tier 3", "Tier 3.5" }));

        javax.swing.GroupLayout primaryPanelLayout = new javax.swing.GroupLayout(primaryPanel);
        primaryPanel.setLayout(primaryPanelLayout);
        primaryPanelLayout.setHorizontalGroup(
            primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(primaryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processingUnitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, primaryPanelLayout.createSequentialGroup()
                        .addGroup(primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memorySlot1ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memorySlot2ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        primaryPanelLayout.setVerticalGroup(
            primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(primaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(processingUnitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(memorySlot1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(primaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(memorySlot2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        secondaryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Secondary Components", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        secondaryPanel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        secondaryPanel.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout secondaryPanelLayout = new javax.swing.GroupLayout(secondaryPanel);
        secondaryPanel.setLayout(secondaryPanelLayout);
        secondaryPanelLayout.setHorizontalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        secondaryPanelLayout.setVerticalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fileMenu.setText("File");

        clearConfigItem.setText("Clear configuration");
        fileMenu.add(clearConfigItem);

        importConfigItem.setText("Import from file");
        fileMenu.add(importConfigItem);

        saveConfigItem.setText("Save to file");
        fileMenu.add(saveConfigItem);
        fileMenu.add(jSeparator1);

        exitConfigItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitConfigItem.setText("Exit configurator");
        fileMenu.add(exitConfigItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText("Help");

        helpItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        helpItem.setText("Help");
        helpMenu.add(helpItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(extensionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(architecturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(architecturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(extensionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
