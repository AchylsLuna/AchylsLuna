// DifficultySelectionFrame.java
package com.mycompany.cardgame;

import javax.swing.*;

public class DifficultySelectionFrame extends JFrame {
    
    public DifficultySelectionFrame() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Difficulty Selection");
        
        JPanel panel = createPanel();
        getContentPane().add(panel);
        
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }
    
    private JPanel createPanel() {
        JPanel panel = new JPanel();
        
        String[] options = {"Easy", "Intermediate", "Hard"};
        JComboBox<String> difficultyComboBox = new JComboBox<>(options);
        panel.add(difficultyComboBox);
        
        JButton startButton = new JButton("Start");
        startButton.addActionListener(evt -> startButtonActionPerformed(difficultyComboBox));
        panel.add(startButton);
        
        return panel;
    }
    
    private void startButtonActionPerformed(JComboBox<String> difficultyComboBox) {
        String selectedDifficulty = (String) difficultyComboBox.getSelectedItem();
        // Here, you can perform any actions based on the selected difficulty
        // For example, you could create the CardPairGameScreen passing the selected difficulty
        new CardPairGameScreen(selectedDifficulty).setVisible(true);
        dispose(); // Close the DifficultySelectionFrame
    }
}
