package com.github.jairrab.htmlutils.lib.head

import com.github.jairrab.htmlutils.HTML.Companion.NEW_LINE
import com.github.jairrab.htmlutils.lib.head.params.Style

data class Head(
    val title: String,
    val styles: List<Style>,
) {
    override fun toString(): String {
        return StringBuilder()
            .append("<head>")
            .append(NEW_LINE)
            .append("<title>".prependIndent())
            .append(title)
            .append("</title>")
            .append(NEW_LINE)
            .append("<style>".prependIndent())
            .append(NEW_LINE)
            .append(styles.getStyles().prependIndent().prependIndent())
            .append(NEW_LINE)
            .append("</style>".prependIndent())
            .append(NEW_LINE)
            .append("</head>")
            .toString()
    }

    private fun List<Style>.getStyles(): String {
        return this.foldIndexed("") { index, previousString, style ->
            if (index == this.lastIndex) {
                "$previousString$style"
            } else {
                "$previousString$style\n"
            }
        }
    }
}

