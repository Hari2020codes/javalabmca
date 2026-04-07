import java.io.*;
import java.net.*;
public class MyclientUDP
{
    public static void main(String args[]) throws IOException
    {
        DatagramSocket dSocket=new DatagramSocket();//create udp socketand resolves destination
        InetAddress add=InetAddress.getByName("localhost");
        String str="*MESSAGE FROM CLIENT";
        byte[] bufBytes=str.getBytes();//converts string message into bytes

        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,9000);
        //store byte data into object datagramPacket 

        dSocket.send(datagramPacket);//sends ,msg to server listening on port 9000
        dSocket.close();
    }
}