plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdkVersion(AndroidSdk.compileSdk)

    defaultConfig {
        applicationId(ApplicationConfig.applicationId)
        minSdkVersion(AndroidSdk.minSdk)
        targetSdkVersion(AndroidSdk.targetSdk)
        versionCode(Releases.versionCode)
        versionName(Releases.versionName)

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Libraries.kotlinStdlib)
    implementation(Libraries.coreKtx)
    implementation(Libraries.appCompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.coroutines)
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUi)
    implementation(Libraries.lifecycleLiveData)
    implementation(Libraries.lifecycleViewModel)

    implementation(Libraries.roomKtx)
    implementation(Libraries.roomRuntime)
    kapt(Libraries.roomCompiler)

    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.androidJunitExt)
    androidTestImplementation(TestLibraries.espresso)

    testImplementation(TestLibraries.roomTest)
}