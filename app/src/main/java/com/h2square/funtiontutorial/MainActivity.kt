package com.h2square.funtiontutorial

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.h2square.funtiontutorial.ui.theme.FuntionTutorialTheme
import java.util.Timer
import kotlin.concurrent.schedule


//ㅍㅡ로그램 메인 함수
fun sayHello(){
    println("안녕 난 정빈이야")
}
fun getRandomNumber(min :Int=1,max:Int=999):Int{
    val randomNumber=(min..max).random()
    println("무작위수는 $randomNumber 입니다")
    return randomNumber
}
fun cookRamen(ramenKind:String="일반"){
    println("주방에간다")
    println("냄비를 선반에서 꺼낸다")
    println("냄비에 물500ml를 담는다")
    println("선반에서 $ramenKind 라면 1봉지를 꺼낸다")
    println("냄비에 불을올려서 물을끈ㄹ인ㄴ다")
    Timer().schedule(3000){
        println("완성")
    }
}
//fun main(){
//
//    getRandomNumber()
//
//}

class MainActivity : ComponentActivity() {

    companion object{
        const val TAG:String="람다"
    }

    val myName:String="이정빈"

    var myOptionalName:String?=null

    var someOPtionalLamda:(()->Unit)?=null
    val someLamda:() -> Unit={}

    fun someFuntion(){
        return Unit
    }

    val someLamdaReturn:()->Int={

        Log.d(TAG,"someLamdaReturn called")
        100
    }
    fun someFunctionReturn():Int{

        Log.d(TAG,"someFuntionReturn called")
        return 100
    }


    val someLamdaWithParam:(number:Int)->Unit={
        Log.d(TAG,"someLamdaWithParam it: $it")

    }

    fun someFunctionWhithParam(number:Int){
        Log.d(TAG,"someFunctionWhithParam called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Log.d(TAG,"MAINACTIVITY=ONCREATE() called")
        setContent {
            FuntionTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FuntionTutorialTheme {
        Greeting("Android")
    }
}