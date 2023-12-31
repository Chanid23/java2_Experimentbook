import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.*;
class PaintCanvas {
   BufferedImage image;
   Graphics2D g_2d;
   PaintCanvas() {
      image=new BufferedImage(1000,900,BufferedImage.TYPE_INT_RGB);
      g_2d=(Graphics2D)image.createGraphics();
      int pointX[] = new int[5];
      int pointY[] = new int[5];
      pointX[0] = 0;
      pointY[0] = -200;
      int shiftX = 200;
      int shiftY = 400;
      Polygon polygon1=new Polygon();
      Polygon polygon2=new Polygon();
      double arcAngle = (72*Math.PI)/180;
      for(int i =1;i<5;i++){
         pointX[i] =(int)(pointX[i-1]*Math.cos(arcAngle)-pointY[i-1]*Math.sin(arcAngle));
         pointY[i] =(int)(pointY[i-1]*Math.cos(arcAngle)+pointX[i-1]*Math.sin(arcAngle));
         System.out.println(pointX[i]+","+pointY[i]);
      }
      polygon1.addPoint(pointX[0]+shiftX,pointY[0]+shiftY);
      polygon1.addPoint(pointX[2]+shiftX,pointY[2]+shiftY);
      polygon1.addPoint(pointX[4]+shiftX,pointY[4]+shiftY);
      polygon1.addPoint(pointX[1]+shiftX,pointY[1]+shiftY); 
      polygon1.addPoint(pointX[3]+shiftX,pointY[3]+shiftY);  //绘制五角星时，注意点的顺序 
      g_2d.setColor(Color.red);
      g_2d.draw(polygon1);
      polygon2.addPoint(pointX[0]+3*shiftX,pointY[0]+shiftY);
      polygon2.addPoint(pointX[2]+3*shiftX,pointY[2]+shiftY);
      polygon2.addPoint(pointX[4]+3*shiftX,pointY[4]+shiftY);
      polygon2.addPoint(pointX[1]+3*shiftX,pointY[1]+shiftY); 
      polygon2.addPoint(pointX[3]+3*shiftX,pointY[3]+shiftY);
      g_2d.fill(polygon2);  
   }
   public BufferedImage getImage() {
      return image;
   }
}
public class Image {
  public static void main(String args[]) {
     File file = new File("fiveStar.bmp"); // 目的地
     try{  
          PaintCanvas  draw= new  PaintCanvas ();
          BufferedImage image = draw.getImage();
          ImageIO.write(image,"bmp",file);
     }
     catch(Exception e) { }
  }
}
