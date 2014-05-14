package com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public final class Server {

  public static void main(String[] args) {
    SpringApplication.run(Server.class, args);
  }

}
