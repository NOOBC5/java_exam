package day12_12;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

class TimerNum extends JLabel implements Runnable {
	int width = 150, height = 25;
	int x = 0, y = 0;
	
	int millisecond;
	int ss, mm, hh;

	public TimerNum(int millisecond) {
		setOpaque(true);
		setBounds(x, y, width, height);
		setForeground(Color.BLACK);
		setText(millisecond + "");
		setFont(new Font("맑은고딕", Font.PLAIN, 25));
		setHorizontalAlignment(JLabel.CENTER);
		
		this.millisecond = millisecond;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);	// 0.001초
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (millisecond >= 0) {
				millisecond += 1;		// 0.001초씩 늘어남
				setText(hh+" : "+mm+" : "+ss+" : "+millisecond);
			}
			else {
				//System.out.println("종료");
				break;
			}
			if(millisecond == 100) {
				millisecond = 0;
				ss++;
				setText(hh+" : "+mm+" : "+ss+" : "+millisecond);
			}
			if(ss == 60) {
				ss = 0;
				mm++;
				setText(hh+" : "+mm+" : "+ss+" : "+millisecond);
			}
			if(mm == 60) {
				mm = 0;
				hh++;
				setText(hh+" : "+mm+" : "+ss+" : "+millisecond);
			}
		}
	}
}
