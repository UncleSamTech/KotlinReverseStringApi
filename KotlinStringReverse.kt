import java.util.*;
class KotlinStringReverse{

fun main(){

fun helper(start : Int, end : Int, vararg : Array<Char>){

        /**
         * A limit is set on this to check for when the start value is
         * greater than the last value
         */
        if(start >= end){
            return
        }

        /**
         * this is where we swipe the first position to be the last position
         * and the last position to be first
         */
        val tmp = vararg[start]

        vararg[start] = vararg[end]
        vararg[end] = tmp

        helper(start + 1, end - 1, vararg)
        println(Arrays.toString(vararg))
    }//closing brace of helper functions
    
    /**
     *This is the function for reversing whatever string value passed by implementing the helper function
    */
    
     fun reverseStrings(vararg : Array<Char>){

        helper(0,vararg.size - 1, vararg)

    }//closing brace of function
//test case of function to check our code
val test_values = arrayOf('h','e','l','l','o')
reverseStrings(test_values)




}
}
