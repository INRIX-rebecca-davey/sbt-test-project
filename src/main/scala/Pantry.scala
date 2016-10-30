
object Pantry {

  val ingredientsInStock = List(
    Powder("crushed ants", 53),
    Liquid("slime (generic)", 98),
    Liquid("monkey blood", 44),
    Powder("crystallised tears", 12),
    Liquid("lambrini", 75)
  )

  def hasInStock(name: String): Boolean = ingredientsInStock.map(_.name).contains(name)

}
