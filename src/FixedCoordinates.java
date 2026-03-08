import processing.core.PApplet;

/**
 * Draws a Canadian flag with fixed coordinates 
 * for the Maple Leaf shape.
 * @author D. Cheng
 */
public class FixedCoordinates extends PApplet {
    public static void main(String[] args) {
        PApplet.main("FixedCoordinates");
    }


    public void settings() {
        size(900, 500);  // Canvas size
    }


    public void setup() {
        background(255, 255, 255);  // White
        noStroke();

        // Vertical bar, left side
        fill(255, 0, 0);  // Red
        rect(0, 0, 200, 500);

        // Vertical bar, right side
        fill(255, 0, 0);  // Red
        rect(700, 0, 200, 500);
        
        // Maple leaf, centred
        fill(255, 0, 0);  // Red
        beginShape();
        vertex(449, 50);   // P1  - top tip
        vertex(487, 118);  // P2  - right of top tip
        vertex(523, 100);  // P3  - upper-right lobe tip
        vertex(505, 211);  // P4  - inner notch
        vertex(560, 156);  // P5  - mid-right lobe tip
        vertex(568, 187);  // P6  - mid-right lobe base
        vertex(628, 173);  // P7  - right lobe tip
        vertex(611, 240);  // P8  - right lobe inner
        vertex(635, 250);  // P9  - right point
        vertex(541, 328);  // P10 - lower-right notch
        vertex(551, 362);  // P11 - lower-right lobe
        vertex(456, 349);  // P12 - right side of stem top
        vertex(458, 450);  // P13 - stem bottom right
        vertex(442, 450);  // P14 - stem bottom left
        vertex(446, 349);  // P15 - left side of stem top
        vertex(350, 362);  // P16 - lower-left lobe
        vertex(361, 328);  // P17 - lower-left notch
        vertex(265, 250);  // P18 - left point
        vertex(291, 240);  // P19 - left lobe inner
        vertex(272, 173);  // P20 - left lobe tip
        vertex(330, 187);  // P21 - mid-left lobe base
        vertex(340, 156);  // P22 - mid-left lobe tip
        vertex(396, 211);  // P23 - inner notch
        vertex(377, 100);   // P24 - upper-left lobe tip
        vertex(414, 118);  // P25 - left of top tip
        endShape(CLOSE);   // Complete, close the shape
    }


    /** Loops continuously - use for animation, dynamic drawings */
    public void draw() {
		
    }

}
