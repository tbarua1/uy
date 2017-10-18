/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androiddata;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Abhishek.Sehgal
 */
public class NSDCServer {

    ServerSocket serSock;
    Socket sock;

    BufferedReader in;
    PrintWriter out;

    public static void main(String[] args) {
        try {
            NSDCServer cs = new NSDCServer();
            cs.startServer();
        } catch (Exception e) {

        }
    }

    private void startServer() throws IOException {
        InputStream is = null;
        FileOutputStream fos = null ;
        BufferedOutputStream bos = null;

        try {
            serSock = new ServerSocket(8070);
            System.out.println("Waiting for client...");
            sock = serSock.accept();

            System.out.println("Connections done");

            //Accept File
            System.out.println("Connected");

            //receive code
            int filesize = 450660;
            int bytesRead;
            int current = 0;
            // receive file
            byte[] mybytearray = new byte[filesize];
            is = sock.getInputStream();
            fos = new FileOutputStream("C:\\Project Server\\Capture.png");
            bos = new BufferedOutputStream(fos);
            bytesRead = is.read(mybytearray, 0, mybytearray.length);
            current = bytesRead;

            do {
                bytesRead
                        = is.read(mybytearray, current, (mybytearray.length - current));
                if (bytesRead >= 0) {
                    current += bytesRead;
                }
            } while (bytesRead > -1);

            bos.write(mybytearray, 0, current);
            bos.flush();
            is.close();
            bos.close();
            fos.close();
            System.out.println("end-start");
        } catch (IOException e) {
            is.close();
            bos.close();
            fos.close();
            System.out.println(e);
            e.printStackTrace();

        }

    }
}
