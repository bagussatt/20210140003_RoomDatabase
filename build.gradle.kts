buildscript {
    extra.apply {
        set("nav_version", "2.5.3")
        set("room_version", "2.5.2")
    }
}

plugins {
    id("com.android.library") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}