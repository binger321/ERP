package com.binger.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.binger.goods.dao")
public class ErpSvcGoodsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpSvcGoodsApplication.class, args);
	}
}
