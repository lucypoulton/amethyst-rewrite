/*
 * Copyright (c) 2021 Lucy Poulton.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.lucypoulton.amethyst.module.example

import net.kyori.adventure.text.Component
import net.lucypoulton.amethyst.api.AmethystModule
import net.lucypoulton.amethyst.api.audience.AmethystPlayer
import net.lucypoulton.amethyst.api.platform.AmethystPlatform
import net.lucypoulton.squirtgun.command.condition.Condition
import net.lucypoulton.squirtgun.command.node.CommandNode
import net.lucypoulton.squirtgun.command.node.NodeBuilder
import net.lucypoulton.squirtgun.platform.audience.PermissionHolder
import net.lucypoulton.squirtgun.util.SemanticVersion

/**
 * An example Amethyst module.
 */
class ExampleModule(platform: AmethystPlatform) : AmethystModule(platform) {
    override fun getPluginName() = "example"

    override fun getPluginVersion(): SemanticVersion = SemanticVersion.parse("1.0.0-SNAPSHOT")

    override fun getAuthors() = arrayOf("Lucy Poulton")

    override fun commands(): List<CommandNode<in AmethystPlayer>> = listOf(
        NodeBuilder<PermissionHolder>()
            .name("example")
            .description("Example command")
            .condition(Condition.alwaysTrue())
            .executes { Component.text("example") }
            .build()
    )
}