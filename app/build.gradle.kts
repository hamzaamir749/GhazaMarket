plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    id("kotlin-kapt")
}

android {
    namespace = "com.coderpakistan.ghazamarket"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.coderpakistan.ghazamarket"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        multiDexEnabled = true
        versionName = "1.0"
        setProperty("archivesBaseName", "Ghaza Market $versionName")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    ndkVersion = "25.2.9519653"
    externalNativeBuild {

        ndkBuild {
            path = file("src/main/cpp/Android.mk")
        }
    }

    buildTypes {
        getByName("debug") {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
                 }
        getByName("release") {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
              }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kapt {
        correctErrorTypes = true
    }
    buildFeatures {
        viewBinding = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")


    // Local Unit Tests
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    testImplementation("org.robolectric:robolectric:4.3.1")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
    testImplementation("com.google.truth:truth:1.1")

    // Instrumented Unit Tests
    androidTestImplementation("junit:junit:4.13.2")
    androidTestImplementation("org.mockito:mockito-core:2.21.0")
    androidTestImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
    androidTestImplementation("androidx.arch.core:core-testing:2.1.0")
    androidTestImplementation("com.google.truth:truth:1.1")
    testImplementation("org.mockito:mockito-core:2.21.0")
    implementation("androidx.test:core:1.5.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")


    //Navigation Architecture Component
    implementation("androidx.navigation:navigation-runtime-ktx:2.5.3")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.5.3")


    //viewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")

    //kotlin coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.3") {
        "use for multiple threading"
    }

    //image show library
    implementation("io.coil-kt:coil:2.1.0") {
        "use for loading images from network"
    }
    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.25")

    //Dagger
    implementation("com.google.dagger:hilt-android:2.44") {
        "use for dependencies injection"
    }
    kapt("com.google.dagger:hilt-android-compiler:2.44")
    implementation("androidx.activity:activity-ktx:1.6.1")



    //REST Network
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    implementation("com.google.code.gson:gson:2.9.1")
    implementation("com.squareup.retrofit2:converter-scalars:2.3.0")
    debugImplementation("com.github.chuckerteam.chucker:library:3.5.2")
    releaseImplementation("com.github.chuckerteam.chucker:library-no-op:3.5.2")


    //Dots on image slider
    implementation("com.tbuonomo:dotsindicator:4.3")

    //Touch zoom in/out imageview
    implementation("com.github.MikeOrtiz:TouchImageView:1.4.1")

    //Local datastore to store data in device memory
    implementation("androidx.datastore:datastore-preferences:1.0.0")



    implementation("androidx.multidex:multidex:2.0.1")


    //SplashScreen Api
    implementation("androidx.core:core-splashscreen:1.0.0")

    //Firebase
    implementation(platform("com.google.firebase:firebase-bom:31.1.0"))
    implementation("com.google.firebase:firebase-crashlytics-ktx")

}