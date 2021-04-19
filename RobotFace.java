package week2;


// This program draws a robot face to the Java Applet.
import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class RobotFace extends GraphicsProgram
{
  private static final int head_width = 100;

  private static final int head_height = 200;

  private static final int left_eye_radius = 20;

  private static final int right_eye_radius = 20;

  private static final int mouth_width = 50;

  private static final int mouth_height = 20;

  @Override
  public void run()
  {
    drawHead();
    drawLeftEye();
    drawRightEye();
    drawMouth();
  }

  private void drawHead()
  {
    int startingWidth = ((getWidth() / 2) - (head_width / 2));
    int startingHeight = ((getHeight() / 2) - (head_height / 2));
    GRect head = new GRect(startingWidth, startingHeight, head_width, head_height);
    add(head);
    head.setFilled(true);
    head.setFillColor(Color.GRAY);

  }

  private void drawLeftEye()
  {
    double startingWidth = (getWidth() / 2) - (head_width / 4) - (left_eye_radius / 2);
    double startingHeight = (getHeight() / 2) - (head_width / 4) - (left_eye_radius / 2);
    GOval lefteye = new GOval(startingWidth, startingHeight, left_eye_radius, left_eye_radius);
    add(lefteye);
    lefteye.setFilled(true);
    lefteye.setFillColor(Color.YELLOW);

  }

  private void drawRightEye()
  {
    double startingWidth = (getWidth() / 2) + (head_width / 4) - (right_eye_radius / 2);
    double startingHeight = (getHeight() / 2) - (head_width / 4) - (right_eye_radius / 2);
    GOval righteye = new GOval(startingWidth, startingHeight, right_eye_radius, right_eye_radius);
    righteye.setFilled(true);
    righteye.setFillColor(Color.YELLOW);
    add(righteye);
  }

  private void drawMouth()
  {
    int startingWidth = getWidth() / 2 - mouth_width / 2;
    int startingHeight = getHeight() / 2 + head_height / 4 - mouth_height / 2;
    GRect mouth = new GRect(startingWidth, startingHeight, mouth_width, mouth_height);
    mouth.setFilled(true);
    mouth.setFillColor(Color.WHITE);
    add(mouth);
  }

}
