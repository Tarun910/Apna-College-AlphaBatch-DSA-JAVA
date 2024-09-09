import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JButton submitButton;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel resultLabel;

    public UserForm() {
        createView();

        setTitle("User Information Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridLayout(4, 2));

        nameLabel = new JLabel("Name:");
        panel.add(nameLabel);

        nameField = new JTextField(20);
        panel.add(nameField);

        emailLabel = new JLabel("Email:");
        panel.add(emailLabel);

        emailField = new JTextField(20);
        panel.add(emailField);

        resultLabel = new JLabel("");
        panel.add(resultLabel);

        submitButton = new JButton("Submit");
        panel.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                if (name.isEmpty() || email.isEmpty()) {
                    resultLabel.setText("Please fill in all fields.");
                } else {
                    resultLabel.setText("Submitted: " + name + ", " + email);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }
}


/**
 * InnerUserForm
 */

 