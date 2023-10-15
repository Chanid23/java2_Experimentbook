import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ThreadFrame extends JFrame implements ActionListener {
   JTextField showWord;
   JButton button;
   JTextField inputText,showScore;
   ������2��//��WordThread����һ��giveWord�߳��� 
   int score=0;
   ThreadFrame() {
      showWord = new JTextField(6);
      showWord.setFont(new Font("",Font.BOLD,72));
      showWord.setHorizontalAlignment(JTextField.CENTER ); 
      ������3��//����giveWord�߳�
      giveWord.setJTextField(showWord);
      giveWord.setSleepLength(5000);
      button=new JButton("��ʼ");
      inputText = new JTextField(10);
      showScore = new JTextField(5);
      showScore.setEditable(false); 
      button.addActionListener(this);
      inputText.addActionListener(this);
      add(button,BorderLayout.NORTH);
      add(showWord,BorderLayout.CENTER);
      JPanel southP=new JPanel();
      southP.add(new JLabel("���뺺�֣��س���:"));
      southP.add(inputText);
      southP.add(showScore);
      add(southP,BorderLayout.SOUTH);
      setBounds(100,100,350,180);
      setVisible(true);
      validate();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   public void actionPerformed(ActionEvent e) {
      if(e.getSource()==button) {
         if(!(giveWord.isAlive())){     
            ������4��//����giveWord
             giveWord.setJTextField(showWord);
             giveWord.setSleepLength(5000);
         }
         try {
              ������5��//giveWord���÷���start()
         }
         catch(Exception exe){}
      }
      else if(e.getSource()==inputText) {
          if(inputText.getText().equals(showWord.getText()))
              score++;
          showScore.setText("�÷�:"+score);
          inputText.setText(null);
      }
   }
}
