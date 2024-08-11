object CeasarCipher{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    def encryption(text:String , shift:Int):String={

        var shift_ = (shift+ alphabet.size) % alphabet.size;
        val outputText = text.map( (c: Char) => { 

            val x = alphabet.indexOf(c.toUpper)
            if (x == -1){
                c
            }
            else{
                alphabet((x + shift_) % alphabet.size)
                } 
        });
        outputText.mkString;
    }
    def decryption(text:String , shifted:Int):String={
        
        encryption(text,-(shifted % alphabet.size));
    }

}
def main(args: Array[String]): Unit = {
    println("----Encryption-----");
    var shift = scala.io.StdIn.readLine("Shift By: ").toInt;
    var inputText = scala.io.StdIn.readLine("Secret Message: ")
    println(s"Encrypted message : ${CeasarCipher.encryption(inputText,shift)}");

    println("----Decryption-----");
    inputText = scala.io.StdIn.readLine("Secret Message: ")
    shift = scala.io.StdIn.readLine("Shifted By: ").toInt;
    println(s"Decrypted message : ${CeasarCipher.decryption(inputText,shift)}");

}