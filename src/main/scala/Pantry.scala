object Pantry {

	val ingredientsInStock: List[Ingredient] = List(
			Powder("crushed ants", 34),
			Liquid("slime (generic)", 87),
			Liquid("crystallised tears", 14),
			Powder("black sand", 56),
			Liquid("lambrini", 50)
		)

	def inStock(ingredientName: String): Boolean = ingredientsInStock.map(_.name).contains(ingredientName)

}