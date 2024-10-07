package com.example.damr_taller


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.damr_taller.Navigation.AppNavigation
import com.example.damr_taller.ui.theme.DAMRTaller1Theme


class Taller1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAMRTaller1Theme {
                    AppNavigation(
                    )
                }
            }
        }
    }











