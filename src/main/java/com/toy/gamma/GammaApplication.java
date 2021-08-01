package com.toy.gamma;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GammaApplication {

    public static void main(String[] args) {
//        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
//        pbeEnc.setPassword("chlwl695"); // PBE 값(XML PASSWORD설정)
//
//        System.out.println("url: \n"+pbeEnc.encrypt("jdbc:mariadb://110.8.197.253:9004/choi?characterEncoding=UTF-8&serverTimezone=UTC"));
//        System.out.println("id: \n"+pbeEnc.encrypt("chlwl"));
//        System.out.println("pwd: \n"+pbeEnc.encrypt("chlwl695"));
//        System.out.println("pbeEnc.toString() = " + pbeEnc.toString());
        SpringApplication.run(GammaApplication.class, args);
    }

}
