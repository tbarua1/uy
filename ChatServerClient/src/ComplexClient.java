/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 *
 * @author Rayhan
 * credit - Base code collected from http://cs.lmu.edu/~ray/notes/javanetexamples/
 */
public class ComplexClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String serverAddress = JOptionPane.showInputDialog("Enter IP Address of the simple server:");
        String serverPort = JOptionPane.showInputDialog("Enter port of the date server:");        
        try
        {
            int port = Integer.parseInt(serverPort);
            Socket s = new Socket(serverAddress, port);
            //first get the input amd output channels
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader input =  new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msgfromsvr = input.readLine();
            System.out.println("Message from server: " + msgfromsvr);
            if(msgfromsvr.equalsIgnoreCase("NAME"))
            {
                String commandfromuser = JOptionPane.showInputDialog("Enter the command to send to the server:");        
                out.println(commandfromuser);
            }
            else
            {
                out.println("Do not understand your command");
            }
            String answer = input.readLine();
            JOptionPane.showMessageDialog(null, "Message from server:"+answer);
            answer = input.readLine();
            System.out.println("Message from server again:"+answer);
            out.println("Thank you man!");
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
        System.exit(0);
    }

}
