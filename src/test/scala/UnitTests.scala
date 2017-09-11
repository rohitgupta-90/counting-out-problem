import org.scalatest.{FlatSpec, Matchers}


class UnitTests extends FlatSpec with Matchers {

  "function eliminate" should "remove the the 3rd index in the circle" in {
    val c1 = Circle(1 to 8 toList, 8)
    assert(Circle.eliminate(c1,3)((_,_) => 2) == Circle(List(4,5,6,7,8,1,2), 7))
  }

  it should "remove the the 0th index in the circle" in {
    val c1 = Circle(1 to 8 toList, 8)
    assert(Circle.eliminate(c1,3)((_,_) => 0) == Circle(List(2,3,4,5,6,7,8),7))
  }


  "indexToBeRemoved" should "return the index for a given value of n=8, k=3" in {
    val c1 = Circle(1 to 8 toList, 8)
    assert(Circle.indexToBeRemoved(c1,4) == 3)
  }

  it should "return the index for a given value of n=8, k=9" in {
    val c1 = Circle(1 to 8 toList, 8)
    assert(Circle.indexToBeRemoved(c1,9) == 0)
  }

  it should "return the index for a given value of n=7, k=-7" in {
    val c1 =Circle(1 to 7 toList, 7)
    assert(Circle.indexToBeRemoved(c1,-7) == 0)
  }

  it should "return the index for a given value of n=7, k=-14" in {
    val c1 = Circle(1 to 7 toList, 7)
    assert(Circle.indexToBeRemoved(c1,-14) == 0)
  }

  it should "return the index for a given value of n=7, k=-12" in {
    val c1 = Circle(1 to 7 toList, 7)
    assert(Circle.indexToBeRemoved(c1,-12) == 2)
  }






}
