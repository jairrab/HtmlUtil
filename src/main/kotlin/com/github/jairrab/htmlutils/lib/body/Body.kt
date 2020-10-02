package com.github.jairrab.htmlutils.lib.body

import com.github.jairrab.htmlutils.HTML
import com.github.jairrab.htmlutils.lib.body.params.Element

data class Body(
    private val elements: List<Element>
) {
    override fun toString(): String {
        val builder = StringBuilder("")
        builder.append("<body>")
        builder.append(HTML.NEW_LINE)
        elements.forEach { builder.append(it.toString()) }
        builder.append("</body>")
        return builder.toString()
    }
}