# SoccerScoreCounter
This is a Project number 2 from Udacity Android NanoDegree program.
The project asks to use multiple layouts to build a split screen for 2 teams. There should be at least 1 TextView to keep the score
and at least 2 Buttons that keep different score values or different type of scores (ex: score and foul).

For this project I have chosen to create an app with 2 TextViews, 1 that keeps track of scores and 2nd keeps track of fouls.

XML file consists of a parent RelativeLayout file, and 2 children. 1 is for the button to reset the score and 2nd is for Horizontal
LinearLayout. The Horizontal layout in turn holds 3 children, 2 vertical layouts and 1 view to act as a separation line between 2 layouts.
Each vertical layout consists of 2 text views to keep track of score and fouls, 2 buttons to add a score and a foul, and an EditText for
the name of a team, that a user can change. Most of the styling is done in styles.xml to make the activity_main file cleaner and easier
to read.

Java file has 4 instance variables of type int that start at 0. Then there are 2 main methods that repeat 4 times.
1st method finds a TextView for a score or foul to change, and then sets a new text accordingly.
2nd method defines what happens when a button is clicked, which increases the initial instance variable by 1 and then changes the value
and displays the total in corresponding TextView. There is also a separate method for a reset button, which upon clicking changes all
TextViews to display 0, and also changes all instance variables to 0.
