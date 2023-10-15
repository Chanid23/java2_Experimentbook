import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class StudentFrame extends JFrame implements ActionListener {
    JTextArea showArea;
    JTextField inputName,inputScore;
    JButton button;
    TreeSet<Student> treeSet;
    StudentFrame() {
       treeSet= ������1�� //ʹ���޲������췽������treeSet
       showArea=new JTextArea();
       showArea.setFont(new Font("",Font.BOLD,20));
       inputName=new JTextField(5);
       inputScore=new JTextField(5);
       button=new JButton("ȷ��");
       button.addActionListener(this);
       JPanel pNorth=new JPanel();
       pNorth.add(new JLabel("Name:"));
       pNorth.add(inputName);
       pNorth.add(new JLabel("Score:"));
       pNorth.add(inputScore);
       pNorth.add(button);
       add(pNorth,BorderLayout.NORTH);
       add(showArea,BorderLayout.CENTER);
       setSize(300,320);
       setVisible(true);
       validate();
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    public void actionPerformed(ActionEvent e) {
       String name=inputName.getText();
       int score=0;
       try{ score=Integer.parseInt(inputScore.getText().trim());
            if(name.length()>0) {
               Student stu=new Student(name,score);
              ������2�� // treeSet���stu
               show(treeSet);
            }
       } 
       catch(NumberFormatException exp) {
            inputScore.setText("�����������ַ�");
       } 
    }
    public void show(TreeSet tree) {
       showArea.setText(null);
       Iterator<Student> te=treeSet.iterator();
       while(te.hasNext()) {    
          Student stu= ������3�� // te�������е���һ��Ԫ��
          showArea.append("Name:"+stu.getName()+" Score: "+stu.getScore()+"\n");
       }
    }
    public static void main(String args[]) {
        new StudentFrame();
    }
}
