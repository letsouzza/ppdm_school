package br.senai.sp.jandira.lionschool.screens

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.UserCard

@Composable
fun StudentsScreen (){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(15.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                )
                Text(
                    text = "Lion \nSchool",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF3347B0)
                )
            }
            Card(
                modifier = Modifier
                    .width(52.dp)
                    .height(52.dp),
                colors = CardDefaults.cardColors(Color(0xFFFFC23D)),
                shape = CircleShape
            ){ }
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth(),
            color = Color(0xFFFFC23D),
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    tint = Color(0xFF9E9FA4)
                )
            },
            label = {
                Text(
                    text = stringResource(R.string.find_course),
                    fontSize = 16.sp,
                    color = Color(0xFF9E9FA4)
                )
            },
            shape = RoundedCornerShape(8.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF5F5F5),
                unfocusedBorderColor = Color(0xFFFFC23D)
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(
                    R.drawable.graduation
                ),
                contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = "Students List",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF3347B0),
                modifier = Modifier
                    .padding(start = 5.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 13.dp)
        ){
            UserCard(
                nomeUser= "Luana Oliveira Dias",
                matricula= "20151001018",
                imageUser= painterResource(R.drawable.user1),
                anoUser= "2022",
                color= Color(0xFFFFC23D)
            )
        }
    }
}

@Preview
@Composable
fun StudentsScreenPreview() {
    StudentsScreen()
}