package com.example.myapplication.data.repository

import com.example.myapplication.utils.Constants

fun getHttpUrl(endpoint: String = ""): String {
//    return "http://"
//            .plus(Constants.IP)
//            .plus(":")
//            .plus(Constants.PORT_NUMBER_HTTP)
//            .plus("/")
//            .plus(endpoint)
//        return "http://localhost/10.0.2.2:19710/"
//    return "http://"
//            .plus("10.0.2.2")
//            .plus(":")
//            .plus("19710")
//            .plus("/")
//            .plus(endpoint)
        return "http://"
                .plus("192.168.0.122")
                .plus(":")
                .plus("19710")

}