import fr.assignment.TreeToList._

object Main extends App {

  val tree : Tree[Int] = Branch(Branch(Leaf, Branch(Branch(Leaf,Leaf,11), Leaf, 2), 3), Branch(Branch(Leaf,Branch(Branch(Leaf,Leaf,12),Leaf,6),1),Branch(Leaf,Leaf,22),8), 5)

  println(getEvenElements(tree))
  println(getOddElements(tree))
  println(sumTree(tree))
  println(oddSumEvenSortedList(tree))

}