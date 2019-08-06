import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp3 {

    public void fun() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        AbstractButton loginButton = new JButton("Login");
        JTable jTable = new JTable(3, 5);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        Rectangle rectangle = jScrollPane.getViewportBorderBounds();
        JList jList = new JList();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                if (login(username, password)) {
                    //jump to other window.
                    Object[] values = jList.getSelectedValuesList().toArray();
                    Object object = jTable.getValueAt(1, 1);
                    for (Object obj : values) {
                        if (obj.equals(object))
                            loginButton.setText(obj.toString());
                    }
                }

            }
        });
    }

    public boolean login(String username, char[] password) {
        if (!isValid(password.toString()))
            return false;
        // check username and password
        return true;
    }

    public boolean isValid(String password) {
        for (char c : password.toCharArray()) {
            if (!Character.isJavaIdentifierPart(c))
                return false;
        }
        return true;
    }

}
