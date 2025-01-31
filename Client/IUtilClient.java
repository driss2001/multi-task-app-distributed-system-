import java.io.*;
import java.net.Socket;

public interface IUtilClient {
    public String[] setInfoFromFile(String filepath) throws IOException;
    public float[] setKernelFromFile(String filepath) throws IOException;
    public File setImage(String filepath);
    public float[][] ReadMatrice(String text,int size); // read matrices, dimetion, operation, 
    public float[][] sendReciveMatrice(Socket socket, Data data) throws IOException, ClassNotFoundException;
    public void printMatrice(float[][] matice);
}
