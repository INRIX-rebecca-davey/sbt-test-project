object Main extends App {

	if (args.nonEmpty) {

		//arguments = ingredient type - ingredient name - ingredient quantity

		val ingredientName = args(1)
		val ingredientQuantity = args(0) match {
			case "liquid" => args(2) + "mL"
			case "powder" => args(2) + "g"
			case _ => args(2)
		}

		println("You have added " + ingredientQuantity + " of " + ingredientName + " to your cauldron")

	} else {

		println("Your cauldron is empty - you're a rubbish witch.")

	}

}