import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import barket.Product;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class asd {

    public static void main(String[] args) {
    	
    	Product[] products = new Product[]{
            new Product("책", "book.jpg", 10, 10000),
            new Product("의자", "chair.jpg", 20, 20000),
            new Product("테이블", "table.jpg", 5, 50000)
    	};

    	JPanel background = new JPanel();
    	background.setLayout(new FlowLayout());

    	for (Product product : products) {
        	JLabel imageLabel = new JLabel();
        	ImageIcon icon = new ImageIcon(product.getImage());
        	imageLabel.setIcon(icon);
        	background.add(imageLabel);
        	JTextPane nameText = new JTextPane();
        	nameText.setText(product.getImage());
        	nameText.setEditable(false);
        	background.add(nameText);
    	}

    	JFrame frame = new JFrame("Product Viewer");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setContentPane(background);
    	frame.pack();
    	frame.setVisible(true);

    }
}