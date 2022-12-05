[memory.pdf](https://github.com/CSIS210-02-S22/problemset3-kade-cam/files/8394047/memory.pdf)
# problemset3
CSIS 210 Fall 2021 Problem Set 3

3.3 Questions

Question1) The above code snippet is printing linkedlist a. This would print 17, 3, 19.

Question2) Picture uploaded as a pdf

Question3) The concern that is raised when looking at this code is about list b's pointers. It is not creating a new linkedlist when it is cloned, it is just pointing to linkedlist a in memory. Any changes made to a are made to b, as well as an changes made to b are implemented in a.

Question4) To satisfy the list interface, we need to add both addAll methods (one adds at the end and the other adds at a specific index), a containsAll method, an equals method, a hashCode method, indexOf method, isEmpty method, lastIndexOf method, listIterator method, remove method (a specific object), removeAll method, replaceAll method, retainAll method, a sort method, spliterator method, sublist method, and a twoToArray method



3.4 questions

Question1) This big O notation would be O(n).

Question2) This big O notation would be O(n^2).

Question3)
  a) The purpose of this method is to flip an entire array and have it go backwards. For example an array that went 1,2,3,4,5,6 would turn into 6, 5, 4, 3, 2, 1
  
  b) if the size of the array is n, then there will be n/2 accesses of the array since the loop only loops half of the size of the array.
  
  c) The big O notation would be be O(n/2).
  
