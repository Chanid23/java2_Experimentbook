interface CompurerAverage {
   public double average(double x[]);
}
class Gymnastics implements CompurerAverage {
   public double average(double x[]) {
      int count=x.length;
      double aver=0,temp=0;
      for(int i=0;i<count;i++) {
         for(int j=i;j<count;j++) {
            if(x[j]<x[i]) {
              temp=x[j];
              x[j]=x[i];
              x[i]=temp;  
            } 
         }
      }
      for(int i=1;i<count-1;i++) {
         aver=aver+x[i];
      }
      if(count>2)
         aver=aver/(count-2);
      else
         aver=0;
      return aver;
   }
}
class School implements CompurerAverage {//��дpublic double average(double x[]);��������x[]��Ԫ�ص�����ƽ��
   ������1��//��дpublic double average(double x[])����,��������x[]��Ԫ�ص�����ƽ��
}
public class Estimator{
   public static void main(String args[]) {
      double a[] = {9.89,9.88,9.99,9.12,9.69,9.76,8.97};
      double b[] ={89,56,78,90,100,77,56,45,36,79,98};  
      CompurerAverage computer;
      computer=new Gymnastics();  
      double result= ������2�� //computer����average(double x[])������������a���ݸ�����x
      System.out.printf("%n");
      System.out.printf("���ѡ�����÷�:%5.3f\n",result);
      computer=new School();  
      result=������3�� //computer����average(double x[])������������b���ݸ�����x
      System.out.printf("�༶����ƽ������:%-5.2f",result);
   } 
}
