package jieminasheji;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;

public class Test05 extends JFrame {

	private JPanel contentPane;
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	private JButton btnGet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test05 frame = new Test05();
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
	public Test05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		ButtonGroup group = new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBorder(new TitledBorder(null, "\u9009\u62E9\u98981", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addGap(478)
					.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		);
		
		r1 = new JRadioButton("option1");
		r1.setBackground(SystemColor.activeCaption);
		r1.setSelected(true);
		group.add(r1);
		
		r2 = new JRadioButton("option2");
		r2.setBackground(Color.RED);
		group.add(r2);
		
		r3 = new JRadioButton("option3");
		r3.setBackground(new Color(255, 239, 213));
		group.add(r3);
		
		btnGet = new JButton("Get");
		btnGet.setBackground(new Color(255, 182, 193));
		btnGet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (r1.isSelected()) {
					btnGet.setText("1");
				}else if (r2.isSelected()) {
					btnGet.setText("2");
				}else if (r3.isSelected()) {
					btnGet.setText("3");
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(r1)
						.addComponent(r2)
						.addComponent(r3)
						.addComponent(btnGet, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(r1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(r2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(r3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnGet)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
