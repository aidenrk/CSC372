import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class app extends JFrame {
    private JPanel panel;
    private JTextField dayField, monthField, yearField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public app() {
        setTitle("KyzerModule2Option2");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));

        panel.add(new JLabel("Day:"));
        dayField = new JTextField();
        panel.add(dayField);
        panel.add(new JLabel("Month:"));
        monthField = new JTextField();
        panel.add(monthField);
        panel.add(new JLabel("Year:"));
        yearField = new JTextField();
        panel.add(yearField);

        calculateButton = new JButton("Calculate Age");
        panel.add(calculateButton);
        resultLabel = new JLabel("Your age will appear here.");
        panel.add(resultLabel);
        add(panel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAge();
            }
        });
    }

    private void calculateAge() {
        int day = Integer.parseInt(dayField.getText());
        int month = Integer.parseInt(monthField.getText());
        int year = Integer.parseInt(yearField.getText());
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        resultLabel.setText("You are " + age.getYears() + " years old.");
        }
}
