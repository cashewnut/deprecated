import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.AbstractButton;

public class Exp2 {

    public void fun(File file) throws MalformedURLException {
        String authority = file.toURL().getAuthority();
        AbstractButton button = new JButton("begin");
        JComponent textArea = new JTextArea();
        textArea.setAlignmentX(1.0f);
        textArea.setAlignmentY(1.0f);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (button.getText().equals("stop")) {
                    textArea.enable();
                    textArea.setAlignmentX(1.0f);
                    textArea.setAlignmentY(1.0f);
                    button.setLabel("begin");
                    textArea.setToolTipText(authority);
                } else {
                    textArea.disable();
                    textArea.setAlignmentX(0.5f);
                    textArea.setAlignmentY(0.5f);
                    textArea.reshape(3, 5, 3, 4);
                    button.setLabel("stop");
                    textArea.setToolTipText("");
                }
            }
        });
    }
}
