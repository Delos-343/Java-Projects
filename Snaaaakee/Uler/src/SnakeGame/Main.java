
package SnakeGame;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
  
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Main {
    public static void main(String[] args) {
    	Thread thread = new Thread();
    
        JFrame frame = new JFrame();
        Gameplay gameplay = new Gameplay();
        frame.setTitle("Snake Games");
        frame.setBounds(10, 10, 905, 700);
        frame.setBackground(Color.WHITE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
       
    }


	}
    


