import org.scalatest.{FlatSpec, Matchers}


class CountingOutTest extends FlatSpec with Matchers {

  "Counting Out Test" should "return 7th position with n = 7, and k = 2" in {
    assert(Main.countOut(7,2) == Right(7))
  }

  it should "return 5th postion when n=7, k=7" in {
    assert(Main.countOut(7,7) == Right(5))
  }

  it should "return 3rd postion when n=3, k=2" in {
    assert(Main.countOut(3,2) == Right(3))
  }

  it should "return 4th position with n=7, k=3" in {
    assert(Main.countOut(7,3) == Right(4))
  }

  it should "return the 1st position for n=1, k=20" in {
    assert(Main.countOut(1,20) == Right(1))
  }

  it should "return error for k =0 " in {
    assert(Main.countOut(7,0).isLeft)
  }

  it should "return 2th position for n=3, k=10" in {
    assert(Main.countOut(3,10) == Right(2))
  }

  it should "return 7th position for n=7 k=-12" in {
    assert(Main.countOut(7,-12) == Right(7))
  }

  it should "return 1st position for n=7 k=12" in {
    assert(Main.countOut(7,12) == Right(1))
  }

  it should "return 1st position for n=4 k=-1" in {
    assert(Main.countOut(4,-1) == Right(1))
  }

  it should "return 1st position for n=2 k=2" in {
    assert(Main.countOut(2,2) == Right(1))
  }

  it should "return 3rd position for n=3 k=2" in {
    assert(Main.countOut(3,2) == Right(3))
  }

  it should "return 1st position for n=4 k=2" in {
    assert(Main.countOut(4,2) == Right(1))
  }

  it should "return 3st position for n=5 k=2" in {
    assert(Main.countOut(5,2) == Right(3))
  }

  it should "return 5th position for n=6 k=2" in {
    assert(Main.countOut(6,2) == Right(5))
  }

  it should "return 7th position for n=7 k=2" in {
    assert(Main.countOut(7,2) == Right(7))
  }

  it should "return 1st position for n=8 k=2" in {
    assert(Main.countOut(8,2) == Right(1))
  }

  it should "return exception for n in -ve" in {
    assert(Main.countOut(-4,10).isLeft)
  }

  it should "return exception for n 0" in {
    assert(Main.countOut(0,10).isLeft)
  }

  it should "return a valid output for large k" in {
    assert(Main.countOut(7,Integer.MAX_VALUE).isRight)
  }

  //Creating a larger takes a long time to compute the problem.
  //  it should "return a valid output for large n" in {
  //    assert(Main.countOut(Integer.MAX_VALUE,1).isRight)
  //  }

}
