# TP2_BroadCastReceiver_29_3_2026
El sistema se ejecuto en un Android 15

Creamos un BroadCastReceiver llamado DebloqueoReceiver en el cuál al activarse llama a un Toast y registra un log en el Logcat con el mensaje: "Pantalla desbloqueada detectada", además abre la pantalla de llamada con el número 2664553747.
En el Main instanciamos el BroadCastReceiver y lo registramos en el onResume el cuál escucha al evento "android.intent.action.USER_PRESENT" del dispositivo.

Integrantes del grupo:
* Walter Alexander Vertacnik 46260391
* Stefani Nair Escobar 38752519
* Valentino Coppola 47040879
* Jeremías Sosa 39797677
