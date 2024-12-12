/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doancanhan_phamvannhattruong;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author ADMIN
 */
public class TCPCLIENT {
    Socket socket = null;
    public void Connect_to_server(String host, int port) throws IOException{
        socket = new Socket(host, port);
        System.out.println("Da ket noi");
    }
    public void Close_connect() throws IOException{
        try{
            if (socket != null){
                socket.close();
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void Output_to_server(String output) throws IOException{
        DataOutputStream out_to_server = new DataOutputStream(socket.getOutputStream());
        out_to_server.writeBytes(output + "\n");
        System.out.println("Da gui " + output + " cho server");
    }
    public String input_from_server(String input) throws IOException{
        BufferedReader in_from_server = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = in_from_server.readLine();
        return data;
    }
}
