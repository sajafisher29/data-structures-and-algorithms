# data-structures-and-algorithms

Repository for Daily Code Challenges assigned in 301 and 401

# 301 Code Challenges
Each set contains up to 10 problems.

The daily challenges will be posted by the instructor at the end of lecture every day. Plan to focus on this task with your partner every day after class until 6 p.m., completing as much as possible during this time, then complete the remainder of the challenges on your own, as needed.

You will be working on these code challenges with a new partner every day. This will also be your partner for the paired lab. Code challenges that are assigned when heading into the weekend should be completed independently.

After lecture, get together with your partner and read through the daily set of challenges. Read the MDN documentation for the topic(s) of the day. Your instructor will also be sharing a YouTube playlist which contains tutorials on each topic. Each video is approximately ten minutes long and you are encouraged to integrate these videos into your workflow as you and your partner see fit.

# 401 Code Challenges
## Table of Contents
1. [Reverse an Array](#reverseArray)
2. [Shift an Array](#shiftArray)
3. [Array Binary Search](#arrayBinarySearch)
4. [Linked List Insertions](#llinsert)
5. [k-th Linked List](#11kth)
6. [Zippering Linked Lists](#llzipper)
7. [PseudoQueue](#pseudoqueue)
8. [FIFO](#FIFO)
9. [MultiBracketValidation](#bracketvalidation)
10. [Trees](#trees)
11. [Breadth-first Tree Traversal](#breadth)
12. [Max Value in a Binary Tree](#maxValue)
13. [Insertion Sort](#insertionSort)
14. [Merge Sort](#mergeSort)
15. [Quick Sort](#quickSort)
16. [Hash Tables](#hashtable)
17. [Repeated Words in a String](#repeatedwords)
18. [Common Values in Binary Trees](#commonvaluesintrees)
19. [Left Join](#leftjoin)
20. [Graphs](#graphs)
21. [Breadth-first Traversal on Graph](#breadthfirstgraph)

<a name = "reverseArray"></a>
# Reverse an Array
This is the first code challenge for Java 401.

## Challenge
Feature Task: Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

Stretch Goal: Implement the same feature with a different methodology.

## Approach & Efficiency
Being new to Java we focused on modifying the array based on the contents' index. We did not get to Big O in lecture and I don't know enough to confidently evaluate it. We put a best guess based on our reading in our whiteboarding solution.

## Solution
![Whiteboard: Reversing an Array](/code401challenges/assets/ArrayReverse.jpg)

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
![Whiteboard: Shifting an Array](/code401challenges/assets/array-shift.jpg)

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
![Whiteboard: Array Binary Search](/code401challenges/assets/array-binary-search.jpg)


<a name = "llinsert"></a>
# Linked List Insertions
Inserting values into a Linked List

## Challenge
Feature Task: Write the following methods for the Linked List class: 
* .append(value) which adds a new node with the given value to the end of the list
* .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
* .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node

Stretch Goal: Write an additional method to delete a node with the given value from the linked list.

## Approach & Efficiency
.....

Time: ....
Space: .....

## Solution
<!-- ![alt text](/code401challenges/assets/.......jpg) -->

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
<!-- ![alt text](/code401challenges/assets/......jpg) -->

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
![Whiteboard: Zippering Linked Lists](/code401challenges/assets/LinkedListMerge1.jpg)
![Whiteboard: Zippering Linked Lists](/code401challenges/assets/LinkedListMerge2.jpg)

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
![Whiteboard: PseudoQueues](/code401challenges/assets/PseudoQueue1.jpg)
![Whiteboard: PseudoQueues](/code401challenges/assets/PseudoQueue2.jpg)

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
![Whiteboard: FIFO](/code401challenges/assets/PseudoQueue2.jpg)
![Whiteboard: FIFO](/code401challenges/assets/FIFO1.jpg)
![Whiteboard: FIFO](/code401challenges/assets/FIFO2.jpg)
![Whiteboard: FIFO](/code401challenges/assets/FIFO3.jpg)
![Whiteboard: FIFO](/code401challenges/assets/FIFO4.jpg)

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
![Whiteboard: MultiBracket Validation](/code401challenges/assets/MultiBracketValidation1.jpg)
![Whiteboard: MultiBracket Validation](/code401challenges/assets/MultiBracketValidation2.jpg)
![Whiteboard: MultiBracket Validation](/code401challenges/assets/MultiBracketValidation3.jpg)


<a name = "trees"></a>
# Trees

## Challenge
Implementing a Tree.

## Approach & Efficiency
<!-- To be added -->

Time: 
Space: 

## Solution
<!-- ![alt text](/code401challenges/assets/tobeadded.jpg) -->

<a name = "breadth"></a>
# Breadth-first Tree Traversal

## Challenge
Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach; print every visited node’s value.

## Approach & Efficiency
Using the methods of a queue we will start at the root and for each step remove the node at the front of the queue while adding its children (if it has any) to the back of the queue. This will continue until the queue is empty.

Time: O(n)
Space: O(1)

## Solution
![Whiteboard: Breadth-first Tree Traversal](/code401challenges/assets/Breadth-first.jpg)

<a name = "maxValue"></a>
# Max Value in a Binary Tree

## Challenge
Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree. You can assume that the values stored in the Binary Tree will be numeric.

## Approach & Efficiency
I built off of the breadth first method I wrote for the last challenge and modified it to fit the challenge. They run through the tree's nodes in very similar ways.

Time: O(n)
Space: O(1)

## Solution
![Whiteboard: Finding the Max Value in a Binary Tree](/code401challenges/assets/findMaxValue.jpg)

<a name = "insertionSort"></a>
# Insertion Sort Algorithm

## Challenge
* Complete a working, tested implementation of Insertion Sort, based on the pseudo code provided below:
````$xslt
 InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
````
* Write unit tests
* Create a blog post on understanding the Insertion Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way.

## Approach & Efficiency
TBD

Time: O(TBD)
Space: O(TBD)

## Solution

<a name = "mergeSort"></a>
# Merge Sort Algorithm

## Challenge
* Complete a working, tested implementation of Merge Sort, based on the pseudo code provided below:
````$xslt
 ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
````
* Write unit tests
* Create a blog post on understanding the Merge Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way.

## Approach & Efficiency
TBD

Time: O(nlog(n))
Space: O(n)

## Solution


<a name = "quickSort"></a>
# Quick Sort Algorithm

## Challenge
* Complete a working, tested implementation of Quick Sort, based on the pseudo code provided below:
````$xslt
 ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
````
* Write unit tests
* Create a blog post on understanding the Quick Sort Algorithm suitable for a 301 level student. Alternately, prepare a presentation that presents the algorithm in a novel way.

## Approach & Efficiency
TBD

Time: O(nlog(n)), worst case scenario is O(n<sup>2</sup>)
Space: O(n)

## Solution

<a name = "hashtable"></a>
# Hashtables

## Features
Implement a Hashtable with the following methods:
* add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
* get: takes in the key and returns the value from the table.
* contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
* hash: takes in an arbitrary key and returns an index in the collection.

## Structure and Testing
* Utilize the Single-responsibility principle: any methods writen should be clean, reusable, abstract component parts to the whole challenge.
* Write tests to prove the following functionality:
    1. Adding a key/value to your hashtable results in the value being in the data structure
    2. Retrieving based on a key returns the value stored
    3. Successfully returns null for a key that does not exist in the hashtable
    4. Successfully handle a collision within the hashtable
    5. Successfully retrieve a value from a bucket within the hashtable that has a collision
    6. Successfully hash a key to an in-range value
    7. Ensure your tests are passing before you submit your solution.  

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Space: 
Time:  

## API
<!-- Description of each method publicly available in each of your hashtable -->

<a name = "repeatedwords"></a>
# Finding Repeated Words in a String

## Features
* Write a function that accepts a lengthy string parameter.
* Without utilizing any of the built-in library methods available, return the first word to occur more than once in that provided string.
* Stretch goal: Modify your function to return a count of each of the words in the provided string
* Stretch goal: Modify your function to return a list of the words most frequently used in the provided string

## Structure and Testing
* Utilize the Single-responsibility principle: any methods writen should be clean, reusable, abstract component parts to the whole challenge.
* Write at least three test assertions for each method that you define.
* Ensure your tests are passing before you submit your solution.

## Approach & Efficiency
I am utilizing the hashtable I created to hold words in the String. As I iterate through the String words will be added to the hashtable if they are not there already. If a word is found already in the hashtable it is returned as the first repeated word. If the iteration finishes the method will return null.

Space: O(n) -> worst case scenario for when there are no repeated words
Time: O(n) -> worst case scenario for when there are no repeated words

## Solution
![Whiteboard: Repeated Words in a String](/code401challenges/assets/repeatedWords1.jpg)
![Whiteboard: Repeated Words in a String](/code401challenges/assets/repeatedWords2.jpg)

<a name = "commonvaluesintrees"></a>
# Finding Common Values in Binary Trees

## Features
* Write a function called tree_intersection that takes two binary tree parameters.
* Without utilizing any of the built-in library methods available, return a set of values found in both trees.
* Stretch goal: When working with BSTs, how can you improve the performance of your algorithm?

## Structure and Testing
* Utilize the Single-responsibility principle: any methods writen should be clean, reusable, abstract component parts to the whole challenge.
* Write at least three test assertions for each method that you define.
* Ensure your tests are passing before you submit your solution.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Space: 
Time:  

## Solution
![Whiteboard: Common Values in Trees](/code401challenges/assets/commonvalues1.jpg)
![Whiteboard: Common Values in Trees](/code401challenges/assets/commonvalues2.jpg)

<a name = "leftjoin"></a>
# Left Join

## Features
* Write a function that LEFT JOINs two hashmaps into a single data structure.
* First parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
* Second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
* Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
* LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
* Returned data structure that holds the results can vary. Just need to achieve LEFT JOIN logic.
* Avoid utilizing any of the library methods available to your language.
* Stretch goal: Consider a RIGHT JOIN. Implement this as a new method. How about by passing an optional parameter to left join method, to specify if LEFT JOIN or RIGHT JOIN logic should be used?

## Structure and Testing
* Utilize the Single-responsibility principle: any methods writen should be clean, reusable, abstract component parts to the whole challenge.
* Write at least three test assertions for each method that you define.
* Ensure your tests are passing before you submit your solution.

## Approach & Efficiency
Utilize a hashtable to hold the combined data. Iterate through the first map and hash it into the hashtable. During each iteration check if the same key is in the second map. If it is append its value to the first map's value and complete insertion into the hashtable. If it is not, append "null" and complete insertion.
Space: O(n)
Time: O(n<sup>2</sup>)

## Solution
![Whiteboard: Left Join](/code401challenges/assets/leftjoin.jpg)

<a name = "graphs"></a>
# Graphs

## Challenge
Impliment a graph. The graph should be represented as an adjacency list, and should include the following methods:
* AddNode()
    * Adds a new node to the graph
    * Takes in the value of that node
    * Returns the added node
* AddEdge()
    * Adds a new edge between two nodes in the graph
    * Include the ability to have a “weight”
    * Takes in the two nodes to be connected by the edge
        * Both nodes should already be in the Graph
* GetNodes()
    * Returns all of the nodes in the graph as a collection (set, list, or similar)
* GetNeighbors()
    * Returns a collection of nodes connected to the given node
    * Takes in a given node
    * Include the weight of the connection in the returned collection
* Size()
    * Returns the total number of nodes in the graph

## Approach & Efficiency
TBA

## Structure and Testing
* Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge.
* Write tests to prove the following functionality:
    * Node can be successfully added to the graph
    * An edge can be successfully added to the graph
    * A collection of all nodes can be properly retrieved from the graph
    * All appropriate neighbors can be retrieved from the graph
    * Neighbors are returned with the weight between nodes included
    * The proper size is returned, representing the number of nodes in the graph
    * A graph with only one node and edge can be properly returned
    * An empty graph properly returns null
* Ensure tests are passing.

## API
* AddNode()
* AddEdge()
* GetNodes()
* GetNeighbors()
* Size()

[Breadth-first Traversal on Graph](#breadthfirstgraph)
<a name = "graphs"></a>
# Breadth-First Traversal on a Graph

## Challenge
Implement a breath-first traversal on a graph.
* Extend graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available, return a collection of nodes in the order they were visited. Display the collection.
* Stretch goal: Define a new method that accepts two nodes as input and uses your traversal algorithm to determine if a path exists between the two nodes.

## Approach & Efficiency
I will use the same fundamentals of a breadth-first traversal of a tree with the additions of a Set to track whether or not a Node has been counted. Using the Set will ensure there will be no infinite loops caused by cycles in the graph.

Space: O(n)
Time:O(n)

## Structure and Testing
* Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge.
* Write at least three test assertions for each method defined.
* Ensure tests are passing.

## API
* 