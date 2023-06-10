import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame {
    public Project() {
        setTitle("Role Selection");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton adminButton = new JButton("Admin");
        JButton professorButton = new JButton("Professor");
        JButton studentButton = new JButton("Student");
        JButton guestButton = new JButton("Guest");

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Project.this, "Admin selected");
                showAdminOptions();
            }
        });

        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Project.this, "Professor selected");
                showProfessorOption();
            }
        });

        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Project.this, "Student selected");
                showStudentOptions();
            }
        });

        guestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Project.this, "Guest selected");
                showGuestOption();
            }
        });

        panel.add(adminButton);
        panel.add(professorButton);
        panel.add(studentButton);
        panel.add(guestButton);

        add(panel);

        setVisible(true);
    }

    public void showAdminOptions() {
        String[] options = {"Add Courses", "Add Student", "Add Professor"};
        int choice = JOptionPane.showOptionDialog(this, "Select an option", "Admin Options", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(this, "Add Courses selected");
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Add Student selected");
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Add Professor selected");
                break;
        }
    }

    public void showStudentOptions() {
        String[] studentOptions = {"Add Courses", "Drop Courses", "Change Major"};
        int choice = JOptionPane.showOptionDialog(this, "Select an option", "Student Options", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, studentOptions, studentOptions[0]);

        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(this, "Add Courses selected");
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Drop Courses selected");
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Change Major selected");
                break;
        }
    }

    public void showProfessorOption() {
        String[] showProfessorOptions = {"Department", "CourseTeaching", "Add Grades"};
        int choice = JOptionPane.showOptionDialog(this, "Select an option", "Professor Options", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, showProfessorOptions, showProfessorOptions[0]);

        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(this, "Department");
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "CourseTeaching");
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Add Grades");
                break;
        }
    }

    public void showGuestOption() {
        String[] showGuestOptions = {"Certificates", "Graduate Courses", "UnderGraduate Courses"};
        int choice = JOptionPane.showOptionDialog(this, "Select an option", "Guest Options", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, showGuestOptions, showGuestOptions[0]);

        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(this, "Certificates");
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Graduate Courses");
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Undergraduate Courses");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Project());
    }
}
