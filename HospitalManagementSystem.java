import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HospitalManagementSystem extends JFrame {
    private JTextField nameField;
    private JTextField ageField;
    private JTextField phoneNumberField;
    private JTextField emailField;
    private JTextArea addressArea;
    private JList<String> cityList;
    private JList<String> stateList;
    private JTextArea diseaseArea;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JTextArea healthHistoryArea;

    public HospitalManagementSystem() {
        setTitle("Hospital Management System - Patient Details");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        nameField.setBounds(80,30,200,40);
        panel.add(nameField);

        panel.add(new JLabel("Date of Birth:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Address:"));
        addressArea = new JTextArea(3, 20);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);
        panel.add(addressScrollPane);

        
        panel.add(new JLabel("Phone Number:"));
        phoneNumberField = new JTextField();
        panel.add(phoneNumberField);

        panel.add(new JLabel("Disease:"));
        diseaseArea = new JTextArea(3, 20);
        JScrollPane diseaseScrollPane = new JScrollPane(diseaseArea);
        panel.add(diseaseScrollPane);

        panel.add(new JLabel("City:"));
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Miami"};
        cityList = new JList<>(cities);
        JScrollPane cityScrollPane = new JScrollPane(cityList);
        panel.add(cityScrollPane);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Previous Health History:"));
        healthHistoryArea = new JTextArea(3, 20);
        JScrollPane healthHistoryScrollPane = new JScrollPane(healthHistoryArea);
        panel.add(healthHistoryScrollPane);
        
        
        panel.add(new JLabel("State:"));
        String[] states = {"New York", "California", "Illinois", "Texas", "Florida"};
        stateList = new JList<>(states);
        JScrollPane stateScrollPane = new JScrollPane(stateList);
        panel.add(stateScrollPane);

        panel.add(new JLabel("Gender:"));
        ButtonGroup genderButtonGroup = new ButtonGroup();
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        panel.add(genderPanel);


        JButton registerButton = new JButton("Register Patient");
        panel.add(registerButton);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement patient registration logic here
            }
        });

        add(panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HospitalManagementSystem().setVisible(true);
            }
        });
    }
}