object MyApp {
def sieveOfEratosthenes(n: Int): Unit =
 {
     // Create a boolean array "prime[0..n]" and initialize
     // all entries it as true. A value in prime[i] will
     // finally be false if i is Not a prime, else true.
     var prime = new Array[Boolean](n+1);
     for(i <- 0 until n)
         prime(i) = true;

var p:Int = 2;

     while( p*p <= n )
     {
         // If prime[p] is not changed, then it is a prime
         if(prime(p) == true)
         {
             // Update all multiples of p
             for(i <- p*p until n by p)
                 prime(i) = false;
         }
         p += 1;
     }

     // Print all prime numbers
     print("[OUTPUT] ");
     for(i <- 2 until n)
     {
         if(prime(i) == true)
             print(i + " ");
     }
     println("");
 }
  def main(args: Array[String]): Unit = {
    var input:Int = 20;
    println("[INPUT] " + input);
    sieveOfEratosthenes(input);
  }
}
