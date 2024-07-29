def getStudentInfo: (String, Int, Int, Double, Char) = {
    var validInput = false;
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'D');

    while (!validInput) {
      printf("Enter student's name: ");
      val name = scala.io.StdIn.readLine();

      printf("Enter marks obtained: ");
      val marks = scala.io.StdIn.readLine().toInt;

      printf("Enter total possible marks: ");
      val totalMarks = scala.io.StdIn.readLine().toInt;

      val (isValid, errorMessage) = validateInput(name, marks, totalMarks);

      if (isValid) {
        val percentage = (marks.toDouble / totalMarks) * 100
        val grade = percentage match {
          case p if p >= 90 => 'A';
          case p if p >= 75 => 'B';
          case p if p >= 50 => 'C';
          case _ => 'D';
        }
        studentInfo = (name, marks, totalMarks, percentage, grade);
        validInput = true;
      } else {
        println(s"Invalid input: $errorMessage");
      }
    }
    return studentInfo ;
}


def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, String) = {
    if (name.isEmpty) {
      return (false, "Name cannot be empty.");
    } else if (marks < 0 || marks > totalMarks) {
      return (false, "Marks should be between 0 and total possible marks.");
    } else if (totalMarks <= 0) {
      return (false, "Total possible marks must be greater than 0.");
    } else {
      return (true, "None");
    }
}

def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name");
    println(s"Marks Obtained: $marks");
    println(s"Total Possible Marks: $totalMarks");
    println(f"Percentage: $percentage%.2f%%");
    println(s"Grade: $grade");
}

def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    getStudentInfo;
  
}

def main(args: Array[String]): Unit = {
    println("------Student Record Management System------");
    val studentRecord = getStudentInfoWithRetry;

    println("\nStudent Record:");
    printStudentRecord(studentRecord);
}

