package com.example.dtodorov.smack.Utilities

const val BASE_URL = "https://multi-chat-chat.herokuapp.com/v1/"
const val SOCKET_URL = "https://multi-chat-chat.herokuapp.com/"
const val URL_REGISTER = "${BASE_URL}account/register"
const val URL_LOGIN = "${BASE_URL}account/login"
const val URL_CREATE_USER = "${BASE_URL}user/add"
const val URL_GET_USER = "${BASE_URL}user/byEmail/"
const val URL_GET_CHANNELS = "${BASE_URL}channel"

//Broad cast constants
const val BROADCAST_USER_DATA_CHANGED = "BROADCAST_USER_DATE_CHANGED"