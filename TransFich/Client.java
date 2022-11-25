package fich;

import java.io.*;
import java.net.*;

public class Client{
    static Socket s;
    public static void main(String[] args)throws Exception{
        s=new Socket("127.0.0.1",60);
        FileInputStream inf=new FileInputStream(new File("d:\\racinen.c"));
        ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
        byte buf[] = new byte[1024];
        int n;
        while((n=inf.read(buf))!=-1){
            out.write(buf,0,n);
        }
        inf.close();
        out.close();
        s.close();
    }
}