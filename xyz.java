import java.awt.*;
// importing java.awt.* for we can use everything inside java.awt

// inhabiting Frame class from java.awt
public class xyz extends Frame {

  // Default Constructor for class
  xyz() {
    // Creating a Button
    Button b = new Button("Submit");

    b.setBackground(Color.green); // setting background color for button
    b.setForeground(Color.white); // setting foreground color for button

    // giving width and height and position to button
    b.setBounds(30, 100, 80, 30);

    add(b); // Adding button to Frame

    setSize(300, 300); // setting size of Frame
    setTitle("This is my first java GUI project"); // giving Frame Title
    setLayout(null); // setting layout of Frame to null
    setVisible(true); // setting visibility of Frame to visible
  }

  public static void main(String[] args) {
    xyz f = new xyz(); // Creating a Frame
  }
}