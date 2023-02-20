import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchFrame extends JFrame {

    private JTextField textField;

    public SearchFrame() {
        super("검색");
        JPanel panel = new JPanel();
        textField = new JTextField(20);
        JButton button = new JButton("검색");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                // 검색 로직 구현
                JOptionPane.showMessageDialog(SearchFrame.this, text + " 검색 결과입니다.");
            }
        });

        panel.add(textField);
        panel.add(button);
        add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new SearchFrame();
    }
}
