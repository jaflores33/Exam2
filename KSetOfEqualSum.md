1) In this problem, we are tasked with being given an array of integers with an integer k and then finding out if it is possible partition
the integers in the array into k sets that are all of equal sum. The recursive nature of this problem comes comes from the fact that we'll
have to try multiple additions with each integer in the array in order to see if this is possible. The array would need to be sorted for 
convenience, and after that is done we can begin to fill in partitions and keep track of the corresponding sums. Each integer in the array
would be added to the next available partition that can fit it, and this would continue for every element until either a true condition is 
returned or the end of the array is reached and a false condition is returned. 

2) To do this, conditions would first need to be met by the array. First we should make sure that the sum of all numbers within the array
is in fact divisible by K, if not a false consition is returned right then and there because equal sums would be impossible. With this step
we also get a 'target' sum, in order for all partitions to be equal they would need to add up to this target sum obtained by dividing the
sum of all the integers in the array by K. Next we check that every element in the array is not greater than the target sum, because that
would make equal sums within the partitions impossible. With all conditions met, we can start addind integers into the partitions, a new
array is created the length of k in order to represent the partisions, and into this array the inregers from the original array are added
and sumed. As this is happening, it is checked that for every addition the integrity of the partision is maintained by making sure that the
addition of the new integer does no make the partision go over the targeted sum. If that happens, the sum is removed promptly by subtracting
the integer from the array from the current sum of the partision that overflowed, then the next available partision is given the integer 
instead. If no partisions are able to receive the integer, then a false condition is returned signifiying that k partitions of equal sums are
not a possibility. 

3) Duke seven applied here by having me recognize the conditions that array must have first in accordance to the number k. I had to do these
steps by hand at first in order to both recognize and solidify the pattern that was needed to solve this problem and ensure that the steps 
did in fact work to solve said problem. 
