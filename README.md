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
7. [PseudoQueue] (#pseudoqueue)
8. [FIFO] (#FIFO)
9. [MultiBracketValidation] (#bracketvalidation)
10. [Trees] (#trees)
11. [Breadth-first Tree Traversal] (#breadth)
12. [Max Value in a Binary Tree] (#maxValue)

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

<a name = "llzipper"></a>
# Zippering Linked Lists
Merge two unsorted linked lists in an alternating pattern.

## Challenge
Feature Task: Write a function called mergeLists which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list. Try and keep additional space down to O(1). You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

Stretch Goal: Implement another function that merges two sorted linked lists into a single sorted linked list.

## Approach & Efficiency
.....

Time: O(n)
Space: O(n)

## Solution
![alt text](/code401challenges/assets/LinkedListMerge1.jpg)
![alt text](/code401challenges/assets/LinkedListMerge2.jpg)

<a name = "pseudoqueue"></a>
# PseudoQueue
Implement a Queue using two Stacks.

## Challenge
Feature Task: Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

*enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
*dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.

The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.

## Approach & Efficiency
Since Queues and Stacks have move data differently I am utilizing the second Stack as a way to 'flip' the data so that the Stack methods produce the same data flow as a Queue when needed.

Time: O(n) and O(1)
Space: O(1)

## Solution
![alt text](/code401challenges/assets/PseudoQueue1.jpg)
![alt text](/code401challenges/assets/PseudoQueue2.jpg)

<a name = "FIFO"></a>
# FIFO
First in, first out AnimalShelter.

## Challenge
Feature Task: Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.

Implement the following methods:
* enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
* dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

Stretch Goal: If a cat or dog isn’t preferred, return whichever animal has been waiting in the shelter the longest.

## Approach & Efficiency
Utilizing yesterday's code format of storing data within stacks inside a queue I will build four stacks: an enqueue for each animal and a dequeue for each animal.

Time: O(n) and O(1)
Space: O(1)

## Solution
![alt text](/code401challenges/assets/FIFO1.jpg)
![alt text](/code401challenges/assets/FIFO2.jpg)
![alt text](/code401challenges/assets/FIFO3.jpg)
![alt text](/code401challenges/assets/FIFO4.jpg)

<a name = "bracketvalidation"></a>
# MultiBracketValidation
Multi-bracket validation within a String.

## Challenge
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

* Round Brackets : ()
* Square Brackets : []
* Curly Brackets : {}


## Approach & Efficiency
Building on the stack methods built in previous code challenges I will be iterating through the String, and using regex methods, push all opening brackets into one stack. This will continue until the first closing backet which will be pushed into a second stack. Then the two stack tops will be compared and if they match they will be popped off and the iteration will continue. If they do not match the method will return false and end. If the iteration ends and the stacks are null it will return true.

Time: O(n)
Space: O(1)

## Solution
![alt text](/code401challenges/assets/MultiBracketValidation1.jpg)
![alt text](/code401challenges/assets/MultiBracketValidation2.jpg)
![alt text](/code401challenges/assets/MultiBracketValidation3.jpg)


<a name = "trees"></a>
# Trees

## Challenge
Implementing a Tree.

## Approach & Efficiency
To be added

Time: 
Space: 

## Solution
![alt text](/code401challenges/assets/tobeadded.jpg)

<a name = "breadth"></a>
# Breadth-first Tree Traversal

## Challenge
Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach; print every visited node’s value.

## Approach & Efficiency
Using the methods of a queue we will start at the root and for each step remove the node at the front of the queue while adding its children (if it has any) to the back of the queue. This will continue until the queue is empty.

Time: O(n)
Space: O(1)

## Solution
![alt text](/code401challenges/assets/Breadth-first.jpg)

<a name = "maxValue"></a>
# Max Value in a Binary Tree

## Challenge
Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

## Approach & Efficiency
I built off of the breadth first method I wrote for the last challenge and modified it to fit the challenge. They run through the tree's nodes in very similar ways.

Time: O(n)
Space: O(1)

## Solution
![alt text](/code401challenges/assets/findMaxValue.jpg)