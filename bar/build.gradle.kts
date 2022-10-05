plugins {
    id("kotlin-kapt")
    id("kotlin-android")
//    id("kotlin-parcelize")
    id("com.android.library")
}

android {
    namespace = "com.example.bar"
    compileSdk = 32
}
