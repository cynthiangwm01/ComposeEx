package com.example.composeex.presentation.component_detail.components.demo

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


/**
 * Scaffold is used to implement basic material design layout structure
 *
 * e.g. topbar, bottomBar, FAB, drawer etc
 *
 * textFieldState is to keep track of current state (input) of the TextField
 */
@Composable
fun SnackBarDemo() {
    val scaffoldState = rememberScaffoldState()

    var textFieldState by remember {
        mutableStateOf("")
    }

    // allow suspend function in composable
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        scaffoldState = scaffoldState
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            TextField(
                value = textFieldState,
                label = {
                    Text("Enter your name:")
                },
                onValueChange = {
                    textFieldState = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.padding(16.dp))

            Button(
                onClick = {
                    scope.launch {
                        scaffoldState.snackbarHostState
                            .showSnackbar(
                                message = "Hello $textFieldState"
                            )
                    }
                }) {
                Text(text = "Click Here")
            }
        }
    }
}