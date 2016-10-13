import java.util.NoSuchElementException

import scala.collection.mutable.ListBuffer

object Pantry {

  var availableIngredients: scala.collection.mutable.ListBuffer[Ingredient] = ListBuffer(
    Powder("ground up frog", 34),
    Powder("turmeric", 29),
    Liquid("newt blood", 88),
    Liquid("child tears", 14),
    Powder("sand", 193),
    Liquid("slug slime", 56),
    Liquid("acid rain", 3),
    Powder("arsenic", 41)
  )

  def showAvailableIngredients(): Unit = {
    availableIngredients.toList foreach {
      case Powder(name, quantity) =>
        println(name + " - powder - " + quantity + " grams")
      case Liquid(name, quantity) =>
        println(name + " - liquid - " + quantity + " mL")
    }
  }

  private def canTakeIngredient(ingredient: Ingredient): Boolean = {
    availableIngredients.toList.find(x => x.name == ingredient.name) match {
      case Some(ing) =>
        println("have found ingredient - going to check quantities")
        ingredient.quantity <= ing.quantity
      case _ =>
        println("couldn't find ingredient in store cupboard")
        false
    }
  }

  private def updatePantry(taken: Ingredient): Unit = {
    var existingIngredient = availableIngredients.toList.find(i => i.name == taken.name).get match {
      case Powder(n, p) => Powder(n, p)
      case Liquid(n, p) => Liquid(n, p)
    }
    val difference = existingIngredient.quantity - taken.quantity
    availableIngredients -= existingIngredient
    availableIngredients += (existingIngredient match {
      case Powder(n, oldP) => Powder(n, difference)
      case Liquid(n, oldP) => Liquid(n, difference)
    })
  }

  def takeIngredient(ingredient: Ingredient): Option[Ingredient] = {
    if (canTakeIngredient(ingredient)) {
      updatePantry(ingredient)
      Some(ingredient)
    } else {
      println("Unable to take ingredient from pantry")
      None
    }
  }

}
