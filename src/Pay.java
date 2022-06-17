import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Pay extends JFrame implements ActionListener{

	private JPanel contentPane , totalpanel , paymentpanel , paynow;
	private JTextPane paymentTxt, txtpnChoosePaymentType ,txtpnTotal , txtpnEnterTheAmount;
	private Dimension dim;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtRm , textField , textField_2 ;
	public JRadioButton ccbut, debitbut, cashbut;
	public String des,cost,payment,newcost;
	public JButton PayButton;
	DecimalFormat formatter =  new DecimalFormat("#0.00");
	public double newnew , newtotal;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pay frame = new Pay();
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
	public Pay(String des , String cost,Integer b,Integer c,String membership,Integer d,Double total) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 973, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 dim = Toolkit.getDefaultToolkit().getScreenSize();
	     this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); 
		
		paymentTxt = new JTextPane();
		paymentTxt.setBackground(Color.DARK_GRAY);
		paymentTxt.setForeground(Color.WHITE);
		paymentTxt.setFont(new Font("Century Gothic", Font.PLAIN, 53));
		paymentTxt.setText("    PAYMENT");
		paymentTxt.setBounds(10, 11, 400, 66);
		contentPane.add(paymentTxt);
		
		paymentpanel = new JPanel();
		paymentpanel.setBackground(new Color(245, 222, 179));
		paymentpanel.setBounds(64, 119, 301, 201);
		contentPane.add(paymentpanel);
		paymentpanel.setLayout(null);
		
		txtpnChoosePaymentType = new JTextPane();
		txtpnChoosePaymentType.setBackground(new Color(245, 222, 179));
		txtpnChoosePaymentType.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16));
		txtpnChoosePaymentType.setText("Choose Payment Type :");
		txtpnChoosePaymentType.setBounds(10, 11, 244, 25);
		paymentpanel.add(txtpnChoosePaymentType);
		
		debitbut = new JRadioButton("Debit Card");
		buttonGroup.add(debitbut);
		debitbut.setFont(new Font("Century Gothic", Font.BOLD, 18));
		debitbut.setBackground(new Color(0, 128, 128));
		debitbut.setBounds(10, 146, 244, 48);
		paymentpanel.add(debitbut);
		
		ccbut = new JRadioButton("Credit Card");
		buttonGroup.add(ccbut);
		ccbut.setFont(new Font("Century Gothic", Font.BOLD, 18));
		ccbut.setBackground(new Color(0, 128, 128));
		ccbut.setBounds(10, 95, 244, 48);
		paymentpanel.add(ccbut);
		
		cashbut = new JRadioButton("Cash");
		buttonGroup.add(cashbut);
		cashbut.setFont(new Font("Century Gothic", Font.BOLD, 17));
		cashbut.setBackground(new Color(0, 128, 128));
		cashbut.setBounds(10, 44, 244, 48);
		paymentpanel.add(cashbut);
		
		totalpanel = new JPanel();
		totalpanel.setBackground(new Color(245, 222, 179));
		totalpanel.setBounds(375, 119, 511, 201);
		contentPane.add(totalpanel);
		totalpanel.setLayout(null);
		
		txtpnTotal = new JTextPane();
		txtpnTotal.setText("TOTAL");
		txtpnTotal.setFont(new Font("Century Gothic", Font.PLAIN, 53));
		txtpnTotal.setBackground(new Color(245, 222, 179));
		txtpnTotal.setBounds(10, 0, 178, 61);
		totalpanel.add(txtpnTotal);
		
		txtRm = new JTextField("RM"+cost);
		txtRm.setFont(new Font("Century Gothic", Font.PLAIN, 99));
		txtRm.setBounds(20, 72, 481, 104);
		totalpanel.add(txtRm);
		txtRm.setColumns(10);
		
		paynow = new JPanel();
		paynow.setBackground(new Color(245, 222, 179));
		paynow.setBounds(64, 331, 822, 104);
		contentPane.add(paynow);
		paynow.setLayout(null);
		
		txtpnEnterTheAmount = new JTextPane();
		txtpnEnterTheAmount.setBackground(new Color(245, 222, 179));
		txtpnEnterTheAmount.setText("Enter the amount you want to pay (RM) :");
		txtpnEnterTheAmount.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		txtpnEnterTheAmount.setBounds(10, 11, 445, 33);
		paynow.add(txtpnEnterTheAmount);
		
		textField = new JTextField();
		textField.setBounds(10, 50, 802, 33);
		paynow.add(textField);
		textField.setColumns(10);
	
		
		PayButton = new JButton("PAY");
		PayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	double newww;
            	String data = textField.getText();
            	double amount = Double.parseDouble(textField.getText());

            	if(cashbut.isSelected())
            	{
            		payment = "CASH";
            	}
            	else if(ccbut.isSelected())
            	{
            		payment = "CREDIT CARD";
            	
            	}
            	else if(debitbut.isSelected())
            	{
            		payment = "DEBIT CARD";
            	}
            	if(buttonGroup.isSelected(null) && (textField == null || textField.isEmpty()))
            	{
            		JOptionPane.showMessageDialog(null, "Please Pick a Payment Method and enter the correct amount to be paid!", "ERROR!", JOptionPane.ERROR_MESSAGE);
					return;
            	}
            	else if (buttonGroup.isSelected(null))
            	{
            		JOptionPane.showMessageDialog(null, "Please Pick A Payment Method!", "ERROR!", JOptionPane.ERROR_MESSAGE);
					return;
            	}
            	else if (amount<total)
            	{
            		JOptionPane.showMessageDialog(null, "Please enter the correct amount!", "ERROR!", JOptionPane.ERROR_MESSAGE);
					return;
            	}
            	
          
            		newww = amount - total;
            		newcost = String.valueOf(formatter.format(newww));
            	
            	
            	Receipt asfdf = new Receipt(des,cost,b,payment,c,membership,d,newcost,amount);
        		asfdf.show();

            }
        });
		PayButton.setIcon(new ImageIcon(Pay.class.getResource("/payment.png")));
		PayButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		PayButton.setBounds(681, 466, 205, 66);
		contentPane.add(PayButton);
		

		
	
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}