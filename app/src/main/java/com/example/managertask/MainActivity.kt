package com.example.managertask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.managertask.ui.theme.ManagerTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ManagerTaskTheme {

                Surface (modifier=Modifier.fillMaxSize(),
                  color = MaterialTheme.colorScheme.background
                )

                {

                }

            }
        }
    }
}
@Composable
fun ManagerTask(text1: String,text2:String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier=Modifier.fillMaxSize()
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier,
        ) {
            val image = painterResource(R.drawable.ic_task_completed)
            Image(
                painter = image,
                contentDescription = null,
            )

            ManagerTaskText(
                text1 =text1,
                text2= text2,

                )
        }
    }
}

@Composable
fun ManagerTaskText(text1: String,text2:String, modifier: Modifier = Modifier) {
    Column(

    )
    {
        Text(
            text=text1,
            fontWeight = FontWeight.Bold,
            modifier= modifier.absolutePadding(top = 24.dp,bottom = 8.dp)

        )
        Text(
            text=text2,
            fontSize = 16.sp,
            modifier= Modifier
                .align(Alignment.CenterHorizontally)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ManagerTaskPreview() {
    ManagerTaskTheme {
        ManagerTask("All tasks completed","Nice work")
    }
}