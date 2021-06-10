package Chat.client;

import javax.swing.*;
import java.awt.*;

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
    private final JTextArea log = new JTextArea();
    private final JTextField fieldNickname = new JTextField("Yurii");
    private final JTextField fieldInput = new JTextField();

    private ClientWindow() {
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setSize(WIDTH, HEIGHT);
      setLocationRelativeTo(null);
      setAlwaysOnTop(true);
      log.setEditable(false);
      log.setLineWrap(true);
      add(log, BorderLayout.CENTER);
      add(fieldInput, BorderLayout.SOUTH);
      add(fieldNickname, BorderLayout.NORTH);

      setVisible(true);
    }
}

