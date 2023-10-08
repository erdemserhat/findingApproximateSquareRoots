import java.lang.Exception

fun main(args: Array<String>) {

    fun findSquare(a:Float):Float{
        var squareA:Float=0F;

        //define sensitivity
        val range=a-0.0000000001F
        while (squareA*squareA!=a){
            //increase the value until condition will be true
            squareA+=0.000001F
            if (squareA*squareA>range) break

        }
        return squareA

    }

    println("Please enter the number which you want to learn square roots:")
    var number:String= readln()
    number+="F"
    var orgNumber:Float
    try {
        orgNumber=number.toFloat()
    }catch (a:Exception){
        throw Exception("please enter valid number,ex :1.121")
        println(number)
    }

    println( findSquare(orgNumber))





}