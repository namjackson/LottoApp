plugins {
    id(BuildPlugins.androidApplication)
    kotlin(BuildPlugins.android)
    kotlin(BuildPlugins.kapt)
    kotlin(BuildPlugins.serialization) version Version.kotlin
}
apply(from = "../jacoco.gradle")

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
    sourceSets {
        map { it.java.srcDir("src/${it.name}/kotlin") }
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

    implementation(Libraries.serialization)
    implementation(Libraries.serializationJson)

    testImplementation(TestLibraries.junit)
    testImplementation(TestLibraries.junitJupiter)
    testImplementation(TestLibraries.truth)
    testImplementation(TestLibraries.truthExt)

    androidTestImplementation(TestLibraries.androidJunitExt)
    androidTestImplementation(TestLibraries.espresso)

    testImplementation(TestLibraries.roomTest)
}