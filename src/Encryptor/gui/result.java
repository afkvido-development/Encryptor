package Encryptor.gui;

import Encryptor.internal.clipboard;

import javax.swing.*;
import java.awt.event.*;

public class result extends JDialog {

    private JPanel contentPane;
    private JButton buttonOK;
    private JButton copyButton;
    private JLabel RES;
    private String code;

    public result () {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(e -> {
            onOK();
        });

        copyButton.addActionListener(e -> {
            onCopy();
        });

        // call onOK() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onOK();
            }
        });

        // call onOK() on ESCAPE
        contentPane.registerKeyboardAction(e -> onOK(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK () {
        dispose();
    }

    private void onCopy () {
        clipboard.Copy(code);
    }

    public static void ShowGUI (String result) {

        result dialog = new result();
        dialog.code = result;
        dialog.RES.setText(dialog.code);
        dialog.pack();
        dialog.setVisible(true);
    }
}
