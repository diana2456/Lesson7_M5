package com.example.lesson7_m5

@Suppress("UNREACHABLE_CODE")
class Math {

    var result = ""
    fun add(a:String,b:String):String{
        result = if (a.isNotBlank() && b.isNotEmpty() && b != "" && b.isNotEmpty()){
          if (a.isNumbers() && b.isNumbers()){
            (a.toInt()+b.toInt()).toString()
           }else "Enter number"
        }else  "Enter number"
         return result
    }

    fun divide(a:String, b:String):String{
         result = if (a.isNotBlank() && b.isNotEmpty() && b != "" && b.isNotEmpty()){
            if (a.isNumbers() && b.isNumbers()){
                (a.toInt()/b.toInt()).toString()
            }else "Enter number"
        }else  "Enter number"
        return result
    }

    fun minus(a:String, b:String):String{
         result = if (a.isNotBlank() && b.isNotEmpty() && b != "" && b.isNotEmpty()){
            if (a.isNumbers() && b.isNumbers()){
                (a.toInt()-b.toInt()).toString()
            }else "Enter number"
        }else  "Enter number"
        return result
    }

    fun multiply(a:String, b:String):String{
        result = if (a.isNotBlank() && b.isNotEmpty() && b != "" && b.isNotEmpty()){
            if (a.isNumbers() && b.isNumbers()){
                (a.toInt()*b.toInt()).toString()
            }else "Enter number"
        }else  "Enter number"
        return result
    }

    fun String.isNumbers():Boolean{
        return this.matches(Regex("[+-]?\\d*(\\.\\d+)?"))
    }
}