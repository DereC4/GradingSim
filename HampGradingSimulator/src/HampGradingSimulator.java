import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class HampGradingSimulator extends JFrame
{
	private JPanel welcome;
	private JLabel to, summoners;

	public HampGradingSimulator()
	{
		int rift;
		String idk;
		
		super.setName("Hamp Grading Simulator");
		super.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		welcome = new JPanel();
		welcome.setBorder(new EmptyBorder(9, 9, 9, 9));
		setContentPane(welcome);
		welcome.setLayout(null);
		
		JButton but = new JButton("Get dat LiT essay grade!");
		but.setFont(new Font("Arial", Font.BOLD, 30));
		but.setBounds(10, 196, 414, 54);
		welcome.add(but);
		
		to = new JLabel();
		to.setFont(new Font("Arial", Font.PLAIN, 70));
		to.setHorizontalAlignment(SwingConstants.CENTER);
		to.setBounds(10, 11, 414, 103);
		welcome.add(to);
		summoners = new JLabel("Hamp Grading Simulator");
		summoners.setFont(new Font("Arial", Font.PLAIN, 35));
		summoners.setHorizontalAlignment(SwingConstants.CENTER);
		summoners.setBounds(10, 50, 414, 103);
		welcome.add(summoners);
		
		rift = (int) Math.floor(Math.random() * (11) + 90);
//		System.out.println(x);
		idk = String.valueOf(rift);
		to.setText(idk);
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int x = (int) Math.floor(Math.random() * (11) + 90);
//				System.out.println(x);
				String strX = String.valueOf(x);
				to.setText(strX);
			}
		});
	}
	 
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
					HampGradingSimulator frame = new HampGradingSimulator();
					frame.setVisible(true);
			}
		});
	}
}