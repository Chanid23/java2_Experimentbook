import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ComputerFrame extends JFrame {
   JMenuBar menubar;
   JMenu choiceGrade; //ѡ�񼶱�Ĳ˵�
   JMenuItem  grade1,grade2;
   JTextField textOne,textTwo,textResult;
   JButton getProblem,giveAnwser;
   JLabel operatorLabel,message;
   Teacher teacherZhang;
   ComputerFrame() { 
      teacherZhang=new Teacher();
      teacherZhang.setMaxInteger(20);
      setLayout(new FlowLayout());
      menubar = new JMenuBar(); 
      choiceGrade = new JMenu("ѡ�񼶱�"); 
      grade1 = new JMenuItem("�׶�����");
      grade2 = new JMenuItem("��ͯ����");
      grade1.addActionListener(new ActionListener() {
                                   public void actionPerformed(ActionEvent e) {
                                      teacherZhang.setMaxInteger(10);
                                   }
                              });
      grade2.addActionListener(new ActionListener() {
                                   public void actionPerformed(ActionEvent e) {
                                      teacherZhang.setMaxInteger(50);
                                   }
                              }); 
      choiceGrade.add(grade1);
      choiceGrade.add(grade2);
      menubar.add(choiceGrade);
      setJMenuBar(menubar); 
      ������1��           //����textOne,��ɼ��ַ�����5
      textTwo=new JTextField(5);
      textResult=new JTextField(5);  
      operatorLabel=new JLabel("+");
      operatorLabel.setFont(new Font("Arial",Font.BOLD,20)); 
      message=new JLabel("�㻹û�лش���");
      getProblem=new JButton("��ȡ��Ŀ");
      giveAnwser=new JButton("ȷ�ϴ�");
      add(getProblem); 
      add(textOne);
      add(operatorLabel);
      add(textTwo);
      add(new JLabel("="));
      add(textResult);
      add(giveAnwser); 
      add(message);
      textResult.requestFocus();
      textOne.setEditable(false);
      textTwo.setEditable(false);
      getProblem.setActionCommand("getProblem");
      textResult.setActionCommand("answer");
      giveAnwser.setActionCommand("answer");
      teacherZhang.setJTextField(textOne,textTwo,textResult);
      teacherZhang.setJLabel(operatorLabel,message); 
      ������2��//��teacherZhangע��ΪgetProblem��ActionEvent�¼�������  
      ������3��//��teacherZhangע��ΪgiveAnwser��ActionEvent�¼�������
      ������4��//��teacherZhangע��ΪtextResult��ActionEvent�¼�������
      setVisible(true);
      validate();
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
} 
