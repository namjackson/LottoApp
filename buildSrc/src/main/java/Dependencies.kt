object ApplicationConfig {
    const val applicationId = "com.namjackson.lotttoapp"
}

object AndroidSdk {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = compileSdk
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

object Version {
    const val kotlin = "1.4.10"

    const val room = "2.2.5"
    const val lifecycle = "2.2.0"
    const val navigation = "2.3.1"
}

object ProjectDependencies {
    const val gradle = "com.android.tools.build:gradle:4.1.1"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
}

object BuildPlugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinKapt = "kotlin-kapt"
}

object Libraries {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
    const val coreKtx = "androidx.core:core-ktx:1.3.2"
    const val appCompat = "androidx.appcompat:appcompat:1.2.0"
    const val material = "com.google.android.material:material:1.2.1"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.1"

    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"

    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"

    const val roomRuntime = "androidx.room:room-runtime:${Version.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Version.room}"
    const val roomKtx = "androidx.room:room-ktx:${Version.room}"
}

object TestLibraries {
    private object Versions {
        const val junit = "4.13.1"
        const val androidJunit = "1.1.2"
        const val espresso = "3.3.0"
    }

    const val roomTest = "androidx.room:room-testing:${Version.room}"

    const val junit = "junit:junit:${Versions.junit}"
    const val androidJunitExt = "androidx.test.ext:junit:${Versions.androidJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}