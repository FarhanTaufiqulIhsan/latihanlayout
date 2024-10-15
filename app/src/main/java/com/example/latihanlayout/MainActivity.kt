package com.example.latihanlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.latihanlayout.ui.theme.LatihanlayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LatihanlayoutTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AlienAndroids() // Menampilkan dua gambar
                }
            }
        }
    }
}

@Composable
fun AlienAndroid(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.alienandroid),
        contentDescription = null
    )
}

@Composable
fun AlienAndroids() {
    Row(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column( // Menggunakan Row untuk menampilkan dua gambar secara horizontal
            modifier = Modifier
                .padding(16.dp)
        ) {
            AlienAndroid(
                modifier = Modifier
                    .size(100.dp) // Ukuran lebih besar agar gambar terlihat jelas
                    .padding(8.dp)
            )
            AlienAndroid(
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LatihanlayoutTheme {
        AlienAndroids() // Menampilkan dua gambar dalam preview
    }
}
