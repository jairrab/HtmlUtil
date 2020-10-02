package com.github.jairrab.htmlutils.lib.body.params

data class Attribute(
    private val attribute: String,
    private val value: String
) {
    override fun toString(): String {
        return "$attribute=\"$value\""
    }
}