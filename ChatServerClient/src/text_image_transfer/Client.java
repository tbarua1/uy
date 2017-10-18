/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text_image_transfer;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Client implements ActionListener {

    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    String str;

//*******************************Client1 GUI*********************************//
    TextField tf;
    TextArea ta;
    Label lb;
    Button b;

    public Client() {
        Frame f = new Frame("Client");
        f.setLayout(new FlowLayout());
        f.setBackground(Color.orange);
        tf = new TextField(15);
        ta = new TextArea(12, 20);
        ta.setBackground(Color.white);
        lb = new Label("Enter File Name To Be Send");
        b = new Button("Send");
        f.add(lb);
        f.add(tf);
        f.add(b);
        f.add(ta);
        ta.setBounds(200, 200, 10, 10);
        f.addWindowListener(new W1());
        b.addActionListener(this);
        f.setSize(300, 400);
        f.setLocation(300, 300);
        f.setVisible(true);
        f.validate();

//*********************************GUI END*******************************//   
//********************************Creating Connection*********************//   
        try {
            s = new Socket("localhost", 7860);
            System.out.println(s);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fileName;
        if (ae.getSource() == b) {
            fileName = tf.getText();

//*******************Coading for image transfer**********************//       
            int flag = 0, i;
            String extn = "";
            for (i = 0; i < fileName.length(); i++) {
                if (fileName.charAt(i) == '.' || flag == 1) {
                    flag = 1;
                    extn += fileName.charAt(i);
                }
            }

            if (extn.equals(".jpg") || extn.equals(".png")) {
                try {

                    File file = new File(fileName);
                    FileInputStream fin = new FileInputStream(file);
                    dout.writeUTF(fileName);
                    System.out.println("Sending image...");
                    byte[] readData = new byte[1024];

                    while ((i = fin.read(readData)) != -1) {
                        dout.write(readData, 0, i);
                    }
                    System.out.println("Image sent");
                    ta.appendText("\nImage Has Been Sent");
                    fin.close();
                } catch (IOException ex) {
                    System.out.println("Image ::" + ex);
                }

//*****************************Text File********************************//
            } else {

                try {
                    FileInputStream fstream = new FileInputStream(fileName);
                    // Get the object of DataInputStream
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader bcr = new BufferedReader(new InputStreamReader(in));

                    dout.writeUTF(fileName);
                    System.out.println("Sending File" + fileName);
                    String s1;
                    ta.appendText("\n");
                    while ((s1 = bcr.readLine()) != null) {
                        System.out.println("" + s1);
                        ta.appendText(s1 + "\n");
                        dout.writeUTF(s1);
                        dout.flush();
                        Thread.currentThread().sleep(500);

                    }
                } catch (Exception e) {
                    System.out.println("Enter Valid File Name");
                }

            }
        }
    }
    public static void main(String[] args) {
        new Client(); 
    }
}
