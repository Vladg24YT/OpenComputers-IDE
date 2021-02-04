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
package ru.VladTheMountain.emulator.ui;

import java.awt.Canvas;
import javax.swing.GroupLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

/**
 *
 * @author VladTheMountain
 */
public class OcelotEmulatorFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form EmulatorFrame
     */
    public OcelotEmulatorFrame() {
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

        mainCanvas = new Canvas();
        jMenuBar1 = new JMenuBar();
        fileMenu = new JMenu();
        viewMenu = new JMenu();
        windowMenu = new JMenu();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OCLIDE Built-In Emulator");

        fileMenu.setText("File");
        jMenuBar1.add(fileMenu);

        viewMenu.setText("View");
        jMenuBar1.add(viewMenu);

        windowMenu.setText("Window");
        jMenuBar1.add(windowMenu);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainCanvas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainCanvas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    JMenu fileMenu;
    JMenuBar jMenuBar1;
    Canvas mainCanvas;
    JMenu viewMenu;
    JMenu windowMenu;
    // End of variables declaration//GEN-END:variables
}