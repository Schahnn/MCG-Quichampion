import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblMcgQuizchampion;
	private JLabel lblSpielerAnzahl;
	private JTextField textFieldspielername1;
	private JTextField textFieldspielername2;
	private JTextField textFieldspielername3;
	private JButton btnLaden;
	private JButton btnStart;
	private JLabel lblRegeln;
	private JLabel lblSeiSchlau;
	private JButton btnSpieler;
	private JButton btnSpieler_1;
	private JButton btnSpieler_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMcgQuizchampion = new JLabel("MCG Quizchampion");
		lblMcgQuizchampion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMcgQuizchampion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMcgQuizchampion.setBounds(312, 58, 288, 72);
		contentPane.add(lblMcgQuizchampion);
		
		lblSpielerAnzahl = new JLabel("Spieler Anzahl");
		lblSpielerAnzahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpielerAnzahl.setBounds(663, 165, 115, 14);
		contentPane.add(lblSpielerAnzahl);
		
		textFieldspielername1 = new JTextField();
		textFieldspielername1.setBounds(682, 233, 96, 20);
		contentPane.add(textFieldspielername1);
		textFieldspielername1.setColumns(10);
		
		textFieldspielername2 = new JTextField();
		textFieldspielername2.setBounds(682, 308, 96, 20);
		contentPane.add(textFieldspielername2);
		textFieldspielername2.setColumns(10);
		
		textFieldspielername3 = new JTextField();
		textFieldspielername3.setBounds(682, 383, 96, 20);
		contentPane.add(textFieldspielername3);
		textFieldspielername3.setColumns(10);
		
		btnLaden = new JButton("Laden");
		btnLaden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLaden.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLaden.setBounds(34, 629, 143, 105);
		contentPane.add(btnLaden);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielername1(textFieldspielername1.getText());
				Hauptklasse.setSpielername2(textFieldspielername2.getText());
				Hauptklasse.setSpielername3(textFieldspielername3.getText());
				
			}
		
		
		
		
		
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnStart.setBounds(789, 629, 163, 105);
		contentPane.add(btnStart);
		
		lblRegeln = new JLabel("Regeln");
		lblRegeln.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegeln.setBounds(205, 164, 80, 58);
		contentPane.add(lblRegeln);
		
		lblSeiSchlau = new JLabel("- sei schlau");
		lblSeiSchlau.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeiSchlau.setBounds(205, 233, 80, 30);
		contentPane.add(lblSeiSchlau);
		
		btnSpieler = new JButton("1 Spieler");
		buttonGroup.add(btnSpieler);
		btnSpieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(1);
				
				
			}
		});
		btnSpieler.setBounds(683, 199, 95, 23);
		contentPane.add(btnSpieler);
		
		btnSpieler_1 = new JButton("2 Spieler");
		buttonGroup.add(btnSpieler_1);
		btnSpieler_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(2);
			}
		});
		btnSpieler_1.setBounds(683, 274, 95, 23);
		contentPane.add(btnSpieler_1);
		
		btnSpieler_2 = new JButton("3 Spieler");
		buttonGroup.add(btnSpieler_2);
		btnSpieler_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(3);
			}
		});
		btnSpieler_2.setBounds(682, 349, 96, 23);
		contentPane.add(btnSpieler_2);
	}
}
