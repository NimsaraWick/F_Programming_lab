object Wholesale_Cost{
  
  def book_cost(copies:Int):Double={
    val cover_price = 24.95;
    val discount = 0.4;
    return cover_price*(1-discount)*copies;
  }
  def shipping_cost(copies:Int):Double={
    return if(copies>50){(50*3)+(copies-50)*0.75} else copies*3;
  }
  
  def total_cost(copies:Int):Double={
    return {book_cost(copies)}+{shipping_cost(copies)};
    
  }
  
  def main(args: Array[String])={
    val copies = 60;
    val cost = total_cost(copies).toFloat;
    println("The total wholesale cost for "+ copies +" copies : Rs."+cost);
  }
}