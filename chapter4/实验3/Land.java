public class Land {  
   public static void main(String args[]) {
       ������1�� //����������setWaterAmount(int m),���������ֵ200
       int leftWater =������2�� //��Village�����������waterAmount
       System.out.println("ˮ������ "+leftWater+" ��ˮ");
       Village zhaoZhuang,maJiaHeZhi;
       zhaoZhuang = new Village("��ׯ");
       maJiaHeZhi = new Village("��Һ���");
       zhaoZhuang.setPeopleNumber(80);
       maJiaHeZhi.setPeopleNumber(120);
       ������3��//zhaoZhuang����drinkWater(int n),���������ֵ50
       leftWater = ������4��//maJiaHeZhi����lookWaterAmount()����
       String name=maJiaHeZhi.name;
       System.out.println(name+"����ˮ������ "+leftWater+" ��ˮ");
       maJiaHeZhi.drinkWater(100);
       leftWater = ������5��//zhaoZhuang����lookWaterAmount()����
       name=zhaoZhuang.name; 
       System.out.println(name+"����ˮ������ "+leftWater+" ��ˮ");
       int peopleNumber = zhaoZhuang.getPeopleNumber(); 
       System.out.println("��ׯ���˿�:"+peopleNumber);
       peopleNumber = maJiaHeZhi.getPeopleNumber(); 
       System.out.println("��Һ��ӵ��˿�:"+peopleNumber);
    }
}

