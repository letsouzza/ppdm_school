package br.senai.sp.jandira.lionschool.screens.components

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTimeFilled
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun Courses(
    siglaCurso: String = "Sigla",
    nomeCurso: String = "Nome do Curso",
    descricaoCurso: String = "Descrição do Curso",
    imageCurso: Painter = painterResource(R.drawable.fakeimage),
    tempoCurso: String = "0 Semestres"
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            .height(220.dp),
        shape = RoundedCornerShape(18.dp),
        border = BorderStroke(
            width = 1.dp,
            color = Color(0xFFFFC23D)
        )
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF3347B0),
                        Color(0xFFCFD4EA)
                    )
                ))
        ){
            Column(
                modifier = Modifier
                    .padding(15.dp)
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = imageCurso,
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
                    )
                    Text(
                        text = siglaCurso,
                        fontSize = 64.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFFC23D),
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                }
                Column {
                    Text(
                        text = nomeCurso,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 6.dp)
                            .padding(top = 10.dp)
                    )
                    Text(
                        text = descricaoCurso,
                        fontSize = 14.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 6.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(start = 6.dp)
                        .padding(top = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        imageVector = Icons.Default.AccessTimeFilled,
                        contentDescription = "",
                        tint =  Color(0xFFFFC23D)
                    )
                    Text(
                        text = tempoCurso,
                        fontSize = 12.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(start = 4.dp)
                    )
                }
            }
        }
    }
}


@Preview
@Composable
private fun CoursesPreview(){
    Courses()
}