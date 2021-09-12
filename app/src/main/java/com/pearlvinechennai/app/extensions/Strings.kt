package com.pearlvinechennai.app.extensions

import android.util.Patterns
import java.util.regex.Pattern

//Minimum 8 characters, at least one uppercase letter, one lowercase letter, one number and one special character
private val PASSWORD_PATTERN =
    "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[`~#@$!%^*?&()+-_=<>,./';:{}|])[A-Za-z\\d`~#@$!%^*?&()+-_=<>,./';:{}|]{8,}$"

fun String.isEmail(): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.isPassword(): Boolean {
    return Pattern.compile(PASSWORD_PATTERN).matcher(this).matches()
}