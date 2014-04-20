import java.awt.*;
import javax.swing.*;

class DrawPanel extends JPanel
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.fillRect(0,0,154,285);
            }
        }

public class SplashScreenTest extends JWindow {
    
    private int duration;
    
    public SplashScreenTest(int d) {
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

        DrawPanel d1= new DrawPanel();

        JProgressBar progressBar = new JProgressBar();
        progressBar.setPreferredSize(new Dimension(150, 18));
        progressBar.setStringPainted(true);
        content.add(progressBar, BorderLayout.NORTH);

        // Build the splash screen
        //JLabel label = new JLabel(new ImageIcon("download.jpg"));
        //JLabel copyrt = new JLabel
        //        ("Copyright 2013, Azimuthal", JLabel.CENTER);
        JLabel abc =new JLabel("1");
        //copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        //content.add(label, BorderLayout.CENTER);
        //content.add(copyrt, BorderLayout.SOUTH); content.add(abc, BorderLayout.SOUTH);


        


        Color oraRed = new Color(156, 20, 20,  255);
        //content.setBorder(BorderFactory.createLineBorder(oraRed, 10));
        
        // Display it
        //setVisible(true);
        
        // Wait a little while, maybe while loading resources
        try { Thread.sleep(duration); } catch (Exception e) {}
        
        setVisible(false);
        
    }
    
    public void showSplashAndExit() {
        
        showSplash();
        System.exit(0);
        
    }
    
    public static void main(String[] args) {
        
        // Throw a nice little title page up on the screen first
        SplashScreen splash = new SplashScreen(5000);

        // Normally, we'd call splash.showSplash() and get on 
        // with the program. But, since this is only a test...
        splash.showSplash();
        SimpleEditor editor = new SimpleEditor();
        editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editor.setVisible(true);
        System.exit(0);
        
    }
}
