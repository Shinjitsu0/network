import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("netology.homework", 8083);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedReader typingOut = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(in.readLine());

        out.println(typingOut.readLine());

        System.out.println(in.readLine());

        out.println(typingOut.readLine());

        System.out.println(in.readLine());
    }
}
