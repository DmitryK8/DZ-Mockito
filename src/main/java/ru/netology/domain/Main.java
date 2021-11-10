package ru.netology.domain;

import ru.netology.manager.PosterItem;
import ru.netology.manager.PosterManager;

import java.util.Properties;

public class Main {



    public static void main(String[] args) {
        PosterItem first = new PosterItem(101);
        PosterItem second = new PosterItem(222);
        PosterItem third = new PosterItem(30);

        PosterManager mana = new PosterManager();
        mana.save(first);
        mana.save(second);
        mana.save(third);
//        String[] id = {
//                "id 1",
//                "id 2",
//                "id 3",
//                "id 4",
//                "id 5",
//                "id 6",
//                "id 7",
//                "id 8",
//                "id 9"
//        };
//        String newId = "id 10";
//
//        String[] tmp = new String[name.length + 1];
//        for (int i = 0; i < names.length; i++) {
//            tmp[i] = names[i];
//        }
//        tmp[tmp.length - 1] = newName;
//        names = tmp;
    }
}