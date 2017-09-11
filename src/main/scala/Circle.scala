import scala.annotation.tailrec



case class Circle[A](elems: List[A], length:Int)

object Circle {

  def indexToBeRemoved[A] : (Circle[A], Int) => Int = { (c, k) =>
    val elements = c.length
    k match {
      case x if x > elements =>
        val e = x % elements
        if(e > 0) e - 1 else elements - 1
      case x if x == 0 => x
      case x if x > 0 => k - 1
      case x if x < 0 && Math.abs(x) <= elements=> elements + x
      case x if x < 0 =>
        val e = Math.abs(x) % elements
        if(e > 0) elements - e else e
    }
  }


  def eliminate[A](c: Circle[A], k: Int)(f: (Circle[A], Int) => Int) : Circle[A] = {
    val (l1,l2) = c.elems.splitAt(f(c,k))
    Circle(l2.tail ::: l1, c.length -1)
  }


  @tailrec
  def play[A](c: Circle[A], k: Int) : Either[Throwable,A] = {
    c.length match {
      case x if x <= 0 => Left(new Throwable("no elements in the circle"))
      case x if x == 1 => Right(c.elems.head)
      case _ => play(eliminate(c, k)(indexToBeRemoved),k)
    }
  }

}
