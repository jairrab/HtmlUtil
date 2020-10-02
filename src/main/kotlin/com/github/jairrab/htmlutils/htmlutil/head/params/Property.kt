package com.github.jairrab.htmlutils.htmlutil.head.params

data class Property(private val property: String, private val value: String){
    override fun toString(): String {
        return "$property:$value"
    }
}