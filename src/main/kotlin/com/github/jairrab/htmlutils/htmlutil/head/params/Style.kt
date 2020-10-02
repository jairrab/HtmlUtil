package com.github.jairrab.htmlutils.htmlutil.head.params

class Style(
    private val id: String,
    private val properties: List<Property>,
) {
    override fun toString(): String {
        val id = id
        val properties = getProperties(properties)
        return "$id{$properties}"
    }

    private fun getProperties(properties: List<Property>): String {
        return properties.foldIndexed("") { index, previousString, property ->
            if (index == properties.lastIndex) {
                "$previousString$property"
            } else {
                "$previousString$property; "
            }
        }
    }
}