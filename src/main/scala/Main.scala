object Main extends App {

  if (args.nonEmpty) {
    val ingredientUnit = args.head match {
      case "liquid" => "mL"
      case "powder" => "g"
    }
    val ingredientName = args(1)
    val ingredientQuantity = args(2) + ingredientUnit

    println("You have added " + ingredientQuantity + " of " + ingredientName + " to your cauldron")
  } else {
    println("Add some ingredients to your cauldron to make a lovely potion!")
  }

}
