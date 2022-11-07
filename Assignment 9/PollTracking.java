import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PollTracking {
	private static final String TITLE = "Faverate IDE For Java";
	private static List<String> votingStrings = new ArrayList<>();
	private static List<Integer> votingNumbers = new ArrayList<>();
	private static JLabel pollOption1Label;
	private static JLabel pollOption2Label;
	private static JLabel pollOtherLabel;
	private static JButton button1;
	private static JButton button2;
	private static JTextField field1;
	private static JButton createGraphButton;
	
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(500, 400);
		window.setTitle(TITLE);
		JPanel mainPanel = new JPanel();
		JPanel votingPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		JPanel createGraphPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		votingPanel.setLayout(new GridLayout(1, 3));
		labelPanel.setLayout(new GridLayout(1, 3));
		votingStrings.add("Eclipse");
		votingStrings.add("Intellij IDEA");
		button1 = new JButton("Eclipse");
		button2 = new JButton("Intellij IDEA");
		field1 = new JTextField(10);
		button1.addActionListener(new Option1ButtonListener());
		button2.addActionListener(new Option2ButtonListener());
		votingPanel.add(button1);
		votingPanel.add(button2);
		votingPanel.add(field1);
		votingNumbers.add(0);
		votingNumbers.add(0);
		pollOption1Label = new JLabel(votingNumbers.get(0)+"");
		pollOption2Label = new JLabel(votingNumbers.get(1)+"");
		pollOtherLabel = new JLabel(getOtherVoting());
		pollOption1Label.setHorizontalAlignment(JLabel.CENTER);
		pollOption2Label.setHorizontalAlignment(JLabel.CENTER);
		pollOtherLabel.setHorizontalAlignment(JLabel.CENTER);
		labelPanel.add(pollOption1Label);
		labelPanel.add(pollOption2Label);
		labelPanel.add(pollOtherLabel);
		field1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = field1.getText();
				if (text == null || text.trim().equals("")) {
					return;
				}
				int votingStrIndex = getVotingStrIndex(text);
				if (votingStrIndex == -1) {
					if (votingStrings.size() >= 6) {
						JOptionPane.showMessageDialog(null, "voting type is bigger than 6");
						return;
						
					}
					votingStrings.add(text);
					votingNumbers.add(1);
				}else {
					Integer integer = votingNumbers.get(votingStrIndex);
					votingNumbers.set(votingStrIndex, integer+1);
				}
				
				refreshLabel();
				field1.setText("");
				
			}
		});
		createGraphButton = new JButton("Show Graph");
		createGraphPanel.add(createGraphButton);
		createGraphButton.addActionListener(new CreateGraphButtonListener());
		mainPanel.add(votingPanel);
		mainPanel.add(labelPanel);
		mainPanel.add(createGraphPanel);
		
		window.getContentPane().add(mainPanel);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	static class Option1ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			votingNumbers.set(0, votingNumbers.get(0)+1);
			refreshLabel();
			
			
		}
		
	}
	static class Option2ButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			votingNumbers.set(1, votingNumbers.get(1)+1);
			refreshLabel();
			
		}
		
	}
	static class CreateGraphButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			button1.setEnabled(false);
			button2.setEnabled(false);
			createGraphButton.setEnabled(false);
			field1.setEnabled(false);
			new StackedChartDisplay().display(TITLE, votingStrings, votingNumbers);
			
		}
		
	}
	
	private static String getOtherVoting() {
		if (votingNumbers.size() <= 2) {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i < votingNumbers.size(); i++) {
			sb.append(votingStrings.get(i)+":"+votingNumbers.get(i));
			sb.append(", ");
		}
		return sb.toString();
	}
	
	private static int getVotingStrIndex(String voting) {
		for (int i = 0; i < votingStrings.size(); i++) {
			if (voting.equalsIgnoreCase(votingStrings.get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	private static void refreshLabel() {
		pollOption1Label.setText(votingNumbers.get(0)+"");
		pollOption2Label.setText(votingNumbers.get(1)+"");
		pollOtherLabel.setText(getOtherVoting());
	}
}
