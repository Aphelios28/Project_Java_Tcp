/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan_phamvannhattruong;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class TCPSERVER {
    ServerSocket serverSocket;
    Socket socket;
    String s= null;
    DANHSACHPHONG dsp = new DANHSACHPHONG();
    public void ConnectServer(int port) throws IOException{
        serverSocket = new ServerSocket(port);
    }
    public void Connect_to_client() throws IOException{
        
        socket = serverSocket.accept();
    }
    public void Close() throws IOException{
        if (socket != null){
            socket.close();
        }
    }
    public String input_from_client() throws IOException{
        BufferedReader in_from_client = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = in_from_client.readLine();
        return data;
    }
    public void output_to_server(String output) throws IOException{
        DataOutputStream out_to_client = new DataOutputStream(socket.getOutputStream());
        out_to_client.writeBytes(output + "\n");
    }
}
