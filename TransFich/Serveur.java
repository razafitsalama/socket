package fich;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serveur{
    static Socket sock;
    static ServerSocket sv;
    public static void main(String[] args){
        try{
            sv=new ServerSocket(60);
            Socket s=sv.accept();
            ObjectInputStream in=new ObjectInputStream(s.getInputStream());
            FileOutputStream out=new FileOutputStream(new File("d:\\racinen.c"));
            byte buf[]=new byte[1024];
            int n;
            while((n=in.read(buf))!=-1){
                out.write(buf,0,n);
            }
            out.close();
            sock.close();
        }catch(Exception e){

        }
    }
}