import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

    //code assigns shapes random X and Y values. Screen is divided into quadrants. Colour changes depending on which quadrant shape is in. Red = top left. Green = top right. Blue = bottom left. Yellow = bottom right
  
    //declaring variables to determine X and Y of shapes
    float randomX = random(0, 400);
    float randomY = random(0, 400);
    float randomX2 = random(0, 400);
    float randomY2 = random(0, 400);
    float randomX3 = random(0, 400);
    float randomY3 = random(0, 400);
    float objectSize = random(25, 250);
    float objectSize2 = random(25, 250);

    //Variables for setting time in hours, minutes, and seconds
    int intSecond = second();
    int intMinute = minute();
    int intHour = hour();

    

  
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	  
    //Position and Colour (Square)
    if(randomX < 200 && randomY < 200){
      fill(255, 0, 0);
    } else if (randomX > 200 && randomY < 200){
      fill(0, 255, 0);
    } else if (randomX < 200 && randomY > 200){
      fill(0,0, 255);
    }else if (randomX > 200 && randomY > 200){
      fill(255, 255, 0);
    }
    
    rect(randomX, randomY, objectSize, objectSize);

    //Position and Colour (Circle)
    if(randomX2 < 200 && randomY2 < 200){
      fill(255, 0, 0);
    } else if (randomX2 > 200 && randomY2 < 200){
      fill(0, 255, 0);
    } else if (randomX2 < 200 && randomY2 > 200){
      fill(0,0, 255);
    }else if (randomX2 > 200 && randomY2 > 200){
      fill(255, 255, 0);
    }
    ellipse(randomX2, randomY2, objectSize2, objectSize2);

    //Position and Colour (Triangle)
    if(randomX3 < 200 && randomY3 < 200){
      fill(255, 0, 0);
    } else if (randomX3 > 200 && randomY3 < 200){
      fill(0, 255, 0);
    } else if (randomX3 < 200 && randomY3 > 200){
      fill(0,0, 255);
    }else if (randomX3 > 200 && randomY3 > 200){
      fill(255, 255, 0);
    }
    triangle(randomX, randomY, randomX2, randomY2, randomX3, randomY3);

    //Lines to show quadrants
    fill(0);
    line(200, 0, 200, 400);

    fill(0);
    line(0, 200, 400, 200);

    //showing the time
    fill(0);
    textSize(20);
    text(+intHour - 5, 250, 50);
    text(":", 280, 50);
    text(+intMinute, 290, 50);
    text(":", 320, 50);
    text(+intSecond, 330, 50);
    
    

    

    
    
  
  // define other methods down here.
}
}