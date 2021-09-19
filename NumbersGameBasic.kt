fun main(){
    val num = 5

    println("you have reached the first trail. THE NUMBERS GAME!! -easy mode-")
    println("to win, you have to guess the correct number I have already chosen!")
    println("TIP: the number is an integer from 0 to 10.")
    println("NOW!! WHAT IS YOUR GUESS?")
    try {
        var guess = readLine()!!.toInt()
        if (guess == num){
            println("HMMPH!! YOU PASS, HUMAN!! *mutters: I thought they were all dumb!*")
        }
        else{
            println("HOHOHO! as expected, you humans are dumb. the correct answer is $num")
        }
    }
    catch (e:Exception){
        println("IDIOT HUMAN! I said number!!")
    }
    println("THE FIRST TRAIL IS FINISHED!!")
}