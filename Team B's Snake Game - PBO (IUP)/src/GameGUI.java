
/* Create the game simulation's matrix.
 * 
 * Import the internal Java graphics library to build the components.*/

import java.awt.Color;

import java.awt.Dimension;

import java.awt.Graphics;

import java.util.ArrayList;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import java.util.Random;

import javax.swing.JPanel;



public class GameGUI extends JPanel implements Runnable, KeyListener {
	
	
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 400, HEIGHT = 400;
	
	private Thread thread;
	
	private boolean running = false;
	
	
	private dangerNoodle b;
	private ArrayList <dangerNoodle> snake;
	
	
	private nomNomz food;
    private ArrayList <nomNomz> nomz;
    
	
    private Random r;
	
	
	private int xAxis = 10, yAxis = 10;
	
    private int size = 5;
    
	
	private boolean right = true, left = false, up = false, down = false;
	
	
	private int clocks = 0;
	
	
	
	public GameGUI() {
		
		
		setFocusable(true);
        
        addKeyListener(this);
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
 
        r = new Random();
		
		snake = new ArrayList<dangerNoodle>();
		nomz = new ArrayList<nomNomz>();
		
		start();
	}
	
	
	
	public void start() {
		
		running = true;
		
		thread = new Thread(this);
		
		thread.start();
		
	}
	
	
	public void stop() {
		
		running = false;
		
		try {
			
			thread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void clock() {
		
		if (snake.size() == 0) {
            b = new dangerNoodle(xAxis, yAxis, 10);
            snake.add(b);
        }
		
		
        if(nomz.size() == 0) {
        	
            int xAxis = r.nextInt(39);
            
            int yAxis = r.nextInt(39);
            
            food = new nomNomz(xAxis, yAxis, 10);
            
            nomz.add(food);
        }
        
        
        for(int i=0; i < nomz.size(); i++) {
        	
            if(xAxis == nomz.get(i).getxAxis() && yAxis == nomz.get(i).getyAxis()) {
            	
                size++;
                
                nomz.remove(i);
                
                i++;
            }
        }
        
        
        for(int i=0; i < snake.size(); i++) {
        	
            if(xAxis == snake.get(i).getxAxis() && yAxis == snake.get(i).getyAxis()) {
            	
                if(i != snake.size() - 1) stop();
            }
        }
        
        
        if(xAxis < 0 || xAxis > 39 || yAxis < 0 || yAxis > 39) stop();
        
        
		clocks++;
		
		
		if(clocks > 250000) {
			
			if(right) xAxis++;
			
			if(left) xAxis--;
			
			if(up) yAxis--;
			
			if(down) yAxis++;
			
			
			clocks = 0;
			
			b = new dangerNoodle(xAxis, yAxis, 10);
			snake.add(b);
			
			
			if(snake.size() > size) {
				snake.remove(0);
			}
			
		}
		
	}
	
	
	public void paint(Graphics g) {
		
		g.clearRect(0, 0, WIDTH, HEIGHT);
		
        g.setColor(Color.BLACK);
        
        g.fillRect(0, 0, WIDTH, HEIGHT);
		
		
		for(int i=0; i < WIDTH / 10; i++) {
			g.drawLine(i*10, 0, i*10, HEIGHT);
		}
		
		
		for(int i=0; i < HEIGHT / 10; i++) {
			g.drawLine(0, i*10, HEIGHT, i*10);
		}
		
		
		for(int i=0; i < snake.size(); i++) {
			snake.get(i).draw(g);
		}
		
		
		for(int i=0; i < nomz.size(); i++) {
			nomz.get(i).draw(g);
        }
		
	}
	
	
	public void run() {
		
        while (running) {
        	
            clock();
            
            repaint();
        }
    }
	
	
	@Override
    public void keyPressed(KeyEvent e) {
		
		
        int key = e.getKeyCode();
        
        
        if(key == KeyEvent.VK_RIGHT && !left) {
        	
            up = false;
            
            down = false;
            
            right = true;
        }
        
        
        if(key == KeyEvent.VK_LEFT && !right) {
        	
            up = false;
            
            down = false;
            
            left = true;
        }
        
        
        if(key == KeyEvent.VK_UP && !down) {
        	
            left = false;
            
            right = false;
            
            up = true;
        }
        
        
        if(key == KeyEvent.VK_DOWN && !up) {
        	
            left = false;
            
            right = false;
            
            down = true;
        }
    }
	
	
    @Override
    public void keyReleased(KeyEvent arg0) {    
    	
    }
    
    
    public void keyTyped(KeyEvent arg0) {   
    	
    }   

}
