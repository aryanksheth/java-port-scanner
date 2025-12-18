import java.io.IOException;
import java.net.Socket;
import java.net.*;
import java.util.ArrayList;


/*
Implementation of port scanning. Will use Java's Socket Class
 */


public class PortScanner {
    ArrayList<Integer> openPorts = new ArrayList<>();
    ArrayList<Integer> closedPorts = new ArrayList<>();
    public ArrayList<Integer> portScan(String ip) throws IOException {

            for (int i = 0; i < 1024; i++){
                try {
                    System.out.println("Scanning Port " + ip);
                    Socket s = new Socket();
                    s.connect(new InetSocketAddress(ip, i), 200);
                    s.close();
                    openPorts.add(i);
                }
                catch(Exception e){
                    closedPorts.add(i);
                    continue;
                }
            }

    return openPorts; //want to change this to one list with a seperate port class that holds wether it is open or not.
    }
    public String toString(){
        String result = "Open Ports: ";
        for (int port : openPorts){
            result += port + " ";
        }
        return result;
    }


    public static void main(String[] args) {
//        if (args.length < 1){
//            System.out.println("Usage: java PortScanner <IP_ADDRESS>");
//            return;
//        }
//        String targetIP = args[0];
        String targetIP = "127.0.0.1";
        PortScanner ps = new PortScanner();
        try{
           ArrayList<Integer> openPorts = ps.portScan(targetIP);
            System.out.println("Open Ports on" + targetIP + ": " + openPorts);
        } catch (IOException e) {
            System.out.println("Error scanning " + targetIP + ": " + e.getMessage());
        }

    }
}
