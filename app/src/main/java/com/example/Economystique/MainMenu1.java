/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Economystique;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Joumongo
 */
public class MainMenu1 extends javax.swing.JFrame  {
    private JFrame frame;
    private JPanel contentPanel;
    public MainMenu1() {
        // Initialize components
        frame = new JFrame("Economystique");

        // Setup the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        
        // Create a panel to hold dynamic content
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        
        // Add components
        frame.setJMenuBar(createMenuBar());
        frame.add(contentPanel);
        
        

        // Show frame
        frame.setVisible(true);
        
    }

    private JMenuBar createMenuBar() {
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create File menu
        JMenuItem navAcc = new JMenuItem("Account");
        JMenuItem navCal = new JMenuItem("Calendar");
        JMenuItem navSales = new JMenuItem("Sales");
        JMenuItem navInv = new JMenuItem("Inventory");

        menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        // Add items to menu bar
        menuBar.add(navAcc);
        menuBar.add(navCal);
        menuBar.add(navSales);
        menuBar.add(navInv);

        // Add action listeners to the menu items
        navInv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InventoryStatus();
            }
        });
        //Add events
        navAcc.addActionListener(e -> Accounts());
        navCal.addActionListener(e -> Calendar());
        navSales.addActionListener(e -> Sales());
        navInv.addActionListener(e -> InventoryStatus());
        
        return menuBar;
    }
    
    public void InventoryStatus(){
        contentPanel.removeAll(); // Clear any previous content
        JLabel title = new JLabel("Inventory Status", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24)); // Optional: Set font style and size
        contentPanel.add(title, BorderLayout.NORTH); // Add the JLabel to the content panel
        contentPanel.revalidate(); // Revalidate the panel to update UI
        contentPanel.repaint(); // Repaint to reflect changes
    }
    
    public void Sales(){
    }
    
    public void Calendar(){
    }
    
    public void Accounts(){
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
