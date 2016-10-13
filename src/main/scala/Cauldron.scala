import scala.collection.mutable.ListBuffer

class Cauldron {

  var contents: scala.collection.mutable.ListBuffer[Ingredient] = new ListBuffer()

  def addIngredient(ingredient: Ingredient): Unit = {
    contents += ingredient
  }

  def showCauldronContents(): Unit = {
    contents.toList foreach { ing =>
      println(ing)
    }
  }

  def stirCauldron: Potion = Potion(choosePotionPurpose(contents.toList))

  def choosePotionPurpose(ingredients: List[Ingredient]): String = {
    val possiblePurposes = List("love", "curse", "luck", "happiness", "amnesia", "shrinking")
    val index = ingredients.size % possiblePurposes.size
    possiblePurposes(index)

  }

}
