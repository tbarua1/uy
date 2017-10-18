package multiuser_chatapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.HashSet;

public class Server {
	private static final int PORT = 9001;
	 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("The chat server is running.");
        ServerSocket listener = new ServerSocket(PORT);
        try {
            while (true) {
                new Handler(listener.accept()).start();
            }
        } finally {
            listener.close();
        }

	}

}
