import java.awt.event.TextEvent

page.title = "Development Update for 2026"
page.contentBreak = true
meta.keywords = "open source, kotlin, news"

addPageHeader(
    BreadcrumbElement {
        link("Ink Applications", "index.html")
        text("2026 Development Update")
    }
)

setBody(
    ScrollingListLayout(
        unified(
            TextElement("2026 Development Update", TextStyle.H1),
            TextElement("""
                Ink Applications was created over a decade ago as a home for
                open source projects that I worked on between various hobbies
                and work. I have published these libraries mostly for myself
                so that they could be shared between my own projects, but
                licensed for public use in the hopes that they might be useful.
            """.trimIndent()),
            TextElement("""
                Over the last year, my relationship with software has changed
                quite a bit. The adoption of AI tools is beginning to increase
                noise in the open source space, and made has made it less
                rewarding to publish.
            """.trimIndent()),
            TextElement("""
                With that in mind, I'm not done with writing or maintaining 
                software libraries. However, I am preemptively changing some
                things about how these projects here are managed.
            """.trimIndent()),
        ),

        unified(
            TextElement("Moving to GPLv3", TextStyle.H2),
            TextElement("""
                The biggest change is that libraries will be moving to the
                GPLv3 license. Today, most libraries are being published under
                the MIT license. The change to GPLv3 helps to ensure that this
                code remains free in every sense. This will restrict what kind
                of projects that can use these libraries. This is intentional,
                as I am no longer fostering libraries that can be so easily
                folded into completely proprietary use-cases, without contributing
                back to the project. It's in the effort to foster quality of
                the open source community rather than the quantity of open 
                source libraries.
            """.trimIndent()),
            TextElement("""
                The existing MIT versions of libraries aren't being revoked
                or removed. Anything that might be using these libraries
                under their current version may continue to do so, however
                future versions will be licensed under GPLv3. I will be making
                major version increases where possible to facilitate this.
            """.trimIndent()),
        ),

        unified(
            TextElement("Reducing Reliance on GitHub", TextStyle.H2),
            TextElement("""
                Currently, GitHub is used as the primary interface for managing
                releases and issues. While GitHub can be useful for interacting
                with potential contributors, I'd like to reduce the reliance
                on its build and release tools. Projects will be moving away
                from GitHub's Actions and Releases features, and will instead
                be managed directly on the project. Sources will still be
                published to GitHub, and Issues and Pull Requests can still
                be submitted to each project. So this change is unlikely to
                directly affect public usage.
            """.trimIndent()),
        ),

        unified(
            TextElement("Updated Signing Keys", TextStyle.H2),
            TextElement("""
                In an effort to improve security in this year, I will be rotating
                all of my GPG signing keys, and making an effort to more
                reliably and consistently sign and pin release artifacts.
                This will help make the libraries more robust against
                supply-chain attacks and tampering.
            """.trimIndent()),
        ),

        unified(
            FormattedText {
                text("Your friend in open source,")
                br()
                emphasis {
                    text(" -- Renee Vandervelde")
                }
            },
        ),
        groupingStyle = GroupingStyle.Sections
    )
)
