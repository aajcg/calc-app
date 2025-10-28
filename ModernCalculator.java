import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ModernCalculator extends JFrame implements ActionListener {
    JTextField display;
    double num1 = 0, num2 = 0, result = 0;
    char operator = ' ';

    public ModernCalculator() {
        setTitle("Modern Calculator");
        setSize(350, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(245, 245, 245));

        display = new JTextField();
        display.setFont(new Font("Segoe UI", Font.BOLD, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        display.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 10, 10));
        buttonPanel.setBackground(new Color(245, 245, 245));
        String[] buttons = {
            "C","DEL","/","*",
            "7","8","9","-",
            "4","5","6","+",
            "1","2","3","=",
            "0",".","",""
        };

        for (String text : buttons) {
            if (text.isEmpty()) {
                buttonPanel.add(new JLabel());
                continue;
            }
            JButton b = createButton(text);
            buttonPanel.add(b);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    JButton createButton(String text) {
        JButton b = new JButton(text);
        b.setFont(new Font("Segoe UI", Font.BOLD, 18));
        b.setBackground(Color.WHITE);
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1, true));
        b.addActionListener(this);
        return b;
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.chars().allMatch(Character::isDigit) || cmd.equals("."))
            display.setText(display.getText() + cmd);
        else if (cmd.equals("C"))
            display.setText("");
        else if (cmd.equals("DEL") && display.getText().length() > 0)
            display.setText(display.getText().substring(0, display.getText().length() - 1));
        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num2 == 0 ? 0 : num1 / num2; break;
            }
            display.setText(String.valueOf(result));
            operator = ' ';
        } else {
            num1 = Double.parseDouble(display.getText());
            operator = cmd.charAt(0);
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ModernCalculator::new);
    }
}
