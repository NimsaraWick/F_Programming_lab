object Sphere{
  
  def sphere_volume(radius:Double):Double={
    return 4*math.Pi*radius*radius*radius/3;
    
  }
  
  def main(args: Array[String])={
    val radius = 5;
    println(s"The volume of a sphere with radius $radius is ${sphere_volume(radius)}");
  }
}