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
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;


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
  `blog_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `blog_owner` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
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
