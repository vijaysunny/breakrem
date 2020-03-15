package conne;
import conne.Scheduler;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;


public class UserHome extends JFrame {

   
    /**
	 * 
	 */
	private static final long serialVersionUID = -943225114217328752L;
	/**
	 * 
	 */

	private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserHome frame = new UserHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UserHome() {

    }

    /**
     * Create the frame.
     */
    public UserHome(String userSes) {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnNewButton = new JButton("Logout");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(btnNewButton, "Are you sure?");
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    UserLogin obj = new UserLogin();
                    obj.setTitle("Student-Login");
                    obj.setVisible(true);
                }
                dispose();
                UserLogin obj = new UserLogin();

                obj.setTitle("Student-Login");
                obj.setVisible(true);

            }
        });
        btnNewButton.setBounds(147, 90, 491, 114);
        contentPane.add(btnNewButton);
        JButton button = new JButton("Start session\r\n");
        button.setBackground(UIManager.getColor("Button.disabledForeground"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Scheduler bo=new Scheduler();
               bo.start();
                bo.setTitle("start session");
                bo.setVisible(true);

            }
        });
        JButton button1 = new JButton("Feedback\r\n");
        button1.setBackground(UIManager.getColor("Button.disabledForeground"));
        button1.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                 
final JFrame frame=new JFrame();
frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
frame.setSize(620,440);
final JFXPanel fxpanel=new JFXPanel();
frame.setSize(1650, 1080);
frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
frame.setUndecorated(false);
frame.setVisible(true);
frame.add(fxpanel);
frame.setTitle("Break reminder");

Platform.runLater(new Runnable() {
@Override
public void run()
{
WebEngine engine;
WebView wv=new WebView();
engine=wv.getEngine();
fxpanel.setScene(new Scene(wv));
engine.load("file:///C:/Users/admin2/Desktop/Back.html");
}
});
frame.setVisible(true);	 
        	 }
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button.setBounds(147, 230, 491, 114);
        contentPane.add(button);
        button1.setFont(new Font("Tahoma", Font.PLAIN, 35));
        button1.setBounds(147, 370, 491, 114);
        contentPane.add(button1);
    }
}