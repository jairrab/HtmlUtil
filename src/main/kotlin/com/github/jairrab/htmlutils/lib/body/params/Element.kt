package com.github.jairrab.htmlutils.lib.body.params

import com.github.jairrab.htmlutils.HTML

sealed class Element(
    private val tag: Tag,
    private val attributes: List<Attribute>? = null,
    private val value: String? = null
) {
    class Open(
        tag: Tag,
        attributes: List<Attribute>? = null
    ) : Element(tag, attributes, null)

    class OpenClose(
        tag: Tag,
        attributes: List<Attribute>? = null,
        value: String?
    ) : Element(tag, attributes, value)

    class Close(
        tag: Tag,
    ) : Element(tag)

    override fun toString(): String {
        val builder = StringBuilder("")
        when (this) {
            is Open -> {
                when (tag) {
                    Tag.TH, Tag.TD -> {
                        builder.append("<${tag.text}")
                        attributes?.forEach { builder.append(" $it") }
                        builder.append('>')
                    }
                    Tag.TR -> {
                        builder.append("<${tag.text}".prependIndent().prependIndent())
                        attributes?.forEach { builder.append(" $it") }
                        builder.append('>')
                    }
                    else -> {
                        builder.append("<${tag.text}".prependIndent())
                        attributes?.forEach { builder.append(" $it") }
                        builder.append('>')
                        builder.append(HTML.NEW_LINE)
                    }
                }
            }
            is OpenClose -> {
                when (tag) {
                    Tag.TH, Tag.TD -> builder.append("<${tag.text}")
                    Tag.TR -> builder.append("<${tag.text}".prependIndent().prependIndent())
                    else -> builder.append("<${tag.text}".prependIndent())
                }

                attributes?.forEach { builder.append(" $it") }

                builder.append('>')

                if (value != null) builder.append(value)

                builder.append("</${tag.text}>")

                when (tag) {
                    Tag.TH, Tag.TD -> builder.append("") //do nothing
                    else -> builder.append(HTML.NEW_LINE)
                }
            }
            is Close -> {
                when (tag) {
                    Tag.TABLE -> builder.append("</${tag.text}>".prependIndent())
                    else -> builder.append("</${tag.text}>")
                }
                builder.append(HTML.NEW_LINE)
            }
        }

        return builder.toString()
    }
}