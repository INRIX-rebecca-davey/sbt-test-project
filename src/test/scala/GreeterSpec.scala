import org.scalatest.FlatSpec

class GreeterSpec extends FlatSpec {

	val greeter = new Greeter

	"Cases" should "be maintained when greeting" in {
		println("hello")
		assert(greeter.greetPerson("mIxOfCaSeS") == "Hello there, mIxOfCaSeS!")
	}

}