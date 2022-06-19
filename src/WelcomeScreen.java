import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;


public class WelcomeScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private static TrainDeparture Departure;
	static public TrainDeparture getcashierframe() {
		return Departure;
	}
	public static void main(String[] args) {
		
		
		WelcomeScreen welcomeframe;
		try {
			welcomeframe = new WelcomeScreen();

			welcomeframe.setVisible(true);
			Thread.sleep(2000);
			welcomeframe.progressBar1.setVisible(true);
			welcomeframe.progressBar2.setVisible(true);
			try {
				for (int i = 0; i <= 100; i += 20) //TO SET PROGRESS BAR
				{
					Thread.sleep(250);
					welcomeframe.progressBar1.setValue(i);
					welcomeframe.progressBar2.setValue(i);
					welcomeframe.lblNewLabel_3.setText("Welcome! Starting up " + i + "%");
				}
				Thread.sleep(1000);
				welcomeframe.setVisible(false); //TO OPEN THE NEXT FRAME 'TRAINDEPARTURE'
				Departure = new TrainDeparture();
				Departure.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



		JProgressBar progressBar1 = new JProgressBar();
		JProgressBar progressBar2 = new JProgressBar();
		JLabel lblNewLabel_3 = new JLabel("Welcome!");
		public WelcomeScreen() {
		setResizable(false);
		setUndecorated(true);
		setTitle("Ticket System");
		setBounds(100, 100, 765, 594);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon(this.getClass().getResource("/trainfront.png")).getImage());
		getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 766, 594);
		panel_1.setBackground(new Color(0, 0, 0));
		getContentPane().add(panel_1);

		//JLABEL FOR 'TICKET SYSTEM'
		JLabel lblTicketSystem = new JLabel("TICKET                                              SYSTEM");
		lblTicketSystem.setBounds(100, 269, 625, 89);
		lblTicketSystem.setForeground(Color.WHITE);
		lblTicketSystem.setFont(new Font("Arial", Font.BOLD, 28));

		//JLABEL FOR 'NAME'
		JLabel lblName = new JLabel("Created By : Shaiful Zharfan, Nur Nadrah Hayati ,Nur Ain Izzaty, Wan Haidhir Syaqimi");
		lblName.setBounds(50, 511, 666, 27);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setBounds(726, 0, 40, 594);
		panel.setBackground(new Color(30, 144, 255));
				
						
						GroupLayout gl_panel = new GroupLayout(panel);
						gl_panel.setHorizontalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addContainerGap(26, Short.MAX_VALUE))
						);
						gl_panel.setVerticalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(progressBar1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
						);
						
						//JLABEL FOR RIGHT SIDE PROGRESS BAR
						progressBar1.setOrientation(SwingConstants.VERTICAL);
						progressBar1.setBackground(new Color(30, 144, 255));
						progressBar1.setVisible(false);
						progressBar1.setForeground(new Color(0, 0, 0));
						
						//JLABEL FOR LEFT SIDE PROGRASS BAR
						progressBar2.setOrientation(SwingConstants.VERTICAL);
						progressBar2.setBackground(new Color(30, 144, 255));
						progressBar2.setVisible(false);
						progressBar2.setForeground(new Color(0, 0, 0));
						progressBar2.setBounds(27, 0, 13, 594);
						
						panel.setLayout(gl_panel);
					
						
						
		lblNewLabel_3.setBounds(50, 484, 347, 17);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		
		panel_1.setLayout(null);
		panel_1.add(panel);
		panel_1.add(lblName);
		panel_1.add(lblNewLabel_3);
		panel_1.add(lblTicketSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 40, 594);
		panel_1.add(panel_2);
		panel_2.setBackground(new Color(30, 144, 255));
		panel_2.setLayout(null);
		panel_2.add(progressBar2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(0, 0, 766, 46);
		panel_1.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.CYAN);
		panel_3_1.setBounds(0, 548, 766, 46);
		panel_1.add(panel_3_1);
		
		//JLABEL FOR ICON
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(600, 408, 128, 93);
		panel_1.add(lblIcon);
		lblIcon.setIcon(new ImageIcon(WelcomeScreen.class.getResource("/trainside.png")));
		
		//JLABEL FOR HEADER 'BookYourTrainTicketToday'
		JLabel lblBookYourTrainTicketToday = new JLabel("BOOK YOUR TRAIN TICKET TODAY!");
		lblBookYourTrainTicketToday.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblBookYourTrainTicketToday.setForeground(new Color(255, 255, 255));
		lblBookYourTrainTicketToday.setBounds(108, 56, 566, 66);
		panel_1.add(lblBookYourTrainTicketToday);
		
		//JLABEL FOR LOGO
		JLabel lblLogo = new JLabel("");
		lblLogo.setForeground(Color.WHITE);
		lblLogo.setFont(new Font("Arial", Font.BOLD, 30));
		lblLogo.setBounds(134, 110, 489, 378);
		lblLogo.setIcon(new ImageIcon(WelcomeScreen.class.getResource("/logonew.png")));
		panel_1.add(lblLogo);
	}
}