package cc.aoeiuv020.panovel.api.site

import org.junit.Test

/**
 * Created by AoEiuV020 on 2020.03.28-16:05:24.
 */
class N9txsTest : BaseNovelContextText(N9txs::class) {
    @Test
    fun search() {
        search("都市")
        search("诡校危道", "微尘轻轻", "171852")
        search("最强神医混都市", "九歌", "43776")
    }

    @Test
    fun detail() {
        detail("43776", "43776", "最强神医混都市", "九歌",
                "https://img.9txs.com/43776/526786.jpg",
                "★精华简介★\n" +
                        "当过兵王，又是神医，兼职修真，一路混迹都市，一路美女狂收。我的桃花运，运不断，做个帅哥太累了！",
                "2020-03-28 15:08:01")
    }

    @Test
    fun chapters() {
        chapters("171852", "第1章 六年前的信", "171852/315691", null,
                "第366章 跑", "171852/1219197", "2020-08-22 16:28:00",
                366)
        chapters("43776", "第1章 小哥，帮帮我", "43776/166315", null,
                "第5207章 人生，处处充满惊喜（大结局）", "43776/2453731", "2020-08-08 11:37:00",
                5207)
    }

    @Test
    fun content() {
        content("171852/684157",
                "您可以在百度里搜索“诡校危道 九桃小说(9txs.com)”查找最新章节！",
                "洛凌汐气得直咬牙根，不过等顾云出去之后，脸上又重新浮现出笑意，趁她姐姐没有看见的时候，将一叠红色的票子，放到一荣不起眼的地方。",
                75)
    }
}