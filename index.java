import GamePack.*;
import IndexPack.*;
import InstructionPack.*;
// import kamel.*;
// import register.*;
// import testFolder.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// comment


import javax.swing.*;

public class index implements ActionListener{
	JFrame frame;
    JButton registerBtn, rulesBtn, playBtn, helpBtn, exitBtn, test;
    GridLayout gdl;
    public static index fi;
    JLabel lbl, indexLabel;

    /**
     * @param FrameTitle
     */
    public index(String FrameTitle){
        // super(FrameTitle);
        frame = new JFrame();


        frame.setSize(1000,1000);
        frame.setLocation(10,10);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);

        new FirstInterface(frame);
       
        // indexLabel = new JLabel();
        // indexLabel.setBounds(0, 0, 1000, 1000);
        // indexLabel.setOpaque(true);
        // indexLabel.setBackground(Color.RED);
        

        // lbl = new JLabel("!!!Welcome to Who wants to be a Millionare!!!");
        // lbl.setBounds(200, 30, 1000, 100);
        // lbl.setForeground(Color.BLACK);
        // lbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
        
        // indexLabel.add(lbl);

        // registerBtn = new JButton("Register");
        // registerBtn.setToolTipText("Click to Register");
        // registerBtn.setBounds(400, 180, 200, 50 );
        // registerBtn.setBackground(Color.YELLOW);
        // registerBtn.setForeground(Color.WHITE);
        
        
        // indexLabel.add(registerBtn);
        

        // rulesBtn = new JButton("Rules and Regulation");
        // rulesBtn.setToolTipText("Click for Rules");
        // rulesBtn.setBounds(400, 280, 200, 50);
        // rulesBtn.setBackground(Color.black);
        // rulesBtn.setForeground(Color.white);
        // // add(rulesBtn);

        // playBtn = new JButton("Play");
        // playBtn.setBounds(400, 380, 200, 50);
        // playBtn.setForeground(Color.white);
        // playBtn.setBackground(Color.black);
        // indexLabel.add(playBtn);

        // helpBtn = new JButton("Help");
        // helpBtn.setBounds(400, 480, 200, 50);
        // helpBtn.setForeground(Color.white);
        // helpBtn.setBackground(Color.magenta);
        // // add(helpBtn);

        // exitBtn = new JButton("Exit");
        // exitBtn.setBounds(400, 580, 200, 50);
        // exitBtn.setForeground(Color.white);
        // exitBtn.setBackground(Color.black);
        // // add(exitBtn);

        // test = new JButton("Test");
        // test.setBounds(400, 650, 200, 50);
        // test.setBackground(Color.white);
        // // add(test);

        // registerBtn.addActionListener(this);
        // rulesBtn.addActionListener(this);
        // playBtn.addActionListener(this);
        // helpBtn.addActionListener(this);
        // exitBtn.addActionListener(this);
        // test.addActionListener(this);


        // frame.add(indexLabel);

    }
    public void actionPerformed(ActionEvent e){
        JButton eventSource = (JButton)e.getSource();
        
   //      if(eventSource == playBtn){
        	
			// indexLabel.setVisible(false);
   //          new PlayGame(frame);

   //      }
        // else if(eventSource == registerBtn){
        //     new Register("Register Section");
        // }
        // else if(eventSource == test){
        //     new testFile("Register Section");
        // }
        
    }
    // public void windowClosing(WindowEvent e){
    //     this.dispose();
    // }
    // @Override
    // public void windowOpened(WindowEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void windowClosed(WindowEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void windowIconified(WindowEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void windowDeiconified(WindowEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void windowActivated(WindowEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    // @Override
    // public void windowDeactivated(WindowEvent e) {
    //     // TODO Auto-generated method stub
        
    // }
    public static void main(String[] args) {
        index fi = new index("Quiz Game");

       
        // fi.getContentPane().setBackground(Color.WHITE);
        // fi.setVisible(true);
    }
}
