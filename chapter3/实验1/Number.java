import java.util.Scanner;
public class Number {
   public static void main(String args[]) {
      int number=0,d5,d4,d3,d2,d1;
      Scanner reader = new Scanner(System.in);
      System.out.println("����һ��1��99999֮�����");
      number = reader.nextInt();
      if(������1��) //�ж�number��1��99999֮�������
      {        ������2��   //����number�����λ����λ��d5
               ������3��   //����number��ǧλd4
               ������4��   //����number�İ�λd3
                d2=number%100/10;
                d1=number%10;
                if(������5��)  //�ж�number��5λ��������
                {  System.out.println(number+"��5λ��");
                   if(������6��) //�ж�number�ǻ�����������
                   {   System.out.println(number+"�ǻ�����");
                   }
                   else
                   {   System.out.println(number+"���ǻ�����");
                   }
                }
                else if(������7��)  //�ж�number��4λ��������
                {  System.out.println(number+"��4λ��");
                   if(������8��) //�ж�number�ǻ�������������
                   {  System.out.println(number+"�ǻ�����");
                   }
                  else
                   {  System.out.println(number+"���ǻ�����");
                   }
                }
                else if(������9��)  //�ж�number��3λ��������
                {  System.out.println(number+"��3λ��");
                   if(������10��) //�ж�number�ǻ�����������
                   {  System.out.println(number+"�ǻ�����");
                   }
                  else
                   {  System.out.println(number+"���ǻ�����");
                   }
                }
                else if(d2!=0)
                {  System.out.println(number+"��2λ��");
                   if(d1==d2)
                   {  System.out.println(number+"�ǻ�����");
                   }
                  else
                   {  System.out.println(number+"���ǻ�����");
                   }
                }
                else if(d1!=0)
                {  System.out.println(number+"��1λ��");
                   System.out.println(number+"�ǻ�����");
                }
            }
      else 
      {  System.out.printf("\n%d����1��99999֮��",number);
      }
   }
}
