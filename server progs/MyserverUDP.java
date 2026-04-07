import java.io.*;
import java.net.*;
public class MyserverUDP
{
    public static void main(String args[]) throws IOException
    {
        DatagramSocket dsocket=new DatagramSocket(9000);// open UDP port
        byte[] buf=new byte[256];// prepare buffer and packet object to receive upto 256 bytes
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        dsocket.receive(packet);//blocks until datagram, fills packet with received data
                                    
        String response=new String(packet.getData());//received packets converted to string
        System.out.println("Server :"+response);

    }
}