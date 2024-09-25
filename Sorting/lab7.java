import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

public class lab7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CSE 2108");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField(20);
        JButton button = new JButton("Calculate");
        JLabel label = new JLabel("Result:");

        JTextArea historyTextArea = new JTextArea(10, 20);
        historyTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historyTextArea);

        label.setPreferredSize(new Dimension(400, 50));

        Border border = new LineBorder(Color.BLACK, 5);
        label.setBorder(border);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String inputText = textField.getText();
                    String[] parts = inputText.split("\\s+");
                    if (parts.length != 3) {
                        label.setText("Invalid input. Please enter 'number operator number'.");
                        return;
                    }
                    double num1 = Double.parseDouble(parts[0]);
                    double num2 = Double.parseDouble(parts[2]);
                    char operator = parts[1].charAt(0);
                    double result = 0;

                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 == 0) {
                                label.setText("Division by zero is not allowed.");
                                return;
                            }
                            result = num1 / num2;
                            break;
                        default:
                            label.setText("Invalid operator. Please use +, -, *, or /.");
                            return;
                    }
                    String calculation = inputText + " = " + result;
                    historyTextArea.append(calculation + "\n");
                    label.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    label.setText("Invalid input. Please enter valid numbers.");
                }
            }
        });

        panel.add(textField, BorderLayout.WEST);
        panel.add(button, BorderLayout.CENTER);

        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.add(label, BorderLayout.NORTH);
        resultPanel.add(scrollPane, BorderLayout.CENTER);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
