import java.io.IOException;
import java.net.Socket;
import java.net.*;
import java.util.ArrayList;


/*
Implementation of port scanning. Will use Java's Socket Class
TODO:
 - Add MultiThreaded scanning
 - Dynamic port scanning
 - Create HashMaps for grabbing port descriptions
 - Attempt to get console results (try connecting via ssh to available ports)
 */


public class PortScanner {
    ArrayList<Port> portsList = new ArrayList<>();
    public ArrayList<Port> portScan(String ip) throws IOException {
            for (int i = 0; i < 1024; i++){
                boolean isOpen = false; //default
                try {
                    System.out.println("Scanning Port " + i);
                    Socket s = new Socket();
                    s.connect(new InetSocketAddress(ip, i), 200);
                    s.close();
                    isOpen = true;
                }
                catch(Exception e){}
                Port p = new Port(i, isOpen);
                portsList.add(p);
            }
        return portsList;
        }



    public String toString() {
        String result = "";
        for (Port n : portsList){
            if (n.getisOpen()) {
                result += n.toString() + " \n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        if (args.length < 1){
//            System.out.println("Usage: java PortScanner <IP_ADDRESS>");
//            return;
//        }
//        String targetIP = args[0];
        String targetIP = "10.27.1.1";
        PortScanner ps = new PortScanner();
        try{
           ArrayList<Port> portScan = ps.portScan(targetIP);
            System.out.println(ps.toString());
        } catch (IOException e) {
            System.out.println("Error scanning " + targetIP + ": " + e.getMessage());
        }
    }
    }
