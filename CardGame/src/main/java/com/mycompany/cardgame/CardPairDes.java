// CardPairGameScreen.java
package com.mycompany.cardgame;

import javax.swing.*;

public class CardPairDes extends JFrame {
    
    private String selectedDifficulty;
    
    public CardPairDes(String selectedDifficulty) {
        this.selectedDifficulty = selectedDifficulty;
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Card Pair Game");
        
        // Implement the components and logic for the card pair game screen here
        
        // Example: Display the selected difficulty in a label
        JLabel difficultyLabel = new JLabel("Selected Difficulty: " + selectedDifficulty);
        getContentPane().add(difficultyLabel);
        
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }
}
