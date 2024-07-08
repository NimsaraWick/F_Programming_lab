def displayInventory(item: Array[String], quantity: Array[Int]): Unit={
    for ((itm, qnty) <- item.zip(quantity)) {
        println(f"$itm : $qnty")
    }
}

def restockItem(item: Array[String], quantity: Array[Int], item_name: String, item_qty: Int): Unit={
    val index = item.indexOf(item_name)
    if (index >= 0) {
        quantity(index) += item_qty
        println(s"Restocked quantity of $item_name is: ${quantity(index)}")
    } else {
        println(s"Item $item_name does not exist.")
    }
}
def sellItem(item: Array[String], quantity: Array[Int], item_name: String, item_qty: Int): Unit={
    val index = item.indexOf(item_name)
    if (index >= 0) {
        if(quantity(index) >= item_qty){
            quantity(index) -= item_qty;
            println(s"Available quantity of $item_name is: ${quantity(index)}");
        }
        else{
            println(s"$item_name stock is not enough")
        }
    } else {
        println(s"Item $item_name does not exist.")
    }
}


def main(args: Array[String]): Unit = {
    var item = Array("pens", "pencils", "A4 bundles", "erasers");
    var quantity = Array(20, 25, 12, 18);
    displayInventory(item, quantity);

    println("------ function restockItem------");
    restockItem(item, quantity,"pens",4);
    displayInventory(item, quantity);

    println("------ function sellItem ------");
    sellItem(item, quantity,"erasers",7); 
    displayInventory(item, quantity);

}