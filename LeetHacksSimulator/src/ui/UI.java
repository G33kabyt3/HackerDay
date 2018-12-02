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

import GameLogic.DisplayImage;
import GameLogic.GameLogic;
import GameLogic.Player;

public class UI {
  
  
  static Player p  = new Player("P1");
  static GameLogic g = new GameLogic();
  static int roundTime= 50000;

  static JFrame frame;
  public static void main(String[] args) {
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("~             WARNING!          ~");
	System.out.println("~                               ~");
	System.out.println("~   COMMISIONER A.J.I.T. PAI    ~");
	System.out.println("~   HAS INVADED THE INTERNET!   ~");
	System.out.println("~ YOUR HACK ATTACK WILL COMENCE ~");
	System.out.println("~  HACK AS FAST AS POSSIBLE IN  ~");
	System.out.println("~  BLACK BOX BEFORE WE ARE OUT  ~"); 
	System.out.println("~ OF TIME! HACKS MAY ON YOU MAY ~");
	System.out.println("~ APPEAR. THWART THEM BY TYPING ~");
	System.out.println("~     OUT THE COUNTER HACK      ~");
	System.out.println("~        IN THE CONSOLE         ~");
	System.out.println("~           GOOD LUCK!          ~");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
    Timer timer = new Timer();
    frame = new JFrame("Hacker");
    frame.setVisible(true);
    frame.setSize(new Dimension(900,400));
    frame.setFocusable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setBackground(Color.BLACK);
    frame.addKeyListener(new KeyListener(){
      @Override
         public void keyPressed(KeyEvent e) {
             
                p.insert(String.valueOf(e.getKeyChar()));
                g.CalcScore(p);
              
         }

         @Override
         public void keyTyped(KeyEvent e) {
            
         }

         @Override
         public void keyReleased(KeyEvent e) {
           
         }
 });
    
    
    for(int i =0; i<roundTime; i+=2000)
    { 
      if (Math.random()<0.5)
        timer.schedule(new RandomMessage(frame, p,g), i);
    }
    for(int i =0; i<roundTime; i+=5000)
    { 
      if (Math.random()<0.2)
        timer.schedule(new RandomEvent(frame, p,g), i);
    }
    timer.schedule(new GameOver(frame, p, g), roundTime);

}
  
  public static void updateLabel(String s)
  {
    //frame.getContentPane().removeAll();
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
    if (p.score < 90000) {
    	System.out.println("YOU FAILED! Score: "+ p.score);
    	DisplayImage img = new DisplayImage("AjitPai.jpg");
    } else {
    	System.out.println("YOU HAVE SUCCEEDED! Score: "+ p.score);
    	DisplayImage img = new DisplayImage("RobbieRotton.png");
    }
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

class RandomEvent extends TimerTask {
	  
	JFrame frame; 
	Player p;
	GameLogic g;
	public RandomEvent(JFrame frame, Player p, GameLogic g)
	{
		this.frame = frame;
		this.p = p;
		this.g = g;
	}
	public void run() {
		g.RandomEvent(p);
		
	}
}
