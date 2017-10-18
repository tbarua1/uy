/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text_image_transfer;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Abhishek.Sehgal
 */
class doComms implements Runnable {

    private Socket s;

    doComms(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            // Get input from the client
            DataInputStream dis = new DataInputStream(s.getInputStream());
            PrintStream out1 = new PrintStream(s.getOutputStream());

            String str, extn = "";
            str = dis.readUTF();
            System.out.println("\n" + str);
            int flag = 0, i;

            for (i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '.' || flag == 1) {
                    flag = 1;
                    extn += str.charAt(i);
                }
            }

//**********************reading image*********************************//            
            if (extn.equals(".jpg") || extn.equals(".png")) {
                File file = new File("RecievedImage" + str);
                FileOutputStream fout = new FileOutputStream(file);

                //receive and save image from client
                byte[] readData = new byte[1024];
                while ((i = dis.read(readData)) != -1) {
                    fout.write(readData, 0, i);
                    if (flag == 1) {
                        System.out.println("Image Has Been Received");
                        flag = 0;
                    }
                }
                fout.flush();
                fout.close();

//****************************Reading Other Files******************//            
            } else {
                FileWriter fstream = new FileWriter("ReceivedFile" + str);
                PrintWriter out = new PrintWriter(fstream);

                do {
                    str = dis.readUTF();
                    System.out.println(" " + str);
                    out.println(str);
                    out.flush();
                    if (str == null) {
                        break;
                    }

                } while (true);

                System.out.println("One File Received");
                out.close();
            }
        } catch (IOException ioe) {
            System.out.println("");
        }
    }
}
