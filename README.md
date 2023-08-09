The partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is the same. 

Examples: 

Input: arr[] = {1, 5, 11, 5}
Output: true 
The array can be partitioned as {1, 5, 5} and {11}

Input: arr[] = {1, 5, 3}
Output: false 
The array cannot be partitioned into equal sum sets.


We strongly recommend that you click here and practice it, before moving on to the solution.
The following are the two main steps to solve this problem:

Calculate the sum of the array. If the sum is odd, there can not be two subsets with an equal sum, so return false. 
If the sum of the array elements is even, calculate sum/2 and find a subset of the array with a sum equal to sum/2. 
The first step is simple. The second step is crucial, it can be solved either using recursion or Dynamic Programming.
