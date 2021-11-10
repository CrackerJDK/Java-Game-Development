package com.company.userinterface;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 600;
    private GamePanel gamePanel;

    public GameFrame(){
        /**
         * call getToolKit() method inside abstract class Toolkit
         */
        Toolkit toolkit = this.getToolkit();
        Dimension dimension = toolkit.getScreenSize();
        this.setBounds((dimension.width-SCREEN_WIDTH)/2,(dimension.height-SCREEN_HEIGHT)/2,SCREEN_WIDTH,SCREEN_HEIGHT);

        /**
         * USE this TO CALL setDefaultCloseOperation() method belong to JFrame extends by GameFrame class
         * SET CLOSE BUTTON TO STOP PROGRAM
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel = new GamePanel();
        add(gamePanel);


    }

    public void startGame(){
        gamePanel.startGame();
//        gamePanel.getThread().start();
    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.setVisible(true);
        gameFrame.startGame();

    }


}
