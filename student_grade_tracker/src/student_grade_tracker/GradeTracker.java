package student_grade_tracker;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GradeTracker extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnum1;
	private JTextField textnum2;
	private JTextField textnum3;
	private JTextField textnum4;
	private JTextField textnum5;
	private JLabel lblNewLabel_1;
	private JLabel lblSubject_3;
	private JLabel lblGrade;
	private JLabel lblTotal;
	private JTextField texttotal;
	private JTextField textavg;
	private JTextField textgrd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeTracker frame = new GradeTracker();
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
	public GradeTracker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 777);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(89, 47, 789, 671);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textnum1 = new JTextField();
		textnum1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textnum1.setBounds(349, 126, 372, 46);
		panel.add(textnum1);
		textnum1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Subject 2");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(196, 185, 123, 46);
		panel.add(lblNewLabel);
		
		JLabel lblSubject_2 = new JLabel("Subject 1");
		lblSubject_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubject_2.setBounds(196, 121, 123, 46);
		panel.add(lblSubject_2);
		
		JLabel lblSubject_1 = new JLabel("Subject 3");
		lblSubject_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubject_1.setBounds(196, 258, 123, 46);
		panel.add(lblSubject_1);
		
		JLabel lblSubject = new JLabel("Average");
		lblSubject.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubject.setBounds(45, 531, 123, 46);
		panel.add(lblSubject);
		
		JLabel lblNewLabel_3_1 = new JLabel("Subject 4");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(196, 327, 123, 46);
		panel.add(lblNewLabel_3_1);
		
		textnum2 = new JTextField();
		textnum2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textnum2.setColumns(10);
		textnum2.setBounds(349, 190, 372, 46);
		panel.add(textnum2);
		
		textnum3 = new JTextField();
		textnum3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textnum3.setColumns(10);
		textnum3.setBounds(349, 258, 372, 46);
		panel.add(textnum3);
		
		textnum4 = new JTextField();
		textnum4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textnum4.setColumns(10);
		textnum4.setBounds(349, 332, 372, 46);
		panel.add(textnum4);
		
		textnum5 = new JTextField();
		textnum5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textnum5.setColumns(10);
		textnum5.setBounds(349, 401, 372, 46);
		panel.add(textnum5);
		
		lblNewLabel_1 = new JLabel("Student Grade Tracker");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_1.setBounds(106, 10, 633, 71);
		panel.add(lblNewLabel_1);
		
		lblSubject_3 = new JLabel("Subject 5");
		lblSubject_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubject_3.setBounds(196, 396, 123, 46);
		panel.add(lblSubject_3);
		
		lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGrade.setBounds(441, 531, 123, 46);
		panel.add(lblGrade);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(196, 474, 123, 46);
		panel.add(lblTotal);
		
		texttotal = new JTextField();
		texttotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		texttotal.setColumns(10);
		texttotal.setBounds(349, 474, 372, 46);
		panel.add(texttotal);
		
		textavg = new JTextField();
		textavg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textavg.setColumns(10);
		textavg.setBounds(128, 531, 223, 46);
		panel.add(textavg);
		
		textgrd = new JTextField();
		textgrd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textgrd.setColumns(10);
		textgrd.setBounds(511, 531, 192, 46);
		panel.add(textgrd);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton.setBounds(568, 604, 135, 57);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m1 = Integer.parseInt(textnum1.getText());
				int m2 = Integer.parseInt(textnum2.getText());
				int m3 = Integer.parseInt(textnum3.getText());
				int m4 = Integer.parseInt(textnum4.getText());
				int m5 = Integer.parseInt(textnum5.getText());
				int total = m1 + m2 + m3 + m4 + m5;
				
				double avg = total/5;
				
				texttotal.setText(String.valueOf(total));
				textavg.setText(String.valueOf(avg));
				
				if(avg >= 90)
				{
					textgrd.setText("A");
				}
				else if(avg >= 80)
				{
					textgrd.setText("B");
				}
				else if(avg >= 70)
				{
					textgrd.setText("C");
				}
				else if(avg >= 60)
				{
					textgrd.setText("D");
				}
				else if(avg >= 50)
				{
					textgrd.setText("E");
				}
				else
				{
					textgrd.setText("Fail");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnNewButton_1.setBounds(114, 604, 135, 57);
		panel.add(btnNewButton_1);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textnum1.setText("");
				textnum2.setText("");
				textnum3.setText("");
				textnum4.setText("");
				textnum5.setText("");
				textavg.setText("");
				texttotal.setText("");
				textgrd.setText("");
				textnum1.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnClear.setBounds(335, 604, 135, 57);
		panel.add(btnClear);
	}
}
