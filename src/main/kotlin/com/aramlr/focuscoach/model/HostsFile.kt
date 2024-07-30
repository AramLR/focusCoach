package com.aramlr.focuscoach.model

// This model represents the hosts file

class HostsFile {

    companion object {

        // Gets the path of the hosts file depending on the operating system
        fun getPath(): String{
            val os: ClientOS.OS = ClientOS.getName();
            val path: String = when(os){
                ClientOS.OS.Windows -> "C:\\Windows\\System32\\drivers\\etc\\hosts"
                ClientOS.OS.Linux -> "/etc/hosts"
                ClientOS.OS.Mac -> "/etc/hosts"
                ClientOS.OS.Unknown -> throw Exception("Unknown operating system")
            }

            return path
        }

    }

}