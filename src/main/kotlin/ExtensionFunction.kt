fun String.pegaUltimoChar(): Char = this.get(this.length - 1);
fun String.removerPrimeiroChar(): String = this.substring(1, this.length - 1);

fun main() {
    var nome = "Renato";
    println(nome.pegaUltimoChar());

    println(nome.removerPrimeiroChar());

}