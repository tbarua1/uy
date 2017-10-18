package multiuser_chatapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashSet;

public class Handler extends Thread {

	private String name;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	 private static HashSet<String> names = new HashSet<String>();
	  private static HashSet<PrintWriter> writers = new HashSet<PrintWriter>();

	public Handler(Socket accept) {
		// TODO Auto-generated constructor stub
		this.socket = accept;
	}
	  public void run() {
          try {

              // Create character streams for the socket.
              in = new BufferedReader(new InputStreamReader(
                  socket.getInputStream()));
              out = new PrintWriter(socket.getOutputStream(), true);

              // Request a name from this client.  Keep requesting until
              // a name is submitted that is not already used.  Note that
              // checking for the existence of a name and adding the name
              // must be done while locking the set of names.
              while (true) {
                  out.println("SUBMITNAME");
                  name = in.readLine();
                  if (name == null) {
                      return;
                  }
                  synchronized (names) {
                      if (!names.contains(name)) {
                          names.add(name);
                          break;
                      }
                  }
              }

              // Now that a successful name has been chosen, add the
              // socket's print writer to the set of all writers so
              // this client can receive broadcast messages.
              out.println("NAMEACCEPTED");
              writers.add(out);

              // Accept messages from this client and broadcast them.
              // Ignore other clients that cannot be broadcasted to.
              while (true) {
                  String input = in.readLine();
                  if (input == null) {
                      return;
                  }
                  for (PrintWriter writer : writers) {
                      writer.println("MESSAGE " + name + ": " + input);
                  }
              }
          } catch (Exception e) {
              System.out.println(e);
          } finally {
              // This client is going down!  Remove its name and its print
              // writer from the sets, and close its socket.
              if (name != null) {
                  names.remove(name);
              }
              if (out != null) {
                  writers.remove(out);
              }
              try {
                  socket.close();
              } catch (IOException e) {
              }
          }
      }
  }


