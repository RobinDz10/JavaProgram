import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import javax.swing.*;

public class StackedChart  extends JComponent{
	private static final long serialVersionUID = 1L;
	private String title;
	private String vote = "vote";
	private List<String> strings;
	private List<Integer> numbers;
	private Color[] colors = {
			Color.red,
			Color.blue,
			Color.orange,
			Color.green,
			Color.pink,
			Color.cyan
	};
	
	
	public StackedChart(String title, List<String> strings, List<Integer> numbers) {
		super();
		this.title = title;
		this.strings = strings;
		this.numbers = numbers;
	}


	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int height2 = this.getHeight();
		int width2 = this.getWidth();
		int per = height2/200;
		int per2 = width2/200;
		int titlex = per2*60;
		int titley = per*30;
		g2.drawString(title+" Poll", titlex, titley);
		int votex = per2*10;
		int votey = per*100;
		g2.drawString(vote, votex, votey);
		g2.setColor(Color.gray);
		int bottomX = per2*25;
		int bottomY = per*150;
		for (int i = 0; i <= 100; i++) {
			if (i%25==0) {
				int numberY = bottomY-i*per;
				g2.drawString(i+"", bottomX, numberY);
				if (i == 0) {
					g2.setStroke(new BasicStroke(4));
				}else {
					g2.setStroke(new BasicStroke(2));
				}
				int lineX = per2*60;
				int lineY = numberY;
				int lineEndX = per2*200;
				g2.drawLine(lineX, lineY, lineEndX, lineY);
			}
		}
		int title2X = per2*100;
		int title2Y = per*170;
		g2.setColor(Color.black);
		g2.drawString(title, title2X, title2Y);
		int blockX = per2*70;
		int blockY = per*200;
		for (int i = 0; i < strings.size(); i++) {
			g2.setColor(colors[i]);
			g2.fillRect(blockX+5*per2, blockY, per2*5, per*10);
			blockX = blockX + 10*per2;
			blockX = blockX+2*per2;
			g2.setColor(Color.black);
			g2.drawString(strings.get(i), blockX, blockY+5*per2);
			blockX = blockX+30*per2;
		}
		int h = 0;
		int total = getTotal();
		bottomY = per*150;
		for (int i = 0; i < numbers.size(); i++) {
			g2.setColor(colors[i]);
			int num = numbers.get(i);
			int p = (int) (Math.round((((double)num)/((double)total))*100));
			int ht = per*p;
			int beginY = bottomY-h*per;
			h = h + p;
			g2.fillRect(per2*80, beginY-ht, per2*100, ht);
		}
	}
	
	private int getTotal() {
		int result = 0;
		for (Integer integer : numbers) {
			result+=integer;
		}
		return result;
	}

}
