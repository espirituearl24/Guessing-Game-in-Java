package hangaroo.gui;

/**
 *
 * @author ej
 */

import static hangaroo.gui.HangarooGUI.clipbgm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Intro {
    
    public static File intro = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\intro.wav");
    public static Clip clip1;
    
    public static void Intro (){
        
         try {
            
            clip1 = AudioSystem.getClip();
            clip1.open(AudioSystem.getAudioInputStream(intro));
            clip1.start();
            clip1.loop(5);
            
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }
    }
    
    public static void main(String[] args) {
        
        Intro();
        JFrame f = new JFrame();
        
        JButton newG = new JButton("Start");
        newG.setBounds(650,300,100,50);
        newG.setFont(new Font("Ariel", Font.BOLD,25));
        newG.setBorder(BorderFactory.createLineBorder(Color.white,3));
        newG.setBackground(Color.CYAN);
   
        JLabel title = new JLabel("Let's");
        title.setBounds(600,100,150,60);
        title.setFont(new Font("Ariel", Font.BOLD, 50));
        
        JLabel title2 = new JLabel("Play");
        title2.setBounds(650,190,150,60);
        title2.setFont(new Font("Ariel", Font.BOLD, 50));
        
        JLabel wallpaper = new JLabel();
        wallpaper.setBounds(0,0,1920,1080);
        wallpaper.setIcon(new ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\wallpaper.gif"));
        
        newG.addActionListener(new ActionListener (){
              
              public void actionPerformed(ActionEvent e){
                  
                  HangarooGUI.Earl();
                  clip1.stop();
              }
          });
        
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        f.add(newG);f.add(title);f.add(title2);f.add(wallpaper);
    }
}
