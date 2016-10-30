import org.scalatest._

class PantrySpec extends FlatSpec {

	"Pantry stock" should "be evaluated correctly" in {
		assert(Pantry.inStock("puppies") == false)
		assert(Pantry.inStock("lambrini") == true)
	}

}