package fr.assignment

object TreeToList {

  sealed trait Tree[+A]

  case object Leaf extends Tree[Nothing]

  case class Branch[A](l: Tree[A], r: Tree[A], value: A) extends Tree[A]

  /**
    *
    * @param tree
    * @return the sum of all elements of the tree
    */
  def sumTree(tree: Tree[Int]): Int =
    tree match {
      case Leaf => 0
      case Branch(l, r, v) => v + sumTree(l) + sumTree(r)
    }

  /**
    *
    * @param tree
    * @return even element of the tree
    */
  def getEvenElements(tree: Tree[Int]): List[Int] =
    tree match {
      case Leaf => List()
      case Branch(l, r, v) if v % 2 == 0 => v +: getEvenElements(l) ::: getEvenElements(r)
      case Branch(l,r,_) => getEvenElements(l) ::: getEvenElements(r)
    }

  /**
    *
    * @param tree
    * @return odd elements of the tree
    */
  def getOddElements(tree: Tree[Int]): List[Int] =
    tree match {
      case Leaf => List()
      case Branch(l, r, v) if v % 2 != 0 => v +: getOddElements(l) ::: getOddElements(r)
      case Branch(l,r,_) => getOddElements(l) ::: getOddElements(r)
    }

  /** Generate a list of int from the tree with the following pattern :
    * - odd elements placed left from the sum element and in ascending order
    * - the sum element that is equal to sum of all elements in the tree
    * - even elements placed right from the sum element and in descending order
    *
    * @param tree
    * @return the list
    */
  def oddSumEvenSortedList(tree : Tree[Int]) : List[Int] =
    (getOddElements(tree).sortWith(_ < _) :+ sumTree(tree)) ::: getEvenElements(tree).sortWith(_ > _)


}
