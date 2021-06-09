package Chat.client;

import javax.swing.*;

public class ClientWindow extends JFrame {
    private static final String IP_ADDR = "192.168.31.177";
    private static final int PORT = 8189;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientWindow();
            }
        });
    }
    private final JTextArea
    private ClientWindow() {
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setSize(WIDTH, HEIGHT);
      setLocationRelativeTo(null);
      setAlwaysOnTop(true);

      setVisible(true);
    }
}

