package com.example.kafkademo;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStream.class)
public class StreamsConfig {

}
