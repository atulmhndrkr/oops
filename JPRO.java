import java.awt.*;
import javax.swing.*;

public class JPRO extends JFrame {
  JProgressBar bar = new JProgressBar(0,1000);
  //JButton step = new JButton("Step");

  public JPRO() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //step.addActionListener(new ActionListener() {
      //public void actionPerformed(ActionEvent e) {
    while(true){    int value = bar.getValue() + 1;
        if (value > bar.getMaximum()) {
          value = bar.getMaximum();
                    System.exit(0);
        }
        bar.setValue(value);
     // }
    //}//);

     bar.setPreferredSize(new Dimension(500,30));
     getContentPane().add(bar, BorderLayout.NORTH);
   // getContentPane().add(step, BorderLayout.EAST);
    pack();
    setVisible(true);try{Thread.sleep(100);
}
catch(Exception e)
{}
  }}

  
}class SplashScreen extends JWindow {
    
    private int duration;
    
    public SplashScreen(int d) {
        duration = d;
    }
    
    // A simple little method to show a title screen in the center
    // of the screen for the amount of time given in the constructor
    public void showSplash() {
        
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
        
        // Set the window's bounds, centering the window
        int width = 350;
        int height =300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        // Build the splash screen
        JLabel label = new JLabel(new ImageIcon("download.jpg"));
        JLabel copyrt = new JLabel
                ("Copyright 2013, Azimuthal", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        Color oraRed = new Color(156, 20, 20,  255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));
        
        // Display it
        setVisible(true);
        
        // Wait a little while, maybe while loading resources
        try { Thread.sleep(duration); } catch (Exception e) {}
        
        setVisible(false);
        
    }
    
    public void showSplashAndExit() {
        
        showSplash();
        System.exit(0);
        
    }
    
    public static void main(String[] args) {
        
        
        SplashScreen splash = new SplashScreen(5000);

        splash.showSplash();
        SimpleEditor editor = new SimpleEditor();
        editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editor.setVisible(true);
    new JPRO();
                 
    }
}
