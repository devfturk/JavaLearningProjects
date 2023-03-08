package aliayse;

import java.net.*;
import java.io.*;
public class P1 {
    public static void main(String args[])
    {
        try
        {
            Socket socket = new Socket("localhost",2053);
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream ooutputStream = new ObjectOutputStream(outputStream);


            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);



            Ogrenci to = new Ogrenci("18253506","Ayşe","TÜRK","Bilgisayar Mühendisliği");
            ooutputStream.writeObject(to);
            ooutputStream.writeObject(new String(to.toString()));

            Ogrenci toi = (Ogrenci) ois.readObject();
            if (toi!=null) {
                System.out.println(toi.toString());}

            ooutputStream.close();
            outputStream.close();
            socket.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}