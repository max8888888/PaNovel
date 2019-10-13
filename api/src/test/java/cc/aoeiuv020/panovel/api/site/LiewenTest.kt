package cc.aoeiuv020.panovel.api.site

import org.junit.Test

/**
 * Created by AoEiuV020 on 2018.06.06-16:47:57.
 */
class LiewenTest : BaseNovelContextText(Liewen::class) {
    @Test
    fun search() {
        search("都市")
        search("斗战狂潮", "骷髅精灵", "15/15090")
        search("万古神帝", "飞天鱼", "5/5024")
    }

    @Test
    fun detail() {
        detail("15/15090", "15/15090", "斗战狂潮", "骷髅精灵",
                "https://www.liewen.la/files/article/image/15/15090/15090s.jpg",
                "双月当空，无限可能的英魂世界\n" +
                        "孤寂黑暗，神秘古怪的嬉命小丑\n" +
                        "百城联邦，三大帝国，异族横行，魂兽霸幽\n" +
                        "这是一个英雄辈出的年代，人类卧薪尝胆重掌地球主权，孕育着进军高纬度的野望！\n" +
                        "重点是……二年级的废柴学长王同学，如何使用嬉命轮盘，撬动整个世界，伙伴们，请注意，学长来了！！！",
                "2018-06-06 00:05:00")
        detail("5/5024", "5/5024", "万古神帝", "飞天鱼",
                "https://www.liewen.la/files/article/image/5/5024/5024s.jpg",
                "八百年前，明帝之子张若尘，被他的未婚妻池瑶公主杀死，一代天骄，就此陨落。\n" +
                        "八百年后，张若尘重新活了过来，却现曾经杀死他的未婚妻，\n" +
                        "已经统一昆仑界，开辟出第一中央帝国，号称“池瑶女皇”。\n" +
                        "池瑶女皇——统御天下，威临八方；青春永驻，不死不灭。\n" +
                        "张若尘站在诸皇祠堂外，望着池瑶女皇的神像，心中燃烧起熊熊的仇恨烈焰，“待我重修十三年，敢叫女皇下黄泉”。",
                "2018-06-05 22:23:12")
    }

    @Test
    fun chapters() {
        chapters("15/15090", "第一章 嬉命小丑", "15/15090/6632365", null,
                "第一百九十二章 画风突变", "15/15090/13778956", "2018-06-06 00:05:00",
                1023)
        chapters("5/5024", "第1章 八百年后-", "5/5024/3447204", null,
                "第1913章 收获满满", "5/5024/13777631", "2018-06-05 22:23:12",
                1913)
    }

    @Test
    fun content() {
        content("15/15090/6632365",
                "**是进步的动力，也孕育了毁灭。? ?猎文 ｗ?ｗ?ｗ?． ｌ?ｉ?ｅ?ｗ?ｅ?ｎ?．ｃｃ",
                "新的开始，求第一个收藏、推荐、点击，谢谢大家！）",
                30)
        content("5/5024/13777631",
                "大战落幕，镇狱古族的族地彻底化作废墟，族人亦是伤亡极多，险些遭遇灭族之祸。",
                "……",
                94)
    }

}