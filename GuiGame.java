package day12_08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JLabel;

public class GuiGame extends JFrame{
	ImageIcon[] img = {
			new ImageIcon("./img/sissor.jpg"),
			new ImageIcon("./img/rock.jpg"),
			new ImageIcon("./img/paper.jpg")
	};
	
	class SelectPanel extends JPanel{
		JButton[] button = new JButton[3];
		public SelectPanel() {
			for(int i = 0; i < img.length; i++) {
				button[i]  = new JButton(img[i]);
				this.add(button[i]);
				
				button[i].addActionListener(new EventHandler());
			}
		}
	}
	
	SelectPanel sPanel = new SelectPanel();
	
	class ResultDisplay extends JPanel{
		
		JLabel user = new JLabel("user");
		JLabel computer = new JLabel("computer");
		JLabel result = new JLabel("Winner");
		
		public ResultDisplay() {
			add(user); add(result); add(computer);
		}
		
		
		public void output(Icon img, Icon computerImage, String res) {
			user.setIcon(img);
			user.setHorizontalTextPosition(JLabel.LEFT);
			computer.setIcon(computerImage);
			result.setText(res);
			result.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		}
	}
	ResultDisplay resultDisplay = new ResultDisplay();
	
	class EventHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			JButton buttonSrc = (JButton) ae.getSource();
			int buttonComputer = (int)(Math.random()*3);
			
			String result = "";
			
			if(buttonSrc.getIcon() == img[0] && buttonComputer == 2 || buttonSrc.getIcon() == img[1] && buttonComputer == 0 || buttonSrc.getIcon() == img[2] && buttonComputer == 1) {
				result = "당신이 이겼습니다.";
			}else if(buttonSrc.getIcon() == img[0] && buttonComputer == 0 || buttonSrc.getIcon() == img[1] && buttonComputer == 1 || buttonSrc.getIcon() == img[2] && buttonComputer == 2) {
				result = "비겼습니다.";
			}else {
				result = "봇이 이겼습니다.";
			}
				resultDisplay.output(buttonSrc.getIcon(), img[buttonComputer], result);
		}
	}
	
	public GuiGame() {
		super("가위 바위 보");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(sPanel, "South");
		add(resultDisplay, "Center");
	
		setSize(1000, 800);
		setLocation(500, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuiGame();
	}
}
