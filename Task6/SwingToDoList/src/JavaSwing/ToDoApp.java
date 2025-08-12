package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ToDoApp extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskInput;

    public ToDoApp() {
        // Frame settings
        setTitle("To-Do List");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Main panel
        JPanel panel=new JPanel();
        panel.setLayout(new BorderLayout());
        // Input field
        taskInput=new JTextField();
        panel.add(taskInput, BorderLayout.NORTH);
        // Task list
        taskListModel=new DefaultListModel<>();
        taskList=new JList<>(taskListModel);
        JScrollPane scrollPane=new JScrollPane(taskList);
        panel.add(scrollPane, BorderLayout.CENTER);
        // Buttons
        JPanel buttonPanel=new JPanel();
        JButton addButton=new JButton("Add Task");
        JButton deleteButton=new JButton("Delete Task");
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        // Add button functionality
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = taskInput.getText().trim();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    taskInput.setText("");
                } else {
                    JOptionPane.showMessageDialog(ToDoApp.this, "Please enter a task!");
                }
            }
        });
        // Delete button functionality
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex=taskList.getSelectedIndex();
                if (selectedIndex!=-1) {
                    taskListModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(ToDoApp.this, "Please select a task to delete!");
                }
            }
        });
        // Add panel to frame
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToDoApp());
    }
}
