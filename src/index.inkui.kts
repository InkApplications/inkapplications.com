page.title = "Ink Applications - Open Source Software"

addStyle("main-v2.css")

setHeader(
    ScrollingListLayout(
        TextElement("Ink Applications", TextStyle.H1),
        TextElement("Friends of Open Source Software"),
        groupingStyle = GroupingStyle.Inline,
    )
)

setBody(
    ScrollingListLayout(
        inline(
            TextElement("Open Source Projects", TextStyle.H1),
            TextElement("""
                This organization is for making things. Libraries, extensions
                and apps. Everything here is open source and open to 
                contributions.
            """.trimIndent()),

            TextElement("Full SDKs and Apps", TextStyle.H2),
            project(
                name = "\uD83D\uDCA1 Shade",
                description = "A modern SDK for the Philips Hue API written for Kotlin.",
                links = listOf(
                    "Website" to "https://shade.lighting",
                    "GitHub" to "https://github.com/inkapplications/shade",
                ),
            ),
            project(
                name = "\uD83D\uDCFB Ack",
                description = "APRS Client for Kotlin.",
                links = listOf(
                    "Website" to "https://ack.inkapplications.com",
                    "GitHub" to "https://github.com/inkapplications/ack",
                    "Play Store" to "https://play.google.com/store/apps/details?id=com.inkapplications.ack.android"
                ),
            ),

            TextElement("Kotlin Multiplatform Utilities", TextStyle.H2),
            project(
                name = "\uD83E\uDD6C Kimchi",
                description = "Kotlin Multiplatform Logging and Analytics.",
                links = listOf(
                    "Website" to "https://kimchi.inkapplications.com/",
                    "GitHub" to "https://github.com/inkapplications/Kimchi",
                ),
            ),
            project(
                name = "\uD83E\uDEA8 Regolith",
                description = "General purpose application interfaces.",
                links = listOf(
                    "GitHub" to "https://github.com/inkapplications/Regolith",
                ),
            ),
            project(
                name = "\uD83D\uDCD0 Spondee",
                description = "A class set for wrapping units of measure and common data types in Kotlin applications.",
                links = listOf(
                    "GitHub" to "https://github.com/inkapplications/Spondee",
                ),
            ),
            project(
                name = "\uD83C\uDF49 Watermelon",
                description = "Multiplatform Kotlin extensions.",
                links = listOf(
                    "GitHub" to "https://github.com/inkapplications/Watermelon",
                ),
            ),

            TextElement("Experimental Projects", TextStyle.H2),
            TextElement("Projects that may be unstable or incomplete but are under active development."),
            project(
                name = "\uD83E\uDE9F Glass",
                description = "A dumb display server for repurposing old Android devices as IoT controllers.",
                links = listOf(
                    "GitHub" to "https://github.com/inkapplications/Glass",
                ),
            ),
        ),
        inline(
            TextElement("Made by Humans", TextStyle.H1),
            FormattedText {
                text("Ink Applications is an organization run by ")
                link("https://ReneeVandervelde.com") {
                    text("Renee Vandervelde")
                }
                text(", focused on meticulous API design with strong intent.")
            },
            TextElement("""
                The software here is designed by humans, for humans, not generated
                by AI tools.
                While AI can be useful during the development process,
                overuse can often degrade the design of a project over time.
                The projects here are for the long haul, so you won't find
                fully generated code or documentation here.
            """.trimIndent()),
        ),
        groupingStyle = GroupingStyle.Sections,
    )
)

fun project(
    name: String,
    description: String,
    links: List<Pair<String, String>>
) = inline(
    TextElement(name, TextStyle.H3),
    TextElement(description),
    LinkNavigation {
        links.forEach { (text, url) ->
            link(text, url)
        }
    }
)
