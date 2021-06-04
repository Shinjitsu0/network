import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8083);
        Socket clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.println("New connection accepted");

        out.println("Добро пожаловать! Введите имя.");

        final String name = in.readLine();

        out.println("Введите ваш возраст");

        final int age = Integer.parseInt(in.readLine());

        if(age >= 18){
            out.println(String.format("Добро пожаловать в зону для взрослых, %s! Хорошего отдыха и отличного дня!", name));
        } else{
            out.println(String.format("Добро пожаловать в зону для детей, %s! Приступим к игре!", name));
        }
    }

}
