package com.ed.gps.socket.config;

import com.ed.gps.socket.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by eliud on 7/25/2017.
 */
@Configuration
public class SocketServerConfig {


    @Bean
    public Server buildServer(@Value("gps.server.port:5001") Integer port,
                              @Value("gps.server.address:localhost") String address) {
        return new Server(port, address);
    }

}
