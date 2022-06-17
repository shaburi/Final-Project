import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.util.Calendar;
import javax.swing.JButton;

public class Receipt extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel TrainReceiptLabel,groupNameLabel,dateAndDayLabel,totalTicketLabel,totalPriceLabel,copyrightLabel,payUsingLabel,methodUsingLabel;
	private JLabel producedbyLabel,supportedbyLabel,masteredbyLabel,ticketreceiptbyLabel,eclipseIdLabel,line1Label,membershipLabel,destinationLabel,categoryLabel;
	private JLabel destinationlbl,ctgorylbl,pymentlbl,mmbrlbl,totalticketslbl,totalpricelbl,line1Label_1,lblAmountPaid,amountpaidlbl,lblBalance,ballbl;
	private Dimension dim;
	public String des, cost,currentDate;
	public Double newtotal;
	DecimalFormat formatter =  new DecimalFormat("#0.00");
	private JLabel platans;
	
	public Receipt(String des , String cost , Integer b , String payment , Integer c,String membership,Integer d,String newcost,Double amount,String plat1) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 685);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dim = Toolkit.getDefaultToolkit().getScreenSize();
	    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); 
		
	     
	    Calendar cals = Calendar.getInstance();
	    DateFormat Date = DateFormat.getDateInstance();
	    currentDate = Date.format(cals.getTime());
	    
	     
	     
	     
		TrainReceiptLabel = new JLabel("Train Receipt");
		TrainReceiptLabel.setEnabled(false);
		TrainReceiptLabel.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 45));
		TrainReceiptLabel.setBounds(213, 0, 391, 54);
		contentPane.add(TrainReceiptLabel);
		
		groupNameLabel = new JLabel("swchaeyo.0l");
		groupNameLabel.setForeground(Color.LIGHT_GRAY);
		groupNameLabel.setFont(new Font("Ravie", Font.PLAIN, 10));
		groupNameLabel.setBounds(470, 40, 89, 26);
		contentPane.add(groupNameLabel);
		
		dateAndDayLabel = new JLabel(""+cals.getTime());
		dateAndDayLabel.setForeground(new Color(255, 255, 255));
		dateAndDayLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dateAndDayLabel.setBounds(10, 99, 222, 13);
		contentPane.add(dateAndDayLabel);
		
		totalTicketLabel = new JLabel("Total tickets :");
		totalTicketLabel.setFont(new Font("Century Gothic", Font.BOLD, 40));
		totalTicketLabel.setForeground(new Color(255, 255, 255));
		totalTicketLabel.setBounds(137, 313, 251, 50);
		contentPane.add(totalTicketLabel);
		
		totalPriceLabel = new JLabel("Total Price :");
		totalPriceLabel.setFont(new Font("Century Gothic", Font.BOLD, 40));
		totalPriceLabel.setForeground(new Color(255, 255, 255));
		totalPriceLabel.setBounds(167, 362, 251, 50);
		contentPane.add(totalPriceLabel);
		
		copyrightLabel = new JLabel("COPYRIGHT TRAIN TICKETING SYSTEM\r\n\r\n");
		copyrightLabel.setForeground(Color.LIGHT_GRAY);
		copyrightLabel.setFont(new Font("Juice ITC", Font.PLAIN, 17));
		copyrightLabel.setBounds(0, 568, 192, 19);
		contentPane.add(copyrightLabel);
		
		producedbyLabel = new JLabel("PRODUCED BY DIDI, NADRAH, AIN, APAN\r\n\r\n\r\n");
		producedbyLabel.setForeground(Color.LIGHT_GRAY);
		producedbyLabel.setFont(new Font("Juice ITC", Font.PLAIN, 17));
		producedbyLabel.setBounds(0, 585, 210, 13);
		contentPane.add(producedbyLabel);
		
		supportedbyLabel = new JLabel("SUPPORTED BY ECLIPSE AND JAVA\r\n\r\n");
		supportedbyLabel.setForeground(Color.LIGHT_GRAY);
		supportedbyLabel.setFont(new Font("Juice ITC", Font.PLAIN, 17));
		supportedbyLabel.setBounds(0, 598, 192, 13);
		contentPane.add(supportedbyLabel);
		
		masteredbyLabel = new JLabel("MASTERED BY MADAM NAJWA\r\n");
		masteredbyLabel.setForeground(Color.LIGHT_GRAY);
		masteredbyLabel.setFont(new Font("Juice ITC", Font.PLAIN, 17));
		masteredbyLabel.setBounds(0, 609, 192, 13);
		contentPane.add(masteredbyLabel);
		
		ticketreceiptbyLabel = new JLabel("TICKET RECEIPT BY ECLIPSEID FOR JAVA DEVELOPERS 2022\r\n"); 
		ticketreceiptbyLabel.setForeground(Color.LIGHT_GRAY);
		ticketreceiptbyLabel.setFont(new Font("Juice ITC", Font.PLAIN, 17));
		ticketreceiptbyLabel.setBounds(0, 622, 271, 13);
		contentPane.add(ticketreceiptbyLabel);
		
		eclipseIdLabel = new JLabel("@ECLIPSEID\r\n");
		eclipseIdLabel.setForeground(Color.LIGHT_GRAY);
		eclipseIdLabel.setFont(new Font("Juice ITC", Font.PLAIN, 17));
		eclipseIdLabel.setBounds(0, 633, 127, 13);
		contentPane.add(eclipseIdLabel);
		
		line1Label = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
		line1Label.setFont(new Font("Tahoma", Font.BOLD, 11));
		line1Label.setForeground(new Color(255, 255, 255));
		line1Label.setBounds(0, 113, 883, 13);
		contentPane.add(line1Label);
		
		membershipLabel = new JLabel("MEMBERSHIP STATUS :");
		membershipLabel.setForeground(new Color(255, 255, 255));
		membershipLabel.setFont(new Font("Century Gothic", Font.BOLD, 35));
		membershipLabel.setBounds(31, 268, 372, 48);
		contentPane.add(membershipLabel);
		
		destinationLabel = new JLabel("DESTINATION :\r\n");
		destinationLabel.setForeground(Color.WHITE);
		destinationLabel.setFont(new Font("Century Gothic", Font.BOLD, 35));
		destinationLabel.setBounds(149, 123, 293, 59);
		contentPane.add(destinationLabel);
		
		categoryLabel = new JLabel("CATEGORY :");
		categoryLabel.setForeground(Color.WHITE);
		categoryLabel.setFont(new Font("Century Gothic", Font.BOLD, 35));
		categoryLabel.setBounds(182, 172, 271, 42);
		contentPane.add(categoryLabel);
		
		payUsingLabel = new JLabel("PAYMENT\r\n");
		payUsingLabel.setForeground(Color.WHITE);
		payUsingLabel.setFont(new Font("Century Gothic", Font.BOLD, 35));
		payUsingLabel.setBounds(53, 225, 169, 32);
		contentPane.add(payUsingLabel);
		
		methodUsingLabel = new JLabel("METHOD :\r\n");
		methodUsingLabel.setForeground(Color.WHITE);
		methodUsingLabel.setFont(new Font("Century Gothic", Font.BOLD, 35));
		methodUsingLabel.setBounds(225, 225, 163, 32);
		contentPane.add(methodUsingLabel);
		
		destinationlbl = new JLabel(""+des);
		destinationlbl.setForeground(new Color(255, 255, 255));
		destinationlbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30)); 
		destinationlbl.setBounds(398, 132, 412, 42);
		contentPane.add(destinationlbl);
		
		ctgorylbl = new JLabel(""+b +" ADULT" + " " + c +" KIDS");
		ctgorylbl.setForeground(Color.WHITE);
		ctgorylbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		ctgorylbl.setBounds(398, 173, 332, 42);
		contentPane.add(ctgorylbl);
		
		pymentlbl = new JLabel(""+payment);
		pymentlbl.setForeground(Color.WHITE);
		pymentlbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		pymentlbl.setBounds(398, 215, 404, 54);
		contentPane.add(pymentlbl);
		
		mmbrlbl = new JLabel("" +membership);
		mmbrlbl.setForeground(Color.WHITE);
		mmbrlbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		mmbrlbl.setBounds(398, 272, 235, 42);
		contentPane.add(mmbrlbl);
		
		totalticketslbl = new JLabel(""+d);
		totalticketslbl.setForeground(Color.WHITE);
		totalticketslbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 35));
		totalticketslbl.setBounds(398, 318, 235, 42);
		contentPane.add(totalticketslbl);
		
		totalpricelbl = new JLabel("RM"+cost);
		totalpricelbl.setForeground(Color.WHITE);
		totalpricelbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		totalpricelbl.setBounds(398, 369, 235, 42);
		contentPane.add(totalpricelbl);
		
		line1Label_1 = new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
		line1Label_1.setForeground(Color.WHITE);
		line1Label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		line1Label_1.setBounds(0, 554, 895, 13);
		contentPane.add(line1Label_1);
		
		lblAmountPaid = new JLabel("Amount Paid :");
		lblAmountPaid.setForeground(Color.WHITE);
		lblAmountPaid.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblAmountPaid.setBounds(115, 412, 286, 50);
		contentPane.add(lblAmountPaid);
		
		amountpaidlbl = new JLabel("RM"+amount);
		amountpaidlbl.setForeground(Color.WHITE);
		amountpaidlbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		amountpaidlbl.setBounds(398, 419, 235, 42);
		contentPane.add(amountpaidlbl);
		
		lblBalance = new JLabel("Balance :");
		lblBalance.setForeground(Color.WHITE);
		lblBalance.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblBalance.setBounds(202, 460, 201, 50);
		contentPane.add(lblBalance);
		
		ballbl = new JLabel("RM"+newcost);
		ballbl.setForeground(Color.WHITE);
		ballbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		ballbl.setBounds(398, 467, 235, 42);
		contentPane.add(ballbl);
		
		JButton endbtn = new JButton("END");
		endbtn.setFont(new Font("Century Gothic", Font.PLAIN, 33));
		endbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TrainDeparture t = new TrainDeparture();
				t.show();
				System.exit(ABORT);
				
				
			}
		});
		endbtn.setBounds(662, 568, 192, 58);
		contentPane.add(endbtn);
		
		JLabel platlbl = new JLabel("Plat :");
		platlbl.setForeground(Color.WHITE);
		platlbl.setFont(new Font("Century Gothic", Font.BOLD, 40));
		platlbl.setBounds(293, 505, 107, 50);
		contentPane.add(platlbl);
		
		platans = new JLabel(""+plat1);
		platans.setForeground(Color.WHITE);
		platans.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 35));
		platans.setBounds(398, 507, 235, 48);
		contentPane.add(platans);

	
	
		
		
	}
}

