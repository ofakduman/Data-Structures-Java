A two‐dimensional shape can be defined by its boundary‐polygon, which is simply a list of all coordinates ordered by a traversal of its outline. See the following figure for an example.

The left picture shows the original shape; the middle picture, the outline of the shape. The rightmost 
picture shows an abstracted boundary, using only the “most important” vertices. We can assign an 
importance measure to a vertex P by considering its neighbors L and R. We compute the distances 
LP, PR, and LR. Call these distances l1, l2, and l3. Define the importance as lll 123.
Use the following algorithm to find the n most important points.
1. while the number of points is greater than n.
2. Compute the importance of each point.
3. Remove the least significant one.
Write a program to read a set of coordinates that form an outline and reduce the list to the n most 
significant ones, where n is an input value. Draw the initial and resulting shapes. Note: This problem 
and the algorithm for its solution are based on the paper: L. J. Latecki and R. Lakämper, “Convexity 
Rule for Shape Decomposition Based on Discrete Contour Evolution,” Computer Vision and Image 
Understanding (CVIU) 73(1999): 441–454.