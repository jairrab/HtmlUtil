package com.github.jairrab.htmlutils

import com.github.jairrab.htmlutils.lib.body.Body
import com.github.jairrab.htmlutils.lib.head.Head

class HTML(
    private val head: Head,
    private val body: Body,
) {
    override fun toString(): String {
        return StringBuilder()
            .append("<!DOCTYPE html>")
            .append(NEW_LINE)
            .append("<html>")
            .append(NEW_LINE)
            .append(head.toString().prependIndent())
            .append(NEW_LINE)
            .append(body.toString().prependIndent())
            .append(NEW_LINE)
            .append("</html>")
            .toString()
    }

    companion object {
        const val NEW_LINE = "\r\n"
    }
}