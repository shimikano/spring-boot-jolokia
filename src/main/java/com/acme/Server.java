package com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

public final class Server {

  public static void main(String[] args) {
    SpringApplication.run(ServerConfig.class, args);
  }
  
  @EnableAutoConfiguration
  public static class ServerConfig {
    // empty
  }
  
}
