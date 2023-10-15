import javax.swing.*;
import java.awt.event.*;
public class ShowCalendar extends JFrame {
    CalendarPanel showCalendar;
    JButton nextMonth;
    JButton previousMonth;
    JLabel showYear,showMonth;
    public ShowCalendar() {
       showCalendar = new CalendarPanel();
       add(showCalendar); 
       nextMonth = new JButton("��һ����");
       previousMonth = new JButton("��һ����");
       showYear = new JLabel();
       showMonth = new JLabel();
       JPanel pNorth = new JPanel();
       showYear.setText(""+showCalendar.currentDate.getYear()+"��");
       showMonth.setText(""+showCalendar.currentDate.getMonthValue()+"��");
       pNorth.add(showYear);
       pNorth.add(previousMonth);
       pNorth.add(nextMonth);
       pNorth.add(showMonth);
       ������3��//��pNorth��ӵ����ڵ�NORTH����
       nextMonth.addActionListener((e)->{
          showCalendar.setNext();
          showYear.setText(""+showCalendar.currentDate.getYear()+"��");
          showMonth.setText(""+showCalendar.currentDate.getMonthValue()+"��");
       });
       previousMonth.addActionListener((e)->{
          showCalendar.setPrevious();
          showYear.setText(""+showCalendar.currentDate.getYear()+"��");
          showMonth.setText(""+showCalendar.currentDate.getMonthValue()+"��");
       });
       setSize(290,260);
       setVisible(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    } 
    public static void main(String args[]){
       new ShowCalendar();
    }
} 
