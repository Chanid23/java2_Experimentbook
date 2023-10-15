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
       nextMonth = new JButton("下一个月");
       previousMonth = new JButton("上一个月");
       showYear = new JLabel();
       showMonth = new JLabel();
       JPanel pNorth = new JPanel();
       showYear.setText(""+showCalendar.currentDate.getYear()+"年");
       showMonth.setText(""+showCalendar.currentDate.getMonthValue()+"月");
       pNorth.add(showYear);
       pNorth.add(previousMonth);
       pNorth.add(nextMonth);
       pNorth.add(showMonth);
       【代码3】//将pNorth添加到窗口的NORTH区域
       nextMonth.addActionListener((e)->{
          showCalendar.setNext();
          showYear.setText(""+showCalendar.currentDate.getYear()+"年");
          showMonth.setText(""+showCalendar.currentDate.getMonthValue()+"月");
       });
       previousMonth.addActionListener((e)->{
          showCalendar.setPrevious();
          showYear.setText(""+showCalendar.currentDate.getYear()+"年");
          showMonth.setText(""+showCalendar.currentDate.getMonthValue()+"月");
       });
       setSize(290,260);
       setVisible(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    } 
    public static void main(String args[]){
       new ShowCalendar();
    }
} 
