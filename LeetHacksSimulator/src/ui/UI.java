package ui;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.Console;
import java.io.Reader;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.bind.Marshaller.Listener;

import GameLogic.GameLogic;
import GameLogic.Player;

public class UI {
  
  
  static Player p  = new Player("P1");
  static GameLogic g = new GameLogic();
  static int roundTime= 10000;

  static JFrame frame;
  public static void main(String[] args) {
    Timer timer = new Timer();
    frame = new JFrame("Hacker");
    frame.setVisible(true);
    frame.setSize(new Dimension(900,900));
    frame.setFocusable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(Color.BLACK);
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
    
    for(int i =0; i<roundTime; i+=1000)
    { 
      if (Math.random()<0.9)
        timer.schedule(new RandomMessage(frame, p,g), i);
    }
    timer.schedule(new GameOver(frame, p, g), roundTime);

}
  
  public static void updateLabel(String s)
  {
    frame.getContentPane().removeAll();
    JLabel label = new JLabel(s);
    label.setForeground(Color.GREEN);
    frame.add(label);
    label.setText(s); 
  }
  
  
}


class GameOver extends TimerTask {
  JFrame frame; 
  Player p;
  GameLogic g;
  public GameOver(JFrame frame, Player p, GameLogic g)
  {
    this.frame = frame;
    this.p = p;
    this.g = g;
  }
  public void run() {
    System.out.println("Congrats, your score is: "+ p.score);
    frame.getContentPane().removeAll();
    frame.dispose();
    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
     
     
    
  }
}

class RandomMessage extends TimerTask {
  
  JFrame frame; 
  Player p;
  GameLogic g;
  public RandomMessage(JFrame frame, Player p, GameLogic g)
  {
    this.frame = frame;
    this.p = p;
    this.g = g;
  }
  public void run() {
     g.RandomMessage();
  }
}
