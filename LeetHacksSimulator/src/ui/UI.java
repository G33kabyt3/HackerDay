package ui;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.Console;
import java.io.Reader;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.bind.Marshaller.Listener;

import GameLogic.GameLogic;
import GameLogic.Player;

public class UI {
  
  

 

  static JFrame frame;
  public static void main(String[] args) {
    Player p  = new Player("P1");
    GameLogic g = new GameLogic();
    frame = new JFrame("Hacker");
    frame.setVisible(true);
    frame.setSize(new Dimension(600,600));
    frame.setFocusable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(Color.BLACK);
    
    updateLabel("Testing");
    try {
      Thread.sleep(10000);
    } catch (Exception e)
    {
      
    }
    updateLabel("H");
    
    frame.addKeyListener(new KeyListener(){
         @Override
            public void keyPressed(KeyEvent e) {
                
                   p.insert(String.valueOf(e.getKeyChar()));
                   g.CalcScore(p);
                   System.out.println(p.score);
                   
                 
            }

            @Override
            public void keyTyped(KeyEvent e) {
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
              
            }
    });
    frame.setVisible(true);

}
  
  public static void updateLabel(String s)
  {
    JLabel label = new JLabel(s);
    label.setForeground(Color.GREEN);
    frame.add(label);
    label.setText(s); 
  }
  




}
