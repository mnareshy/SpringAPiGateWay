package com.apigateway.we;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class APIGateWayServer {


    /*
    * URLS
    *
    *http://localhost:8765/MSINSURENCEWE/quote/premium/feign/NareshM/KA51MC9384
    *
    * http://localhost:8765/   -  API GATEWAY
    *
    * MSINSURENCEWE - app name registered in Eureka
    *
    * quote/premium/feign/NareshM/KA51MC9384 - service URL
    *
    *
    * http://localhost:8765/QUOTE-SERVICE/quote/premium/feign/NareshM/KA51MC9384
    *
    * */

    public static void main(String[] args) {

        SpringApplication.run(APIGateWayServer.class);

    }
}
