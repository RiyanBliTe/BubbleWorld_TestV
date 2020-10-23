import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
public class PowerUp{
		private double x;
		private double y;
		private int r;
		private int type;
		private Color color;
		
		//1 -- +1 life
		//2 -- +1 power
		//3 -- +2 power
		//4 -- slow down time
		public PowerUp(int type, double x, double y){
			this.x=x;
			this.y=y;
			this.type=type;
			
			if (type == 1) { r = 5; color = Color.RED;}
			if (type == 2) { r = 5; color = Color.YELLOW;}
			if (type == 3) { r = 7; color = Color.YELLOW.darker();}
			if (type == 4) { r = 5; color = Color.CYAN;}
		}
		
		public double getX() { return x; }
		public double getY() { return y; }
		public double getR() { return r; }
		public int getType() { return type; }
		
		public boolean update(){
			y += 2;
			if (y > GamePanel.HEIGHT+r){
				return true; }
				return false; }
		
		public void draw(Graphics2D g){
			g.setColor(color);
			g.fillRect((int)(x-r), (int)(y-r), 2*r, 2*r);	
			g.setStroke(new BasicStroke(3));
			g.setColor(color.darker());
			g.fillRect((int)(x-r), (int)(y-r), 2*r, 2*r);
			g.setStroke(new BasicStroke(1));
		}
}