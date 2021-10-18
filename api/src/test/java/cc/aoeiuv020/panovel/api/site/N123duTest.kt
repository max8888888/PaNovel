package cc.aoeiuv020.panovel.api.site

import org.junit.Test

/**
 *
 * Created by AoEiuV020 on 2018.03.14-02:19:11.
 */
class N123duTest : BaseNovelContextText(N123du::class) {
    @Test
    fun search() {
        search("都市")
        search("柯南之我就是不务正业", "歇会再来", "40/705684")
    }

    @Test
    fun detail() {
        detail("40/705684", "40/705684", "柯南之我就是不务正业", "歇会再来",
                "https://www.123ds.org/bookface/3/152173.jpg",
                "实时提供柯南之我就是不务正业最新章节免费阅读，歇会再来的最新著作柯南之我就是不务正业是一本非常优秀的灵异小说类小说,欢迎爱好的读者来阅读,如你喜欢这本小说，那么请将它加入收藏方便下次阅读。123读书网的爱好者将会第一时间分享更新最新的内容。\n" +
                        "（就算跟主线有偏差也按作者写的为主）陈百成：“我是一个莫得感情地杀手。”众人：“你是啥？”“杀手。”“你告诉我你这一个星期都干了什么？”“也就破了一个案子、救了一个小孩、拍了一部电影……”“……”“我真的是杀手！”“滚！”",
            "2020-12-12 18:59:53"
        )
    }

    @Test
    fun chapters() {
        // 这网站最新章节标题随机错误，12，意外4的意外
        chapters(
            "40/705684",
            "1，交换生陈百成", "40/705684/36287633:0", null,
            "142，意外的意外", "40/705684/41483404:1", "2020-12-12 18:59:53",
            142
        )
    }

    @Suppress("unused")
    fun chapters2() {
        // 章节数除4余3情况会需要再次下一页，
        chapters(
            "35/886996",
            "第一章 死后立马就能变大佬", "35/886996/44418028:0", null,
            "第114章大 型社死现场", "35/886996/45704984:2", "2020-12-12 18:59:53",
            115
        )
    }

    @Test
    fun content() {
        // 文字不倒序，有p，
        // 正文分多页，
        content(
            "40/705684/36287633:0",
            "“你是组织的最后的杀手了，我们决定打开次元壁，让你进行特训。”",
            "陈百成：“？？”",
            115
        )
    }

    @Test
    fun contentNextChapter() {
        // 只能通过下一章获取的，
        content(
            "40/705684/37080945:1",
            "外交官家……",
            "陈百成：要出现了吗？工藤新一？",
            92
        )
    }

    @Test
    fun contentNextChapter2() {
        // 有可能需要下两章获取，
        content(
            "35/886996/45704984:2",
            "第114章大型社死现场【为均订400、500、600加更】",
            "视死如归魏君子",
            447
        )
    }

    @Test
    fun contentReversed() {
        // 文字倒序，没有p,
        content(
            "40/705684/41483404:0",
            "“能请你们说一下，当大和隆男先生出事的时候，你们都在干什么吗？”大泷悟郎掏出他的刑侦小本本，开始了问话。",
            "。",
            70
        )
    }

    @Test
    fun contentReversedP() {
        // 文字倒序，有p,
        // 章节被删除了，暂时没有样例，
    }
}
