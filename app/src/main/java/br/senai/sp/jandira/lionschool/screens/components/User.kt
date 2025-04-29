package br.senai.sp.jandira.lionschool.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.ContactEmergency
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun UserCard(
    nomeUser: String = "Nome Usuário",
    matricula: String = "00000000000",
    imageUser: Painter = painterResource(R.drawable.person),
    anoUser: String = "0000",
    color: Color = Color.Black
){
    Card(
        modifier = Modifier
            .padding(bottom = 12.dp)
            .fillMaxWidth()
            .height(78.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(Color(0xFF9FA9E1))
    ){
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Card(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(12.dp),
                shape = RoundedCornerShape(0.dp),
                colors = CardDefaults.cardColors(color)
            ){ }
            Image(
                painter = imageUser,
                contentDescription = "",
                modifier = Modifier
                    .padding(start = 5.dp)
                    .size(60.dp)
            )
            Column(
                modifier = Modifier
                    .padding(start = 7.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = nomeUser,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        imageVector = Icons.Default.ContactEmergency,
                        contentDescription = "",
                        tint = Color.White
                    )
                    Text(
                        text = matricula,
                        fontSize = 10.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(130.dp)
                    .padding(end = 5.dp)
                    .padding(top = 40.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ){
                Icon(
                    imageVector = Icons.Default.CalendarMonth,
                    contentDescription = "",
                    tint = Color.White
                )
                Text(
                    text = anoUser,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold,
                    color = color,
                )
            }
        }
    }

}

@Preview
@Composable
private fun UserCardPreview(){
    UserCard()
}