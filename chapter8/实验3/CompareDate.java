import java.util.*;
public class CompareDate {
   public static void main(String args[ ]) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("�����һ���꣬�£�������");
      System.out.print("�������"); 
      short yearOne = scanner.nextShort();
      System.out.print("�����·�"); 
      byte monthOne = scanner.nextByte();
      System.out.print("��������"); 
      byte dayOne = scanner.nextByte();
      System.out.println("����ڶ����꣬�£�������");
      System.out.print("�������"); 
      short yearTwo = scanner.nextShort();
      System.out.print("�����·�"); 
      byte monthTwo= scanner.nextByte();
      System.out.print("��������"); 
      byte dayTwo = scanner.nextByte();
      Calendar calendar = ������1��  //��ʼ����������
      ������2��   //��calendar��ʱ������ΪyearOne��monthOne��dayOne��
      long timeOne =������3��     //calendar��ʾ��ʱ��ת���ɺ���
      calendar.set(yearTwo,monthTwo-1,dayTwo); 
      long timeTwo=calendar.getTimeInMillis();
      Date date1 = ������4��       // ��timeOne����������date1
      Date date2 =new Date(timeTwo);
      if(date2.equals(date1))
          System.out.println("�������ڵ��ꡢ�¡�����ȫ��ͬ");
      else if(date2.after(date1))
          System.out.println("������ĵڶ������ڴ��ڵ�һ������");
      else if(date2.before(date1))
          System.out.println("������ĵڶ�������С�ڵ�һ������");
      long days=������5��//ʹ��timeTwo,timeOne�������������������
      System.out.println(yearOne+"��"+monthOne+"��"+dayOne+"�պ�"
                         +yearTwo+"��"+monthTwo+"��"+dayTwo+"���"+days+"��");
   }  
}
