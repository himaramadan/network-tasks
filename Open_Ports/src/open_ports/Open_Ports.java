 
package open_ports;

import java.io.IOException;
import java.net.Socket;


public class Open_Ports {

    public static void main(String[] args) throws IOException {
       
            Socket tempSocket = new Socket();	
        boolean isOpened;

        for (int port = 0; port < 65536; port++) {

            isOpened = true;
          
            try {
              	//	Let's try connecting
                tempSocket = new Socket("127.0.0.1", port);
            }
            catch (IOException e) {
                isOpened = false;
            }
            finally {

                tempSocket.close();
            }

            if (isOpened) {
                String message = String.format("port %d is open", port);
                System.out.println(message);
            }
        }
    }
    
}
