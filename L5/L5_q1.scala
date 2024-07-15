
def getProductList():List[String]={
    
    println("------Enter Your List ------");
    println("type \"done\" to finish....");
    var list: List[String]= List();
    var input:String = "";
    while (input != "done"){
        input= scala.io.StdIn.readLine();
        if(input!="done"){
            list = list :+ input
        }
    }
    return list;
}
def printProductList(list:List[String]):Unit = {
    for(item <- list){
        println(s"${list.indexOf(item)+1}. $item")
    }
}
def getTotalProducts(list:List[String]):Int ={
    return list.length;
}

def main(args: Array[String]): Unit = {
    val list = getProductList(); 
    printProductList(list);
    println(s"Total number of products: ${getTotalProducts(list)}");
}