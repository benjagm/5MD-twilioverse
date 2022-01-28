# 5MD-twilioverse
Demo de 5 minutos primeros pasos usando Twilio

Preparación
- Verificar que el endpoint GET http://localhost:4567/web funciona
- Iniciar ngrok hacia el puerto http 4567
- Abrir la consola de Twilio en la sección de números de teléfono.

Demo
- Explicar como funcionan los webhooks en twilio aplicados a sms entrantes y salientes.
- Comprar un número de telefono.
- Implementar el webhook para sms.
- Probar el webhook con curl -X POST http://localhost:4567/sms  
- Configurar el webhook de sms en el telefono usando http://zzzzz.ngrok.io/sms
- Pedir a asistentes que envien un sms.
- Explicar webhooks para llamadas de voz entrantes y salientes.
- Implementar el webhook para voz.
- Probar el webhook con curl -X POST http://localhost:4567/voz
- Configurar el webhook de voz en el telefono usando http://zzzzz.ngrok.io/voz
- Pedir a asistentes que llamen.
