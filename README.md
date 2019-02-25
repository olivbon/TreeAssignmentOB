[![Build Status](https://travis-ci.org/olivbon/TreeAssignmentOB.svg?branch=master)](https://travis-ci.org/olivbon/TreeAssignmentOB)
[![codecov](https://codecov.io/gh/olivbon/TreeAssignmentOB/branch/master/graph/badge.svg)](https://codecov.io/gh/olivbon/TreeAssignmentOB)

# TreeAssignmentOB

Context
----------

Given a tree (un-balanced and un-sorted) containing positive integers greater than 0 such that every
node of this tree contains exactly 1 integer, write a recursive algorithm that for a given tree returns
a linked list containing all elements from the tree, plus additional element that is equal to sum of
all elements in the tree. Elements in this linked list have to be ordered with respect to the following
rules:

* all odd elements are placed left from the sum element and in ascending order
* all even elements are placed right from the sum element and in descending order

Implemented algorithm has to have complexity O(n²). Usage of any additional data structures is not allowed.

Algorithm
------------

The algorithm is split in 3 parts.

* The sum calculation in O(n)
* The odd list generation in O(n)
* The even list generation in O(n)

Then we sort both list in Θ(n log(n)) as described above and we concatenate them without forgetting the sum element at the middle.

It is just a sum of complexity, and so, the algorithm has complexity O(n log(n)).
