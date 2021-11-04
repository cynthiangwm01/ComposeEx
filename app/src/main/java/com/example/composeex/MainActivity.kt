//package com.example.composeex
//
//import android.graphics.Paint
//import android.os.Bundle
//import android.util.Log
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.gestures.scrollable
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.itemsIndexed
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.*
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.MutableState
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.layout.layoutId
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.SpanStyle
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.buildAnnotatedString
//import androidx.compose.ui.text.font.Font
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.text.style.TextDecoration
//import androidx.compose.ui.text.withStyle
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.constraintlayout.compose.ChainStyle
//import androidx.constraintlayout.compose.ConstraintSet
//import androidx.constraintlayout.compose.Dimension
//import androidx.constraintlayout.compose.ConstraintLayout
//import kotlinx.coroutines.launch
//import kotlin.random.Random
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val fontFamily = FontFamily(
//            Font(R.font.comfortaa_light, FontWeight.Light),
//            Font(R.font.comfortaa_regular, FontWeight.Normal),
//            Font(R.font.comfortaa_medium, FontWeight.Medium),
//            Font(R.font.comfortaa_semi_bold, FontWeight.SemiBold),
//            Font(R.font.comfortaa_bold, FontWeight.Bold),
//        )
//
//        setContent {
//            ColumnComponent()
//            RowComponent()
//            WithModifier()
//
//            Box(
//                Modifier
//                    .padding(16.dp)
//                    .fillMaxWidth(0.5f)
//            ) {
//                ImageCardComponent(
//                    painterResource(id = R.drawable.demo),
//                    "reading image's content description",
//                    "here is the title"
//                )
//            }
//
//            StylingText(fontFamily = fontFamily)
//
//            ColorBoxComponent(Modifier.fillMaxSize())
//
//            Snackbar {
//                Text(text = "Hello Cynthia")
//            }
//            TextviewAndSnackbar()
//
//            LazyColumnComposable()
//
//            ConstraintLayoutInCompose()
//        }
//    }
//}
//
///**
// *  Column
//1. column uses horizontalAlignment & verticalArrangement
//
//2. size is not defined = wrap content, then no effect to
//horizontalAlignment & verticalArrangement, as it is
//talking about the components' alignment in between the column
//
//3. SpaceBetween: max. available space between each item
//4. SpaceEvenly: each height distance between each item is the same(including
//the height between parent & first / last components)
//5. SpaceAround: each height between each item is the same but the distance between
//parent & first / last components are each item distance / 2
// */
//@Composable
//fun ColumnComponent() {
//    Column(
//        modifier = Modifier
////            .fillMaxSize()
////            .fillMaxSize(0.5f)
//            .width(200.dp)
//            .height(300.dp)
//            .background(Color.Green),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceAround
//    ) {
//        Text("Hello")
//        Text("World")
//        Text("!")
//    }
//}
//
///**
// * Row
//1. Row uses horizontalArrangement & verticalAlignment instead
//2. CenterVertically is for Row while CenterHorizontally is for Column
//3. Others are similar to Column
// */
//@Composable
//fun RowComponent() {
//    Row(
//        modifier = Modifier
////            .fillMaxSize()
////            .fillMaxSize(0.5f)
////            .width(200.dp)
////            .height(300.dp)
//            .background(Color.LightGray),
//        horizontalArrangement = Arrangement.SpaceAround,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Text("Hello")
//        Text("World")
//        Text("!")
//    }
//}
//
///**
// * Modifier
// * 1. the function called in the modifier are applied sequentially, we can apply
// * the same function multiple times (e.g. multiple borders)
// */
//@Composable
//fun WithModifier() {
//    Column(
//        modifier = Modifier
//            .background(Color.LightGray)
//            .fillMaxHeight(0.5f)
//
//            /**
//             * Width vs requiredWidth:
//             */
//            .fillMaxWidth()
////            .width(600.dp)
////            .requiredWidth(600.dp)
//
//            /**
//             *   Padding: set All vs side by side
//             */
//            .padding(16.dp)
////            .padding(top= 8.dp)
//
//            /**
//             * Border
//             */
//            .border(5.dp, Color.DarkGray)
//            .padding(50.dp)
//
//            .border(5.dp, Color.Yellow)
//            .padding(16.dp)
//
//    ) {
//        Text(
//            "Hello",
//            /**
//             * Offset: offset not equals to margin. Offset will not affect other components
//             * In this case, if offset = 0, "Hello" & "World" will overlap
//             */
////            Modifier.offset(50.dp, 20.dp)
////            Modifier.offset(0.dp, 20.dp)
//
//        )
//
//        Text(
//            "World",
//            modifier = Modifier
//                .background(Color.Magenta)
//                /**
//                 * Clickable
//                 */
//                .clickable {
//                    Log.d("DEBUG", "Clicked World")
//                }
//        )
//
//        /**
//         * Spacer = Empty component
//         */
//        Spacer(modifier = Modifier.height(50.dp))
//
//        Text("!")
//    }
//}
//
//@Composable
//fun ConstraintLayoutInCompose() {
//    val constraints = ConstraintSet {
//        val greenBox = createRefFor("greenBox")
//        val redBox = createRefFor("redBox")
//        val guideLine = createGuidelineFromTop(0.5f)
//
//        constrain(greenBox) {
//            top.linkTo(guideLine)
////            start.linkTo(parent.start)
//            width = Dimension.value(100.dp)
//            height = Dimension.value(200.dp)
//        }
//
//        constrain(redBox) {
//            top.linkTo(parent.top)
////            start.linkTo(greenBox.end)
//            width = Dimension.value(100.dp)
//            height = Dimension.value(200.dp)
//        }
//        createHorizontalChain(greenBox, redBox, chainStyle = ChainStyle.Packed)
//    }
//
//    ConstraintLayout(constraints, modifier = Modifier.fillMaxSize()) {
//        Box(
//            modifier = Modifier
//                .background(Color.Green)
//                .layoutId("greenBox")
//        )
//
//        Box(
//            modifier = Modifier
//                .background(Color.Red)
//                .layoutId("redBox")
//        )
//
//    }
//}
//
//@Composable
//fun ImageCardComponent(
//    painter: Painter,
//    contentDescription: String,
//    title: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier
//            .fillMaxWidth(),
//        shape = RoundedCornerShape(15.dp),
//        elevation = 5.dp
//    ) {
//        /**
//         * Box:
//         * stacks every child on top of each other.
//         */
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp)
//        ) {
//            Image(
//                painter = painter,
//                contentDescription = contentDescription,
//                contentScale = ContentScale.Crop // crop equals to centerCrop in xml
//            )
//
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(
//                        brush = Brush.verticalGradient(
//                            colors = listOf(
//                                Color.Transparent,
//                                Color.DarkGray
//                            ),
//                            startY = 300f
//                        )
//                    )
//            )
//
//            Text(
//                title,
//                style = TextStyle(Color.White, fontSize = 16.sp),
//                modifier = Modifier
//                    .align(Alignment.BottomCenter)
//                    .padding(12.dp)
//            )
//        }
//    }
//}
//
//@Composable
//fun StylingText(fontFamily: FontFamily) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Yellow)
//    ) {
//        Text(
//            modifier = Modifier.align(Alignment.TopCenter),
//            text = buildAnnotatedString {
//                withStyle(
//                    style = SpanStyle(
//                        color = Color.Cyan,
//                        fontSize = 50.sp,
////                        textDecoration = TextDecoration.None
//                    )
//                ) {
//                    append("Try")
//                }
//                append(" Styling Text")
//            },
//
//            /**
//             * Those without style in the builder will use the default style below
//             */
//            color = Color.Black,
//            fontSize = 28.sp,
//            fontFamily = fontFamily,
//            fontWeight = FontWeight.Bold,
//            fontStyle = FontStyle.Italic,
//            textAlign = TextAlign.Center,
//            textDecoration = TextDecoration.Underline
//        )
//    }
//}
//
///**
// * State:
// * Here uses state to change background color
// *
// * "remember" is used to remember the value of the state from last
// * composition
// *
// */
//@Composable
//fun ColorBoxComponent(modifier: Modifier = Modifier) {
//    val color = remember { mutableStateOf(Color.Yellow) }
//
//    Box(modifier = modifier
//        .background(color.value)
//        .clickable {
//            color.value = Color(
//                Random.nextFloat(),
//                Random.nextFloat(),
//                Random.nextFloat(),
//                1f
//            )
//        })
//}
//
///**
// * Scaffold is used to implement basic material design layout structure
// *
// * e.g. topbar, bottomBar, FAB, drawer etc
// *
// * textFieldState is to keep track of current state (input) of the TextField
// */
//@Composable
//fun TextviewAndSnackbar() {
//    val scaffoldState = rememberScaffoldState()
//
//    var textFieldState by remember {
//        mutableStateOf("")
//    }
//
//    // allow suspend function in composable
//    val scope = rememberCoroutineScope()
//
//    Scaffold(
//        modifier = Modifier.fillMaxSize(),
//        scaffoldState = scaffoldState
//    ) {
//
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp)
//        ) {
//            TextField(
//                value = textFieldState,
//                label = {
//                    Text("Enter your name:")
//                },
//                onValueChange = {
//                    textFieldState = it
//                },
//                singleLine = true,
//                modifier = Modifier.fillMaxWidth()
//            )
//
//            Spacer(modifier = Modifier.padding(16.dp))
//
//            Button(
//                onClick = {
//                    scope.launch {
//                        scaffoldState.snackbarHostState
//                            .showSnackbar(
//                                message = "Hello $textFieldState"
//                            )
//                    }
//                }) {
//                Text(text = "Click Here")
//            }
//        }
//
//    }
//
//}
//
//@Composable
//fun LazyColumnComposable() {
//    LazyColumn {
//
//        itemsIndexed(
//            listOf("a", "b", "c", "d", "e", "f", "g")
//        ) { index, item ->
//            Text(
//                text = "Item $index is $item",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(250.dp)
//                    .padding(16.dp)
//            )
//        }
//
////        items(500) {
////            Text(
////                text = "Item $it",
////                modifier = Modifier
////                    .fillMaxWidth()
////                    .padding(16.dp)
////            )
////        }
//    }
//}
//
//@Composable
//fun SideEffectHandler() {
//    Button(onClick = {}) {
//        Text(text = "Button")
//    }
//}
