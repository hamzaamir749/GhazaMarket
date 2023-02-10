#include <jni.h>


JNIEXPORT jstring JNICALL
Java_com_auctionexperts_utils_ExtensionFunctionsKt_getBaseUrl(JNIEnv *env, jclass clazz) {
    return (*env)->
            NewStringUTF(env,
                         "https://generalapiproduction.azurewebsites.net/");
}


JNIEXPORT jstring JNICALL
Java_com_auctionexperts_utils_ExtensionFunctionsKt_getClientId(JNIEnv *env, jclass clazz) {
    return (*env)->
            NewStringUTF(env,
                         "AE_Brights");

}

JNIEXPORT jstring JNICALL
Java_com_auctionexperts_utils_ExtensionFunctionsKt_getClientSecret(JNIEnv *env, jclass clazz) {
    return (*env)->
            NewStringUTF(env,
                         "36799AF9-5875-41B1-9A51-DFA2B919EC31");

}

JNIEXPORT jstring JNICALL
Java_com_auctionexperts_utils_ExtensionFunctionsKt_getSignalRBaseUrl(JNIEnv *env, jclass clazz) {
    return (*env)->
            NewStringUTF(env,
                         "https://signalr2.aeapi.net/lotr");

}