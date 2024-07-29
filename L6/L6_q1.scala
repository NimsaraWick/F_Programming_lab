  case class Product(id: Int, name: String, quantity: Int, price: Double);
  type Inventory = Array[Product];

  val inventory_1: Inventory = Array(
    Product(1, "Books", 10, 500),
    Product(2, "Bags", 5, 4000),
    Product(3, "Water bottles", 20,800)
  );

  val inventory_2: Inventory = Array(
    Product(1, "Books", 7, 600),
    Product(2, "Bags", 3, 4500),
    Product(4, "Pencil Boxes", 9, 300)
  );

  def get_product_names(inventory: Inventory): Array[String] = {
    inventory.map(_.name);
  }

  def calculate_total(inventory: Inventory): Double = {
    inventory.map(product =>product.quantity * product.price).sum;
  }

  def is_inventory_empty(inventory: Inventory): Boolean = {
    inventory.isEmpty;
  }


  def merge_inventories(inventory_1: Inventory, inventory_2: Inventory): Inventory = {
    val combinedInventory = inventory_1 ++ inventory_2;
    val groupedInventory = combinedInventory.groupBy(_.id);
  
    groupedInventory.map { case (id, products) =>
    val name = products.head.name;
    val totalQuantity = products.map(_.quantity).sum;
    val maxPrice = products.map(_.price).max;
    Product(id, name, totalQuantity, maxPrice);
  }.toArray
}

  def check_products(inventory: Inventory, productId: Int): Unit = {
    inventory.find(_.id == productId) match {
      case Some(Product(id, name, quantity, price)) =>
        println(s"Product ID: $id, Name: $name, Quantity: $quantity, Price: $price");
      case None =>
        println(s"Product with ID $productId does not exist.");
    }
  }

 
  def main(args: Array[String]): Unit = {

    println("All product names in inventory_1:");
    println(get_product_names(inventory_1).mkString(", "));


    println("Total value of all products in inventory_1:");
    println(calculate_total(inventory_1));


    println("Is inventory_1 empty?");
    println(is_inventory_empty(inventory_1));


    println("Merged inventory:")
    val mergedInventory = merge_inventories(inventory_1, inventory_2);
    mergedInventory.foreach { case Product(id, name, quantity, price) =>
      println(s"ID: $id, Name: $name, Quantity: $quantity, Price: $price");
    }

    println("Details of product with ID 3 in inventory_1:");
    check_products(inventory_1, 3);
  }

