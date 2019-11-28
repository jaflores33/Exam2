1) Here, we obtain a square matrix and are tasked with finding a path down that results in the smallest sum possible given the integers
we are traversing. To solve this, we should actually start at the bottom and work our way up to find this path, this is because as we work
out way upwards, we would have already have figured out the smallest sums possible as we work our way towards the start, which means that
the starting paths will have sums to refer to when picking an ideal path. Starting from the bottom we work our way up by seeing the integer
within the current matrix position and comparing the different sum results when adding the integers above it, which will always be at most
three integers we can add and at least two. These results will be used in reference as we move up a row and obtain new sums. This process 
will repeat until the top is reached and we are able to obtain the minimum sum from the results in the top row. 

2) I will need to create a new 2D array that is identical in size to the array I will be traversing, and initialize every index in it to 
zero to begin. Then, starting from the bottom row this new array will be filled with the smallest possible sums, this will be done by 
creating three integers representing the possible sums, each with it's own condition to be set to integer.max so no out of bounds elements will be
compared. Three integers each representing the following; addition towards the top index, and additions towards the top right an top left 
accordingly. From these, the minimum would be picked and placed in the current index acordingly, and this process would continue until the 
top row of the array is reached, and from the row of results, the smallest one would be picked as the solution. 

2) 
