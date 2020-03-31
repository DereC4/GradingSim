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
	private JPanel jpane;
	private JLabel label, name;

	public HampGradingSimulator()
	{
		int x;
		String strX;
		
		super.setName("Hamp Grading Simulator");
		super.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		jpane = new JPanel();
		jpane.setBorder(new EmptyBorder(9, 9, 9, 9));
		setContentPane(jpane);
		jpane.setLayout(null);
		
		JButton but = new JButton("LiT essay grade!");
		but.setFont(new Font("Arial", Font.BOLD, 40));
		but.setBounds(10, 196, 414, 54);
		jpane.add(but);
		
		label = new JLabel();
		label.setFont(new Font("Arial", Font.PLAIN, 70));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 11, 414, 103);
		jpane.add(label);
		name = new JLabel("Hamp Grading Simulator");
		name.setFont(new Font("Arial", Font.PLAIN, 35));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(10, 50, 414, 103);
		jpane.add(name);
		
		x = (int) Math.floor(Math.random() * (11) + 90);
//		System.out.println(x);
		strX = String.valueOf(x);
		label.setText(strX);
		but.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int x = (int) Math.floor(Math.random() * (11) + 90);
//				System.out.println(x);
				String strX = String.valueOf(x);
				label.setText(strX);
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