package package01;

import java.awt.Color;
import java.awt.Container;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Generator extends JFrame {
	Generator() {
		setSize(500, 320);
		setTitle("Generator");
		Container d = getContentPane();
		d.setBackground(Color.WHITE);
		setLayout(new GridLayout(5, 0));
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		JPanel p3 = new JPanel(new FlowLayout());
		JPanel p4 = new JPanel(new FlowLayout());

		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.WHITE);
		p3.setBackground(Color.WHITE);
		p4.setBackground(Color.WHITE);
		JTextArea jta1 = new JTextArea("Generator");
		JTextArea jta2 = new JTextArea("Input the number of ciphers. : ");
		JTextField jf = new JTextField(2);
		JTextArea jta3 = new JTextArea("Press \"Generate button\" to make new,strong password\"");
		JTextField jf1 = new JTextField(24);
		jta1.setBackground(Color.WHITE);
		jta2.setBackground(Color.WHITE);
		jf1.setEditable(false);
		jf1.setBackground(Color.WHITE);
		jta1.setEditable(false);
		jta2.setEditable(false);

		JButton b1 = new JButton("Generate");
		JButton b2 = new JButton("Reset");
		JButton b3 = new JButton("Back");
		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);

		JFrame resetframe = new JFrame();
		resetframe.setSize(200, 200);
		resetframe.setLocationRelativeTo(null);
		resetframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resetframe.setResizable(false);
		resetframe.getContentPane().setLayout(null);
		JLabel resetmessage = new JLabel("Do you want to reset this password?");
		resetmessage.setOpaque(true);
		resetmessage.setForeground(Color.BLACK);
		resetmessage.setHorizontalAlignment(JLabel.CENTER);

		b1.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
				String tmp = jf.getText();
				int cipher = Integer.parseInt(tmp);
				Make m = new Make();
				jf1.setText(m.getGenerator(cipher));
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
				int quit = JOptionPane.showConfirmDialog(resetframe, resetmessage, "EXIT", JOptionPane.YES_NO_OPTION);
				if (quit == 0) {
					JOptionPane.showMessageDialog(resetframe, "Reset Finished!", "Notice",
							JOptionPane.INFORMATION_MESSAGE);
					jf1.setText("");
				} else if (quit == 1) {
					// nothing happens.
				}
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
				Main.main(null);
				setVisible(false);
			}

			public void mouseReleased(MouseEvent e) {
			}

		});
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, new File("Font/LINESeedSans_Bd.ttf"));
			font = font.deriveFont(Font.BOLD, 20);
			jta1.setFont(font);
			font = font.deriveFont(Font.PLAIN, 13);
			jta2.setFont(font);
			jta3.setFont(font);

			font = font.deriveFont(Font.PLAIN, 15);
			jf.setFont(font);
			jf1.setFont(font);
			b1.setFont(font);
			b2.setFont(font);
			b3.setFont(font);

		} catch (Exception e) {

		}
		p1.add(jta1);
		p2.add(jta2);
		p2.add(jf);
		p3.add(jta3);
		p3.add(jf1);
		p4.add(b1);
		p4.add(b2);
		p4.add(b3);

		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	}

}
