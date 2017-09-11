
object Main extends App {


  override def main(args: Array[String]) = {
    if (args.length != 2)
      println("insufficient arguments")
    else {
      val res = countOut(Integer.valueOf(args(0)), Integer.valueOf(args(1)))
      res.fold(e => println(e.getMessage), v => println(s"the position you need to stand at is : $v"))
    }
  }

  def countOut(n: Int, k: Int): Either[Throwable, Int] = {
    val s: List[Int] = (1 to n).toList
    val circle = Circle(s, n)
    Circle.play(circle, k)
  }

}
