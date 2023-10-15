public class Land {  
   public static void main(String args[]) {
       【代码1】 //用类名调用setWaterAmount(int m),并向参数传值200
       int leftWater =【代码2】 //用Village类的类名访问waterAmount
       System.out.println("水井中有 "+leftWater+" 升水");
       Village zhaoZhuang,maJiaHeZhi;
       zhaoZhuang = new Village("赵庄");
       maJiaHeZhi = new Village("马家河子");
       zhaoZhuang.setPeopleNumber(80);
       maJiaHeZhi.setPeopleNumber(120);
       【代码3】//zhaoZhuang调用drinkWater(int n),并向参数传值50
       leftWater = 【代码4】//maJiaHeZhi调用lookWaterAmount()方法
       String name=maJiaHeZhi.name;
       System.out.println(name+"发现水井中有 "+leftWater+" 升水");
       maJiaHeZhi.drinkWater(100);
       leftWater = 【代码5】//zhaoZhuang调用lookWaterAmount()方法
       name=zhaoZhuang.name; 
       System.out.println(name+"发现水井中有 "+leftWater+" 升水");
       int peopleNumber = zhaoZhuang.getPeopleNumber(); 
       System.out.println("赵庄的人口:"+peopleNumber);
       peopleNumber = maJiaHeZhi.getPeopleNumber(); 
       System.out.println("马家河子的人口:"+peopleNumber);
    }
}

