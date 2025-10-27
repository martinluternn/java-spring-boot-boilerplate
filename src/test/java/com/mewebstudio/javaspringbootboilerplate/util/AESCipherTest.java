package com.mewebstudio.javaspringbootboilerplate.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("unit")
@DisplayName("Unit tests for AESCipher")
class AESCipherTest {

    private static final String SECRET_KEY = "ZsV6Zj53yzT8zvuTl49FupPCADQIxAnV";

    @Test
    @DisplayName("Encrypting and decrypting a value produces the original text")
    void encryptAndDecryptRoundTrip() throws Exception {
        String plainText = "Hello, World!";

        String encryptedText = AESCipher.encrypt(plainText, SECRET_KEY);
        String decryptedText = AESCipher.decrypt(encryptedText, SECRET_KEY);

        assertThat(decryptedText).isEqualTo(plainText);
    }
}
