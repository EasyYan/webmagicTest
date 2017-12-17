package com.easy.webmagic;

import com.easy.model.ZhihuUser;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.Date;
import java.util.List;

public class FirstWebMagic implements PageProcessor {

    //抓取网站的相关配置，包括：编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(10).setSleepTime(1000);
    //用户数量
    private static int num = 0;
    //搜索关键词
    private static String keyword = "JAVA";


    public void process(Page page) {

        //1. 如果是用户列表页面 【入口页面】，将所有用户的详细页面的url放入target集合中。
        if(page.getUrl().regex("https://www\\.zhihu\\.com/search\\?type=people&q=[\\s\\S]+").match()){
            List<String> a=page.getHtml().xpath("//div[@class='List']/div/div[@class='List-item']/div/div/div[@class='ContentItem-head']/h2").links().all();
            page.addTargetRequests(a);
            System.out.println(a);
        }
        //2. 如果是用户详细页面
        else{
            num++;//用户数++
            /*实例化ZhihuUser，方便持久化存储。*/
            ZhihuUser user = new ZhihuUser();
            /*从下载到的用户详细页面中抽取想要的信息，这里使用xpath居多*/
            /*为了方便理解，抽取到的信息先用变量存储，下面再赋值给对象*/
            String name = page.getHtml().xpath("//div[@class='ProfileHeader-main']/div[@class='ProfileHeader-content']/div/h1/span[@class='ProfileHeader-name']/text()").get();
            String identity = page.getHtml().xpath("//div[@class='ProfileHeader-main']/div[@class='ProfileHeader-content']/div[@class='ProfileHeader-contentHead']/h1/span[@class='RichText ProfileHeader-headline']/text()").get();
            String location = page.getHtml().xpath("//div[@class='ProfileHeader-main']/div[@class='ProfileHeader-content']/div[@class='ProfileHeader-contentBody']/span/div[@class='ProfileHeader-detail']/div[@class='ProfileHeader-detailItem']/div[@class='ProfileHeader-detailValue']/span/text()").get();

            //对象赋值
            user.setKey(keyword);
            user.setName(name);
            user.setIdentity(identity);
            user.setLocation(location);

            System.out.println("num:"+num +" " + user.toString());//输出对象
        }
    }

    public Site getSite() {
        return this.site;
    }

    public static void main(String[] args) {
        long startTime ,endTime;
        System.out.println("========知乎用户信息小爬虫【启动】喽！=========");
        startTime = new Date().getTime();
        //入口为：【https://www.zhihu.com/search?type=people&q=xxx 】，其中xxx 是搜索关键词
        Spider.create(new FirstWebMagic()).addUrl("https://www.zhihu.com/search?type=people&q="+keyword).thread(5).run();
        endTime = new Date().getTime();
        System.out.println("========知乎用户信息小爬虫【结束】喽！=========");
        System.out.println("一共爬到"+num+"个用户信息！用时为："+(endTime-startTime)/1000+"s");
    }
}
