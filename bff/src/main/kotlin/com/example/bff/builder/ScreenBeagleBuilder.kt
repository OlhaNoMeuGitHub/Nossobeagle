package com.example.bff.builder


import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.core.AlignSelf
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Text

object ScreenBeagleBuilder : ScreenBuilder {
    override fun build() = Screen(
            child = Container(
                    children = listOf(
                            Text(
                                    text = "Hello Beagle!",
                                    styleId = "Title.Text.Orange"
                            ).applyStyle(
                                    Style(
                                            margin = EdgeValue(
                                                    top = 16.unitReal()
                                            ),
                                            flex = Flex(alignSelf = AlignSelf.CENTER)
                                    )
                            ),
                            Text(
                                    styleId = "Description.Text.Orange",
                                    text = "teste ela vai voltaaaar aaaa Beagle is a cross-platform framework which provides usage of the " +
                                            "Server-Driven UI concept, natively in iOS, Android and Web applications. " +
                                            "By using Beagle, your team could easily change application's layout and" +
                                            " data by just changing backend code."

                            ).applyStyle(
                                    Style(
                                            margin = EdgeValue(
                                                    top = 16.unitReal()
                                            ),
                                            flex = Flex(alignSelf = AlignSelf.CENTER)
                                    )
                            )
                    )
            )
    )
}