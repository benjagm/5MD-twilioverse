# 5MD-twilioverse
5 minutes Demo first steps using Twilio

Preparation
- Make sure the endpoint GET http://localhost:4567/web is working.
- Start ngrok to port http 4567.
- Open Twilio's console in the numbers section.

Demo
- Explain how webhooks can be applied to inbound / outbound sms with Twilio.
- Buy a new phone.
- Code the sms webhook.
- Test the webhook using curl -X POST http://localhost:4567/sms  
- Configure the ngrok version of the webhook http://zzzzz.ngrok.io/sms as sms webhook in the phone number
- Prompt people to send an SMS.
- Explain how webhooks can be applied to inbound / outbound voice calls with Twilio.
- Code the voice webhook.
- Test the webhook using curl -X POST http://localhost:4567/voz 
- Configure the ngrok version of the webhook http://zzzzz.ngrok.io/voz as voice webhook in the phone number
- Prompt people to make a call to the number.
