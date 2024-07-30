package com.aramlr.focuscoach

import com.aramlr.focuscoach.model.ClientOS;
import com.aramlr.focuscoach.model.HostsFile

fun main(){
    println("Client OS: ${ClientOS.getName()} Expected: ${ClientOS.OS.Windows}")
    println("Hosts file path: ${HostsFile.getPath()}")
}