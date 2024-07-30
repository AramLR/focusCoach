package com.aramlr.focuscoach.model

import java.lang.System;

// This model represents the operating system of the client

class ClientOS{

    companion object {
        // Returns the OS of the client
        fun getName(): OS {

            val os = System.getProperty("os.name").lowercase()

            return when {
                os.contains("windows") -> OS.Windows
                os.contains("linux") -> OS.Linux
                os.contains("mac") -> OS.Mac
                else -> OS.Unknown
            }

        }
    }

    enum class OS (val os: String){
        Windows("Windows"),
        Linux("Linux"),
        Mac("Mac"),
        Unknown("unknown");

        override fun toString(): String{
            return os
        }
    }

}