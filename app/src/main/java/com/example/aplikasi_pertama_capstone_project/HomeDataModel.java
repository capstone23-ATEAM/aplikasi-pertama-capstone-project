package com.example.aplikasi_pertama_capstone_project;

import java.util.ArrayList;
import java.util.List;

public class HomeDataModel {
    public static List<HomeModel> groceryList() {
        HomeModel telur = new HomeModel("telur", 10, "https://fitshop-production.s3.ap-southeast-1.amazonaws.com/wp-content/uploads/2020/04/20202149/Telur-Ayam.jpg");
        HomeModel sabun = new HomeModel("sabun", 2, "https://cdn0-production-images-kly.akamaized.net/8krAgRVCaEwC0_cqFV6iaC8N5PE=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1459340/original/049816700_1483461106-Sabun-Wajah-yang-Tepat-untuk-Kulit-Berjerawat.jpg");
        HomeModel kopi = new HomeModel("kopi", 5, "https://www.makanabis.com/bima-content/2020/03/27/l-istock-157528129182130308d672292833ba27bc1ab295c20200327103751-bimacms.jpg");
        HomeModel teh = new HomeModel("teh", 2, "https://assets-a1.kompasiana.com/items/album/2019/09/16/tea-5d7f4e0c0d823044bd67f8e2.jpg");

        List<HomeModel> groceryList = new ArrayList<>();

        groceryList.add(telur);
        groceryList.add(sabun);
        groceryList.add(kopi);
        groceryList.add(teh);

        return groceryList;
    }
}
