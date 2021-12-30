//Tcp server
package network;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.*;
public class Server {
    public static void main(String[] args) {
        try{
  ServerSocket server = new ServerSocket(3000);
            Socket  socket = server.accept();
            System.out.println("open port successfully");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            String username = "hima";
            String password = "hima123";
            while (true) {
               String mes1 = input.readLine();         
               String mes2 = input.readLine();         
                if(mes1.equals(username)&&mes2.equals(password)){
                    out.println("valid user");}
                else
                    out.println("Sorry , Try again");
            }
    }catch (IOException ex) {
            System.out.println("server error " + ex.getMessage());
            System.exit(1);
    }

}

}
