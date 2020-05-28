class CalculateHomeSalary (val h1: Int , val h2: Int) {

  var nHours : Int = h1;
  var otHours : Int = h2;



  def normal(hours:Int):Int=hours*150

  def ot(hours:Int):Int=hours*75

  def income(h1:Int,h2:Int):Int= normal(h1)+ot(h2)

  def tax(income:Int):Double= income * .1

  def takeHome():Double= income(nHours,otHours)-tax(income(nHours,otHours))

}
