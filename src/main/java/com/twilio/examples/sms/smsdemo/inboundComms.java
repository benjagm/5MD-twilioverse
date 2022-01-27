package com.twilio.examples.sms.smsdemo;

import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;
import com.twilio.twiml.voice.Say;

import java.security.MessageDigest;

import static spark.Spark.*;


public class inboundComms {
        public static void main(String[] args) {
            get("/", (req, res) -> "Hola Twiloverso!");

            post("/sms", (req, res) -> {
                Body body = new Body.Builder("¡Buenvenido al Twilioverso!").build();
                Message sms = new Message.Builder().body(body).build();
                MessagingResponse messagingResponse = new MessagingResponse.Builder().message(sms).build();
                return messagingResponse.toXml();
            });

            post("/voz", (req, res) -> {
                Say say = new Say.Builder("¡Buenvenido al Twilioverso!").build();
                VoiceResponse voiceResponse = new VoiceResponse.Builder().say(say).build();
                return voiceResponse.toXml();
            });
        }
}
