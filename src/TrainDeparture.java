import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.util.Date;

public class TrainDeparture extends JFrame implements ActionListener  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private final JLabel timelabel= new JLabel();
    private final DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainDeparture frame = new TrainDeparture();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		SwingUtilities.invokeLater(() -> new TrainDeparture().setVisible(true));
	}

	/**
	 * Create the frame.
	 */
	public TrainDeparture() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Departure");
		contentPane.setLayout(null);
		setBounds(100, 100, 780, 630);
		setResizable(false);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon(this.getClass().getResource("/trainfront.png")).getImage());
        new Timer(500, this).start();

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 205));
		panel.setBounds(0, 0, 765, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//JLABEL FOR DESTINATION AVAILABLE
		JLabel lblDestination = new JLabel("DESTINATION");
		lblDestination.setForeground(Color.WHITE);
		lblDestination.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblDestination.setBounds(172, 61, 123, 19);
		panel.add(lblDestination);
		
		//JLABEL FOR PLAT
		JLabel lblPlat = new JLabel("PLAT");
		lblPlat.setForeground(Color.WHITE);
		lblPlat.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblPlat.setBounds(358, 61, 49, 19);
		panel.add(lblPlat);
		
		//JLABEL FOR TIME EXPECTED
		JLabel lblExpetation = new JLabel("EXPECTED");
		lblExpetation.setForeground(Color.WHITE);
		lblExpetation.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblExpetation.setBounds(475, 61, 95, 19);
		panel.add(lblExpetation);
		
		//JLABEL FOR TRAIN DEPARTURE
		JLabel lblDeparture = new JLabel("DEPARTURE");
		lblDeparture.setBounds(10, 18, 143, 19);
		panel.add(lblDeparture);
		lblDeparture.setForeground(Color.WHITE);
		lblDeparture.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		//JLABEL FOR TRAIN TIME
		JLabel lblNewLabel = new JLabel("TIME");
		lblNewLabel.setBounds(30, 61, 49, 19);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		timelabel.setBounds(154, 18, 337, 19);
		panel.add(timelabel);
		
		//TO GET TIME
		timelabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		timelabel.setForeground(new Color(255, 255, 255));
		
		//JLABEL FOR ICON
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(693, 2, 72, 78);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(WelcomeScreen.class.getResource("/clock1.png")));
		
		//JLABEL FOR PRICE
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblPrice.setBounds(625, 61, 58, 19);
		panel.add(lblPrice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 205));
		panel_1.setBounds(0, 543, 765, 51);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//JBUTTON TO BUY TICKET
		JButton btnNewButton = new JButton("BUY TICKET");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				 if(e.getSource()==btnNewButton) {
					 
					 Order jf5 = new Order();
					 jf5.show();
						
						
					
					 
		
				//	
				//
			    //
				}
				
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnNewButton.setIcon(new ImageIcon(TrainDeparture.class.getResource("/add-icon.png")));
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(293, 0, 190, 51);
		panel_1.add(btnNewButton);
		
		//JLABEL FOR TIME AND DESTINATIONS
		JLabel lblDestination1 = new JLabel("6:30 AM             WILAYAH PERSEKUTUAN ");
		lblDestination1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination1.setForeground(Color.WHITE);
		lblDestination1.setBounds(25, 99, 351, 27);
		contentPane.add(lblDestination1);
		
		JLabel lblDestination2 = new JLabel("8:00 AM             JOHOR\r\n");
		lblDestination2.setForeground(Color.WHITE);
		lblDestination2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination2.setBounds(25, 136, 351, 27);
		contentPane.add(lblDestination2);
		
		JLabel lblDestination3 = new JLabel("9:30 AM             PULAU PINANG");
		lblDestination3.setForeground(Color.WHITE);
		lblDestination3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination3.setBounds(25, 173, 351, 27);
		contentPane.add(lblDestination3);
		
		JLabel lblDestination4 = new JLabel("11:00 PM           KELANTAN");
		lblDestination4.setForeground(Color.WHITE);
		lblDestination4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination4.setBounds(25, 210, 351, 27);
		contentPane.add(lblDestination4);
		
		JLabel lblDestination5 = new JLabel("12:30 PM           MELAKA");
		lblDestination5.setForeground(Color.WHITE);
		lblDestination5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination5.setBounds(25, 247, 351, 27);
		contentPane.add(lblDestination5);
		
		JLabel lblDestination6 = new JLabel("2:00 PM             PERAK");
		lblDestination6.setForeground(Color.WHITE);
		lblDestination6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination6.setBounds(25, 284, 351, 27);
		contentPane.add(lblDestination6);
		
		JLabel lblDestination7 = new JLabel("3:30 PM             TERENGGANU");
		lblDestination7.setForeground(Color.WHITE);
		lblDestination7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination7.setBounds(25, 321, 351, 27);
		contentPane.add(lblDestination7);
		
		JLabel lblDestination8 = new JLabel("5:00 PM             NEGERI SEMBILAN");
		lblDestination8.setBounds(25, 358, 351, 27);
		contentPane.add(lblDestination8);
		lblDestination8.setForeground(Color.WHITE);
		lblDestination8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		JLabel lblDestination9 = new JLabel("6:30 PM             KEDAH");
		lblDestination9.setBounds(25, 395, 351, 27);
		contentPane.add(lblDestination9);
		lblDestination9.setForeground(Color.WHITE);
		lblDestination9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		
		JLabel lblDestination10 = new JLabel("8:00 PM             PAHANG");
		lblDestination10.setForeground(Color.WHITE);
		lblDestination10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination10.setBounds(25, 432, 351, 27);
		contentPane.add(lblDestination10);
		
		JLabel lblDestination11 = new JLabel("9:30 PM             SELANGOR");
		lblDestination11.setForeground(Color.WHITE);
		lblDestination11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDestination11.setBounds(25, 469, 351, 27);
		contentPane.add(lblDestination11);
		
		JLabel lblDestination12 = new JLabel("11:00 PM           PERLIS");
		lblDestination12.setBounds(25, 506, 351, 27);
		contentPane.add(lblDestination12);
		lblDestination12.setForeground(Color.WHITE);
	 	lblDestination12.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	
	 	//JLABEL FOR TIME
	 	JLabel lblP1 = new JLabel("1                          ON TIME                 RM15.00");
	 	lblP1.setForeground(Color.WHITE);
	 	lblP1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1.setBounds(372, 99, 384, 27);
	 	contentPane.add(lblP1);
	 	
	 	JLabel lblP1_1 = new JLabel("1                          ON TIME                 RM50.00");
	 	lblP1_1.setForeground(Color.WHITE);
	 	lblP1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_1.setBounds(372, 136, 384, 27);
	 	contentPane.add(lblP1_1);
	 	
	 	JLabel lblP1_2 = new JLabel("6                          ON TIME                 RM25.00");
	 	lblP1_2.setForeground(Color.WHITE);
	 	lblP1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_2.setBounds(372, 173, 384, 27);
	 	contentPane.add(lblP1_2);
	 	
	 	JLabel lblP1_3 = new JLabel("1                          ON TIME                 RM60.00");
	 	lblP1_3.setForeground(Color.WHITE);
	 	lblP1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_3.setBounds(372, 210, 384, 27);
	 	contentPane.add(lblP1_3);
	 	
	 	JLabel lblP1_4 = new JLabel("3                          ON TIME                 RM40.00");
	 	lblP1_4.setForeground(Color.WHITE);
	 	lblP1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_4.setBounds(372, 247, 384, 27);
	 	contentPane.add(lblP1_4);
	 	
	 	JLabel lblP1_5 = new JLabel("1                          ON TIME                 RM40.00");
	 	lblP1_5.setForeground(Color.WHITE);
	 	lblP1_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_5.setBounds(372, 284, 384, 27);
	 	contentPane.add(lblP1_5);
	 	
	 	JLabel lblP1_6 = new JLabel("6                          ON TIME                 RM65.00");
	 	lblP1_6.setForeground(Color.WHITE);
	 	lblP1_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_6.setBounds(372, 321, 384, 27);
	 	contentPane.add(lblP1_6);
	 	
	 	JLabel lblP1_7 = new JLabel("2                          ON TIME                 RM30.00");
	 	lblP1_7.setForeground(Color.WHITE);
	 	lblP1_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_7.setBounds(372, 358, 384, 27);
	 	contentPane.add(lblP1_7);
	 	
	 	JLabel lblP1_8 = new JLabel("1                          ON TIME                 RM70.00");
	 	lblP1_8.setForeground(Color.WHITE);
	 	lblP1_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_8.setBounds(372, 395, 384, 27);
	 	contentPane.add(lblP1_8);
	 	
	 	JLabel lblP1_9 = new JLabel("8                          ON TIME                 RM35.00");
	 	lblP1_9.setForeground(Color.WHITE);
	 	lblP1_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_9.setBounds(372, 432, 393, 27);
	 	contentPane.add(lblP1_9);
	 	
	 	JLabel lblP1_10 = new JLabel("9                          ON TIME                 RM20.00");
	 	lblP1_10.setForeground(Color.WHITE);
	 	lblP1_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_10.setBounds(372, 469, 384, 27);
	 	contentPane.add(lblP1_10);
	 	
	 	JLabel lblP1_11 = new JLabel("1                          ON TIME                 RM90.00");
	 	lblP1_11.setForeground(Color.WHITE);
	 	lblP1_11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
	 	lblP1_11.setBounds(372, 506, 384, 27);
	 	contentPane.add(lblP1_11);
	  }
	 public void actionPerformed(ActionEvent event) {
	        timelabel.setText(df.format(new Date()));

	}
}