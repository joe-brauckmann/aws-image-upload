package com.jbrauck.awsimageupload.config;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import javax.websocket.RemoteEndpoint;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey:"AKIAZ4JHAHCCUAB7UWVU", secretKey:"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");

        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }

}
