package com.example.dtodorov.smack.Services

import android.graphics.Color
import java.util.*

object UserDataService {

    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

    fun logout(){
        id = ""
        avatarColor = ""
        avatarName = ""
        email = ""
        name = ""
        AuthService.authToken = ""
        AuthService.userEmail = ""
        AuthService.isLoggedIn = false
    }
    fun returnAvatarColor(components: String) : Int {
        val stripedColor = components
                .replace("[", "")
                .replace("]","")
                .replace(",", "")

        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(stripedColor)

        if(scanner.hasNext()){
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }
        println("red = $r, green = $g, blue = $b")
        return Color.rgb(r,g,b)
    }

}