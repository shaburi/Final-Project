import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import javax.swing.*;

public class Order extends JFrame implements ActionListener {
    private JLabel destinationlabel, lblCategory, adultLabel, childLabel, lblMembership, Pricelabel,imgLabel , headerlbl;
    private JPanel contentPane , hdrpnl;
    private JComboBox<String> comboBox;
    private JSpinner kidspinner, adultspinner;
    private JButton TotalButton , btnReset ;
    private JRadioButton YesBtn, NoBtn;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    protected JTextField Pricetxt;
    private JButton NextButton;
    public String cost , membership , adultstring , kidstring , dname , destination , des ,plat1 , time;
    public int plat;
    public double price,total;
    private Dimension dim;
    private JTextArea textArea , textArea_1;
    public SpinnerModel model,model1;
    DecimalFormat formatter =  new DecimalFormat("#0.00");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Order frame = new Order();
                    frame.setVisible(true);
                    new Choice();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Order() {
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1040, 575);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 128));
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        Image payment = new ImageIcon(this.getClass().getResource("/pay.png")).getImage();
      
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        //JLABEL FOR DESTINATION
        destinationlabel = new JLabel("Destination.");
        destinationlabel.setBackground(new Color(255, 255, 255));
        destinationlabel.setForeground(new Color(255, 255, 255));
        destinationlabel.setFont(new Font("Century Gothic", Font.BOLD, 50));
        destinationlabel.setBounds(71, 90, 448, 49);
        contentPane.add(destinationlabel);


        
        //COMBOBOX TO CHOOSE DESTINATION
        String[]places = {"WILAYAH PERSEKETUAN","JOHOR","PULAU PINANG","KELANTAN","MELAKA","PERAK","TERENGGANU","NEGERI SEMBILAN","KEDAH","PAHANG","SELANGOR","PERLIS"};
        int[] prices = {1,2,3,4,5,6,7,7,8,9,10};
        comboBox = new JComboBox(places);
        comboBox.setBackground(Color.WHITE);
        comboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        comboBox.insertItemAt("---ENTER YOUR DESTINATION---", 0);
        comboBox.setSelectedIndex(0);
        comboBox.setBounds(82, 150, 294, 23);
        contentPane.add(comboBox);

        //KLABEL FOR CATEGORY
        lblCategory = new JLabel("Category.");
        lblCategory.setForeground(new Color(255, 255, 255));
        lblCategory.setFont(new Font("Century Gothic", Font.BOLD, 50));
        lblCategory.setBounds(71, 225, 255, 62);
        contentPane.add(lblCategory);
        
        //SPINNER TO CHOOSE HOW MANY ADULT
        SpinnerModel model = new SpinnerNumberModel(0, 0, 100, 1);
        adultspinner = new JSpinner(model);
        adultspinner.setForeground(Color.CYAN);
        adultspinner.setBounds(259, 298, 84, 32);
        contentPane.add(adultspinner);
        
        //SPINNER TO CHOOSE HOW MANY CHILDREN
        SpinnerModel model1 = new SpinnerNumberModel(0, 0, 100, 1);
        kidspinner = new JSpinner(model1);
        kidspinner.setBackground(Color.CYAN);
        kidspinner.setBounds(259, 341, 84, 32);
        contentPane.add(kidspinner);
      
        //JLABEL FOR ADULT
        adultLabel = new JLabel("ADULT (RM15)");
        adultLabel.setForeground(new Color(255, 255, 255));
        adultLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
        adultLabel.setBounds(57, 298, 185, 32);
        contentPane.add(adultLabel);
        
        //JLABEL FOR CHILDREN
        childLabel = new JLabel("CHILDREN (RM5)");
        childLabel.setForeground(new Color(255, 255, 255));
        childLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
        childLabel.setBounds(27, 341, 221, 32);
        contentPane.add(childLabel);

        //JLABEL FOR MEMBERSHIP
        lblMembership = new JLabel("MEMBERSHIP.");
        lblMembership.setForeground(new Color(255, 255, 255));
        lblMembership.setFont(new Font("Century Gothic", Font.BOLD, 50));
        lblMembership.setBounds(71, 384, 334, 62);
        contentPane.add(lblMembership);

        //JLABEL FOR PRICE
        Pricelabel = new JLabel("PRICE: ");
        Pricelabel.setForeground(new Color(255, 255, 255));
        Pricelabel.setFont(new Font("Century Gothic", Font.BOLD, 50));
        Pricelabel.setBounds(536, 122, 184, 49);
        contentPane.add(Pricelabel);
        
        //JBUTTON TO GET TOTAL COST	
        TotalButton = new JButton("TOTAL");
        TotalButton.setBackground(Color.LIGHT_GRAY);
        TotalButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        TotalButton.setBounds(834, 200, 130, 32);
        contentPane.add(TotalButton);
               
        //JTEXTFIELD TO GET TOTAL COST
        Pricetxt = new JTextField();
        Pricetxt.setBounds(718, 114, 220, 64);
        contentPane.add(Pricetxt);
        Pricetxt.setBackground(Color.WHITE);
        Pricetxt.setFont(new Font("Dubai Light", Font.PLAIN, 50));
        Pricetxt.setColumns(10);
               
        //JRADIOBUTTON TO DETERMINE YOU HAVE MEMBERSHIP
        YesBtn = new JRadioButton("Yes");
        YesBtn.setForeground(new Color(0, 0, 0));
        YesBtn.setBackground(new Color(255, 255, 255));
        YesBtn.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        buttonGroup.add(YesBtn);
        YesBtn.setBounds(108, 453, 109, 23);
        contentPane.add(YesBtn);
             
        //JRADIOBUTTON TO DETERMINE YOU HAVE NO MEMBERSHIP
        NoBtn = new JRadioButton("No");
        NoBtn.setForeground(new Color(0, 0, 0));
        NoBtn.setBackground(new Color(255, 255, 255));
        NoBtn.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        buttonGroup.add(NoBtn);
        NoBtn.setBounds(246, 453, 109, 23);
        contentPane.add(NoBtn);
              
        //JBUTTON TO RESET YOUR ORDER
        btnReset = new JButton("RESET");
        btnReset.setBackground(Color.LIGHT_GRAY);
        btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnReset.setBounds(699, 200, 125, 32);
        contentPane.add(btnReset);
        
        //JBUTTON TO GO TO THE NEXT FRAME
        NextButton = new JButton("NEXT");
        NextButton.setIcon(new ImageIcon(Order.class.getResource("/payment.png")));
        NextButton.setForeground(Color.BLACK);
        NextButton.setBackground(Color.WHITE);
        NextButton.setFont(new Font("Century Gothic", Font.BOLD, 28));
        NextButton.setBounds(716, 414, 248, 62);
        contentPane.add(NextButton);
        
        
        hdrpnl = new JPanel();
        hdrpnl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        hdrpnl.setBackground(new Color(204, 204, 255));
        hdrpnl.setBounds(0, 0, 1047, 62);
        contentPane.add(hdrpnl);
        hdrpnl.setLayout(null);
        
        
        headerlbl = new JLabel("Book Your Ticket Now!");
        headerlbl.setForeground(new Color(0, 0, 0));
        headerlbl.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 30));
        headerlbl.setBounds(33, 11, 411, 40);
        hdrpnl.add(headerlbl);
        
      
      
        
        

        TotalButton.addActionListener(this);
        btnReset.addActionListener(this);
        NextButton.addActionListener(this);
        YesBtn.addActionListener(this);
        NoBtn.addActionListener(this);
        comboBox.addActionListener(this);
    }
    
    
       
    	
	

		@Override
		public void actionPerformed(ActionEvent e) {
			String placez;
			int adult1;  
			int kid1;
			double newtotal;
			adult1 = (int) adultspinner.getValue();
			kid1 = (int) kidspinner.getValue();
			String des = (String)comboBox.getSelectedItem();
			Integer b = (Integer)adultspinner.getValue();
			Integer c = (Integer)kidspinner.getValue();
			Integer d = (Integer)adultspinner.getValue() +  (Integer)kidspinner.getValue();
			plat1 = String.valueOf(plat);
		
			//ERROR MESSAGE
			if(e.getSource() == TotalButton) {
				if(buttonGroup.isSelected(null))
				{
					JOptionPane.showMessageDialog(null, "Please Tell us if you have a membership or not!", "ERROR!", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(YesBtn.isSelected())
				{
					membership = "YES";
						
							
								if (((String)comboBox.getSelectedItem()).equals("WILAYAH PERSEKETUAN")){
									price = 15;
									plat = 1;
									time = "6:30AM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("---ENTER YOUR DESTINATION---")){
									JOptionPane.showMessageDialog(null, "Please Enter The Your Destination", "ERROR!", JOptionPane.ERROR_MESSAGE);
									return;

									
								}
								else if(((String)comboBox.getSelectedItem()).equals("JOHOR")){
									price = 50;
									plat = 1;
									time = "8:00 AM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PULAU PINANG")){
									price = 25;
									plat = 6;
									time = "9:30 AM";
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("KELANTAN")){
									price = 60;
									plat = 1;
									time = "11:00 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("MELAKA")){
									price = 40;
									plat = 3;
									time = "12:30 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PERAK")){
									price = 40;
									plat = 1;
									time = "2:00 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("TERENGGANU")){
									price = 65;
									plat = 6;
									time = "3:30 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("NEGERI SEMBILAN")){
									price = 30;
									plat = 2;
									time = "5:00 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("KEDAH")){
									price = 70;
									plat = 1;
									time = "6:30 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PAHANG")){
									price = 35;
									plat = 8;
									time = "8:00 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("SELANGOR")){
									price = 20;
									plat = 9;
									time = "9:30 PM";
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PERLIS")){
									price = 90;
									plat = 1;
									time = "11:00 PM";
									
									
								}
								
					//GET TOTAL COST WITH DISCOUNT
					newtotal = (adult1*15)+(kid1*5);
					total = (newtotal*90/100)+price;
					cost = String.valueOf(formatter.format(total));
					Pricetxt.setText("RM"+cost);
					
					
					
				
				
				}
					else if(NoBtn.isSelected())
				{
					
					membership = "NO";	
						
					if (((String)comboBox.getSelectedItem()).equals("WILAYAH PERSEKETUAN")){
						price = 15;
						plat = 1;
						time = "6:30AM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("---ENTER YOUR DESTINATION---")){
						JOptionPane.showMessageDialog(null, "Please Enter The Your Destination", "ERROR!", JOptionPane.ERROR_MESSAGE);
						return;

						
					}
					else if(((String)comboBox.getSelectedItem()).equals("JOHOR")){
						price = 50;
						plat = 1;
						time = "8:00 AM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("PULAU PINANG")){
						price = 25;
						plat = 6;
						time = "9:30 AM";
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("KELANTAN")){
						price = 60;
						plat = 1;
						time = "11:00 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("MELAKA")){
						price = 40;
						plat = 3;
						time = "12:30 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("PERAK")){
						price = 40;
						plat = 1;
						time = "2:00 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("TERENGGANU")){
						price = 65;
						plat = 6;
						time = "3:30 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("NEGERI SEMBILAN")){
						price = 30;
						plat = 2;
						time = "5:00 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("KEDAH")){
						price = 70;
						plat = 1;
						time = "6:30 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("PAHANG")){
						price = 35;
						plat = 8;
						time = "8:00 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("SELANGOR")){
						price = 20;
						plat = 9;
						time = "9:30 PM";
						
						
					}
					else if(((String)comboBox.getSelectedItem()).equals("PERLIS")){
						price = 90;
						plat = 1;
						time = "11:00 PM";
						
						
					}
							
							
					//GET TOTAL COST WITH DISCOUNT		
					total = (adult1*15)+(kid1*5)+price;
					cost = String.valueOf(formatter.format(total));
					Pricetxt.setText("RM"+cost);
							
				
					
					}
				}
			
		           //RESET YOUR ORDER
					else if(e.getSource() == btnReset)
					{
						buttonGroup.clearSelection();
						Pricetxt.setText("");
						comboBox.setSelectedIndex(0);
						adultspinner.setValue(0);
						kidspinner.setValue(0);
					}
				else if(e.getSource()==NextButton)
			{
					
				Pay jf1 = new Pay(des,cost,b,c,membership,d,total,plat1,time);
				jf1.show();
				
				
				
		
				
			}
			}
		}