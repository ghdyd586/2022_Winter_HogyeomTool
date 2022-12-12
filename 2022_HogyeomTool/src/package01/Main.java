package package01;

import java.awt.Color;
import java.awt.Container;
//import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Main extends JFrame {

	Main() {
		setSize(400, 200);
		setTitle("Password Generator");
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setResizable(false);
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		JPanel p0 = new JPanel();
		p0.setBackground(Color.WHITE);
		JPanel p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		JPanel p2 = new JPanel(new GridLayout(3, 0));
		p2.setBackground(Color.WHITE);
		JTextArea jta1 = new JTextArea("Password Generator");

		jta1.setEditable(false);
		JButton b1 = new JButton("Generate Password");
		JButton b2 = new JButton("About This Program");
		JButton b3 = new JButton("Exit");

		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		JFrame exitframe = new JFrame();
		exitframe.setSize(200, 200);
		exitframe.setLocationRelativeTo(null);
		exitframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		exitframe.setResizable(false);
		exitframe.getContentPane().setLayout(null);
		JLabel exitmessage = new JLabel("Do you want to exit this program?");
		exitmessage.setOpaque(true);
		exitmessage.setForeground(Color.BLACK);
		exitmessage.setHorizontalAlignment(JLabel.CENTER);

		b1.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				new Generator();
				setVisible(false);
			}

			public void mouseReleased(MouseEvent e) {
			}

		});

		b2.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				new ProgramInfo();
				setVisible(false);
			}

			public void mouseReleased(MouseEvent e) {
			}

		});
		b3.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				int quit = JOptionPane.showConfirmDialog(exitframe, exitmessage, "EXIT", JOptionPane.YES_NO_OPTION);
				if (quit == 0) {
					System.exit(0);
				} else if (quit == 1) {
					// nothing happens.
				}
			}

			public void mouseReleased(MouseEvent e) {
			}

		});

		p0.add(jta1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);

		add(p0);
		add(p1);
		add(p2);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, new File("Font/LINESeedSans_Bd.ttf"));
			font = font.deriveFont(Font.BOLD, 20);
			jta1.setFont(font);
			font = font.deriveFont(Font.BOLD, 15);
			font = font.deriveFont(Font.PLAIN, 12);
			exitmessage.setFont(font);
			font = font.deriveFont(Font.PLAIN, 15);
			b1.setFont(font);
			b2.setFont(font);
			b3.setFont(font);

		} catch (Exception e) {

		}
	}

	public void visiblesetting(boolean n) {
		setVisible(n);
	}

	public static void main(String[] args) {
		new Main();
	}

}
