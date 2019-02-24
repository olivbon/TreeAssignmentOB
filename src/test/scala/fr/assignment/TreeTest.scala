package fr.assignment

import fr.assignment.TreeToList._
import org.scalatest.{FlatSpec, Matchers}

class TreeTest extends FlatSpec with Matchers {

  "SumTree" should "sum tree" in {
    val tree : Tree[Int] = Branch(Branch(Leaf, Branch(Branch(Leaf,Leaf,11), Leaf, 2), 3), Branch(Branch(Leaf,Branch(Branch(Leaf,Leaf,12),Leaf,6),1),Branch(Leaf,Leaf,22),8), 5)

    sumTree(tree) should equal(70)
  }

  it should "sum empty tree" in {
    val tree = Leaf

    sumTree(tree) should equal(0)
  }

  "EvenList" should "list even elements from the tree" in {
    val tree : Tree[Int] = Branch(Branch(Leaf, Branch(Branch(Leaf,Leaf,11), Leaf, 2), 3), Branch(Branch(Leaf,Branch(Branch(Leaf,Leaf,12),Leaf,6),1),Branch(Leaf,Leaf,22),8), 5)

    getEvenElements(tree) should equal(List(2,8,6,12,22))
  }

  "OddList" should "list odd elements from the tree" in {
    val tree : Tree[Int] = Branch(Branch(Leaf, Branch(Branch(Leaf,Leaf,11), Leaf, 2), 3), Branch(Branch(Leaf,Branch(Branch(Leaf,Leaf,12),Leaf,6),1),Branch(Leaf,Leaf,22),8), 5)

    getOddElements(tree) should equal(List(5,3,11,1))
  }

  "OddSumEvenSortedList" should "list odd elements in ascending order, the sum element and even elements in descending order" in {
    val tree : Tree[Int] = Branch(Branch(Leaf, Branch(Branch(Leaf,Leaf,11), Leaf, 2), 3), Branch(Branch(Leaf,Branch(Branch(Leaf,Leaf,12),Leaf,6),1),Branch(Leaf,Leaf,22),8), 5)

    oddSumEvenSortedList(tree) should equal(List(1, 3, 5, 11, 70, 22, 12, 8, 6, 2))
  }
}
