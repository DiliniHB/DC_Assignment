import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class ClientNode {

	 public static void main(String args[])
	    {
            String myName;
	        String bootstrapServer = "127.0.0.1";
	        int port;
	        InetAddress address;
	        DatagramSocket socket = null;
	        DatagramPacket packet;
	        byte[] sendBuf = new byte[65536];

	        try
	        {
	            //sock = new DatagramSocket(55555, )

	            echo("Client Note Started... ..");
	            String msg = "0036 REG 127.0.0.1 55556 1234abc";
	                address = InetAddress.getByName("127.0.0.1");
	                packet = new DatagramPacket(sendBuf, sendBuf.length, 
	                                                address,4445);
	                socket = new DatagramSocket(55555);
	                socket.send(packet);
	              
	        }

	        catch(IOException e)
	        {
	            System.err.println("IOException " + e);
	        }
	    }
	 
	  public static void echo(String msg)
	    {
	        System.out.println(msg);
	    }
}
