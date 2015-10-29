import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgrammingLab16_6 extends JFrame {
  private DisplayMessage message = new DisplayMessage();

  public ProgrammingLab16_6() {
    add(message, BorderLayout.CENTER);
    message.setFocusable(true);
  }

  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new ProgrammingLab16_6();
    frame.setTitle("ProgrammingLab16_6");
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  //extends MessagePanel from book example 13.8
  class DisplayMessage extends MessagePanel {
    private String message1 = "Java is fun.";
    private String message2 = "Java is powerful.";
    private boolean isMessage1;

    public DisplayMessage() {
      setCentered(true);
      this.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
          if (isMessage1) setMessage(message1);
          else setMessage(message2);

          isMessage1 = !isMessage1;//change the message
        }
      });
    }
  }
}
