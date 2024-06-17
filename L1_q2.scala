object Temperature{
  
  def cels_to_fahren(cels:Double):Double={
    return (cels*1.8)+32;
    
  }
  
  def main(args: Array[String])={
    val temp_cels = 35;
    println(s"The temperature $temp_cels C  in fahrenheit : ${cels_to_fahren(temp_cels)}");
  }
}