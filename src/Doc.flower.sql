create database docflower;
use docflower;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `cus_id` int(11) NOT NULL AUTO_INCREMENT,
  `cus_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `cus_email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `cus_telnum` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `cus_pwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '登陆密码',
  `cus_paypwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '支付密码',
  `cus_address` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `cus_orders` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `cus_friends` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,

  PRIMARY KEY (`cus_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for flowers
-- ----------------------------
DROP TABLE IF EXISTS `flowers`;
DROP TABLE IF EXISTS `flowers`;
CREATE TABLE `flowers`  (
  `flower_id` int(11) NOT NULL AUTO_INCREMENT,
  `flower_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `flower_kind` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `flower_introduction` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `flower_image1` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `flower_image2` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `flower_image3` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `flower_image4` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `flower_price` int(5) DEFAULT NULL,
  PRIMARY KEY (`flower_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('墨牡丹','菊花类','别名：富贵花、木芍药.介绍：通常为红色，有着牡丹般的大气，说是墨，其实是颜色深的意思。','..\img\花\菊花类\1.墨牡丹图集\墨牡丹1.jpg','..\img\花\菊花类\1.墨牡丹图集\墨牡丹2.jpg','..\img\花\菊花类\1.墨牡丹图集\墨牡丹1.jpg','..\img\花\菊花类\1.墨牡丹图集\墨牡丹2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('白牡丹','菊花类','介绍：纯白的颜色，精致的花形，就好像不存于世间的仙子一样，下方花瓣肆意分离开放，中间花瓣抱成团，花期在10月份。相关作品描述：《白牡丹菊》是明代诗人罗颀：东篱谁识旧花王，自别唐宫处处霜。犹似沈香亭北见，美人凝睡倚新妆。','..\img\花\菊花类\2.白牡丹图集\白牡丹1.jpg','..\img\花\菊花类\2.白牡丹图集\白牡丹2.jpg','..\img\花\菊花类\2.白牡丹图集\白牡丹1.jpg','..\img\花\菊花类\2.白牡丹图集\白牡丹2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('瑶台玉凤','菊花类','介绍：花色为白色，花期为10月下旬，花型为匙莲型。花瓣上有深浅的凹槽。 它的开花期处于中后期。花开美丽动人高雅清心，像玉凤凰一样飞翔，美丽多彩。推荐理由：喜欢菊花，不如养盆“瑶台玉凤”，乳白似玉，似水晶纯洁无暇。','..\img\花\菊花类\3.瑶台玉凤图集\瑶台玉凤1.jpg','..\img\花\菊花类\3.瑶台玉凤图集\瑶台玉凤2.jpg','..\img\花\菊花类\3.瑶台玉凤图集\瑶台玉凤1.jpg','..\img\花\菊花类\3.瑶台玉凤图集\瑶台玉凤2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('仙灵芝','菊花类','介绍：仙灵芝是菊花的多色品种之一，它的花瓣细长，顶端的颜色是淡黄色，底部的颜色是淡紫色;仙灵芝比较珍贵，并且对生长条件也比较苛刻。推荐理由：它开出来的花朵花瓣形态和其它品种不同，具有着独特的观赏价值，通常仙灵芝菊花在每年的秋季时开花，可用于装饰环境。','..\img\花\菊花类\4.仙灵芝图集\仙灵芝1.jpg','..\img\花\菊花类\4.仙灵芝图集\仙灵芝2.jpg','..\img\花\菊花类\4.仙灵芝图集\仙灵芝1.jpg','..\img\花\菊花类\4.仙灵芝图集\仙灵芝2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('天鹅舞','菊花类','介绍：是我国传统名菊。1960年我国邮电部发行的菊花特种邮票，其中第18枚即为天鹅舞。花中细管匙瓣，飞舞型，外围瓣长，瓣端呈匙钩状，基部瓣短密集内卷呈桂瓣状；翠绿色。推荐理由：它在开花时候类似一位翩翩起舞的少女一样，又似天鹅翩翩起舞。','..\img\花\菊花类\5.天鹅舞图集\天鹅舞1.jpg','..\img\花\菊花类\5.天鹅舞图集\天鹅舞2.jpg','..\img\花\菊花类\5.天鹅舞图集\天鹅舞1.jpg','..\img\花\菊花类\5.天鹅舞图集\天鹅舞2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('黄睡莲','睡莲类','花语：洁净，纯真。介绍：为多年生草本宿根性水生花卉。叶近圆形，宽12-19厘米，具不明显的波状缘。上面深绿色，有褐色斑纹，下面红褐色，有黑色小斑点。推荐理由：物种是极具观赏价值的莲花种类，常用作观赏植物。','..\img\花\睡莲类\1.黄睡莲图集\黄睡莲1.jpg','..\img\花\睡莲类\1.黄睡莲图集\黄睡莲2.jpg','..\img\花\睡莲类\1.黄睡莲图集\黄睡莲3.jpg','..\img\花\睡莲类\1.黄睡莲图集\黄睡莲1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('印度蓝睡莲','睡莲类','别名：星形睡莲。介绍：花瓣在16-20片之间，颜色多为深蓝色，中下部可现淡蓝色，叶茎比较长，会在傍晚时开花，并散发出淡淡的香味。','..\img\花\睡莲类\2.印度蓝睡莲图集\印度蓝睡莲1.jpg','..\img\花\睡莲类\2.印度蓝睡莲图集\印度蓝睡莲2.jpg','..\img\花\睡莲类\2.印度蓝睡莲图集\印度蓝睡莲3.jpg','..\img\花\睡莲类\2.印度蓝睡莲图集\印度蓝睡莲1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('白睡莲','睡莲类','花语：洁净、纯真、 妖艳。介绍：叶近圆形、纸质，基部有深弯缺、裂片尖锐、近平行或开展，全缘或波状。茎为匍匐根茎。花梗与叶柄长度相近；萼片披针形脱落或在花期后腐烂。花瓣20至25片，白色、卵状矩圆形，外轮略长于萼片。推荐理由：以各自的形态安然着的睡莲。有着自己的莞尔一笑。有着独有的矜持超脱，有着芳华四溢的意境。宛然，待定眼细凝，看迎风弄襟，颔首俯眉。','..\img\花\睡莲类\3.白睡莲图集\白睡莲1.jpg','..\img\花\睡莲类\3.白睡莲图集\白睡莲2.jpg','..\img\花\睡莲类\3.白睡莲图集\白睡莲3.jpg','..\img\花\睡莲类\3.白睡莲图集\白睡莲1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('红睡莲','睡莲类','介绍：叶圆形或近圆形，基部深裂，幼叶紫红色。老时上面转为墨绿色，有光泽。花大，直径30-34厘米，玫瑰红色。','..\img\花\睡莲类\4.红睡莲图集\红睡莲1.jpg','..\img\花\睡莲类\4.红睡莲图集\红睡莲2.jpg','..\img\花\睡莲类\4.红睡莲图集\红睡莲3.jpg','..\img\花\睡莲类\4.红睡莲图集\红睡莲1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('香睡莲','睡莲类','介绍：根茎平卧，叶圆形，直径8-25厘米，稍厚，全缘，表面暗绿色，背面常为紫色；花香，白色，花径8-5厘米，推荐理由：香睡莲开花端庄清丽，叶片散浮水面，是园林水体中常见的花卉。亦可缸植观赏。','..\img\花\睡莲类\5.香睡莲图集\香睡莲1.jpg','..\img\花\睡莲类\5.香睡莲图集\香睡莲2.jpg','..\img\花\睡莲类\5.香睡莲图集\香睡莲3.jpg','..\img\花\睡莲类\5.香睡莲图集\香睡莲1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('延药睡莲','睡莲类','介绍：根状茎肥厚。叶二型：浮水叶圆形或卵形，基部具弯缺，心形或箭形，常无出水叶；沉水叶薄膜质，脆弱。花形美丽，浮在或高出水面。','..\img\花\睡莲类\6延药睡莲图集\延药睡莲1.jpg','..\img\花\睡莲类\6延药睡莲图集\延药睡莲2.jpg','..\img\花\睡莲类\6延药睡莲图集\延药睡莲3.jpg','..\img\花\睡莲类\6延药睡莲图集\延药睡莲1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('百合花','百合类','别名：“山丹、中庭、中逢花“和”夜合花”。介绍：百合花长于茎的顶端，单生和簇生均有，有花冠大和花筒长的特点，总体呈漏斗的形状。花色大多为白色。因其鳞茎由许多白色鳞片层环抱而成，状如莲花，因而取 “ 百年好合”之意命名。推荐理由：百合具有百年好合美好家庭、伟大的爱之含意，有深深祝福的意义。','..\img\花\百合类\1.百合花图集\百合花1.jpg','..\img\花\百合类\1.百合花图集\百合花2.jpg','..\img\花\百合类\1.百合花图集\百合花3.jpg','..\img\花\百合类\1.百合花图集\百合花1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('郁金香','百合类','花语：博爱、体贴、高雅、富贵、能干、聪颖。介绍：英文名为“Didier''s tulip”或“Garden tulip”。叶3-5枚，条状披针形至卵状披针状，花单朵顶生，大型而艳丽，花被片红色或杂有白色和黄色，有时为白色或黄色，长5-7厘米，宽2-4厘米，6枚雄蕊等长，花丝无毛，无花柱，柱头增大呈鸡冠状，花期4-5月。相关故事：从前有位美丽的少女，在一个阳光明媚的早上，少女提着装满种子的花篮，到处播撒种子，希望能为春天增加美丽的色彩。美丽的少女走累了，就在一个河边坐下来休息，结果被风神布鲁斯无意间发现了，风神对少女产生了爱慕之心，于是便不断地追求少女。少女被风神穷追不舍，只好求助于女性的守护神洁安娜。洁安娜为了救助女孩而将她变成了一株鲜花，后来人们就给这朵花起了一个美丽的名字——郁金香。','..\img\花\百合类\2.郁金香图集\郁金香1.png','..\img\花\百合类\2.郁金香图集\郁金香2.png','..\img\花\百合类\2.郁金香图集\郁金香3.png','..\img\花\百合类\2.郁金香图集\郁金香1.png',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('六出花','百合类','介绍：多年生宿根草本植物，高约1米，根肥厚肉质，平卧土中延长，须根多；茎自根茎上不定芽萌发，直立而细长，叶片多数，互生状散生，披针形，光滑，长7.5-10厘米，叶柄短而狭，叶片常自叶柄处外倾，叶面有数条平行脉。花序下为一轮生叶，总花梗5，各具花2-3朵，极少超过3朵或仅1朵者。伞形花序，单花直径8-10厘米，花瓣2轮，无花被管，花被片不整齐，内轮花被片具深褐色斑点。推荐理由：花色绮丽，花形优美，其低矮品种是优良的盆栽材料自。用它点缀窗台、客厅、橱窗、宾馆等地方。','..\img\花\百合类\3.六出花图集\六出花1.jpg','..\img\花\百合类\3.六出花图集\六出花2.jpg','..\img\花\百合类\3.六出花图集\六出花3.jpg','..\img\花\百合类\3.六出花图集\六出花1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('萱草','百合类','花语：1、遗忘的爱，萱草又名忘忧草，代表“忘却一切不愉快的事”。2、放下他（她）放下忧愁。3、隐藏起来的心情。4、萱草的花语是爱的忘却。5、同时又是中国的母亲花。别名：“金针”、“忘忧草”、“宜男草”、“疗愁”、“鹿箭”。介绍：其叶形为扁平状的长线型，花形则是于开花期会长出细长绿色的开花枝，花色橙黄、花柄很长、呈为像百合花一样的筒状。结出来的果子有翅。','..\img\花\百合类\4.萱草图集\萱草1.jpg','..\img\花\百合类\4.萱草图集\萱草2.jpg','..\img\花\百合类\4.萱草图集\萱草3.jpg','..\img\花\百合类\4.萱草图集\萱草1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('玉簪花','百合类','花语：脱俗、冰清玉洁。别名：白萼、白鹤仙。介绍：叶基生，成簇，卵状心形、卵形或卵圆形。花葶高40-80cm，具几朵至十几朵花；花单生或2-3朵簇生，长10-13cm，白色，芳香。蒴果圆柱状，有三棱。花果期8-10月。','..\img\花\百合类\5.玉簪花图集\玉簪花1.jpg','..\img\花\百合类\5.玉簪花图集\玉簪花2.jpg','..\img\花\百合类\5.玉簪花图集\玉簪花3.jpg','..\img\花\百合类\5.玉簪花图集\玉簪花1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('嘉兰','百合类','花语：荣光。介绍：是津巴布韦的国花；其花瓣向后反卷是重要的特征，瓣缘呈波状的花瓣。花名来源于拉丁的“惊叹”“美丽”之意。瓣缘呈波状的花瓣，表现出超越现实的美丽。推荐理由：北方多作盆栽，用于布置庭院、阳台、居室等处，也可将花朵制作胸花或者搭配其他花卉做成花束。','..\img\花\百合类\6.嘉兰图集\嘉兰1.jpg','..\img\花\百合类\6.嘉兰图集\嘉兰2.jpg','..\img\花\百合类\6.嘉兰图集\嘉兰3.jpg','..\img\花\百合类\6.嘉兰图集\嘉兰1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('卡罗拉','玫瑰类','花语：幸福而浪漫的爱情。介绍：卡罗拉（Carola），切花月季的一个品种，具有鲜红色，高芯卷边大花型等特点。赠送理由：卡罗拉玫瑰是属于玫瑰中的精品，它的花色十分经典，花朵饱满丰富，并且盛开之后明艳动人。因此，将卡罗拉玫瑰赠送给心爱的人，寓意十分美好，可以表达一种真挚之情。','..\img\花\玫瑰类\1.卡罗拉图集\卡罗拉1.jpg','..\img\花\玫瑰类\1.卡罗拉图集\卡罗拉2.jpg','..\img\花\玫瑰类\1.卡罗拉图集\卡罗拉3.jpg','..\img\花\玫瑰类\1.卡罗拉图集\卡罗拉4.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('白玫瑰','玫瑰类','花语：纯洁、高贵、天真和纯纯的爱。介绍：切花白玫瑰（实为白色杂交茶香月季），白色大花，高心卷边，花形优美，花梗、枝条硬挺、多刺。其分级标准为：一级，45cm以上，花苞饱满，枝条粗壮，叶片浓绿。赠送理由：白玫瑰代表达纯纯的爱，表示你是圣洁的，甘心为你付出所有；送给一直爱慕、暗恋的女孩，最好送对方白玫瑰，以免对方有过强的抵触心理；','..\img\花\玫瑰类\2.白玫瑰图集\白玫瑰1.jpg','..\img\花\玫瑰类\2.白玫瑰图集\白玫瑰2.jpg','..\img\花\玫瑰类\2.白玫瑰图集\白玫瑰1.jpg','..\img\花\玫瑰类\2.白玫瑰图集\白玫瑰2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('法兰西','玫瑰类','花语：能言善道介绍：落叶灌木，枝茎密生直刺，小叶5－9片，叶子较月季更窄，质地较厚，花一至数朵生于枝端，花直径较小5—8厘米，紫红色。赠送理由：接受这种花祝福而生的人，口才非常的好，属于辨才无碍型。','..\img\花\玫瑰类\3.法兰西图集\法兰西1.jpg','..\img\花\玫瑰类\3.法兰西图集\法兰西2.jpg','..\img\花\玫瑰类\3.法兰西图集\法兰西3.jpg','..\img\花\玫瑰类\3.法兰西图集\法兰西1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('冷美人','玫瑰类','花语：浪漫真情，珍贵独特。介绍：冷美人又称冷香玫瑰，是中科院生态所多年培育开发的新一代玫瑰新品种，花期长，花朵大，枝条红色美观。赠送理由：它象征意义是深深的爱情，永恒爱情的守护花朵。','..\img\花\玫瑰类\4.冷美人图集\冷美人1.jpg','..\img\花\玫瑰类\4.冷美人图集\冷美人2.jpg','..\img\花\玫瑰类\4.冷美人图集\冷美人3.jpg','..\img\花\玫瑰类\4.冷美人图集\冷美人1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('金香玉','玫瑰类','花语：对于爱情：热情真爱，还代表为爱道歉。对于友情，黄玫瑰代表纯洁的友谊和美好的祝福，介绍：切花月季Rosa hybrida中的黄色品种。以其优雅的姿态，明亮的颜色，成为人们喜爱的花卉。赠送理由：娇羞花解语，温柔玉生香，代表纯洁的友谊和美好的祝福，所以送给好朋友会是一份不错的礼物。','..\img\花\玫瑰类\5.金香玉图集\金香玉1.jpg','..\img\花\玫瑰类\5.金香玉图集\金香玉2.jpg','..\img\花\玫瑰类\5.金香玉图集\金香玉3.jpg','..\img\花\玫瑰类\5.金香玉图集\金香玉1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('假日公主','玫瑰类','花语：快乐、笑容、美好的心情、愿你开怀每一天。介绍：Queen''s day，花头大、枝条长，香槟色。故事：在中世纪，这种玫瑰的颜色充满活力, 以能够让人微笑而闻名，特别是在寒冷、艰难的冬天。一天，女王注意到市场上的这种玫瑰，于是要求每天都把一支玫瑰放在床边，这样她每天起床后都能够看到美丽的东西，尽管外面天气灰暗沉闷，尽管她的臣民心情不太好。从此以后，女王每天醒来后，都心情舒畅，心中郁闷都远离而去。这个习惯一直坚持到她去世。以后，人们把这种玫瑰命名为“Queen''sDay”,一直沿用至今，中文名字叫做假日公主。赠送理由：它不仅充满活力，同时能够让人微笑而闻名。 ','..\img\花\玫瑰类\6.假日公主图集\假日公主1.jpg','..\img\花\玫瑰类\6.假日公主图集\假日公主2.jpg','..\img\花\玫瑰类\6.假日公主图集\假日公主3.jpg','..\img\花\玫瑰类\6.假日公主图集\假日公主1.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('康乃馨','康乃馨类','花语：康乃馨的含义包括迷恋，与众不同和爱。红色：深爱与钦佩白：纯洁的爱情和好运粉红：母爱黄色：失望或拒绝紫色：反复无常条纹：拒绝或遗憾介绍：是石竹科、石竹属多年生草本植物，是多种石竹属园艺品种的通称。为多年生草本植物，株高70-100厘米，基部半木质化。整个植株被有白粉，呈灰绿色。花冠半球形，花萼长筒状，花蕾橡子状，花瓣扇形，花朵内瓣多呈皱缩状，花色有大红、粉红、鹅黄、白、深红等，还有玛瑙等复色及镶边等，有香气。推荐理由：康乃馨是优异的切花品种。矮生品种还可用于盆栽观赏。花朵还可提香精。这种体态玲珑、斑谰雅洁、端庄大方、芳香清幽的鲜花，随着母亲节的兴起，成为全球销量最大的花卉。中国广泛栽培供观赏，有很多园艺品种，耐瓶插，常用作切花，温室培养可四季开花。','..\img\花\康乃馨\1.康乃馨(未包装)图集\康乃馨3.jpg','..\img\花\康乃馨\1.康乃馨(未包装)图集\康乃馨4.jpg','..\img\花\康乃馨\2.康乃馨(包装)图集\康乃馨2.jpg','..\img\花\康乃馨\2.康乃馨(包装)图集\康乃馨7.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('满天星','满天星类类','花语：清纯、关怀、思恋、配角、真爱以及纯洁的心灵。别名：锥花霞草、宿根满天星、锥花丝石竹、圆锥花丝石竹、丝石竹。介绍：多年生宿根花卉，株高90厘米以上。肉质根，外观似粗大“人参”，米黄色，略带须根。花小，白色、淡粉红色。推荐理由：满天星用途广泛，集观赏、药用于一体。由于它花型小、浅色、花姿蓬松具立体感，气质高雅清秀，给人以朦胧感，花序群体效果极佳，是重要的陪衬花材。','..\img\花\满天星\1.满天星(未包装)图集\满天星1.jpg','..\img\花\满天星\1.满天星(未包装)图集\满天星2.jpg','..\img\花\满天星\2.满天星(包装)图集\满天星1.jpg','..\img\花\满天星\2.满天星(包装)图集\满天星5.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('向日葵','向日葵类','花语：信念、光辉、高傲、忠诚、爱慕，寓意是沉默的爱，代表着勇敢地去追求自己想要的幸福介绍：是桔梗目、菊科、向日葵属的植物。因花序随太阳转动而得名。头状花序，直径10-30厘米，单生于茎顶或枝端。推荐理由：向日葵花盘形似太阳，花色亮丽，纯朴自然，充满生机。一般成片种植，开花时金黄耀眼，极为壮观，深受大家喜爱。','..\img\花\向日葵\1.向日葵(未包装)图集\向日葵2.jpg','..\img\花\向日葵\1.向日葵(未包装)图集\向日葵6.jpg','..\img\花\向日葵\2.向日葵(包装)图集\向日葵4.jpg','..\img\花\向日葵\2.向日葵(包装)图集\向日葵5.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('紫罗兰','紫罗兰类','花语：永恒的美与爱；质朴，美德，盛夏的清凉。介绍：全株密被灰白色具柄的分枝柔毛。茎直立，多分枝，基部稍木质化。叶片长圆形至倒披针形或匙形。推荐理由：紫罗兰花朵茂盛，花色鲜艳，香气浓郁，花期长，花序也长，为众多爱花者所喜爱，适宜于盆栽观赏，适宜于布置花坛、台阶、花径，整株花朵可作为花束。','..\img\花\紫罗兰\1.紫罗兰(未包装)图集\紫罗兰1.jpg','..\img\花\紫罗兰\1.紫罗兰(未包装)图集\紫罗兰4.jpg','..\img\花\紫罗兰\2.紫罗兰(包装)图集\紫罗兰1.jpg','..\img\花\紫罗兰\2.紫罗兰(包装)图集\紫罗兰2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('山荷叶','稀有花类','花语：亲情。别名：金魁莲、旱八角、八角莲、佛爷伞、大叶子、大脖梗子。拉丁学名：Diphylleia grayi F. Schm.介绍：多年生草本，植株高40-150厘米。根状茎粗状，横生，多须根；茎直立，不分枝，无毛，淡绿色。花深红色，5-8朵簇生于离叶基部不远处。变身秘诀：为什么花瓣是透明的？因为水分容易侵入花瓣内的细胞间隙，由于水和细胞液折射率接近，消除了反射界面，透射部分增强，花瓣就显得透明了。','..\img\花\稀有花类\1.山荷叶图集\山荷叶1.jpg','..\img\花\稀有花类\1.山荷叶图集\山荷叶2.jpg','..\img\花\稀有花类\1.山荷叶图集\山荷叶1.jpg','..\img\花\稀有花类\1.山荷叶图集\山荷叶2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('天堂鸟','稀有花类','花语：1、无论何时，无论何地，永远不要忘记你爱的人在等你2、能飞向天堂的鸟，能把各种情感、思恋带到天堂介绍：叶片长圆状披针形，长25-45cm，宽10cm。叶片顶端急尖；叶柄细长。花数朵生于总花梗上，下托一佛焰苞；佛焰苞绿色，边紫红，萼片橙黄色，花瓣暗蓝色；雄蕊与花瓣等长；花药狭线形，花柱突出，柱头3。','..\img\花\稀有花类\2.天堂鸟图集\天堂鸟1.jpg','..\img\花\稀有花类\2.天堂鸟图集\天堂鸟2.jpg','..\img\花\稀有花类\2.天堂鸟图集\天堂鸟1.jpg','..\img\花\稀有花类\2.天堂鸟图集\天堂鸟2.jpg',25);
INSERT INTO flowers(flower_name,flower_kind,flower_introduction,flower_image1,flower_image2,flower_image3,flower_image4,flower_price)VALUES
('荷包牡丹','稀有花类','介绍：荷包牡丹，（拉丁学名：Lamprocapnos spectabilis (L.) Fukuhara [2] ），为罂粟科、荷包牡丹属多年生草本植物，株高30～60cm。地上茎直立，圆柱形，带紫红色，根状茎肉质，小裂片通常全缘，表面绿色，背面具白粉，两面叶脉明显；叶柄长约10厘米，形似当归。','..\img\花\稀有花类\5.荷包牡丹图集\荷包牡丹1.jpg','..\img\花\稀有花类\5.荷包牡丹图集\荷包牡丹2.jpg','..\img\花\稀有花类\5.荷包牡丹图集\荷包牡丹1.jpg','..\img\花\稀有花类\5.荷包牡丹图集\荷包牡丹1.jpg',25);

-- ----------------------------
-- Table structure for plants
-- ----------------------------
DROP TABLE IF EXISTS `plants`;
CREATE TABLE `plants`  (
                           `plant_id` int(11) NOT NULL AUTO_INCREMENT,
                           `plant_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
                           `plant_introduction` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
                           `plant_image1` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
                           `plant_image2` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
                           `plant_price` int(5) DEFAULT NULL,
                           PRIMARY KEY (`plant_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;


insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('人参榕','生长温度18-33度,冬季不能低于10度,低于6度极易受到冻害 。性喜温暖湿润的环境,春秋季节可以放置与有适当光照的地方，夏季放于无阳光直射的地方 。人参榕浇水要见干见湿，盆土宜经常保持湿润 。 [1] 人参榕喜温暖湿润和阳光充足的环境，不耐寒，耐半阴，生长适温为20℃至30℃，冬季棚室温度应维持不低于5℃。栽培土壤要自求为疏松肥沃、排水良好、富含有机质、呈酸性反应的沙质壤土，碱性土易导致其叶片黄化、生长不良。','../img/绿植/人参榕/img/人参榕1.jpg','../img/绿植/人参榕/img/人参榕1.jpg','39.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('光瓜栗','主要价值光瓜栗株型美观，耐荫性强，为优良的室内盆栽观叶植物。生长环境光瓜栗喜高温高湿气候，耐寒力差，幼苗忌霜冻。喜肥沃疏松、透气保水的沙壤土，喜酸性土，忌碱性土或黏重土壤，较耐水湿，也稍耐旱。生长适温为20-30℃。忌冷湿，在过于潮湿的环境下，叶片很容易出现渍状冻斑','../img/绿植/光瓜栗/img/发财树1.jpg','../img/绿植/光瓜栗/img/发财树2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('合果芋','合果芋属天南星科的植物，大部分天南星科的植物都是有一定毒性的，合果芋的毒性主要是表现在合果芋的根茎还有汁液中。但是毒性不强，一般误食合果芋之后，会导致身体中喉咙有灼热感，还会导致口舌发麻，口腔黏膜溃疡感，严重的还会水肿，流口水，嘴巴不易张开','../img/绿植/发财树/img/合果芋1.jpg','../img/绿植/合果芋2/img/人参榕1.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('吊兰','观赏：吊兰是多年生草本植物，枝条细长下垂，夏季或其他季节温度高时开小白花，花集中于垂下来的枝条的末端，花蕊呈黄色，内部小嫩叶有时呈紫色，可供盆栽观赏。净化环境：吊兰养殖容易，适应性强，最为传统的居室垂挂植物之一。它叶片细长柔软，从叶腋中抽生出小植株，由盆沿向下垂，舒展散垂，似花朵，四季常绿。植物文化：吊兰的花语是“无奈而又给人希望”。','../img/绿植/吊兰/img/吊兰1.jpg','../img/绿植/吊兰/img/吊兰2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('君子兰','君子兰为石蒜科，其植株文雅俊秀，有君子风姿，花如兰，而得名。君子兰是一种高品味的名贵花卉。它的拉丁文名字含有富贵、高尚、美好、壮丽的意思。《辞源》称“有才徳的人为君子”。君子兰的命名，其寓意有着人的君子般的品格和风采。中国君子兰是一种品格高尚、伫立含蓄的花卉。中国君子兰具有团结奋斗、勇于创新的精神，具有格调高雅的姿容，具有幽静、素雅的品格。 [5]','../img/绿植/君子兰/img/君子兰1.jpg','../img/绿植/君子兰/img/君子兰2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('富贵竹','富贵竹象征着花开富贵、竹报平安、大吉大利、富贵一生，名字也是因此而出，富贵竹的美与它的吉祥名字分不开。它具有细长潇洒的叶子，翠绿的叶色，其茎节表现出貌似竹节的特征，却不是真正的竹。中国有“花开富贵，竹报平安”的祝辞，由于富贵竹茎叶纤秀，柔美优雅，极富竹韵，故而很得人们喜爱。','../img/绿植/富贵竹/img/富贵竹1.jpg','../img/绿植/富贵竹/img/富贵竹2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('常春藤','英国在十六世纪采用忽布花以前，都是用常春藤来酿啤酒，因为把它混在麦子里，会使麦子化成啤酒。所以，常春藤的花语就是－感化。凡是受到这种花祝福而生的人，具有了不起的感化力，能够影响其他人，对恋人也有莫大的影响力，能把对方潜移默化成自己喜欢的类型。','../img/绿植/常春藤/img/常春藤1.jpg','../img/绿植/常春藤/img/常春藤2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('散尾葵','散尾葵是小型的棕榈植物，耐阴性强。在家居中摆放散尾葵，能够有效去除空气中的苯、三氯乙烯、甲醛等有挥发性的有害物质。散尾葵与滴水观音一样，具有蒸发水气的功能，如果在家居种植一棵散尾葵，能够将室内的湿度保持在40%-60%，特别是冬季，室内湿度较低时，能有效提高室内湿度。在热带地区的庭院中，多作观赏树栽种于草地、树荫、宅旁；北方地区主要用于盆栽，是布置客厅、餐厅、会议室、家庭居室、书房、卧室或阳台的高档盆栽观叶植物。在明亮的室内可以较长时间摆放观赏；在较阴暗的房间也可连续观赏4-6周。散尾葵生长很慢，一般多作中、小盆栽植','../img/绿植/散尾葵/img/散尾葵1.jpg','../img/绿植/散尾葵/img/散尾葵2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('棕竹','棕竹为典型的室内观叶植物。因为耐阴、耐湿、喜散射光，可长期在室内光线明亮的地方摆放，即使连续3个月在暗处见不到阳光，也能正常生长，并能保持其浓绿的叶色。棕竹丛生挺拔，枝叶繁茂，姿态潇洒，叶形秀丽，四季青翠，似竹非竹，美观清雅，富有热带风光，为家庭栽培最广泛的室内观叶植物。南部地区口丛植于庭院内大树下或假山旁，构成一幅热带山林的自然景观。北方地区可盆栽，大丛林可摆放在会议室、宾馆门口两侧，颇为雅观。如果家里客厅摆放高低错落有致、疏密协调的浅盆棕竹盆景，旁边再配几块山石，更显得玲珑秀丽。 [8]','../img/绿植/棕竹/img/棕竹1.jpg','../img/绿植/棕竹/img/棕竹2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('橡皮树','橡皮树叶片肥厚而绮丽，叶片宽大美观且有光泽，红色的顶芽状似伏云，托叶裂开后恰似红缨倒垂，颇具风韵。它观赏价值较高，是著名的盆栽观叶植物。橡皮树叶大光亮，四季常青，是大型的耐阴观叶植物。盆栽是点缀宾馆堂和家庭居室的好材料，南方常配置于建筑物前、花坛中心和道路两侧等处。盆栽的中小型植株常用来美化客厅、书房、大型建筑物的门厅两侧及大堂中央，显得雄伟壮观，可体现热带风光','../img/绿植/橡皮树/img/橡皮树1.jpg','../img/绿植/橡皮树/img/橡皮树2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('白掌','植物文化：花语：一帆风顺。白掌物语：美好、高洁、贤德、热烈、友谊、自信、自傲。寓意：白掌酷似鹤翘首，亭亭玉立，洁白无瑕，给人“纯洁平静、祥和安泰”美感，被称为“清白之花”。民间觉得白鹤芋有一种吉祥的寓意，按花的形象得名“一帆风顺”。白鹤芋花叶美，轻盈多姿，生长旺盛，且又耐阴，深受人们的青睐，常用于室内美化装饰','../img/绿植/白掌/img/白掌1.jpg','../img/绿植/白掌/img/白掌2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('空气凤梨','空气凤梨可黏附于枯木上，岩石上，或放置于贝壳上，盆器上，只要根部不积水均能生长。不少外国室内设计杂志，都有空气凤梨作为室内植物点缀家居，十分时尚。更多人大量种植空气凤梨，就用金属线或鱼线挂起来，造型生动奇特。空气凤梨的根部以附着植株于固定处的功能为主，所以即使没有根部亦可生存，折断或弄伤的枝干也能独立存活一段日子，若环境合适也能长出子株延命。','../img/绿植/空气凤梨/img/空气凤梨1.jpg','../img/绿植/空气凤梨/img/空气凤梨2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('艾草','人们还经常把艾草、菖蒲、雄黄、檀香等装在小布袋内做成香囊用五彩线系着，挂在身上，以得健康。民间认为艾草还有招百福的作用，有些地方在端午节贴“午时联”，曾这样写道： “手执艾旗招百福，门悬蒲剑斩千邪。”寄托着人们向往幸福生活，痛恨贪官污吏的美好愿望。艾是一种普通的植物和一味普通的中药，但是在中国文化的元素中却蕴含着丰富的知识和内涵。人们不仅用它祈福生活的美满和平安，又运用其为自己解除病痛，同时又以艾的温馨，让人们赏心悦目地细细品尝着它的滋味' ,'../img/绿植/艾草/img/艾草1.jpg','../img/绿植/艾草/img/艾草2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('芦荟','早在1918年，美国食品与药物管理局就确认芦荟（Aloe vera，即库拉索芦荟）可食用。如今，库拉索芦荟凝胶制品已经被广泛应用于饮料、果冻、酸奶、罐头等食品的制作中。 [3] ','../img/绿植/芦荟/img/芦荟1.jpg','../img/绿植/芦荟/img/芦荟2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('荷兰铁','荷兰铁原产中美洲的墨西哥、危地马拉的温暖地区。其生性强健，喜温暖，耐干旱，喜阳也耐阴，耐瘠薄，但要求土壤排水良好。生长适宜温度为15-25℃，越冬温度为0℃荷兰铁生长速度一般，对温度的要求范围较宽，生长最佳温度为15-30℃之间，冬季要保持在2℃之上最适，不耐严寒。在生长季节中，需要保持一定的空气湿度，如气温为20℃时，湿度在50%左右即可，气温为30℃左右时，湿度需要调整至70%左右，才可保持较好的生长势头。','../img/绿植/荷兰铁/img/荷兰铁1.jpg','../img/绿植/荷兰铁/img/荷兰铁2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('蓝宝石','春秋是生长期，喜欢全日照。夏天会休眠，通风遮阳，每周可以在表土喷上少量的水，防止根死亡。冬天温度要逐渐断水，保持盆土干燥，提高植株抗寒能力。主要价值：摆放在房间内，有很高的观赏价值。','../img/绿植/蓝宝石/img/蓝宝石1.jpg','../img/绿植/蓝宝石/img/蓝宝石2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('虎尾兰','虎尾兰用来净化空气起到良好的作用。研究表明，虎尾兰可吸收室内部分有害气体，并能有效地清除二氧化硫、氯、乙醚、乙烯、一氧化碳、过氧化氮等有害物。虎尾兰堪称卧室植物，即便是在夜间它也可以吸收二氧化碳，放出氧气。六棵齐腰高的虎尾兰就可以满足一个人的吸氧量。在室内养殖虎尾兰配合使用椰维炭，不仅可以提高人们的工作效率，还能在夏季减少开窗换气。','../img/绿植/虎尾兰/img/虎尾兰1.jpg','../img/绿植/虎尾兰/img/虎尾兰2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('袖珍椰子','袖珍椰原产于墨西哥和危地马拉。袖珍椰喜温暖、湿润和半阴的环境，生长适宜的温度是20-30℃，13℃时进入休眠期，冬季最低气5261温为3℃。适生环境以排水良好、湿润、肥沃壤土为佳。','../img/绿植/袖珍椰子/img/袖珍椰子1.jpg','../img/绿植/袖珍椰子/img/袖珍椰子2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('豆瓣绿','豆瓣绿养在家里面，对房间内的空气还能很好的起到净化作用。尤其是刚刚装修好的新房子，更适合养上一盆豆瓣绿，它可以很好的分解空气中的有毒气体，给我们营造一个健康的环境。豆瓣绿还是防辐射最好的植物。对于一些电脑和手机上面的辐射，可以很快将它们吸收，让我们的身体变得健康。另外它的植株是绿色的，所以我们在眼睛比较疲劳的时候，看上它一眼，可以很快的缓解我们的疲劳，保护了我们的视力。 [6] ' ,'../img/绿植/豆瓣绿/img/豆瓣绿1.jpg','../img/绿植/豆瓣绿/img/豆瓣绿2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('铜钱草','人的一生离不开绿色环境，因为绿色植物光合作用制造氧气、释放的气味等生理功能与人息息相关，所以高质量的绿色环境在风水学上起着重要作用，植物构成的“生物场”对人类的事业、身体健康、爱情等都有十分重要的影响。根据对铜钱草的了解，我们都知道，铜钱草对水质要求不严，可在硬度较低的淡水中进行栽培。在温暖地区可露地盆栽，适於水盘、水族箱、水池、湿地中，室内水体绿化，能够净化水质，而且铜钱草的绿叶能够净化室内空气，因此对室内环境是有好处的，从这方面来说，铜钱草是能带来好风水的。再者，根据在中国的文化中，讲究寓意、谐音等，铜钱草，叶子圆圆的，象迷你型的荷叶，挺可爱，像古代的铜钱，寓意团团圆圆，好运连连，而且名字沾上了“铜”“钱”二字，寓意自然不同：家有铜钱，滚滚财源，因此被认为是财富的象征，所以，从寓意这方面来说，同钱财也是寓意着好的风水。','../img/绿植/铜钱草/img/铜钱草1.jpg','../img/绿植/铜钱草/img/铜钱草2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('银皇后','银皇后以它独特的空气净化能力著称，可有效吸收空气中的甲醛和尼古丁，最适合放在新装修、购置新家具的房间中，如果家中有人抽烟，也可摆放一盆银皇后避免家人遭受二手烟的危害。而且，空气中污染物的浓度越高，它越能发挥其净化能力，非常适合通风条件不佳阴暗房间，是不可多得的健康植物。','../img/绿植/银皇后/img/银皇后1.jpg','../img/绿植/银皇后/img/银皇后2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('雪铁芋','雪铁芋可以通过光合作用吸收毒气释放氧气，带来新鲜的空气。在白天的时候，它可以吸收房间的二氧化碳，同时放出氧气，让室内的空气中负离子浓度增加，甚至可以吸纳连吸尘器也难以吸到的灰尘。而更重要的是，它还可以吸收甲醛、苯系物等有害气体，杀灭空气中的细菌。在这个过程中有效地净化空气，增加空间中的绿色气氛，让人心旷神怡','../img/绿植/雪铁芋/img/雪铁芋1.jpg','../img/绿植/雪铁芋/img/雪铁芋2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('青苹果竹芋','观赏价值青苹果竹芋，叶形浑圆、叶质丰腴、叶色青翠，其上排列有整齐的条纹，具有极高的观赏价值，更兼之比较喜阴，适于较长时间在室内作盆栽观赏。由于其叶片硕大、株形旺盛，将其栽植于大型广口花盆中，可用于布置商场、宾馆、会议室、会客厅等大型公共场所。用中小型精致陶瓷盆栽种，则适于作一般居家的客厅、书房、卧室摆设。植物文化：花语：优雅标致、清新宜人。诗韵：翠叶青枝根饰链，和露带雨惹人怜。不慕颜色不争春，只留青气在人间','../img/绿植/青苹果竹芋/img/青苹果竹芋1.jpg','../img/绿植/青苹果竹芋/img/青苹果竹芋2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('香龙血树','植物文化，坚贞不屈，坚定不移，长寿富贵，吉祥如意，夜满秋深花带露，望月楼中，燕雨桥头，芳尘万里愁且住。此生料定多空度？巨木无边，亭亭玉树，龙血暗香销魂处。西双版纳热带植物园龙血树园的香龙血树意为，芳香，芬芳馥郁，沁人心脾，夜间香味尤其浓烈。','../img/绿植/香龙血树/img/香龙血树1.jpg','../img/绿植/香龙血树/img/香龙血树2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('高大肾蕨','高大肾蕨生命力强，栽培容易，奇特的叶形叶姿和青翠碧绿的色彩，使人赏2113心悦目，适宜家居栽培，常以盆栽或吊篮置于阳台或居室的窗边','../img/绿植/高大肾蕨/img/高大肾蕨1.jpg','../img/绿植/高大肾蕨/img/高大肾蕨2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('鹅掌柴','鹅掌柴大型盆栽植物，适用于宾馆大厅、图书馆的阅览室和博物馆展厅摆放，呈现自然和谐的绿色环境。春、夏、秋也可放在庭院蔽荫处和楼房阳台上观赏。可庭院孤植，是南方冬季的蜜源植物。盆栽布置客室、书房和卧室，具有浓厚的时代气息。能给吸烟家庭带来新鲜的空气。叶片可以从烟雾弥漫的空气中吸收尼古丁和其他有害物质，并通过光合作用将之转换为无害的植物自有的物质。另外，它每小时能把甲醛浓度降低大约9毫克。','../img/绿植/鹅掌柴/img/鹅掌柴1.jpg','../img/绿植/鹅掌柴/img/鹅掌柴2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('黑美人','性喜高温多湿，生育适温约22~30℃。寒流侵袭低于15℃以下，需注意预防寒害，避免叶片因滞水隔夜而冻伤。','../img/绿植/黑美人/img/黑美人1.jpg','../img/绿植/黑美人/img/黑美人2.jpg','69.9');
insert into plants(plant_name, plant_introduction, plant_image1, plant_image2, plant_price) VALUES
    ('龙血树','主要价值 观赏：龙血树植株挺拔、素雅、朴实、雄伟，富有热带风情，大型植株可布置于庭院、大堂、客厅，小型植株和水养植株适于装饰书房、卧室等。药用：从龙血树的木质部提取出来的血竭为名贵中药材品种，深红色。具有活血祛瘀、消肿止痛、收敛止血之效','../img/绿植/龙血树/img/龙血树1.jpg','../img/绿植/龙血树/img/龙血树2.jpg','69.9');


-- ----------------------------
-- Table structure for shops
-- ----------------------------
DROP TABLE IF EXISTS `shops`;
CREATE TABLE `shops`  (
  `shop_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `shop_address` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `shop_tel` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `shop_text` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,

  PRIMARY KEY (`shop_id`) USING BTREE

) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;



-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `blogs`;
CREATE TABLE `blogs`  (
  `blog_id` int(11) NOT NULL AUTO_INCREMENT,
  `blog_owner` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `blog_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `blog_text` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `blog_image` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `blog_time` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `blog_views` int(10) DEFAULT NULL,
  `blog_likes` int(10) DEFAULT NULL,
  PRIMARY KEY (`blog_id`) USING BTREE

) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

insert into blogs(blog_name, blog_owner, blog_time, blog_views, blog_likes) VALUES
    ('《中秋节适合送什么花给家人或者另一半呢？》','刘宇阳','2021-9-24 14:29','2397','1521');
insert into blogs(blog_name, blog_owner, blog_time, blog_views, blog_likes) VALUES
    ('《《使用鲜花打扮自己的卧室？》','刘璇','2020-9-24 14:29','2397','1521');
insert into blogs(blog_name, blog_owner, blog_time, blog_views, blog_likes) VALUES
    ('《实用小技巧:如何为家中的鲜花或者绿植松土？》','苗欢欢','2021-8-24 14:29','2397','1521');
insert into blogs(blog_name, blog_owner, blog_time, blog_views, blog_likes) VALUES
    ('《花的品种和养育技巧？》','范佳伟','2021-5-24 14:29','2397','1521');
insert into blogs(blog_name, blog_owner, blog_time, blog_views, blog_likes) VALUES
    ('《教师节该送什么花给老师？》','徐卓龙','2021-9-8 14:29','2397','1521');
-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_owner_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `order_flower_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `order_owner_tel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `order_address` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `order_text` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for shops
-- ----------------------------
DROP TABLE IF EXISTS `messages`;
CREATE TABLE `messages`  (
      `message_id` int(11) NOT NULL AUTO_INCREMENT,
      `message_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
      `message_title` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
      `message_email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
      `message_time` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
      `message_text` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
      PRIMARY KEY (`message_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;



SET FOREIGN_KEY_CHECKS = 1;



INSERT INTO shops(shop_id,shop_name,shop_address,shop_tel,shop_text) VALUES
('001','范佳伟的店铺','西安邮电大学',15830599166,'备注1');
INSERT INTO shops(shop_id,shop_name,shop_address,shop_tel,shop_text) VALUES
('002','徐卓龙的店铺','西安邮电大学',17792379816,'备注2');
INSERT INTO shops(shop_id,shop_name,shop_address,shop_tel,shop_text) VALUES
('003','刘璇的店铺','西安邮电大学',15929068966,'备注3');
INSERT INTO shops(shop_id,shop_name,shop_address,shop_tel,shop_text) VALUES
('004','刘宇阳的店铺','西安邮电大学',13279505680,'备注4');
INSERT INTO shops(shop_id,shop_name,shop_address,shop_tel,shop_text) VALUES
('005','张嘉祺的店铺','西安邮电大学',17792379816,'备注5');
INSERT INTO shops(shop_id,shop_name,shop_address,shop_tel,shop_text) VALUES
('006','张若鹏的店铺','西安邮电大学',17792379816,'备注6');



INSERT INTO customer(cus_name,cus_email,cus_telnum,cus_pwd,cus_paypwd,cus_address,cus_orders,cus_friends) VALUES
('刘宇阳','2193560021@qq.com', '13279505680','liuyng01253217','111111','陕西杨凌','无','无');
INSERT INTO customer(cus_name,cus_email,cus_telnum,cus_pwd,cus_paypwd,cus_address,cus_orders,cus_friends) VALUES
('刘璇','3199432593@qq.com', '15929068966','lx123456789.','444444','陕西延安','无','无');
INSERT INTO customer(cus_name,cus_email,cus_telnum,cus_pwd,cus_paypwd,cus_address,cus_orders,cus_friends) VALUES
('徐卓龙','1299605102@qq.com', '17764753450','123456','222222','陕西宝鸡','无','无');
INSERT INTO customer(cus_name,cus_email,cus_telnum,cus_pwd,cus_paypwd,cus_address,cus_orders,cus_friends) VALUES
('范佳伟	','2058298285@qq.com', '15830599166','123456','333333','河北张北','无','无');
INSERT INTO customer(cus_name,cus_email,cus_telnum,cus_pwd,cus_paypwd,cus_address,cus_orders,cus_friends) VALUES
('苗欢','3030027737@qq.com', '13709188179','123456','555555','陕西临潼','无','无');


INSERT INTO `order`(order_owner_name,order_flower_name,order_owner_tel,order_address,order_text) VALUES
('刘宇阳','日巴欻', '13279505680','西安邮电大学长安校区东区','送女友');
INSERT INTO `order`(order_owner_name,order_flower_name,order_owner_tel,order_address,order_text) VALUES
('张若鹏','郁金香', '15129072144','西安邮电大学','无');
INSERT INTO `order`(order_owner_name,order_flower_name,order_owner_tel,order_address,order_text) VALUES
('范佳伟','狗尾巴草', '15830599166','邮电大学安悦南楼','自己留着吃');
INSERT INTO `order`(order_owner_name,order_flower_name,order_owner_tel,order_address,order_text) VALUES
('刘璇','狗娃屁','15929068966','邮电大学','送男友');
INSERT INTO `order`(order_owner_name,order_flower_name,order_owner_tel,order_address,order_text) VALUES
('张三','永生花', '1414141','邮电东区家属楼','拿来送老师');


INSERT INTO messages(message_name,message_title,message_email,message_time,message_text) VALUES
('文文','这家花城里面花种类真多，赞赞赞！！！', '2193560021@qq.com','2021-10-24 14:12','这家花城里面花种类真多，赞赞赞！！！');
INSERT INTO messages(message_name,message_title,message_email,message_time,message_text) VALUES
('刘小阳','女朋友可喜欢了，赞赞赞！！！', '2193560021@qq.com','2021-9-24 14:12','这家花城里面花种类真多，赞赞赞！！！');
INSERT INTO messages(message_name,message_title,message_email,message_time,message_text) VALUES
('刘小璇','男朋友可喜欢了，赞赞赞！！！', '2193560021@qq.com','2021-8-24 14:12','这家花城里面花种类真多，赞赞赞！！！');
INSERT INTO messages(message_name,message_title,message_email,message_time,message_text) VALUES
('润迎','苗总可喜欢了，赞赞赞！！！', '2193560021@qq.com','2021-7-24 14:12','这家花城里面花种类真多，赞赞赞！！！');
INSERT INTO messages(message_name,message_title,message_email,message_time,message_text) VALUES
('徐卓龙','隔壁润迎可喜欢了，赞赞赞！！！', '2193560021@qq.com','2021-6-24 14:12','这家花城里面花种类真多，赞赞赞！！！');
