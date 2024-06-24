
def salary_normal(hours:Double):Double={
    return hours*250;
}
def salary_OT(hours:Double):Double={
    return 85*hours;
}
def taxes(salary:Double):Double={
    return salary*0.88;
}

def main(args: Array[String]): Unit = {
    val salary= taxes(salary_normal(40)+salary_OT(30));
    printf(s"Take home weekly salary : $salary");
}