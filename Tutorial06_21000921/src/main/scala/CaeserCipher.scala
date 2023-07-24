import scala.io.StdIn.readInt;

object CaeserCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

  def encryption(a: Int): Unit = {

    val shift = (scala.io.StdIn.readLine("Shifted by : ").toInt + alphabet.size) % alphabet.size

    val input = scala.io.StdIn.readLine("Enter the secret message:")

    val output = input.map((c: Char) => {

      val x = alphabet.indexOf(c.toUpper)

      if (x == -1) {
        c
      }
      else {
        alphabet((x + shift) % alphabet.size)
      }

    });

    println("Message :" + output);

    }
  println("_______Caeser Cipher_______");
  println("Encryption -> 1 \nDecryption -> 2");
  print("Enter Your Choice : ");

  val n:Int= readInt();
   n match{
     case 1 => encryption(1);
     case 2 => encryption(-1);
     case _ => println("Please Check Again...Invalid Entry!");
   }
}