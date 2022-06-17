import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;


import javax.swing.SwingConstants;
import javax.swing.JButton;

public class recProject extends JFrame {
	
	DecimalFormat priceformatter = new DecimalFormat("#0.00");

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recProject frame = new recProject();
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
	
		
		public recProject() {
			// DECLARE ALL DATA FOR RECEIPT
			String name = null;
			String Destination = null;
			boolean category = false;
			String paymenttype = null;
			double totalprice = 0;
			double customerpay = 0;
			boolean regularcuststate = false;
			String date = null;
			String time = null;

			DefaultTableModel listitemmodel = new DefaultTableModel(new Object[][] {},
					new String[] {"Destination", "Quantity", "Price" }) {
				private static final long serialVersionUID = 1L;

				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return false;
				}
			};

			
		setTitle("Train muamuah");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 428);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 128)));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 31, 616, 207);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Destination");
		lblNewLabel_2.setBounds(10, 75, 87, 24);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(10, 11, 46, 24);
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_3.setBounds(10, 147, 75, 24);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Category");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(364, 11, 114, 24);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Payment Type");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_5.setBounds(364, 75, 121, 24);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Total Price");
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(363, 147, 133, 24);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("TICKET RECEIPT.");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 0, 363, 28);
		contentPane.add(lblNewLabel);
		
		table_1 = new JTable();
		table_1.setForeground(new Color(255, 255, 255));
		table_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		table_1.setBounds(10, 385, 606, -128);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_7 = new JLabel("Total: RM" + priceformatter.format(totalprice));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_7.setBounds(486, 322, 109, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblCustomerPaid = new JLabel("Customer paid: RM" + priceformatter.format(customerpay));
		lblCustomerPaid.setForeground(new Color(0, 0, 0));
		lblCustomerPaid.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		lblCustomerPaid.setBounds(470, 342, 109, 19);
		contentPane.add(lblCustomerPaid);
		
		JLabel lblNewLabel_8 = new JLabel("Balance: RM" + priceformatter.format(customerpay - totalprice));
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_8.setBounds(473, 360, 87, 14);
		contentPane.add(lblNewLabel_8);
		}
}
		
		