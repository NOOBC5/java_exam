package day12_12;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TimerTest extends JFrame {
	private JPanel panel;
	
	private TimerNum timerNum;
	private Thread threadNum;
	
	public TimerTest() {
		int millisecond = 0;// 초
		int ss = 0, mm = 0, hh = 0;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		timerNum = new TimerNum(millisecond);
		timerNum = new TimerNum(ss);
		timerNum = new TimerNum(mm);
		timerNum = new TimerNum(hh);
		threadNum = new Thread(timerNum);
		threadNum.start();
		panel.add(timerNum);
		
		add(panel);
		setTitle("타이머");
		setSize(1000, 600);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TimerTest();
	}
}
