package ru.kosarev.cloud;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoChat {
    public static void main(String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(8189)){
            System.out.println("Server connected");
            while (true){
                Socket socket =server.accept();
                ChatHandler chatHandler = new ChatHandler(socket);
                new Thread(chatHandler).start();
            }
        }

    }
}
