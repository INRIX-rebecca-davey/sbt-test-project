trait Ingredient {
	val name: String
	val quantity: Int
}

case class Liquid(name: String, quantity: Int) extends Ingredient
case class Powder(name: String, quantity: Int) extends Ingredient