package com.example.android.nigerianstatesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.nigerianstatesapp.model.State
import com.example.android.nigerianstatesapp.model.StateRepository.states
import com.example.android.nigerianstatesapp.ui.theme.NigerianStatesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NigerianStatesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NigerianStatesApp()
                }
            }
        }
    }
}

@Composable
fun NigerianStatesApp(modifier: Modifier = Modifier){
    LazyColumn(modifier = modifier){
        items(states){
            StateInformation(state = it, modifier = Modifier.padding(16.dp))
        }
    }
}

@Composable
fun StateInformation(state: State, modifier: Modifier = Modifier) {
   Card(modifier = modifier.fillMaxSize(),) {
       Column {
//           Text(text = stringResource(id = state.day))
           Row() {
               Text(text = stringResource(id = R.string.state))
               Text(text = stringResource(id = state.stateRes))
           }
           Row() {
               Text(text = stringResource(id = R.string.capital))
               Text(text = stringResource(id = state.capitalRes))
           }

           Row() {
               Text(text = stringResource(id = R.string.slogan))
               Text(text = stringResource(id = state.slogan))
           }


           
           Image(painter = painterResource(id = state.imageRes), contentDescription = null,
           modifier = Modifier.fillMaxWidth())
       }

   }
}

@Preview()
@Composable
fun NigerianStatesLightTheme() {
    NigerianStatesAppTheme(useDarkTheme = false) {
        NigerianStatesApp()
    }
}

@Preview()
@Composable
fun NigerianStatesDarkTheme() {
    NigerianStatesAppTheme(useDarkTheme = true ) {
        NigerianStatesApp()
    }
}