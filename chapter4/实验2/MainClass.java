public class MainClass {  
   public static void main(String args[]) {
       TV haierTV = new TV(); 
       ������2�� //haierTV����setChannel(int m),�������m����5
       System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
       Family zhangSanFamily = new Family();
       ������3��//zhangSanFamily����void buyTV(TV tv)����,����haierTV���ݸ�����TV
       System.out.println("zhangSanFamily��ʼ�����ӽ�Ŀ");
       zhangSanFamily.seeTV();
       int m=2; 
       System.out.println("hangSanFamily�����Ӹ�����"+m+"Ƶ��");
       zhangSanFamily.remoteControl(m);
       System.out.println("haierTV��Ƶ����"+haierTV.getChannel());
       System.out.println("hangSanFamily�ٿ����ӽ�Ŀ");
       zhangSanFamily.seeTV();       
    }
}

