fun main(args: Array<String>) {
    val aes = AES.getInstance("Hu0tOrrFa9bncwy3bj8ebB==", "Aw3tbBsiTVCDDfNUEOwEkS")
        ?: throw IllegalStateException("Failed to initialize AES instance.")

    val message = "Hello, this is Aman Dhaker."
    val encryptedMessage = encryptMessage(message, aes = aes)
    println("message: $message\n encryptedMessage: $encryptedMessage")
    println("message: $message\n decryptedMessage: ${decryptMessage(encryptedMessage, aes = aes)}")
}

private fun encryptMessage(message: String, aes: AES): String {
    var encryptedPassword: String = ""
    encryptedPassword = aes.singleEncryption(message)
    // Encrypt any other user properties as needed

    return encryptedPassword
}

private fun decryptMessage(message: String, aes: AES): String {
    var encryptedPassword: String = ""
    encryptedPassword = aes.singleDecryption(message)
    // Encrypt any other user properties as needed

    return encryptedPassword
}