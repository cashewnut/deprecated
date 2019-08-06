import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.AbstractButton;
import java.lang.Character;

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
                // Return value type changed! (String) -> (char[])
                String password = String.valueOf(passwordField.getPassword());
                if (login(username, password)) {
                    // Return value type changed! (Object[]) -> (List)
                    java.util.List<Object> values = jList.getSelectedValuesList();
                    Object object = jTable.getValueAt(1, 1);
                    for (Object obj : values) {
                        if (obj.equals(object))
                            loginButton.setText(obj.toString());
                    }
                }
            }
        });
    }

    public boolean login(String username, String password) {
        if (!isValid(password))
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
