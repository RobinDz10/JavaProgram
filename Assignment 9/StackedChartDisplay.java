import java.util.List;
import javax.swing.JFrame;

public class StackedChartDisplay {
	public void display(String title, List<String> votingStrings, List<Integer> votingNumbers) {
		JFrame window = new JFrame();
		window.setTitle(title);
		window.setSize(600,500);
		StackedChart chart = new StackedChart(title,votingStrings,votingNumbers);
		chart.setSize(600,400);
		
		window.getContentPane().add(chart);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setVisible(true);
	}
}
