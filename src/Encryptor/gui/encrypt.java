package Encryptor.gui;

import Encryptor.api.Encryptor;

import javax.swing.*;
import java.awt.event.*;

public class encrypt extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField MESSAGE;
    private JTextField TOKEN;

    public String result;

    public encrypt() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK () {

        result = Encryptor.encrypt(this.TOKEN.getText(), this.MESSAGE.getText());

        dispose();
    }

    private void onCancel () {
        // add your code here if necessary
        dispose();
    }

    public static String ShowGUI () {
        encrypt dialog = new encrypt();
        dialog.pack();
        dialog.setVisible(true);

        return dialog.result;

    }
}
