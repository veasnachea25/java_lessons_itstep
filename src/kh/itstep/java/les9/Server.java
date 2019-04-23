package kh.itstep.java.les9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;

public class Server implements Runnable {

    @Override
    public void run() {
        try {
//            File folder = new File("path to folder here");

            ServerSocket serverSocket = new ServerSocket(8080);
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println(client.getInetAddress().toString()+" connected");
                OutputStream out = client.getOutputStream();
                PrintWriter outWriter = new PrintWriter(out);
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                String line = in.readLine();
                System.out.println(line);

//                for (File file : folder.listFiles()) {
//                    //todo: display
//                }

                outWriter.println("HTTP/1.0 200 OK\n"+
                        "Server: java\n" +
                        "Content-Length: 32\n" +
                        "Content-Type: text/html\n\n");
                outWriter.println("<html><body>Hello</body></html>\n");
                outWriter.close();
                in.close();
                client.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server1 = new Server();
        server1.run();
    }

    void sendFile(File in, OutputStream out) {
        try {
            out.write(Files.readAllBytes(in.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
