package com.pandawork.nenu.oa.service.history.impl;

import com.pandawork.core.common.exception.SSException;
import com.pandawork.nenu.oa.common.dto.history.College;
import com.pandawork.nenu.oa.common.dto.history.Major;
import com.pandawork.nenu.oa.service.history.MajorCodeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学院对应的专业的代码
 * @author Lw
 * @time 2017/7/26 9:59
 */
@Service("majorCodeService")
public class MajorCodeServiceImpl implements MajorCodeService {
    @Override
    public Map<String, List<Major>> init() throws SSException {
        List<College> collegeList = new ArrayList<College>();
        Map<String, List<Major>> majorMap = new HashMap<String, List<Major>>();

        College college1 = new College();
        college1.setCollegeName("传媒科学学院");
        college1.setCollegeCode("101");
        List<Major> majorListInCollege1 = new ArrayList<Major>();
        majorListInCollege1.add(new Major("01", "播音与主持艺术", 2));
        majorListInCollege1.add(new Major("02", "广播电视编导", 2));
        majorListInCollege1.add(new Major("03", "广播电视新闻学", 2));
        majorListInCollege1.add(new Major("04", "广播电视学", 2));
        majorListInCollege1.add(new Major("05", "广告学", 2));
        majorListInCollege1.add(new Major("06", "广播电视", 1));
        majorListInCollege1.add(new Major("07", "广播电视艺术学", 1));
        majorListInCollege1.add(new Major("08", "图书馆学", 1));
        majorListInCollege1.add(new Major("09", "戏剧与影视学", 1));
        majorListInCollege1.add(new Major("10", "新闻学", 1));
        majorListInCollege1.add(new Major("11", "新闻与传播", 1));
        college1.setMajorsInCollege(majorListInCollege1);
        collegeList.add(college1);

        College college2 = new College();
        college2.setCollegeName("地理科学学院");
        college2.setCollegeCode("102");
        List<Major> majorListInCollege2 = new ArrayList<Major>();
        majorListInCollege2.add(new Major("01","地理科学", 2));
        majorListInCollege2.add(new Major("02","地理信息科学", 2));
        majorListInCollege2.add(new Major("03","地理信息系统", 2));
        majorListInCollege2.add(new Major("04","人文地理与城乡规划", 2));
        majorListInCollege2.add(new Major("05","资源环境与城乡规划管理", 2));
        majorListInCollege2.add(new Major("06","城市规划与设计", 1));
        majorListInCollege2.add(new Major("07","城市与区域规划", 1));
        majorListInCollege2.add(new Major("08","城乡规划学", 1));
        majorListInCollege2.add(new Major("09","地图学与地理信息系统", 1));
        majorListInCollege2.add(new Major("10","环境工程", 1));
        majorListInCollege2.add(new Major("11","环境规划与管理", 1));
        majorListInCollege2.add(new Major("12","环境科学", 1));
        majorListInCollege2.add(new Major("13","课程与教学论", 1));
        majorListInCollege2.add(new Major("14","旅游管理", 1));
        majorListInCollege2.add(new Major("15","区域经济学", 1));
        majorListInCollege2.add(new Major("16","人文地理学", 1));
        majorListInCollege2.add(new Major("17","湿地科学", 1));
        majorListInCollege2.add(new Major("18","土地资源管理", 1));
        majorListInCollege2.add(new Major("19","学科教学(地理)", 1));
        majorListInCollege2.add(new Major("20","自然地理学", 1));
        college2.setMajorsInCollege(majorListInCollege2);
        collegeList.add(college2);

        College college3 = new College();
        college3.setCollegeName("化学学院");
        college3.setCollegeCode("105");
        List<Major> majorListInCollege3 = new ArrayList<Major>();
        majorListInCollege3.add(new Major("01", "化学", 2));
        majorListInCollege3.add(new Major("02", "材料物理与化学", 1));
        majorListInCollege3.add(new Major("03", "分析化学", 1));
        majorListInCollege3.add(new Major("04", "高分子化学与物理", 1));
        majorListInCollege3.add(new Major("05", "课程与教学论", 1));
        majorListInCollege3.add(new Major("06", "无机化学", 1));
        majorListInCollege3.add(new Major("07", "物理化学", 1));
        majorListInCollege3.add(new Major("08", "学科教学(化学)", 1));
        majorListInCollege3.add(new Major("09", "有机化学", 1));
        college3.setMajorsInCollege(majorListInCollege3);
        collegeList.add(college3);

        College college4 = new College();
        college4.setCollegeName("环境学院");
        college4.setCollegeCode("106");
        List<Major> majorListInCollege4 = new ArrayList<Major>();
        majorListInCollege4.add(new Major("01", "环境科学", 2));
        majorListInCollege4.add(new Major("02", "生态学", 2));
        majorListInCollege4.add(new Major("03", "城市与区域规划", 1));
        majorListInCollege4.add(new Major("04", "环境工程", 1));
        majorListInCollege4.add(new Major("05", "环境规划与管理", 1));
        majorListInCollege4.add(new Major("06", "环境科学", 1));
        majorListInCollege4.add(new Major("07", "生态学", 1));
        college4.setMajorsInCollege(majorListInCollege4);
        collegeList.add(college4);

        College college5 = new College();
        college5.setCollegeCode("107");
        college5.setCollegeName("信息科学与技术学院");
        List<Major> majorListInCollege5 = new ArrayList<Major>();
        majorListInCollege5.add(new Major("01", "软件工程", 2));
        majorListInCollege5.add(new Major("02", "教育技术学", 2));
        majorListInCollege5.add(new Major("03", "计算机科学与技术", 2));
        majorListInCollege5.add(new Major("04", "图书馆学", 2));
        majorListInCollege5.add(new Major("05", "计算机技术", 1));
        majorListInCollege5.add(new Major("06", "计算机软件与理论", 1));
        majorListInCollege5.add(new Major("07", "计算机系统结构", 1));
        majorListInCollege5.add(new Major("08", "计算机应用技术", 1));
        majorListInCollege5.add(new Major("09", "教育技术学", 1));
        majorListInCollege5.add(new Major("10", "软件工程", 1));
        majorListInCollege5.add(new Major("11", "图书情报", 1));
        majorListInCollege5.add(new Major("12", "现代教育技术", 1));
        majorListInCollege5.add(new Major("13", "档案学", 1));
        majorListInCollege5.add(new Major("14", "计算机技术与理论", 1));
        majorListInCollege5.add(new Major("15", "课程与教学论", 1));
        majorListInCollege5.add(new Major("16", "情报学", 1));
        majorListInCollege5.add(new Major("17", "图书馆学", 1));
        majorListInCollege5.add(new Major("18", "学科教学(化学)", 1));
        majorListInCollege5.add(new Major("19", "智能环境分析与规划", 1));
        college5.setMajorsInCollege(majorListInCollege5);
        collegeList.add(college5);

        College college6 = new College();
        college6.setCollegeName("教育学部");
        college6.setCollegeCode("108");
        List<Major> majorListInCollege6 = new ArrayList<Major>();
        majorListInCollege6.add(new Major("01", "公共事业(教育)管理", 2));
        majorListInCollege6.add(new Major("02", "教育学", 2));
        majorListInCollege6.add(new Major("03", "小学教育", 2));
        majorListInCollege6.add(new Major("04", "心理学", 2));
        majorListInCollege6.add(new Major("05", "学前教育", 2));
        majorListInCollege6.add(new Major("06", "比较教育学", 1));
        majorListInCollege6.add(new Major("07", "发展与教育心理学", 1));
        majorListInCollege6.add(new Major("08", "高等教育学", 1));
        majorListInCollege6.add(new Major("09", "基础心理学", 1));
        majorListInCollege6.add(new Major("10", "教师教育", 1));
        majorListInCollege6.add(new Major("11", "教育管理", 1));
        majorListInCollege6.add(new Major("12", "教育技术学", 1));
        majorListInCollege6.add(new Major("13", "教育经济与管理", 1));
        majorListInCollege6.add(new Major("14", "教育领导与管理", 1));
        majorListInCollege6.add(new Major("15", "教育史", 1));
        majorListInCollege6.add(new Major("16", "教育学原理", 1));
        majorListInCollege6.add(new Major("17", "课程与教学论", 1));
        majorListInCollege6.add(new Major("18", "农村教育", 1));
        majorListInCollege6.add(new Major("19", "小学教育", 1));
        majorListInCollege6.add(new Major("20", "心理健康教育", 1));
        majorListInCollege6.add(new Major("21", "学科教育(语文)", 1));
        majorListInCollege6.add(new Major("22", "学前教育", 1));
        majorListInCollege6.add(new Major("23", "学前教育学", 1));
        majorListInCollege6.add(new Major("24", "学校课程与教学", 1));
        majorListInCollege6.add(new Major("25", "应用心理", 1));
        majorListInCollege6.add(new Major("26", "应用心理学", 1));
        college6.setMajorsInCollege(majorListInCollege6);
        collegeList.add(college6);

        College college7 = new College();
        college7.setCollegeName("经济学院");
        college7.setCollegeCode("109");
        List<Major> majorListInCollege7 = new ArrayList<Major>();
        majorListInCollege7.add(new Major("01", "财政学", 2));
        majorListInCollege7.add(new Major("02", "国际经济与贸易", 2));
        majorListInCollege7.add(new Major("03", "金融学", 2));
        majorListInCollege7.add(new Major("04", "经济学", 2));
        majorListInCollege7.add(new Major("05", "财政学", 1));
        majorListInCollege7.add(new Major("06", "产业经济学", 1));
        majorListInCollege7.add(new Major("07", "公共管理", 1));
        majorListInCollege7.add(new Major("08", "国际贸易学", 1));
        majorListInCollege7.add(new Major("09", "技术经济及管理", 1));
        majorListInCollege7.add(new Major("10", "金融", 1));
        majorListInCollege7.add(new Major("11", "金融学", 1));
        majorListInCollege7.add(new Major("12", "劳动经济学", 1));
        majorListInCollege7.add(new Major("13", "区域经济学", 1));
        majorListInCollege7.add(new Major("14", "世界经济", 1));
        majorListInCollege7.add(new Major("15", "数量经济学", 1));
        majorListInCollege7.add(new Major("16", "统计学", 1));
        majorListInCollege7.add(new Major("17", "西方经济学", 1));
        majorListInCollege7.add(new Major("18", "政治经济学", 1));
        college7.setMajorsInCollege(majorListInCollege7);
        collegeList.add(college7);

        College college8 = new College();
        college8.setCollegeName("历史文化学院");
        college8.setCollegeCode("110");
        List<Major> majorListInCollege8 = new ArrayList<Major>();
        majorListInCollege8.add(new Major("01", "历史学", 2));
        majorListInCollege8.add(new Major("02", "旅游管理", 2));
        majorListInCollege8.add(new Major("03", "东北民族民俗学", 1));
        majorListInCollege8.add(new Major("04", "考古学", 1));
        majorListInCollege8.add(new Major("05", "考古学及博物馆学", 1));
        majorListInCollege8.add(new Major("06", "课程与教学论", 1));
        majorListInCollege8.add(new Major("07", "历史地理学", 1));
        majorListInCollege8.add(new Major("08", "历史文献学", 1));
        majorListInCollege8.add(new Major("09", "旅游管理", 1));
        majorListInCollege8.add(new Major("10", "史学理论及史学史", 1));
        majorListInCollege8.add(new Major("11", "世界史", 1));
        majorListInCollege8.add(new Major("12", "文物与博物馆", 1));
        majorListInCollege8.add(new Major("13", "学科教学(历史)", 1));
        majorListInCollege8.add(new Major("14", "亚洲文化研究", 1));
        majorListInCollege8.add(new Major("15", "中国古代史", 1));
        majorListInCollege8.add(new Major("16", "中国近现代史", 1));
        majorListInCollege8.add(new Major("17", "中国史", 1));
        majorListInCollege8.add(new Major("18", "中国现当代文学", 1));
        majorListInCollege8.add(new Major("19", "专门史", 1));
        college8.setMajorsInCollege(majorListInCollege8);
        collegeList.add(college8);

        College college9 = new College();
        college9.setCollegeName("马克思主义学部");
        college9.setCollegeCode("112");
        List<Major> majorListInCollege9 = new ArrayList<Major>();
        majorListInCollege9.add(new Major("01", "社会学", 2));
        majorListInCollege9.add(new Major("02", "思想政治教育", 2));
        majorListInCollege9.add(new Major("03", "哲学", 2));
        majorListInCollege9.add(new Major("04", "国外马克思主义研究", 1));
        majorListInCollege9.add(new Major("05", "科学技术哲学", 1));
        majorListInCollege9.add(new Major("06", "科学社会主义与国际共产主义运动", 1));
        majorListInCollege9.add(new Major("07", "伦理学", 1));
        majorListInCollege9.add(new Major("08", "马克思主义发展史", 1));
        majorListInCollege9.add(new Major("09", "马克思主义基本原理", 1));
        majorListInCollege9.add(new Major("10", "马克思主义理论", 1));
        majorListInCollege9.add(new Major("11", "马克思主义理论与思想政治教育", 1));
        majorListInCollege9.add(new Major("12", "马克思主义哲学", 1));
        majorListInCollege9.add(new Major("13", "马克思主义中国化研究所", 1));
        majorListInCollege9.add(new Major("14", "人口、资源与环境经济学", 1));
        majorListInCollege9.add(new Major("15", "社会学", 1));
        majorListInCollege9.add(new Major("16", "思想政治教育", 1));
        majorListInCollege9.add(new Major("17", "外国哲学", 1));
        majorListInCollege9.add(new Major("18", "中国共产党史", 1));
        majorListInCollege9.add(new Major("19", "中国近现代史基本问题研究", 1));
        majorListInCollege9.add(new Major("20", "中国哲学", 1));
        majorListInCollege9.add(new Major("21", "中外政治制度", 1));
        college9.setMajorsInCollege(majorListInCollege9);
        collegeList.add(college9);

        College college10 = new College();
        college10.setCollegeName("美术学院");
        college10.setCollegeCode("113");
        List<Major> majorListInCollege10 = new ArrayList<Major>();
        majorListInCollege10.add(new Major("01", "雕塑", 2));
        majorListInCollege10.add(new Major("02", "服装与服饰设计", 2));
        majorListInCollege10.add(new Major("03", "环境设计", 2));
        majorListInCollege10.add(new Major("04", "美术学", 2));
        majorListInCollege10.add(new Major("05", "视觉传达设计", 2));
        majorListInCollege10.add(new Major("06", "视觉传达设计(动画设计)", 2));
        majorListInCollege10.add(new Major("07", "艺术设计", 2));
        majorListInCollege10.add(new Major("08", "风景园林", 1));
        majorListInCollege10.add(new Major("09", "服装", 1));
        majorListInCollege10.add(new Major("10", "服装设计与工程", 1));
        majorListInCollege10.add(new Major("11", "建筑设计及其理论", 1));
        majorListInCollege10.add(new Major("12", "美术", 1));
        majorListInCollege10.add(new Major("13", "美术学", 1));
        majorListInCollege10.add(new Major("14", "设计艺术学", 1));
        majorListInCollege10.add(new Major("15", "学科教学(美术)", 1));
        majorListInCollege10.add(new Major("16", "艺术设计", 1));
        majorListInCollege10.add(new Major("17", "艺术学", 1));
        majorListInCollege10.add(new Major("18", "艺术学理论", 1));
        majorListInCollege10.add(new Major("19", "园林植物与观赏园艺", 1));
        college10.setMajorsInCollege(majorListInCollege10);
        collegeList.add(college10);

        College college11 = new College();
        college11.setCollegeName("商学院");
        college11.setCollegeCode("116");
        List<Major> majorListInCollege11 = new ArrayList<Major>();
        majorListInCollege11.add(new Major("01", "财务管理", 2));
        majorListInCollege11.add(new Major("02", "工商管理", 2));
        majorListInCollege11.add(new Major("03", "工商管理(财务管理)", 2));
        majorListInCollege11.add(new Major("04", "会计学", 2));
        majorListInCollege11.add(new Major("05", "人力资源管理", 2));
        majorListInCollege11.add(new Major("06", "市场营销", 2));
        majorListInCollege11.add(new Major("07", "保险硕士", 1));
        majorListInCollege11.add(new Major("08", "财政学", 1));
        majorListInCollege11.add(new Major("09", "产业经济学", 1));
        majorListInCollege11.add(new Major("10", "工商管理", 1));
        majorListInCollege11.add(new Major("11", "工商管理硕士", 1));
        majorListInCollege11.add(new Major("12", "会计", 1));
        majorListInCollege11.add(new Major("13", "会计学", 1));
        majorListInCollege11.add(new Major("14", "技术经济及管理", 1));
        majorListInCollege11.add(new Major("15", "金融学", 1));
        majorListInCollege11.add(new Major("16", "劳动经济学", 1));
        majorListInCollege11.add(new Major("17", "旅游管理", 1));
        majorListInCollege11.add(new Major("18", "企业管理", 1));
        majorListInCollege11.add(new Major("19", "社会保障", 1));
        college11.setMajorsInCollege(majorListInCollege11);
        collegeList.add(college11);

        College college12 = new College();
        college12.setCollegeName("生命科学学院");
        college12.setCollegeCode("117");
        List<Major> majorListInCollege12 = new ArrayList<Major>();
        majorListInCollege12.add(new Major("01", "生物技术", 2));
        majorListInCollege12.add(new Major("02", "生物科学", 2));
        majorListInCollege12.add(new Major("03", "草学", 1));
        majorListInCollege12.add(new Major("04", "草业科学", 1));
        majorListInCollege12.add(new Major("05", "动物学", 1));
        majorListInCollege12.add(new Major("06", "风景园林", 1));
        majorListInCollege12.add(new Major("07", "课程与教学论", 1));
        majorListInCollege12.add(new Major("08", "生理学", 1));
        majorListInCollege12.add(new Major("09", "生态学", 1));
        majorListInCollege12.add(new Major("10", "生物化学与分子生物学", 1));
        majorListInCollege12.add(new Major("11", "微生物学", 1));
        majorListInCollege12.add(new Major("12", "细胞生物学", 1));
        majorListInCollege12.add(new Major("13", "学科教学(生物)", 1));
        majorListInCollege12.add(new Major("14", "遗传学", 1));
        majorListInCollege12.add(new Major("15", "植物学", 1));
        majorListInCollege12.add(new Major("16", "作物遗传育种", 1));
        college12.setMajorsInCollege(majorListInCollege12);
        collegeList.add(college12);

        College college13 = new College();
        college13.setCollegeName("数学与统计学院");
        college13.setCollegeCode("120");
        List<Major> majorListInCollege13 = new ArrayList<Major>();
        majorListInCollege13.add(new Major("01", "数学与应用数学", 2));
        majorListInCollege13.add(new Major("02", "统计学", 2));
        majorListInCollege13.add(new Major("03", "概率论与数理统计", 1));
        majorListInCollege13.add(new Major("04", "机器学习与生物信息学", 1));
        majorListInCollege13.add(new Major("05", "基础数学", 1));
        majorListInCollege13.add(new Major("06", "计算数学", 1));
        majorListInCollege13.add(new Major("07", "课程与教学论", 1));
        majorListInCollege13.add(new Major("08", "数学教育", 1));
        majorListInCollege13.add(new Major("02", "统计学", 1));
        majorListInCollege13.add(new Major("09", "学科教学(数学)", 1));
        majorListInCollege13.add(new Major("10", "应用数学", 1));
        majorListInCollege13.add(new Major("11", "应用统计", 1));
        majorListInCollege13.add(new Major("12", "运筹学与控制论", 1));
        college13.setMajorsInCollege(majorListInCollege13);
        collegeList.add(college13);

        College college14 = new College();
        college14.setCollegeName("体育学院");
        college14.setCollegeCode("122");
        List<Major> majorListInCollege14 = new ArrayList<Major>();
        majorListInCollege14.add(new Major("01", "民族传统体育", 2));
        majorListInCollege14.add(new Major("02", "体育教育", 2));
        majorListInCollege14.add(new Major("03", "武术与民族传统体育", 2));
        majorListInCollege14.add(new Major("04", "运动训练", 2));
        majorListInCollege14.add(new Major("05", "课程与教学论", 1));
        majorListInCollege14.add(new Major("06", "民族传统体育学", 1));
        majorListInCollege14.add(new Major("07", "体育教学", 1));
        majorListInCollege14.add(new Major("08", "体育教育训练学", 1));
        majorListInCollege14.add(new Major("09", "体育人文社会学", 1));
        majorListInCollege14.add(new Major("10", "学科教学(体育)", 1));
        majorListInCollege14.add(new Major("11", "运动人体科学", 1));
        majorListInCollege14.add(new Major("12", "运动训练", 1));
        college14.setMajorsInCollege(majorListInCollege14);
        collegeList.add(college14);

        College college15 = new College();
        college15.setCollegeName("外国语学院");
        college15.setCollegeCode("123");
        List<Major> majorListInCollege15 = new ArrayList<Major>();
        majorListInCollege15.add(new Major("01", "俄语", 2));
        majorListInCollege15.add(new Major("02", "俄语(商务俄语)", 2));
        majorListInCollege15.add(new Major("03", "日语", 2));
        majorListInCollege15.add(new Major("04", "日语(商务日语)", 2));
        majorListInCollege15.add(new Major("05", "日语(语言文学)", 2));
        majorListInCollege15.add(new Major("06", "商务英语", 2));
        majorListInCollege15.add(new Major("07", "英语", 2));
        majorListInCollege15.add(new Major("08", "英语(电子商务)", 2));
        majorListInCollege15.add(new Major("09", "英语(翻译)", 2));
        majorListInCollege15.add(new Major("10", "英语(国际商务管理)", 2));
        majorListInCollege15.add(new Major("11", "英语(科技交流)", 2));
        majorListInCollege15.add(new Major("12", "英语(语言文学)", 2));
        majorListInCollege15.add(new Major("13", "俄语语言文学", 1));
        majorListInCollege15.add(new Major("14", "课程与教学论", 1));
        majorListInCollege15.add(new Major("15", "日语语言文学", 1));
        majorListInCollege15.add(new Major("16", "外国语言学及应用语言学", 1));
        majorListInCollege15.add(new Major("17", "学科教学(英语)", 1));
        majorListInCollege15.add(new Major("18", "英语笔译", 1));
        majorListInCollege15.add(new Major("19", "英语口译", 1));
        majorListInCollege15.add(new Major("20", "英语语言文学", 1));
        college15.setMajorsInCollege(majorListInCollege15);
        collegeList.add(college15);

        College college16 = new College();
        college16.setCollegeName("文学院");
        college16.setCollegeCode("124");
        List<Major> majorListInCollege16 = new ArrayList<Major>();
        majorListInCollege16.add(new Major("01", "汉语言文学", 2));
        majorListInCollege16.add(new Major("02", "新闻学", 2));
        majorListInCollege16.add(new Major("03", "比较文学与世界文学", 1));
        majorListInCollege16.add(new Major("03", "传播学", 1));
        majorListInCollege16.add(new Major("03", "对外汉语", 1));
        majorListInCollege16.add(new Major("03", "汉语言文字学", 1));
        majorListInCollege16.add(new Major("03", "课程与教学论", 1));
        majorListInCollege16.add(new Major("03", "文艺学", 1));
        majorListInCollege16.add(new Major("03", "新闻学", 1));
        majorListInCollege16.add(new Major("03", "新闻与传播", 1));
        majorListInCollege16.add(new Major("03", "学科教学(语文)", 1));
        majorListInCollege16.add(new Major("03", "语文教育", 1));
        majorListInCollege16.add(new Major("03", "语言学及应用语言学", 1));
        majorListInCollege16.add(new Major("03", "中国古代文学", 1));
        majorListInCollege16.add(new Major("03", "中国现当代文学", 1));
        college16.setMajorsInCollege(majorListInCollege16);
        collegeList.add(college16);

        College college17 = new College();
        college17.setCollegeName("物理学院");
        college17.setCollegeCode("125");
        List<Major> majorListInCollege17 = new ArrayList<Major>();
        majorListInCollege17.add(new Major("01", "电气工程及其自动化", 2));
        majorListInCollege17.add(new Major("02", "电子信息科学与技术", 2));
        majorListInCollege17.add(new Major("03", "物理学", 2));
        majorListInCollege17.add(new Major("04", "材料物理与化学", 1));
        majorListInCollege17.add(new Major("05", "电路与系统", 1));
        majorListInCollege17.add(new Major("06", "光学", 1));
        majorListInCollege17.add(new Major("07", "核技术及应用", 1));
        majorListInCollege17.add(new Major("08", "课程与教学论", 1));
        majorListInCollege17.add(new Major("09", "理论物理", 1));
        majorListInCollege17.add(new Major("10", "粒子物理与原子核物理", 1));
        majorListInCollege17.add(new Major("11", "凝聚态物理", 1));
        majorListInCollege17.add(new Major("12", "学科教学(物理)", 1));
        college17.setMajorsInCollege(majorListInCollege17);
        collegeList.add(college17);

        College college18 = new College();
        college18.setCollegeName("音乐学院");
        college18.setCollegeCode("127");
        List<Major> majorListInCollege18 = new ArrayList<Major>();
        majorListInCollege18.add(new Major("01", "音乐学",2));
        majorListInCollege18.add(new Major("02", "舞蹈编导",2));
        majorListInCollege18.add(new Major("02", "课程与教学论",1));
        majorListInCollege18.add(new Major("02", "舞蹈",1));
        majorListInCollege18.add(new Major("02", "舞蹈学",1));
        majorListInCollege18.add(new Major("02", "戏剧与影视学",1));
        majorListInCollege18.add(new Major("02", "学科教学(音乐)",1));
        majorListInCollege18.add(new Major("02", "艺术学",1));
        majorListInCollege18.add(new Major("02", "艺术学理论",1));
        majorListInCollege18.add(new Major("02", "音乐",1));
        majorListInCollege18.add(new Major("02", "音乐学",1));
        majorListInCollege18.add(new Major("02", "音乐与舞蹈学",1));
        college18.setMajorsInCollege(majorListInCollege18);
        collegeList.add(college18);

        College college19 = new College();
        college19.setCollegeName("政法学院");
        college19.setCollegeCode("128");
        List<Major> majorListInCollege19 = new ArrayList<Major>();
        majorListInCollege19.add(new Major("01", "法学",2));
        majorListInCollege19.add(new Major("02", "国际政治",2));
        majorListInCollege19.add(new Major("03", "行政管理",2));
        majorListInCollege19.add(new Major("04", "社会学",2));
        majorListInCollege19.add(new Major("05", "思想政治教育",2));
        majorListInCollege19.add(new Major("06", "法律",1));
        majorListInCollege19.add(new Major("07", "法律(法学)",1));
        majorListInCollege19.add(new Major("08", "法律(非法学)",1));
        majorListInCollege19.add(new Major("09", "法律硕士",1));
        majorListInCollege19.add(new Major("10", "法学理论",1));
        majorListInCollege19.add(new Major("11", "公共管理",1));
        majorListInCollege19.add(new Major("12", "国际关系",1));
        majorListInCollege19.add(new Major("13", "国际政治",1));
        majorListInCollege19.add(new Major("14", "国外马克思主义研究",1));
        majorListInCollege19.add(new Major("15", "行政管理",1));
        majorListInCollege19.add(new Major("16", "科学社会主义与国际共产主义运动",1));
        majorListInCollege19.add(new Major("17", "课程与教学论",1));
        majorListInCollege19.add(new Major("18", "逻辑学",1));
        majorListInCollege19.add(new Major("19", "马克思主义理论与思想政治教育",1));
        majorListInCollege19.add(new Major("20", "马克思主义中国化研究",1));
        majorListInCollege19.add(new Major("21", "民商法学",1));
        majorListInCollege19.add(new Major("22", "社会学",1));
        majorListInCollege19.add(new Major("23", "思想政治教育",1));
        majorListInCollege19.add(new Major("24", "外国哲学",1));
        majorListInCollege19.add(new Major("25", "宪法学与行政法学",1));
        majorListInCollege19.add(new Major("26", "刑法学",1));
        majorListInCollege19.add(new Major("27", "学科教学(思政)",1));
        majorListInCollege19.add(new Major("28", "政治学理论",1));
        majorListInCollege19.add(new Major("29", "中共党史",1));
        majorListInCollege19.add(new Major("30", "中国古代史",1));
        majorListInCollege19.add(new Major("31", "中外政治制度",1));
        college19.setMajorsInCollege(majorListInCollege19);
        collegeList.add(college19);

        College college20 = new College();
        college20.setCollegeName("亚洲文明研究所");
        college20.setCollegeCode("126");
        List<Major> majorListInCollege20 = new ArrayList<Major>();
        majorListInCollege20.add(new Major("01", "历史学", 1));
        majorListInCollege20.add(new Major("02", "世界史", 1));
        majorListInCollege20.add(new Major("03", "亚洲文化研究", 1));
        majorListInCollege20.add(new Major("04", "中国古代史", 1));
        majorListInCollege20.add(new Major("05", "中国古典文献学", 1));
        majorListInCollege20.add(new Major("06", "中国史", 1));
        majorListInCollege20.add(new Major("07", "专门史", 1));
        college20.setMajorsInCollege(majorListInCollege20);
        collegeList.add(college20);

        College college21 = new College();
        college21.setCollegeName("心理学院");
        college21.setCollegeCode("132");
        List<Major> majorListInCollege21 = new ArrayList<Major>();
        majorListInCollege21.add(new Major("01", "发展与教育心理学",1));
        majorListInCollege21.add(new Major("02", "基础心理学",1));
        majorListInCollege21.add(new Major("03", "心理健康教育",1));
        majorListInCollege21.add(new Major("04", "应用心理",1));
        majorListInCollege21.add(new Major("05", "应用心理学",1));
        college21.setMajorsInCollege(majorListInCollege21);
        collegeList.add(college21);

        College college22 = new College();
        college22.setCollegeName("思想政治教育研究中心");
        college22.setCollegeCode("121");
        List<Major> majorListInCollege22 = new ArrayList<Major>();
        majorListInCollege22.add(new Major("01", "思想政治教育", 1));
        college22.setMajorsInCollege(majorListInCollege22);
        collegeList.add(college22);

        College college23 = new College();
        college23.setCollegeName("世界中古史研究所");
        college23.setCollegeCode("119");
        List<Major> majorListInCollege23 = new ArrayList<Major>();
        majorListInCollege23.add(new Major("01", "世界史", 1));
        college23.setMajorsInCollege(majorListInCollege23);
        collegeList.add(college23);

        College college24 = new College();
        college24.setCollegeName("世界古典文明史研究所");
        college24.setCollegeCode("118");
        List<Major> majorListInCollege24 = new ArrayList<Major>();
        majorListInCollege24.add(new Major("01", "历史文献学", 1));
        majorListInCollege24.add(new Major("02", "世界史", 1));
        college24.setMajorsInCollege(majorListInCollege24);
        collegeList.add(college24);

        College college25 = new College();
        college25.setCollegeName("日本研究所");
        college25.setCollegeCode("115");
        List<Major> majorListInCollege25 = new ArrayList<Major>();
        majorListInCollege25.add(new Major("01", "国际政治",1));
        majorListInCollege25.add(new Major("02", "日语语言文学",1));
        majorListInCollege25.add(new Major("03", "世界经济",1));
        majorListInCollege25.add(new Major("04", "世界史",1));
        college25.setMajorsInCollege(majorListInCollege25);
        collegeList.add(college25);

        College college26 = new College();
        college26.setCollegeName("农村教育研究所");
        college26.setCollegeCode("114");
        List<Major> majorListInCollege26 = new ArrayList<Major>();
        majorListInCollege26.add(new Major("01", "教育经济与管理",1));
        majorListInCollege26.add(new Major("02", "教育学",1));
        majorListInCollege26.add(new Major("03", "教育学与原理",1));
        majorListInCollege26.add(new Major("04", "课程与教学论",1));
        majorListInCollege26.add(new Major("05", "农村教育",1));
        majorListInCollege26.add(new Major("06", "小学教育",1));
        college26.setMajorsInCollege(majorListInCollege26);
        collegeList.add(college26);

        College college27 = new College();
        college27.setCollegeName("国际与比较教育研究所");
        college27.setCollegeCode("104");
        List<Major> majorListInCollege27 = new ArrayList<Major>();
        majorListInCollege27.add(new Major("01", "比较教育学",1));
        majorListInCollege27.add(new Major("02", "小学教育",1));
        college27.setMajorsInCollege(majorListInCollege27);
        collegeList.add(college27);

        College college28 = new College();
        college28.setCollegeName("国际汉学院");
        college28.setCollegeCode("111");
        List<Major> majorListInCollege28 = new ArrayList<Major>();
        majorListInCollege28.add(new Major("01","汉语国际教育", 1));
        majorListInCollege28.add(new Major("02","汉语国际教育硕士", 1));
        college28.setMajorsInCollege(majorListInCollege28);
        collegeList.add(college28);

        College college29 = new College();
        college29.setCollegeName("古籍整理研究所");
        college29.setCollegeCode("103");
        List<Major> majorListInCollege29 = new ArrayList<Major>();
        majorListInCollege29.add(new Major("01", "历史文献学", 1));
        majorListInCollege29.add(new Major("02", "中国古典文献学", 1));
        majorListInCollege29.add(new Major("03", "中国史", 1));
        college29.setMajorsInCollege(majorListInCollege29);
        collegeList.add(college29);

        majorMap.put(college1.getCollegeCode(), college1.getMajorsInCollege());
        majorMap.put(college2.getCollegeCode(), college2.getMajorsInCollege());
        majorMap.put(college3.getCollegeCode(), college3.getMajorsInCollege());
        majorMap.put(college4.getCollegeCode(), college4.getMajorsInCollege());
        majorMap.put(college5.getCollegeCode(), college5.getMajorsInCollege());
        majorMap.put(college6.getCollegeCode(), college6.getMajorsInCollege());
        majorMap.put(college7.getCollegeCode(), college7.getMajorsInCollege());
        majorMap.put(college8.getCollegeCode(), college8.getMajorsInCollege());
        majorMap.put(college9.getCollegeCode(), college9.getMajorsInCollege());
        majorMap.put(college10.getCollegeCode(), college10.getMajorsInCollege());
        majorMap.put(college11.getCollegeCode(), college11.getMajorsInCollege());
        majorMap.put(college12.getCollegeCode(), college12.getMajorsInCollege());
        majorMap.put(college13.getCollegeCode(), college13.getMajorsInCollege());
        majorMap.put(college14.getCollegeCode(), college14.getMajorsInCollege());
        majorMap.put(college15.getCollegeCode(), college15.getMajorsInCollege());
        majorMap.put(college16.getCollegeCode(), college16.getMajorsInCollege());
        majorMap.put(college17.getCollegeCode(), college17.getMajorsInCollege());
        majorMap.put(college18.getCollegeCode(), college18.getMajorsInCollege());
        majorMap.put(college19.getCollegeCode(), college19.getMajorsInCollege());
        majorMap.put(college20.getCollegeCode(), college20.getMajorsInCollege());
        majorMap.put(college21.getCollegeCode(), college21.getMajorsInCollege());
        majorMap.put(college22.getCollegeCode(), college22.getMajorsInCollege());
        majorMap.put(college23.getCollegeCode(), college23.getMajorsInCollege());
        majorMap.put(college24.getCollegeCode(), college24.getMajorsInCollege());
        majorMap.put(college25.getCollegeCode(), college25.getMajorsInCollege());
        majorMap.put(college26.getCollegeCode(), college26.getMajorsInCollege());
        majorMap.put(college27.getCollegeCode(), college27.getMajorsInCollege());
        majorMap.put(college28.getCollegeCode(), college28.getMajorsInCollege());
        majorMap.put(college29.getCollegeCode(), college29.getMajorsInCollege());

        return majorMap;

    }

    @Override
    public List<Major> getMajorListByCollegeCode(String CollegeCode) throws SSException{
        List<Major> majorList = new ArrayList<>();
        Map<String, List<Major>> majorMap= new MajorCodeServiceImpl().init();
        majorList = majorMap.get(CollegeCode);
        return majorList;
    }
}
