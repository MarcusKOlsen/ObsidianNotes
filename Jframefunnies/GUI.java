import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JFrame frame;
    private JLabel label;
    private JLabel congratslabel;
    private JButton button;

    private int count = 0;
    
    public GUI() {
        frame = new JFrame();
        label = new JLabel("");
        congratslabel = new JLabel("");
        button = new JButton("");

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Penis Creator");
                button.setText("Penis Creator");
                count++;
                label.setText(" Amount of peni: " + Integer.toString(count));

                if(count != 0 && count % 10 == 0) {
                    congratslabel.setText(" Congrats! You got " + Integer.toString(count) + " big peni!");
                } else {
                    congratslabel.setText("");
                }
                
            }
            
        });

        JPanel panel = new JPanel();
        
        panel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 20, true));
        panel.setSize(new Dimension(500, 500));
        panel.setBackground(Color.CYAN);
        

        Dimension d = new Dimension(150,50);
        button.setPreferredSize(d);
        button.setBackground(Color.RED);
        button.setForeground(Color.WHITE);

        panel.add(label);
        panel.add(button);
        panel.add(congratslabel);
        button.setFocusPainted(false);

        frame.setSize(500, 500);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("");
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GUI();
    }
}