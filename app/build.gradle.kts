//plugins {
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//    id("com.google.dagger.hilt.android") // For Hilt
//    id("kotlin-kapt") // For Annotation Processing
//    id("com.google.gms.google-services") // For Firebase
//}
//
//android {
//    namespace = "com.example.authentication"
//    compileSdk = 35
//
//    defaultConfig {
//        applicationId = "com.example.authentication"
//        minSdk = 24
//        targetSdk = 35
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
////    buildFeatures {
////        viewBinding = true
////        dataBinding = true
////    }
//}
//
////dependencies {
////
////    implementation(libs.androidx.core.ktx)
////    implementation(libs.androidx.appcompat)
////    implementation(libs.material)
////    implementation(libs.androidx.activity)
////    implementation(libs.androidx.constraintlayout)
////    implementation(libs.googleid)
////    testImplementation(libs.junit)
////    androidTestImplementation(libs.androidx.junit)
////    androidTestImplementation(libs.androidx.espresso.core)
////
////    // Core Libraries
////    implementation("androidx.core:core-ktx:1.15.0")
////    implementation("androidx.appcompat:appcompat:1.7.0")
////    implementation("com.google.android.material:material:1.12.0")
////    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
////
////    // Testing
////    testImplementation("junit:junit:4.13.2")
////    androidTestImplementation("androidx.test.ext:junit:1.2.1")
////    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
////
////    // Retrofit, OkHttp, and Moshi
////    implementation("com.squareup.retrofit2:retrofit:2.11.0")
////    implementation("com.squareup.okhttp3:okhttp:4.12.0")
////    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
////    implementation("com.squareup.retrofit2:converter-moshi:2.11.0")
////    implementation("com.squareup.moshi:moshi:1.15.1")
////    implementation("com.squareup.moshi:moshi-kotlin:1.15.1")
////    implementation("com.google.code.gson:gson:2.10.1") // Use only if needed
////
////    // Hilt for Dependency Injection
////    implementation("com.google.dagger:hilt-android:2.52")
////    kapt("com.google.dagger:hilt-android-compiler:2.52")
////
////    // Firebase (Using BOM for consistent versions)
////    implementation(platform("com.google.firebase:firebase-bom:33.7.0"))
////    implementation("com.google.firebase:firebase-auth-ktx")
////    implementation("com.google.android.gms:play-services-auth:21.3.0")
////
////    // Credential Manager
////    implementation("androidx.credentials:credentials:1.3.0")
////    implementation ("androidx.credentials:play-services-auth:1.1.0")
////
////    // Datastore Preferences
////    implementation("androidx.datastore:datastore-preferences:1.1.1")
////
////    // Lifecycle and Coroutines
////    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
////    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
////
////    // Navigation Component
////    implementation("androidx.navigation:navigation-fragment-ktx:2.8.5")
////    implementation("androidx.navigation:navigation-ui-ktx:2.8.5")
////
////
////}
//dependencies {
//    // Core Libraries
//    implementation("androidx.core:core-ktx:1.12.0")
//    implementation("androidx.appcompat:appcompat:1.7.0-alpha03")
//    implementation("com.google.android.material:material:1.9.0")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//
//    // Testing
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//
//    // Retrofit, OkHttp, and Moshi
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.okhttp3:okhttp:4.10.0")
//    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
//    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
//    implementation("com.squareup.moshi:moshi:1.15.0")
//    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
//    implementation("com.google.code.gson:gson:2.10.1") // Use only if needed
//
//    // Hilt for Dependency Injection
//    implementation("com.google.dagger:hilt-android:2.48")
//    kapt("com.google.dagger:hilt-android-compiler:2.48")
//
//    // Firebase (Using BOM for consistent versions)
//    implementation(platform("com.google.firebase:firebase-bom:32.0.0"))
//    implementation("com.google.firebase:firebase-auth-ktx")
//    implementation("com.google.android.gms:play-services-auth:20.7.0")
//
//    // Credential Manager
//    implementation("androidx.credentials:credentials:1.2.0-alpha03")
//    implementation("androidx.credentials:play-services-auth:1.2.0-alpha03")
//
//    // Datastore Preferences
//    implementation("androidx.datastore:datastore-preferences:1.1.0-alpha05")
//
//    // Lifecycle and Coroutines
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
//
//    // Navigation Component
//    implementation("androidx.navigation:navigation-fragment-ktx:2.7.3")
//    implementation("androidx.navigation:navigation-ui-ktx:2.7.3")
//
////    // Project Modules
////    implementation(project(":common"))
////    implementation(project(":onboarding"))
////    implementation(project(":profile"))
////    implementation(project(":myroom"))
////    implementation(project(":auth"))
////    implementation(project(":api"))
//}
//

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.authentication"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.authentication"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
//        dataBinding = true
    }
}

dependencies {
    // Core Libraries
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.7.0-alpha03")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(libs.googleid)

    // Testing Libraries
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Retrofit, OkHttp, and Moshi
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    implementation("com.squareup.moshi:moshi:1.15.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.15.0")
    implementation("com.google.code.gson:gson:2.10.1")

    // Hilt for Dependency Injection
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")

    // Firebase (Using BOM for consistent versions)
    implementation(platform("com.google.firebase:firebase-bom:32.0.0"))
    implementation("com.google.firebase:firebase-auth-ktx")
//    implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation ("androidx.credentials:play-services-auth:<latest_version>")


    // Credential Manager
    implementation("androidx.credentials:credentials:1.3.0")
    implementation("androidx.credentials:play-services-auth:1.2.0-alpha03")

    // Datastore Preferences
    implementation("androidx.datastore:datastore-preferences:1.1.0")

    // Lifecycle and Coroutines
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.3")
}

