package com.github.jairrab.htmlutils.lib.head.params

data class Property(private val property: String, private val value: String) {
    override fun toString(): String {
        return "$property:$value"
    }

    companion object {
        fun arial() = Property("font-family", "arial, sans-serif")
        fun background(color: String) = Property("background-color", color)
        fun bold() = Property("font-weight", "bold")
        fun borderCollapse() = Property("border-collapse", "collapse")
        fun borderColor(color: String) = Property("border", "1px solid $color")
        fun fontSize(value: Int) = Property("font-size", "${value}px")
        fun italic() = Property("font-style", "italic")
        fun padding(value: Int) = Property("padding", "${value}px")
        fun paddingLeft(value: Int) = Property("padding-left", "${value}px")
        fun textAlignCenter() = Property("text-align", "center")
        fun textAlignLeft() = Property("text-align", "left")
        fun textAlignRight() = Property("text-align", "right")
        fun widthPercent(value: Int) = Property("width", "$value%")
    }
}