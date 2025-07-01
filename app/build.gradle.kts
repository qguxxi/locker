plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.opentech.locker"
    compileSdk = 36
    val googleClientId: String = project.findProperty("GOOGLE_CLIENT_ID").toString()
    defaultConfig {
        android.buildFeatures.buildConfig = true
        applicationId = "com.opentech.locker"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        buildConfigField("String", "GOOGLE_CLIENT_ID", "\"$googleClientId\"")

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
        compose = true
    }
}

dependencies {
//    Splash Screen
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation("androidx.navigation:navigation-compose:2.7.7")

//    AppCompat
    implementation("androidx.appcompat:appcompat:1.7.1")

//    Google Play Services
    implementation("com.google.android.gms:play-services-auth:21.3.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.9.1")
    // Hilt
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")




    implementation("androidx.credentials:credentials:1.2.0")

    implementation(libs.dagger.hilt.android)
    kapt(libs.dagger.hilt.android.compiler)

    implementation ("androidx.compose.ui:ui-text-google-fonts:1.8.3")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}