package com.example.mycalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycalculator.ui.theme.MyCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContent {

            var num1 by remember {
                mutableStateOf("")
            }

            var num2 by remember {
                mutableStateOf("")
            }


            Column {

                TextField(value = num1, onValueChange = {
                    num1 = it
                })

                TextField(value = num2, onValueChange = {
                    num2 = it
                })

                Row {
                    Button(onClick = {
                        var result = num1.toInt() + num2.toInt()
                        Toast.makeText(this@MainActivity,"Ans is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Add")

                    }
                    
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(onClick = {
                        var result = num1.toInt() - num2.toInt()
                        Toast.makeText(this@MainActivity,"Ans is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Sub")

                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(onClick = {
                        var result = num1.toInt() * num2.toInt()
                        Toast.makeText(this@MainActivity,"Ans is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Mul")

                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(onClick = {
                        var result = num1.toInt() / num2.toInt()
                        Toast.makeText(this@MainActivity,"Ans is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Div")

                    }

                }

            }

        }
    }
}




