package com.github.jairrab.htmlutils.htmlutil.head.params

object Properties {
    fun fontArial() = Property("font-family", "arial, sans-serif")
    fun fontSize(value: Int) = Property("font-size", "${value}px")
    fun borderCollapse() = Property("border-collapse", "collapse")
    fun widthPercent(value: Int) = Property("width", "$value%")
    fun padding(value: Int) = Property("padding", "${value}px")
    fun paddingLeft(value: Int) = Property("padding-left", "${value}px")
    fun textAlignLeft() = Property("text-align", "left")
    fun borderColor() = Property("border", "1px solid #dddddd")
    fun textAlignCenter() = Property("text-align", "center")
    fun textAlignRight() = Property("text-align", "right")
    fun fontBold() = Property("font-weight", "bold")
    fun fontItalic() = Property("font-style", "italic")
    fun backgroundColor() = Property("background-color", "#dddddd")
}