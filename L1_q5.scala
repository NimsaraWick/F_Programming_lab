object Time{
  
  def easy_pace(time:Double,distance:Double):Double={
    return time*distance;
  }
  def tempo(time:Double,distance:Double):Double={
    return time*distance;
  }
  
  
  def main(args: Array[String])={
    val easy_pace_time = 8; //min per km
    val tempo_time = 7; //min per km
    val total_time=easy_pace(easy_pace_time,2)+tempo(tempo_time,3)+easy_pace(easy_pace_time,2);
    println(s"Total running time $total_time min");
  }
}