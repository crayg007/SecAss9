import java.awt.Color; 
import acm.program.*; 
import acm.graphics.*;  

public class Robo extends GraphicsProgram {
		
	    private static final int head_width = 200;
	    private static final int head_height = 200;
	    private static final int eye_radius = 50;
	    private static final int mouth_width = 175;
	    private static final int mouth_height = 30;
	 
	    public void run() {
        head();
        lEye();
        rEye();
        mouth();
	    }
	    private void head() {
        double startingWidth = ((getWidth()/2) - (head_width/2));
        double startingHeight = ((getHeight()/2) - (head_height/2));
        GRect face = new GRect (startingWidth, startingHeight, head_width, head_height);
        add(face);
        face.setFilled(true);
        face.setFillColor(Color.GRAY);
	    }
	    private void lEye() {
        double startingWidth = getWidth()/2 - head_width/4 - eye_radius/2;
        double startingHeight = getHeight()/2 - head_height/4 - eye_radius/2;
        GOval leftEye = new GOval (startingWidth, startingHeight, eye_radius, eye_radius);
        add(leftEye);
        leftEye.setColor(Color.YELLOW);
        leftEye.setFilled(true);
        leftEye.setFillColor(Color.YELLOW);
	    }
	    private void rEye() {
        double startingWidth = getWidth()/2 + head_width/4 - eye_radius/2;
        double startingHeight = getHeight()/2 - head_height/4 - eye_radius/2;
        GOval rightEye = new GOval (startingWidth, startingHeight, eye_radius, eye_radius);
        add(rightEye);
        rightEye.setColor(Color.YELLOW);
        rightEye.setFilled(true);
        rightEye.setFillColor(Color.YELLOW);
	    }
	    private void mouth() {
        double startingWidth = getWidth()/2 - mouth_width/2;
        double startingHeight = getHeight()/2 + head_height/4 - mouth_height/2;
        GRect mouth = new GRect (startingWidth, startingHeight, mouth_width, mouth_height);
        add(mouth);
        mouth.setColor(Color.WHITE);
        mouth.setFilled(true);
        mouth.setFillColor(Color.WHITE);
	    }
	    //I'd like to thank my Mom, George Washington, and Tom Cruise for helping me finish this code. 
	}