package multiuser_chatapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient {
	BufferedReader in;
    PrintWriter out;
    JFrame frame = new JFrame("Chatter");
    JTextField textField = new JTextField(40);
    JTextArea messageArea = new JTextArea(8, 40);

	public ChatClient() {
		 textField.setEditable(false);
	        messageArea.setEditable(false);
	        frame.getContentPane().add(textField, "North");
	        frame.getContentPane().add(new JScrollPane(messageArea), "Center");
	        frame.pack();

	        // Add Listeners
	        textField.addActionListener(new ActionListener() {
	         
	            public void actionPerformed(ActionEvent e) {
	                out.println(textField.getText());
	                textField.setText("");
	            }
	        });

	}

	 private String getServerAddress() {
	        return JOptionPane.showInputDialog(
	            frame,
	            "Enter IP Address of the Server:",
	            "Welcome to the Chatter",
	            JOptionPane.QUESTION_MESSAGE);
	    }

	    /**
	     * Prompt for and return the desired screen name.
	     */
	    private String getName() {
	        return JOptionPane.showInputDialog(
	            frame,
	            "Choose a screen name:",
	            "Screen name selection",
	            JOptionPane.PLAIN_MESSAGE);
	    }

	    /**
	     * Connects to the server then enters the processing loop.
	     */
	    private void run() throws IOException {

	        // Make connection and initialize streams
	        String serverAddress = getServerAddress();
	        Socket socket = new Socket(serverAddress, 9001);
	        in = new BufferedReader(new InputStreamReader(
	            socket.getInputStream()));
	        out = new PrintWriter(socket.getOutputStream(), true);

	        // Process all messages from server, according to the protocol.
	        while (true) {
	            String line = in.readLine();
	            if (line.startsWith("SUBMITNAME")) {
	                out.println(getName());
	            } else if (line.startsWith("NAMEACCEPTED")) {
	                textField.setEditable(true);
	            } else if (line.startsWith("MESSAGE")) {
	                messageArea.append(line.substring(8) + "\n");
	            }
	        }
	    }

	    /**
	     * Runs the client as an application with a closeable frame.
	     */
	    public static void main(String[] args) throws Exception {
	        ChatClient client = new ChatClient();
	        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        client.frame.setVisible(true);
	        client.run();
	    }


}
