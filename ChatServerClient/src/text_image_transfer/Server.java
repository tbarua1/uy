/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text_image_transfer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Server {

    static int i = 0;
    private static final int maxcon = 0;

    public static void main(String[] args) {
        try {
            ServerSocket ss;
            Socket s;

            System.out.println("Server Started");
            ss = new ServerSocket(7860);

            while ((i++ < maxcon) || (maxcon == 0)) {
                doComms connection;
                s = ss.accept();
                System.out.println(s);
                System.out.println("Client " + i + "  Connected");
                doComms conn_c = new doComms(s);
                Thread t = new Thread((Runnable) conn_c);
                t.start();
            }
        } catch (IOException ioe) {
            System.out.println("IOException on socket listen: " + ioe);
            ioe.printStackTrace();
        }

    }
}
