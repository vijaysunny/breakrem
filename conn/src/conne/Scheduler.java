package conne;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;

import java.util.TimerTask;
import java.util.Timer;

import javax.swing.JOptionPane;
public class Scheduler
{
	int flag=0;	
	Timer timer = new Timer();
	TimerTask task = new TimerTask()
	{
		public void run() 
		{ 
			
			    
			if (flag==0){
				Object[] options = {"OK"};
			    int n = JOptionPane.showOptionDialog(null,
			                   "Take a Neck Break ","Break Reminder",
			                   JOptionPane.PLAIN_MESSAGE,
			                   JOptionPane.INFORMATION_MESSAGE,
			                   null,
			                   options,
			                   options[0]);
final JFrame frame=new JFrame();
frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
frame.setSize(620,440);
frame.setTitle("Break reminder");
final JFXPanel fxpanel=new JFXPanel();
frame.setSize(1650, 1080);
frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
frame.setUndecorated(false);
frame.setVisible(true);
frame.add(fxpanel);

Platform.runLater(new Runnable() {
@Override
public void run()
    {
    WebEngine engine;
    WebView wv=new WebView();
    engine=wv.getEngine();
    fxpanel.setScene(new Scene(wv));
    engine.load("file:///C:/Users/DARSHAN/Downloads/Neck.html");
    }
    });
frame.setVisible(true);

			    flag++;	
			    }
			    else if(flag==1)
			    {
			    	Object[] options = {"OK"};
				    int n = JOptionPane.showOptionDialog(null,"Take a Shoulder Break"
				    		,"Break Reminder",
				                   JOptionPane.PLAIN_MESSAGE,
				                   JOptionPane.INFORMATION_MESSAGE,
				                   null,
				                   options,
				                   options[0]);
			    	

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
    engine.load("file:///C:/Users/DARSHAN/Downloads/Shoulder.html");
    }
    });
frame.setVisible(true);

			    	flag++;
			    	
			    }
			    else if(flag==2)
			    {
			    	Object[] options = {"OK"};
				    int n = JOptionPane.showOptionDialog(null,
				                   "Take a Back Break ","Break Reminder",
				                   JOptionPane.PLAIN_MESSAGE,
				                   JOptionPane.INFORMATION_MESSAGE,
				                   null,
				                   options,
				                   options[0]);
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
    engine.load("file:///C:/Users/DARSHAN/Downloads/Back.html");
    }
    });
frame.setVisible(true);	    
				flag++;
			    } 
			    else if(flag==3){
			    	System.exit(0);;
			    }
		
		};
	};
		public void start() {
			timer.scheduleAtFixedRate(task, 3*60*1000,3*60*1000);	// TODO Auto-generated method stub
			
		}
	
public static void main(String[] args)
{
	
	Scheduler you =new Scheduler();
	you.start();	
    
}

public void setTitle(String string) {
	// TODO Auto-generated method stub
	
}

public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}
}

