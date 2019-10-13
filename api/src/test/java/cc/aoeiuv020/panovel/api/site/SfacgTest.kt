package cc.aoeiuv020.panovel.api.site

import org.junit.Test

/**
 *
 * Created by AoEiuV020 on 2018.03.06-19:25:09.
 */
class SfacgTest : BaseNovelContextText(Sfacg::class) {
    @Test
    fun search() {
        search("都市")
        search("黑猫变成少女才不奇怪呢", "青衣流苏", "123589")
        search("重生之都市少女", "雁落荆南", "71095")
        search("学战都市")?.first {
            // 不支持搜索空格，
            "学战都市 龙神" == it.name
                    && "午夜绅士" == it.author
                    && "57643" == it.extra
        }
    }

    @Test
    fun detail() {
        detail("123589", "123589", "黑猫变成少女才不奇怪呢", "青衣流苏",
                "http://rs.sfacg.com/web/novel/images/NovelCover/Big/defaultNew.jpg",
                "逃避真实的世界是要付出代价的，而这个代价，我的妈妈为我垫付了十八年。\n" +
                        "这种假象一直维持到了那一刻，我捡回来的黑猫变成了美少女，所以说黑猫变成少女才不奇怪呢！",
                "2018-05-17 22:51:10")
        detail("114367", "114367", "我的学生们都是问题大小姐", "诡话连篇",
                "http://rs.sfacg.com/web/novel/images/NovelCover/Big/2018/03/cef45df7-b012-460b-a18b-85f4bb4be97b.jpg",
                "本书原名《我的学生们都是病娇大小姐》。\n" +
                        "“同学们，下课了！”我站在讲台上整理了一下衣服，怯怯地说道：“所以你们能把我的手铐打开吗……”\n" +
                        "我的可爱学生们一齐答道：“啊咧，这怎么可以呢？合格的老师就应该二十四小时陪伴在学生身边吧？”\n" +
                        "什么？我拿你们当学生，你们却想上我？！\n" +
                        "..",
                "2018-05-20 17:53:37")
    }

    @Test
    fun chapters() {
        chapters("114367",
                "小小的导读", "/Novel/114367/199838/1891478/", null,
                "第三十三章", "/vip/c/2853182/", null,
                372)
    }

    @Test
    fun content() {
        content("/Novel/114367/191449/1584685/",
                "樱才高中，位于K市市中心，是一所名副其实的贵族女校。",
                "“喂，等等，你们要什么？不要拉我……我真的没有语言猥亵学生啊！”",
                34)
        content("/vip/c/2517034/",
                "“我明白了。”一名返老还童的修士一指秦钩胸有成竹，语气笃定道：“此人绝非与我们一样的外来修士，否则他不可能还维持这样的实力，他一定是就是秘境给我们的第一重考验，只要我们通力合作一起战胜他，就能顺利通过第一轮考验。”",
                "见这小妮子果然被自己吓得大惊失色，秦钩登时潇洒的一拂大袖，深不可测的一笑道：“傻妮子，我是你爹啊，亲的。”",
                44)
    }
}
