import org.scalatest.FlatSpec

class PantrySpec extends FlatSpec {

  "Pantry stock" should "be correctly evaluated" in {
    assert(Pantry.hasInStock("whole ants") == false)
    assert(Pantry.hasInStock("crushed ants") == true)
  }

}
