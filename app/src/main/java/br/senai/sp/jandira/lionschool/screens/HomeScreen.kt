package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.5f),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .size(160.dp)
                )
                Text(
                    text = "Lion\nSchool",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF3347B0)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp)
                    .weight(2f),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Find your favorite course",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3347B0)
                )
                Card(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(bottom = 30.dp)
                        .height(6.dp)
                        .width(60.dp),
                    colors = CardDefaults.cardColors(Color(0xFFFFC23D))
                ){}
                Text(
                    text = "Get to your destination faster, study at\n " +
                            "the best vocational school in Brazil. Be\n " +
                            "the best version of yourself.",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    color = Color(0xFF9E9FA4),
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.5f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ){
                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(48.dp)
                        .width(270.dp),
                    shape = RoundedCornerShape(16.dp),
                    border = BorderStroke(
                        width = 2.dp,
                        color = Color(0xFF3347B0)
                    ),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFC23D))
                ){
                    Text(
                        text = "Get Started",
                        fontSize = 16.sp
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)
                        .height(40.dp),
                    horizontalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(
                            R.drawable.youtube
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .size(33.dp)
                    )
                    Image(
                        painter = painterResource(
                            R.drawable.twitter
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(33.dp)
                    )
                    Image(
                        painter = painterResource(
                            R.drawable.instagram
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(33.dp)
                    )
                    Image(
                        painter = painterResource(
                            R.drawable.facebook
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(33.dp)
                    )

                }
            }
        }
    }
}


@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}