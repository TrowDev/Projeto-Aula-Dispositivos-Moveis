fun main() {
    val exInt           = 1;
    val exLong          = 1L;
    val exFloat         = 1.5F;
    val exDouble        = 1.5;
    val exHex           = 0x0F;
    val exBin           = 0b010101;

    val exBool          = true; // ou false

    val exString        = "Teste de String";
    val exBigString     = """
       A B
        C
        D
        E
    """;

    val idade = 20;
    val msg             = "Parabéns ${if (idade == 20) "Você sabe o segredo do Universo" else "Espere até lá" }";

}