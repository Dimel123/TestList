import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainWindow extends JFrame {
    private MyListModel model;
    private JScrollPane scrollPane;
    private JList<String> jList;
    private JButton btnDelete;
    private JButton btnAdd;

    public MainWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 11, 300, 430);
        getContentPane().add(scrollPane);
        model = new MyListModel();

        jList = new JList<String>(model);
        scrollPane.setViewportView(jList);

        btnDelete = new JButton("Удалить");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> array = jList.getSelectedValuesList();
                for(String s: array){
                    model.removeElement(s);
                }

                jList.updateUI();
            }
        });
        btnDelete.setBounds(350, 20, 120, 20);
        getContentPane().add(btnDelete);

        btnAdd = new JButton("Добавить");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JOptionPane.showInputDialog("Enter your string here:");
                model.addElement(s);
                jList.updateUI();
            }
        });
        btnAdd.setBounds(350, 60, 120, 20);
        getContentPane().add(btnAdd);
        setVisible(true);
        jList.updateUI();



    }

    public void addElement(String s){
        model.addElement(s);
    }

    public void removeElement(int index){
        model.removeElement(index);
    }

        public void updateUI(){
            jList.updateUI();
        }
}
