
package com.unpri.charactermanager.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
import com.unpri.charactermanager.model.Character;

public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private ArrayList<Character> characterList;
    private double averageLevel;

    public MainWindow(ArrayList<Character> characterList,
                      double averageLevel) {
        super("Character Manager v0.3");

        this.characterList = characterList;
        this.averageLevel = averageLevel;

        initComponents();

        setSize(650, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new javax.swing.BoxLayout(
            mainPanel, javax.swing.BoxLayout.Y_AXIS
        ));

        JLabel titleLabel = new JLabel(
            "=== Daftar Karakter (" + characterList.size() + ") ==="
        );
        mainPanel.add(titleLabel);

        for (Character c : characterList) {
            String info = c.getName()
                    + " | " + c.getType()
                    + " | Lv." + c.getLevel()
                    + " | HP:" + c.getHitPoints()
                    + " | ATK:" + c.getAttackPower();

            JLabel characterLabel = new JLabel(info);
            mainPanel.add(characterLabel);
        }

        JLabel statisticLabel = new JLabel(
            "Rata-rata Level: " + String.format("%.2f", averageLevel)
        );
        mainPanel.add(statisticLabel);

        add(mainPanel);
    }
}
