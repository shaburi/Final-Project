import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.border.EmptyBorder;
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
    private JLabel destinationlabel, lblCategory, adultLabel, childLabel, lblMembership, Pricelabel,imgLabel;
    private JPanel contentPane;
    private JComboBox<String> comboBox;
    private JSpinner kidspinner, adultspinner;
    private JButton TotalButton , btnReset ;
    private JRadioButton YesBtn, NoBtn;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    protected JTextField Pricetxt;
    private JButton NextButton;
    public String cost , membership , adultstring , kidstring , dname , destination , des;
    public double price,total;
    private Dimension dim;
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
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        Image payment = new ImageIcon(this.getClass().getResource("/pay.png")).getImage();
      
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        destinationlabel = new JLabel("Destination");
        destinationlabel.setForeground(Color.WHITE);
        destinationlabel.setFont(new Font("Century Gothic", Font.BOLD, 50));
        destinationlabel.setBounds(55, 38, 448, 49);
        contentPane.add(destinationlabel);


        
        
        String[]places = {"WILAYAH PERSEKETUAN","JOHOR","PULAU PINANG","KELANTAN","MELAKA","PERAK","TERENGGANU","NEGERI SEMBILAN","KEDAH","PAHANG","SELANGOR","PERLIS"};
        comboBox = new JComboBox(places);
        comboBox.insertItemAt("---ENTER YOUR DESTINATION---", 0);
        comboBox.setSelectedIndex(0);
        comboBox.setBounds(55, 99, 294, 23);
        contentPane.add(comboBox);


        lblCategory = new JLabel("Category");
        lblCategory.setForeground(Color.WHITE);
        lblCategory.setFont(new Font("Century Gothic", Font.BOLD, 50));
        lblCategory.setBounds(55, 168, 255, 62);
        contentPane.add(lblCategory);
        
        SpinnerModel model = new SpinnerNumberModel(0, 0, 100, 1);
        adultspinner = new JSpinner(model);
        adultspinner.setForeground(Color.CYAN);
        adultspinner.setBounds(200, 241, 84, 32);
        contentPane.add(adultspinner);
        
        SpinnerModel model1 = new SpinnerNumberModel(0, 0, 100, 1);
        kidspinner = new JSpinner(model1);
        kidspinner.setBackground(Color.CYAN);
        kidspinner.setBounds(200, 284, 84, 32);
        contentPane.add(kidspinner);
      
        adultLabel = new JLabel("ADULT");
        adultLabel.setForeground(Color.CYAN);
        adultLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
        adultLabel.setBounds(55, 241, 90, 32);
        contentPane.add(adultLabel);

        childLabel = new JLabel("CHILDREN");
        childLabel.setForeground(Color.CYAN);
        childLabel.setFont(new Font("Century Gothic", Font.PLAIN, 26));
        childLabel.setBounds(55, 282, 125, 32);
        contentPane.add(childLabel);


        lblMembership = new JLabel("MEMBERSHIP");
        lblMembership.setForeground(Color.WHITE);
        lblMembership.setFont(new Font("Century Gothic", Font.BOLD, 50));
        lblMembership.setBounds(55, 325, 334, 62);
        contentPane.add(lblMembership);

        Pricelabel = new JLabel("PRICE");
        Pricelabel.setForeground(Color.WHITE);
        Pricelabel.setFont(new Font("Century Gothic", Font.BOLD, 50));
        Pricelabel.setBounds(707, 38, 153, 49);
        contentPane.add(Pricelabel);

        TotalButton = new JButton("TOTAL");
        TotalButton.setBackground(Color.LIGHT_GRAY);
        TotalButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        TotalButton.setBounds(176, 442, 173, 49);
        contentPane.add(TotalButton);
                
        Pricetxt = new JTextField();
        Pricetxt.setBounds(631, 98, 294, 89);
        contentPane.add(Pricetxt);
        Pricetxt.setBackground(Color.WHITE);
        Pricetxt.setFont(new Font("Dubai Light", Font.PLAIN, 50));
        Pricetxt.setColumns(10);
                        
        YesBtn = new JRadioButton("Yes");
        YesBtn.setForeground(Color.CYAN);
        YesBtn.setBackground(Color.BLACK);
        YesBtn.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        buttonGroup.add(YesBtn);
        YesBtn.setBounds(55, 399, 109, 23);
        contentPane.add(YesBtn);
                        
        NoBtn = new JRadioButton("No");
        NoBtn.setForeground(Color.CYAN);
        NoBtn.setBackground(Color.BLACK);
        NoBtn.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        buttonGroup.add(NoBtn);
        NoBtn.setBounds(189, 399, 109, 23);
        contentPane.add(NoBtn);
                        
        btnReset = new JButton("RESET");
        btnReset.setBackground(Color.LIGHT_GRAY);
        btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnReset.setBounds(48, 442, 125, 49);
        contentPane.add(btnReset);
        
        NextButton = new JButton("NEXT");
        NextButton.setIcon(new ImageIcon(Order.class.getResource("/payment.png")));
        NextButton.setForeground(Color.BLACK);
        NextButton.setBackground(Color.WHITE);
        NextButton.setFont(new Font("Century Gothic", Font.BOLD, 28));
        NextButton.setBounds(631, 421, 294, 70);
        contentPane.add(NextButton);
      
        
        

        TotalButton.addActionListener(this);
        btnReset.addActionListener(this);
        NextButton.addActionListener(this);
        YesBtn.addActionListener(this);
        NoBtn.addActionListener(this);
        comboBox.addActionListener(this);
    }
    
    
       
    	
	

		@Override
		public void actionPerformed(ActionEvent e) {
			int adult1;  
			int kid1;
			double newtotal;
			adult1 = (int) adultspinner.getValue();
			kid1 = (int) kidspinner.getValue();
			String des = (String)comboBox.getSelectedItem();
			Integer b = (Integer)adultspinner.getValue();
			Integer c = (Integer)kidspinner.getValue();
			Integer d = (Integer)adultspinner.getValue() +  (Integer)kidspinner.getValue();
		
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
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("---ENTER YOUR DESTINATION---")){
									JOptionPane.showMessageDialog(null, "Please Enter The Your Destination", "ERROR!", JOptionPane.ERROR_MESSAGE);
									return;

									
								}
								else if(((String)comboBox.getSelectedItem()).equals("JOHOR")){
									price = 50;
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PULAU PINANG")){
									price = 25;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("KELANTAN")){
									price = 60;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("MELAKA")){
									price = 40;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PERAK")){
									price = 40;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("TERENGGANU")){
									price = 65;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("NEGERI SEMBILAN")){
									price = 30;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("KEDAH")){
									price = 70;
								
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PAHANG")){
									price = 35;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("SELANGOR")){
									price = 20;
									
									
								}
								else if(((String)comboBox.getSelectedItem()).equals("PERLIS")){
									price = 90;
									
									
								}
								
								
								
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
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("JOHOR")){
							price = 50;
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("PULAU PINANG")){
							price = 25;
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("KELANTAN")){
							price = 60;
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("MELAKA")){
							price = 40;
						
						}
						else if(((String)comboBox.getSelectedItem()).equals("PERAK")){
							price = 40;
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("TERENGGANU")){
							price = 65;
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("NEGERI SEMBILAN")){
							price = 30;
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("KEDAH")){
							price = 70;
						
						}
						else if(((String)comboBox.getSelectedItem()).equals("PAHANG")){
							price = 35;
							
						}
						else if(((String)comboBox.getSelectedItem()).equals("SELANGOR")){
							price = 20;
						
						}
						else if(((String)comboBox.getSelectedItem()).equals("PERLIS")){
							price = 90;
							
						}
							
							
							
					total = (adult1*15)+(kid1*5)+price;
					cost = String.valueOf(formatter.format(total));
					Pricetxt.setText("RM"+cost);
							
					
					}
				
				
				}
			
		
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
					
				Pay jf1 = new Pay(des,cost,b,c,membership,d,total);
				jf1.show();
				
				
				
		
				
			}
			}
		}


   