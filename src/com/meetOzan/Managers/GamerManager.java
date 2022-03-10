package com.meetOzan.Managers;

import com.meetOzan.Entities.Gamers;
import com.meetOzan.Services.CheckService;
import com.meetOzan.Services.GamerService;

public class GamerManager implements GamerService {


    @Override
    public void addGamer(Gamers gamers) {

            if(true){
                System.out.println(gamers.getFirstName()+""+gamers.getLastName()+ " Kayıt Oldunuz "
                        +gamers.getNickname()+" Nickli Kullanıcı Adını Aldınız.");
            }
            else{
                System.out.println(gamers.getLastName()+""+gamers.getFirstName()+" ReCaptcha Dogrulanmadi.");
            }
    }

    @Override
    public void upgradeGamer(Gamers gamers) {

        System.out.println(gamers.getId() + " ID'li " + gamers.getNickname()+
                " Değişmiştir. Yeni Nickname: " + gamers.getNewNickName());

        gamers.setNickname(gamers.getNewNickName());
    }

    @Override
    public void removeGamer(Gamers gamers) {
        System.out.println(gamers.getNickname()+" Nickli Kullanici Kaydi Silinmiştir.");

    }

}
