
/*   Make the snake's food.
 *   King Shark: "Hmm... NOM NOM ?"   */

import java.awt.Color;
import java.awt.Graphics;
 


public class nomNomz {
    
	
    private int xAxis, yAxis, width, height;
    
    
    public nomNomz(int xAxis, int yAxis, int tileSize) {
    	
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        
        width = tileSize;
        height = tileSize;
    }
    
    
    public void tick() {
        
    }
    
    
    public void draw(Graphics g) {
    	
        g.setColor(Color.YELLOW);
        g.fillRect(xAxis*width , yAxis*height, width, height);
    }
    
    
    public int getxAxis() {
    	
        return xAxis;
    }
    
    
    public void setxAxis(int xAxis) {
    	
        this.xAxis = xAxis;
    }
    
    
    public int getyAxis() {
    	
        return yAxis;
    }
    
    
    public void setyAxis(int yAxis) {
    	
        this.yAxis = yAxis;
    }

}
