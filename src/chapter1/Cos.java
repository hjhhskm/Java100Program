package chapter1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
class ShapesPanel extends JPanel{
		 public ShapesPanel(){
			 setBackground(Color.white);
		 }
	 public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 setBackground(Color.white); //背景色为黄色
//		 g.setXORMode(Color.red); //设置XOR绘图模式,颜色为红色
//		 g.setColor(Color.green);
//		 g.fillRect(20, 20, 80, 40); //实际颜色是green + yellow的混合色=灰色
//		 g.setColor(Color.yellow);
//		 g.fillRect(60, 20, 80, 40); //后一半是yellow+yellow=read,前一半是yellow+灰色
//		 g.setColor(Color.green);
//		 g.fillRect(20, 70, 80, 40); //实际颜色是green+yellow的混合色=灰色.
//		 g.fillRect(60, 70, 80, 40);
//		 //前一半是(green+yellow)+gray =背景色,后一半是green+yellow = gray
//		 g.setColor(Color.green);
//		 g.drawLine(80, 100, 180, 200); //该直线是green+yellow = gray
//		 g.drawLine(100, 100, 200, 200); //同上
//		 /*再绘制部分重叠的直线.原直线中间段是灰色+灰色=背景色,延长部分是green+yellow=gray.*/
//		 g.drawLine(140, 140, 220, 220);
//		 g.setColor(Color.yellow); //分析下列直线颜色变化,与早先的力有重叠
//		 g.drawLine(20, 30, 160, 30);
//		 g.drawLine(20, 75, 160, 75);
		 int x,y;
		 double a;
//		 x
		 for(x = 0;x <= 750;x++){
			 g.drawLine(x, 200, x, 200);
		 }
		 
		 for(x = 740;x<=750;x++){
			 g.drawLine(x, x-550, x, x-550);
			 g.drawLine(x, 950-x, x, 950-x);
		 }
		 
//		 y
		 for(y = 0;y <= 375;y++){
			 g.drawLine(360, y, 360, y);
		 }
		 
		 for(x = 360;x <= 370;x++){
			 g.drawLine(x-10, 375-x, x-10,375-x);
			 g.drawLine(x, x-355, x,x-355);
		 }
//		 cos
		 for(x = 0;x < 720;x++){
			 a = Math.cos(x*Math.PI/180);
			 y = (int)(200+80*a);
			 g.drawLine(x, y, x, y);
		 }
	}
}
	
public class Cos extends JFrame{
	public Cos(){
	this.getContentPane().add(new ShapesPanel());
	this.setTitle("基本绘图方法演示");
	setSize(300, 300);
	setVisible(true);
	}
}
