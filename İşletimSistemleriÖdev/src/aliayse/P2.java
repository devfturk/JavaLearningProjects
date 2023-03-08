package aliayse;


import java.net.ServerSocket;
import java.io.*;

public class P2 
{
    public static void main(String args[]) 
    {
        int port = 2053;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            java.net.Socket s = serverSocket.accept();


            InputStream inputStream = s.getInputStream();
            ObjectInputStream oinputStream = new ObjectInputStream(inputStream);

            OutputStream outputStream = s.getOutputStream();
            ObjectOutputStream ooutputStream = new ObjectOutputStream(outputStream);



            Ogrenci ft = (Ogrenci) oinputStream.readObject();
            if (ft!=null) 
            {
                System.out.println(ft.toString());
            }
            ft.setOgrenciAd("Ali");
            ooutputStream.writeObject(ft);


            ooutputStream.writeObject(new String(ft.toString()));

           

            inputStream.close();
            s.close();
            serverSocket.close();
        }catch(Exception e){System.out.println(e);}
    }
}