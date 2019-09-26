# data-structures-and-algorithms

Repository for Daily Code Challenges assigned in 301 and 401

# 301 Code Challenges
Each set contains up to 10 problems.

The daily challenges will be posted by the instructor at the end of lecture every day. Plan to focus on this task with your partner every day after class until 6 p.m., completing as much as possible during this time, then complete the remainder of the challenges on your own, as needed.

You will be working on these code challenges with a new partner every day. This will also be your partner for the paired lab. Code challenges that are assigned when heading into the weekend should be completed independently.

After lecture, get together with your partner and read through the daily set of challenges. Read the MDN documentation for the topic(s) of the day. Your instructor will also be sharing a YouTube playlist which contains tutorials on each topic. Each video is approximately ten minutes long and you are encouraged to integrate these videos into your workflow as you and your partner see fit.

# 401 Code Challenges
## Table of Contents
1. [Reverse an Array] (#reverseArray)
2. [Shift an Array] (#shiftArray)
3. [Array Binary Search] (#arrayBinarySearch)
4. [Linked List Insertions] (#llinsert)
5. [k-th Linked List] (#11kth)
6. [Zippering Linked Lists] (#llzipper)
7.

<a name = "reverseArray"></a>
# Reverse an Array
This is the first code challenge for Java 401.

## Challenge
Feature Task: Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

Stretch Goal: Implement the same feature with a different methodology.

## Approach & Efficiency
Being new to Java we focused on modifying the array based on the contents' index. We did not get to Big O in lecture and I don't know enough to confidently evaluate it. We put a best guess based on our reading in our whiteboarding solution.

## Solution
![alt text](/code401challenges/assets/ArrayReverse.jpg)

<a name = "shiftArray"></a>
# Shift an Array
Insert and shift an array in middle at index.

## Challenge
Feature Task: Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

Stretch Goal: Write a second function that removes an element from the middle index and shifts other elements in the array to fill the new gap.

## Approach & Efficiency
Being new to Java we focused on modifying the array based on the contents' index. Today was the first day of writing tests and targeting edge cases.

I need to add the test and code for rounding up for odd numbered array lengths and work on the stretch goal.

## Solution
![alt text](/code401challenges/assets/array-shift.jpg)

<a name = "arrayBinarySearch"></a>
# Array Binary Search
Binary search of a sorted 1D array.

## Challenge
Feature Task: Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

Stretch Goal: Once you’ve achieved a working solution, benchmark with varying array sizes (100, 10000, 100000 elements).

## Approach & Efficiency
I focused on building the tests first (five in total) before moving to the code. Dan and I planned a while loop with nested if statements.

Time: O(lg(n))
Space: O(1) -> We have not covered this yet and I am not confident in this assessment yet.

## Solution
![alt text](/code401challenges/assets/array-binary-search.jpg)


<!-- [Linked List Insertions] (#llinsert) -->
<a name = "llinsert"></a>
# Linked List Insertions
Linked list insertions.

## Challenge
Feature Task: Write the following methods for the Linked List class: .append(value) which adds a new node with the given value to the end of the list; .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node; .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node.

Stretch Goal: Write an additional method to delete a node with the given value from the linked list.

## Approach & Efficiency
.....

Time: ....
Space: .....

## Solution
![alt text](/code401challenges/assets/.......jpg)

<!-- [k-th Linked List] (#11kth) -->
<a name = "llkth"></a>
# k-th Linked List
Finding the k-th value from the end of a linked list.

## Challenge
Feature Task: Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

Stretch Goal: Implement a method that finds the node at the middle of the Linked List.

## Approach & Efficiency
......

Time: .....
Space: ......

## Solution
![alt text](/code401challenges/assets/......jpg)

<!-- [Zippering Linked Lists] (#llzipper) -->
<a name = "llzipper"></a>
# Zippering Linked Lists
Merge two unsorted linked lists in an alternating pattern.

## Challenge
Feature Task: Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

Stretch Goal: Implement another function that merges two sorted linked lists into a single sorted linked list.

## Approach & Efficiency
.....

Time: ....
Space: ....

## Solution
![alt text](/code401challenges/assets/......jpg)