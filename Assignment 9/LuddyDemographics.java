import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class LuddyDemographics {
	private static String title = "STUDENT DEMOGRAPHICS";
	private static List<String> strings = new ArrayList<>();
	private static List<Integer> nums = new ArrayList<>();
	private static JFrame chartFrame = null;
	static {
		nums.add(0);
		nums.add(0);
		strings.add("Female");
		strings.add("Male");
	}
	private static String[] items={
			"Choose",
			"All",
		"Computer Science",
		"Cybersecurity and Global Policy",
		"Data Science",
		"Informatics",
		"Intelligent Systems Engineering"
	};
	private static Double[][] genders = {
			{20.2,79.8},
			{15.5,84.5},
			{35.3,64.7},
			{20.8,79.2},
			{24.0,76.0},
			{20.2,79.8}
	};
	
	static class DegreeSelectedListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				String string = e.getItem().toString();
				int index = getIndex(string);
				if (chartFrame != null) {
					chartFrame.dispose();
				}
				if (index==0) {
					return;
				}
				Double[] sexs = genders[index];
				nums.set(0, (int)(sexs[0]*10));
				nums.set(1, (int)(sexs[1]*10));
				chartFrame = new JFrame();
				chartFrame.setTitle(title);
				chartFrame.setSize(600,500);
				StackedChart chart = new StackedChart(title,strings,nums);
				chart.setSize(600,400);
				
				chartFrame.getContentPane().add(chart);
				chartFrame.setLocationRelativeTo(null);
				chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				chartFrame.setVisible(true);
			}
			
		}
	}
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(500,400);
		window.setTitle(title);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 1));
		JComboBox<String> box = new JComboBox<>(items);
		mainPanel.add(box);
		box.addItemListener(new DegreeSelectedListener());
		JLabel rules = new JLabel();
		rules.setText("<html>Select the required discipline type,<br>except for all. When it changes,<br>the scale diagram of male and female will pop up</html>");
		mainPanel.add(rules);
		window.getContentPane().add(mainPanel);
		window.getContentPane().add(mainPanel);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	private static int getIndex(String str) {
		for (int i = 0; i < items.length; i++) {
			if (str.equals(items[i])) {
				return i;
			}
		}
		return -1;
	}

}
