
# Java Program to Find Sum of Array Elements
Given an array of integers. Write a Java Program to find the sum of the elements of the array.

Examples:

Input : arr[] = {1, 2, 3}
Output : 6
1 + 2 + 3 = 6

Input : arr[] = {15, 12, 13, 10}
Output : 50
15 + 12 + 13 + 10 = 50

An array is a data structure that contains a group of elements. Typically these elements are all of the same data type, such as an integer or string. Arrays are commonly used in computer programs to organize data so that a related set of values can be quickly sorted or searched. All the items of the array are stored at contiguous memory locations. 

Array Elements: Each item of an array is an Element. All the elements in an array must be of the same type.
Algorithm

    Initialize an array arr and a variable sum.
    Set the value of sum=0.
     Start a for loop from index 0 to the length of the array – 1.
    In every iteration, perform sum = sum + arr[i].
    After the termination of the loop, print the value of the sum.
