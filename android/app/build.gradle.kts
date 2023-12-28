plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.myweb.pemanduwisata_view"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.myweb.pemanduwisata_view"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        multiDexEnabled = true
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildFeatures {
        dataBinding = true
        viewBinding = true
        buildConfig = true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    flavorDimensions += listOf("main")
    productFlavors {
        create("production") {
            dimension = "main"
            buildConfigField("String", "API_URL", "\"https://www.google.com\"")
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    testImplementation("junit:junit:4.13.2")
    implementation("androidx.multidex:multidex:2.0.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0-alpha02")

    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // HAWK
    implementation("com.orhanobut:hawk:2.0.1")
    // DI
    implementation("io.insert-koin:koin-android:3.4.0")
    // RETROFIT
    val okhttpVersion = "4.11.0"
    val retrofitVersion = "2.9.0"
    implementation("com.github.ZieIony.carbon:carbon:3e929fcff4")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.okhttp3:logging-interceptor:$okhttpVersion")

    // piccasso
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("jp.wasabeef:picasso-transformations:2.4.0")
    implementation("com.vanniktech:android-image-cropper:4.5.0")

}