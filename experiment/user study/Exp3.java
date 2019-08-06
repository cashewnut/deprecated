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
        JScrollPane jScrollPane = JTable.createScrollPaneForTable(jTable);
        Rectangle rectangle = new ScrollPaneLayout().getViewportBorderBounds(jScrollPane);
        JList jList = new JList();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                if (login(username, password)) {
                    //jump to other window.
                    Object[] values = jList.getSelectedValues();
                    Object object = jTable.getValueAt(1, 1);
                    for (Object obj : values) {
                        if (obj.equals(object))
                            loginButton.setLabel(obj.toString());
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
            if (!Character.isJavaLetterOrDigit(c))
                return false;
        }
        return true;
    }

}
