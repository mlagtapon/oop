package project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random; 

public class GraphicalUserInterface {
    private JFrame frame;
    private JComboBox<String> playersComboBox;
    private JLabel playerNameLabel;
    private JLabel winRateLabel;
    private JButton fireballButton;
    private JButton shieldButton;
    private JButton luteButton;
    private JLabel effectLabel; 


    public GraphicalUserInterface(ArrayList<PlayerData> playerList) {
        createAndShowGUI(playerList);
    }

    public void createAndShowGUI(ArrayList<PlayerData> playerList) {
        frame = new JFrame("Fireball | Shield | Lute");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); 

        playersComboBox = new JComboBox<>();

        for (PlayerData player : playerList) {
            if (player.isActive()) {
                playersComboBox.addItem(player.getFirstName());
            }
        } 

        
        frame.add(playersComboBox);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        //Player info labels
        playerNameLabel = new JLabel("Player: ");
        winRateLabel = new JLabel("Win Rate: ");
        frame.add(playerNameLabel);
        frame.add(winRateLabel);
        
        //Action buttons
        JPanel buttonPanel = new JPanel();
        fireballButton = new JButton("Fireball");
        shieldButton = new JButton("Shield");
        luteButton = new JButton("Lute");
        
        //Buttons are initially disabled
        fireballButton.setEnabled(false);
        shieldButton.setEnabled(false);
        luteButton.setEnabled(false);
        
        //Button colors
        fireballButton.setBackground(Color.RED);
        shieldButton.setBackground(Color.BLUE);
        luteButton.setBackground(Color.YELLOW);
        
        buttonPanel.add(fireballButton);
        buttonPanel.add(shieldButton);
        buttonPanel.add(luteButton);
        frame.add(buttonPanel);
        
        playersComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedPlayer = (String) playersComboBox.getSelectedItem();
                for (PlayerData player : playerList) {
                    if (player.getFirstName().equals(selectedPlayer)) {
                        playerNameLabel.setText("Player: " + player.getFirstName());
                        winRateLabel.setText("Win Rate: " + player.getWinRate());       
                 
                        //Buttons are enabled when player is selected
                        fireballButton.setEnabled(true);
                        shieldButton.setEnabled(true);
                        luteButton.setEnabled(true);
                    }
                }
            }
        });    
        
        effectLabel = new JLabel();
        frame.add(effectLabel); 
        
        // Action listeners for the buttons
        fireballButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onFireballSelected();
            }
        });

        shieldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onShieldSelected();
            }
        });

        luteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onLuteSelected();
            }
        });
    }
    private void onFireballSelected() {
        Random rand = new Random();
        int randNum = rand.nextInt(3);
        
        //If the opponent is the fighter: display the failureGraphic() text
        if (randNum == 0) {
            FighterCharacter fighter = new FighterCharacter();
            effectLabel.setText(fighter.failureGraphic());
        }
        //If the opponent is the bard, display the graphicEffect of fireball.
        else if (randNum == 1) {
            BardCharacter bard = new BardCharacter();
            effectLabel.setText(bard.graphicalEffect());
        }
        //If the opponent is a magic character , display It’s a draw.
        else if (randNum == 2) {
            effectLabel.setText("It's a draw.");
        }
    }

    private void onShieldSelected() {
        // TODO: Implement Shield  logic 
        effectLabel.setText("Shield example text");
    }

    private void onLuteSelected() {
        // TODO: Implement Lute  logic 
        effectLabel.setText("Lute example text");
    }
     
   
    
 }
