package com.company.userinterface;


import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{

    Thread thread;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0,0,GameFrame.SCREEN_WIDTH,GameFrame.SCREEN_HEIGHT);

    }

    public void startGame(){
        if(thread==null) {
            thread = new Thread();
            thread.start();
            System.out.println("Game start");
        }
    }

    @Override
    public void run() {
        System.out.println("This game is running..............");
    }


}
