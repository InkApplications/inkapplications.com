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
            TextElement("We don't need software to tell us we're lost", TextStyle.H1),
            FormattedText {
                text("As of August 2026, Ink Applications is on an")
                space()
                strong {
                    text("indefinite hiatus")
                }
                text(".")
            },
            TextElement("""
                With so many engineers using AI to generate slop instead of
                engineering code, there hasn't been any real reward in keeping
                software libraries open source. This pains me deeply, but I
                just don't get any enjoyment out of uploading code publicly 
                to be stolen en masse. So I'm just not doing it anymore; 
                there's no point.
            """.trimIndent()),

            TextElement("Later, tater", TextStyle.H2),
            FormattedText {
                text("""
                    These projects live on in my own private repositories.
                    I continue to enjoy engineering coding projects and software
                    libraires. I'm simply no longer working in public.
                """.trimIndent())
            },
            FormattedText {
                text("""
                    You can learn more about me or contact me at my
                """.trimIndent())
                space()
                link("https://reneevandervelde.com") {
                    text("personal website")
                }
                text(". ")
            },
            FormattedText {
                text("\u00a0\u00a0\u00a0\u00a0")
                emphasis {
                    text("-- Renee Vandervelde")
                }
            }
        ),
        groupingStyle = GroupingStyle.Sections,
    )
)
