def even_sum(list:List[Int]):Int = { 
    //return list.filter(_%2 == 0).sum;
    var sum:Int = 0;
    for(x <- list){
        if(x % 2 == 0){
            sum += x;
        }  
    }
    return sum;
}

def main(args: Array[String]): Unit = {
    val int_list = List(1,2,3,4,5,6,7);
    printf(s"Sum of all the even numbers : ${even_sum(int_list)}");
}