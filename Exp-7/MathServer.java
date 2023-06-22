import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MathServer {
    private static final int PORT = 8080;
    private ServerSocket serverSocket;
    private ExecutorService threadPool;
    public MathServer() {
        try {
            serverSocket = new ServerSocket(PORT);
            threadPool = Executors.newFixedThreadPool(10); // Maximum 10 concurrent clients
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start() {
        System.out.println("Math Server is running on port " + PORT);
        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " +
                clientSocket.getInetAddress().getHostAddress());
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                threadPool.execute(clientHandler);
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static class ClientHandler implements Runnable {
        private Socket clientSocket;
        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new
                InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                String input = reader.readLine();
                System.out.println("Client " + clientSocket.getInetAddress().getHostAddress() + " sent: " +
                input);
                int result = performMathOperation(input);
                System.out.println("Result for client " + clientSocket.getInetAddress().getHostAddress() + ": "
                + result);
                writer.println(result);
                reader.close();
                writer.close();
                clientSocket.close();
                System.out.println("Client " + clientSocket.getInetAddress().getHostAddress() + "disconnected");
            } 
            catch (IOException e) {
                    e.printStackTrace();
            }
        }
        private int performMathOperation(String input) {
            // Parse and evaluate the mathematical expression
            String[] parts = input.split("[+\\-*/]");
            int operand1 = Integer.parseInt(parts[0].trim());
            int operand2 = Integer.parseInt(parts[1].trim());
            char operator = input.charAt(parts[0].length());
            int result;
            switch (operator) {
            case '+':
            result = operand1 + operand2;
            break;
            case '-':
            result = operand1 - operand2;
            break;
            case '*':
            result = operand1 * operand2;
            break;
            case '/':
            result = operand1 / operand2;
            break;
            default:
            throw new IllegalArgumentException("Invalid operator: " + operator);
            }
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.print("Yash Atrey\n35520807220\nCSE-A ( 109 )\n\n");
        MathServer mathServer = new MathServer();
        mathServer.start();
    }
}