Author: Sahar Lowell
email: mastoureshgh@yahoo.com

# Bowling Score System
# Requirements
Build a system that can be used as an electronic scorekeeper for bowling.
The system should display a scorer interface and include a main method that takes a filename as a command-line argument,
executes the scoring, and prints the results to the screen in the format: “Player X scored Y”  where X is the player name  and  Y is the score).

# Game Rules:
* A game consists of 10 frames.
* Each frame consists of 2 chances to knock down 10 pins.
* Knocking down all 10 pins on your first ball in a frame is called a Strike. When you get a strike, that frame is done except in the  10th  frame   i.e. the last frame).
* Knocking down all 10 pins in a frame with 2 balls is called a Spare.
* If, after 2 balls , there  are  any pins left standing , this  is called  an  open  frame.
* If you get a  strike in  the 10th  frame, 10 more pins  are  put up  and  you  have  2  more rolls
* If you get  a strike on the 2nd roll in the 10th frame, 10 more pins are  put up and  you  get 1 final roll.
* If you get a  spare  in  the 10th frame, 10 more pins are  put  up  and you get 1 final roll.

# Scoring:
* Spares are worth 10 PLUS the value of your next roll
* Strikes are worth 10 PLUS the value of your next 2 rolls
* Open frames are work face-value (i.e. if you knock down 7 pins, that frame is scored as 7)
* The maximum possible score is 300

# Input file format:
* First line is the number of players. The next n lines are the names of each player
* All subsequent lines are of the format: A B C Where A is the number of pins hit on the first ball (0-10), B is the number of pins hit on the second ball, and C is the number of pins hit on the third ball. B will be omitted  in  the case of a strike (A=10) except on the last frame.  C can only be present in the 10th frame and ONLY when the player rolls a strike or spare in the tenth frame

# This implementation includes
* an object oriented design
* rigorous unit testing with 90% code coverage.

# How to run:
java -jar BowlingScoreSystem.jar FilePath+FileName.txt

# sample:
* java -jar BowlingScoreSystem.jar ~/Documents/Projects/BowlingScoreSystem/input.txt
* Player One  : 279
* Player Two  : 101
