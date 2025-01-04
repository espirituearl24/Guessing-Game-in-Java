package hangaroo.gui;

/**
 *
 * @author ej
 */

import static hangaroo.gui.HangarooGUI.bgMusic;
import static hangaroo.gui.HangarooGUI.clipbgm;
import static hangaroo.gui.HangarooGUI.correct;
import static hangaroo.gui.HangarooGUI.correctAns;
import static hangaroo.gui.HangarooGUI.errorctr;
import static hangaroo.gui.HangarooGUI.wrongAns;
import static hangaroo.gui.Manila.bgMusic;
import static hangaroo.gui.Manila.correct;
import static hangaroo.gui.Manila.end;
import static hangaroo.gui.Manila.errorctr;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Arrays;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.border.Border;

public class Joshua {
    
    public static int correct=0;
    public static int errorctr=0;
    public static int sumerrorctr=0;
    
     public static File bgm = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\bgm.wav");
    public static Clip clipbgm;
    
    static void bgMusic(){
        
    try {
            if (errorctr==0){  
            clipbgm = AudioSystem.getClip();
            clipbgm.open(AudioSystem.getAudioInputStream(bgm));
            clipbgm.start();           
            }
            
            if (errorctr==4){
                clipbgm.stop();
            }
            
    }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            }
    
    }
    
    public static void correctAns (){
        
        File correctSE = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\correctEffect.wav");
        
         try {
            
            Clip clip1 = AudioSystem.getClip();
            clip1.open(AudioSystem.getAudioInputStream(correctSE));
            clip1.start();
            
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }
    }
    
    public static void finish(){
        
        File victory = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\victory.wav");
        
        try {
            
            Clip clip2 = AudioSystem.getClip();
            clip2.open(AudioSystem.getAudioInputStream(victory));
            clip2.start();
            
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }
    }
    
    public static void wrongAns(){
        
        File errorEffect = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\errorEffect.wav");
        
        try {
            
            Clip clip3 = AudioSystem.getClip();
            clip3.open(AudioSystem.getAudioInputStream(errorEffect));
            clip3.start();
            
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }
    }
    
    public static void end(){
        
        File gameover = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\gameover.wav");
        
        try {
            
            Clip clip4 = AudioSystem.getClip();
            clip4.open(AudioSystem.getAudioInputStream(gameover));
            clip4.start();
            
        }catch(IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }
    }
    
    public static void Joshua() {
        
        bgMusic();
        
         JFrame f = new JFrame();
        
        String[] sagot = {"J", "O", "S", "H", "U", "A"};
        
        JButton error1=new JButton("X");
        error1.setBounds(100,10,50,40);
        error1.setFont(new Font("Arial",Font.BOLD,20));
        error1.setBackground(Color.yellow);
        error1.setEnabled(false);
        
        JButton error2=new JButton("X");
        error2.setBounds(100,55,50,40);
        error2.setFont(new Font("Arial",Font.BOLD,20));
        error2.setBackground(Color.yellow);
        error2.setEnabled(false);
        
        JButton error3=new JButton("X");
        error3.setBounds(100,105,50,40);
        error3.setFont(new Font("Arial",Font.BOLD,20));
        error3.setBackground(Color.yellow);
        error3.setEnabled(false);
        
        JButton error4=new JButton("X");
        error4.setBounds(100,155,50,40);
        error4.setFont(new Font("Arial",Font.BOLD,20));
        error4.setBackground(Color.yellow);
        error4.setEnabled(false);

        JButton a=new JButton("A");
        a.setFont(new Font("Arial",Font.PLAIN,20));
        a.setBounds(350,100,50,40);
        a.setBackground(Color.green);
        a.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton b=new JButton("B");
        b.setFont(new Font("Arial",Font.PLAIN,20));
        b.setBounds(400,100,50,40);
        b.setBackground(Color.green);
        b.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton c=new JButton("C");
        c.setFont(new Font("Arial",Font.PLAIN,20));
        c.setBounds(450,100,50,40);
        c.setBackground(Color.green);
        c.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton d=new JButton("D");
        d.setFont(new Font("Arial",Font.PLAIN,20));
        d.setBounds(500,100,50,40);
        d.setBackground(Color.green);
        d.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton e=new JButton("E");
        e.setFont(new Font("Arial",Font.PLAIN,20));
        e.setBounds(550,100,50,40);
        e.setBackground(Color.green);
        e.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton fb=new JButton("F");
        fb.setFont(new Font("Arial",Font.PLAIN,20));
        fb.setBounds(600,100,50,40);
        fb.setBackground(Color.green);
        fb.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton g=new JButton("G");
        g.setFont(new Font("Arial",Font.PLAIN,20));
        g.setBounds(650,100,50,40);
        g.setBackground(Color.green);
        g.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton h=new JButton("H");
        h.setFont(new Font("Arial",Font.PLAIN,20));
        h.setBounds(700,100,50,40);
        h.setBackground(Color.green);
        h.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton i=new JButton("I");
        i.setFont(new Font("Arial",Font.PLAIN,20));
        i.setBounds(750,100,50,40);
        i.setBackground(Color.green);
        i.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton j=new JButton("J");
        j.setFont(new Font("Arial",Font.PLAIN,20));
        j.setBounds(800,100,50,40);
        j.setBackground(Color.green);
        j.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton k=new JButton("K");
        k.setFont(new Font("Arial",Font.PLAIN,20));
        k.setBounds(850,100,50,40);
        k.setBackground(Color.green);
        k.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton l=new JButton("L");
        l.setFont(new Font("Arial",Font.PLAIN,20));
        l.setBounds(900,100,50,40);
        l.setBackground(Color.green);
        l.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton m=new JButton("M");
        m.setFont(new Font("Arial",Font.PLAIN,18));
        m.setBounds(950,100,50,40);
        m.setBackground(Color.green);
        m.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton n=new JButton("N");
        n.setFont(new Font("Arial",Font.PLAIN,20));
        n.setBounds(350,155,50,40);
        n.setBackground(Color.green);
        n.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton o=new JButton("O");
        o.setFont(new Font("Arial",Font.PLAIN,20));
        o.setBounds(400,155,50,40);
        o.setBackground(Color.green);
        o.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton p=new JButton("P");
        p.setFont(new Font("Arial",Font.PLAIN,20));
        p.setBounds(450,155,50,40);
        p.setBackground(Color.green);
        p.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton q=new JButton("Q");
        q.setFont(new Font("Arial",Font.PLAIN,20));
        q.setBounds(500,155,50,40);
        q.setBackground(Color.green);
        q.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton r=new JButton("R");
        r.setFont(new Font("Arial",Font.PLAIN,20));
        r.setBounds(550,155,50,40);
        r.setBackground(Color.green);
        r.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton s=new JButton("S");
        s.setFont(new Font("Arial",Font.PLAIN,20));
        s.setBounds(600,155,50,40);
        s.setBackground(Color.green);
        s.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton t=new JButton("T");
        t.setFont(new Font("Arial",Font.PLAIN,20));
        t.setBounds(650,155,50,40);
        t.setBackground(Color.green);
        t.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton u=new JButton("U");
        u.setFont(new Font("Arial",Font.PLAIN,20));
        u.setBounds(700,155,50,40);
        u.setBackground(Color.green);
        u.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton v=new JButton("V");
        v.setFont(new Font("Arial",Font.PLAIN,20));
        v.setBounds(750,155,50,40);
        v.setBackground(Color.green);
        v.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton w=new JButton("W");
        w.setFont(new Font("Arial",Font.PLAIN,16));
        w.setBounds(800,155,50,40);
        w.setBackground(Color.green);
        w.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton x=new JButton("X");
        x.setFont(new Font("Arial",Font.PLAIN,20));
        x.setBounds(850,155,50,40);
        x.setBackground(Color.green);
        x.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton y=new JButton("Y");
        y.setFont(new Font("Arial",Font.PLAIN,20));
        y.setBounds(900,155,50,40);
        y.setBackground(Color.green);
        y.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton z=new JButton("Z");
        z.setFont(new Font("Arial",Font.PLAIN,20));
        z.setBounds(950,155,50,40);
        z.setBackground(Color.green);
        z.setBorder(BorderFactory.createLineBorder(Color.white,3));
        
        JButton text=new JButton("The Leader of Israelite tribe after the death of Moses");
        text.setBounds(500,10,400,30);
        
        JButton ans1=new JButton();
        ans1.setBackground(Color.yellow);
        ans1.setBounds(420,300,50,50);
        ans1.setEnabled(false);
        
        JButton ans2=new JButton();
        ans2.setBackground(Color.yellow);
        ans2.setBounds(500,300,50,50);
        ans2.setEnabled(false);
        
        JButton ans3=new JButton();
        ans3.setBackground(Color.yellow);
        ans3.setBounds(580,300,50,50);
        ans3.setEnabled(false);
        
        JButton ans4=new JButton();
        ans4.setBackground(Color.yellow);
        ans4.setBounds(660,300,50,50);
        ans4.setEnabled(false);
        
        JButton ans5=new JButton();
        ans5.setBackground(Color.yellow);
        ans5.setBounds(740,300,50,50);
        ans5.setEnabled(false);
        
        JButton ans6=new JButton();
        ans6.setBackground(Color.yellow);
        ans6.setBounds(820,300,50,50);
        ans6.setEnabled(false);
        
        JLabel image=new JLabel();
        image.setBounds(900,350,394,250);
        image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\spongebob.png"));
        
        JLabel wallpaper = new JLabel();
        wallpaper.setBounds(0,0,1920,1080);
        wallpaper.setIcon(new ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\Hangaroo GUI\\src\\hangaroo\\gui\\wallpaper.gif"));
        
        JButton next=new JButton("Next");
        next.setBounds(1000,10,60,50);
        next.setBackground(Color.GREEN);
        next.setEnabled(false);
        
        j.addActionListener(new ActionListener(){
           
           public void actionPerformed(ActionEvent e){
               
               int x=0;
               String Jvalue="J";
               correctAns();
               while (x<=6){
                   
               
          
                   if(sagot[0]==Jvalue){
                       correct++;
                       System.out.println("Correct Answer Counter "+correct);
                       ans1.setText("" + sagot[0]);
                       break;
               }
                   
               }
                   if(correct==6){
                       next.setEnabled(true);
                   }
                   
                  j.setEnabled(false);
                  j.setBackground(Color.ORANGE);
                  
           }
       });
        
        o.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
            int x=0;
            String Ovalue="O";   
            correctAns();
            
            while(x<=6){
                
                x++;
                if (sagot[x]==Ovalue){
                    correct++;
                    System.out.println("Correct Answer Counter "+correct);
                    ans2.setText("" + sagot[x]);
                    break;
                }
                
            }
               if(correct==6){
                       next.setEnabled(true);
                   }
               
            o.setEnabled(false);
            o.setBackground(Color.ORANGE);
            
            }
        });
        
         s.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                 int x=0;
            String Svalue="S";  
            correctAns();
            
            while(x<=6){
                
                x++;
                if (sagot[x]==Svalue){
                    correct++;
                    System.out.println("Correct Answer Counter "+correct);
                    ans3.setText("" + sagot[x]);
                    break;
                }
                
            }
               if(correct==6){
                       next.setEnabled(true);
                   }
               
            s.setEnabled(false);
            s.setBackground(Color.ORANGE);
            
            }
        });
         
         h.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                 int x=0;
            String Hvalue="H"; 
            correctAns();
            
            while(x<=6){
                
                x++;
                if (sagot[x]==Hvalue){
                    correct++;
                    System.out.println("Correct Answer Counter "+correct);
                    ans4.setText("" + sagot[x]);
                    break;
                }
                
            }
               if(correct==6){
                       next.setEnabled(true);
                   }
               
            h.setEnabled(false);
            h.setBackground(Color.ORANGE);
            
            }
        });
         
          u.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                 int x=0;
            String Uvalue="U";
            correctAns();
            
            while(x<=5){
                
                x++;
                if (sagot[x]==Uvalue){
                    correct++;
                    System.out.println("Correct Answer Counter "+correct);
                    ans5.setText("" + sagot[x]);
                    break;
                }
                
            }
               if(correct==6){
                       next.setEnabled(true);
                   }
              
            u.setEnabled(false);
            u.setBackground(Color.ORANGE);
            
            }
        });
          
          a.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                 int x=0;
            String Avalue="A";
            correctAns();
            
            while(x<=5){
                
                x++;
                if (sagot[x]==Avalue){
                    correct++;
                    System.out.println("Correct Answer Counter "+correct);
                    ans6.setText("" + sagot[x]);
                    break;
                }
                
            }
               if(correct==6){
                       next.setEnabled(true);
                   }
               
            a.setEnabled(false);
            a.setBackground(Color.ORANGE);
            
            }
        });
          
          b.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  b.setEnabled(false);
                  b.setBackground(Color.red);
              }
          });
          
          c.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  c.setEnabled(false);
                  c.setBackground(Color.red);
              }
          });
          
          d.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  d.setEnabled(false);
                  d.setBackground(Color.red);
              }
          });
          
          e.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent el){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  e.setEnabled(false);
                  e.setBackground(Color.red);
              }
          });
          
          fb.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  fb.setEnabled(false);
                  fb.setBackground(Color.red);
              }
          });
          
          g.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  g.setEnabled(false);
                  g.setBackground(Color.red);
              }
          });
        
       
          i.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  i.setEnabled(false);
                  i.setBackground(Color.red);
              }
          });
          
          k.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  k.setEnabled(false);
                  k.setBackground(Color.red);
              }
          });
          
          
          l.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  l.setEnabled(false);
                  l.setBackground(Color.red);
              }
          });
          
          
             m.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  m.setEnabled(false);
                  m.setBackground(Color.red);
              }
          });
             
                n.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  n.setEnabled(false);
                  n.setBackground(Color.red);
              }
          });
          
          p.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  p.setEnabled(false);
                  p.setBackground(Color.red);
              }
          });
          
          q.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  q.setEnabled(false);
                  q.setBackground(Color.red);
              }
          });
          
          r.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  r.setEnabled(false);
                  r.setBackground(Color.red);
              }
          });
         
          
          t.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  t.setEnabled(false);
                  t.setBackground(Color.red);
              }
          });
          
      
          v.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  v.setEnabled(false);
                  v.setBackground(Color.red);
              }
          });
          
          w.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  w.setEnabled(false);
                  w.setBackground(Color.red);
              }
          });
          
          x.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  x.setEnabled(false);
                  x.setBackground(Color.red);
              }
          });
          
          y.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  y.setEnabled(false);
                  y.setBackground(Color.red);
              }
          });
          
          z.addActionListener(new ActionListener(){
              
              public void actionPerformed(ActionEvent e){
                  
                  errorctr++;
                  System.out.println("Error Counter" + errorctr);
                  wrongAns();
                  
                  if(errorctr==1){
                      
                      error1.setBackground(Color.RED);
                  }
                  
                  if(errorctr==2){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                  }
                  
                  if(errorctr==3){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                  }
                  
                  if(errorctr==4){
                      
                      error1.setBackground(Color.red);
                      error2.setBackground(Color.red);
                      error3.setBackground(Color.red);
                      error4.setBackground(Color.red);
                      image.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\walk out.gif"));
                      end();
                      bgMusic();
                  }
                  
                  z.setEnabled(false);
                  z.setBackground(Color.red);
              }
          });
          
          next.addActionListener(new ActionListener (){
              
              public void actionPerformed(ActionEvent e){
                  
                  f.dispose();
                  clipbgm.stop();
                  TheWeeknd.TheWeeknd();
              }
          });
          
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel panel=new JPanel();
        panel.setLocation(280,70);
        panel.setSize(800,155);
        panel.setBackground(Color.orange);
        panel.setBorder(BorderFactory.createLineBorder(Color.green,5));
                 
        f.add(a);f.add(b);f.add(c);f.add(d);f.add(e);f.add(fb);f.add(g);f.add(h);
        f.add(i);f.add(j);f.add(k);f.add(l);f.add(m);f.add(n);f.add(o);f.add(p);
        f.add(q);f.add(r);f.add(s);f.add(t);f.add(u);f.add(v);f.add(w);f.add(x);
        f.add(y);f.add(z);
        
        f.add(text);f.add(ans1);f.add(ans2);f.add(ans3);f.add(ans4);f.add(error1);f.add(error2);f.add(error3);
        f.add(error4);f.add(image);f.add(next);f.add(ans5);f.add(ans6);
        
        f.add(panel);f.add(wallpaper);
        
      
        
    }
    
}
