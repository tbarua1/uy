


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Rayhan
 * credit - Base code collected from http://cs.lmu.edu/~ray/notes/javanetexamples/
 */
public class ComplexServer extends Thread
{
    Socket socket =null;
    
    public ComplexServer(Socket sock)
    {
        this.socket = sock;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ServerSocket listener = null;
        try 
        {
            String serverPort = JOptionPane.showInputDialog("Enter port of the data server:");  
            int port = Integer.parseInt(serverPort);
            listener = new ServerSocket(port);
            System.out.println("Server started.");
            while (true) 
            {
                Socket socket = listener.accept();  
                System.out.println("Connected from : " 
                                   + socket.getInetAddress().getHostAddress()
                                   + " Name: " + socket.getInetAddress().getHostName());
                ComplexServer cs = new ComplexServer(socket);
                cs.start();
            }
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
        finally 
        {
            try
            {
                listener.close();
            }
            catch(Exception clse)
            {
                clse.printStackTrace();
            }
        }
    }
    
    public void run()
    {
        try 
        {
             BufferedReader input =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             out.println("NAME");
             String name = input.readLine();
             System.out.println("Client Name: " + name);
             //now check if the command is correct
             out.println("Hello " + name);  
             out.println("Today's date: " + new Date().toString());
             String msgfromclient = input.readLine();
             System.out.println("Message from " + name + ": " + msgfromclient);
        } 
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally 
        {
            try
            {
                socket.close();
            }
            catch(Exception cex)
            {
                cex.printStackTrace();
            }
        }        
    }
}
