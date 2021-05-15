package com.example.myapplication.utils

class Constants {
    companion object {
        const val PROD_PROJECT_ID = "07af6ff3-0f28-0106-770b-39743a18ad22"
        const val LOCAL_HTTP_PROJECT_ID = "faa3cb57-7b91-0128-87ca-b4647da33b36"
        const val LOCAL_GRPC_PROJECT_ID = "faa3cb57-7b91-0128-87ca-b4647da33b36"
        const val GRPC_API_URL = "http://localhost:5000"
        const val LOCALHOST = "localhost"
        const val PORT_NUMBER_GRPC = 5000
        const val PORT_NUMBER_HTTP = 19710
        const val IP = "192.168.0.122"

        // connection to the gRPC API from the emulator
        const val GRPC_LOCALHOST_EMULATOR = "10.0.2.2:5000"
        const val HTTP_LOCALHOST_EMULATOR = "http://10.0.2.2:19710"
    }
}