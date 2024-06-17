object Disk_Area{
  
  def area_of_disk(r:Double):Double={
    return math.Pi*r*r;
    
  }
  
  def main(args: Array[String])={
    val radius = 5;
    val area = area_of_disk(radius);
    println(s"The area of the disk with radius $radius is $area");
  }
}