fun main() {

    val renatoPessoa = Pessoa("Renato", 20, "12345678900");
    renatoPessoa.conversar("Oie pessoal, tudo bem?!");
    println(renatoPessoa.toString());

    val renatoAluno = Aluno("Renato", 20);
    renatoAluno.aprenderNovasCoisas();
    renatoAluno.empreender();
    println(renatoAluno.toString());

    val renatoProfessor = Professor("Renato", "12345678900");
    renatoProfessor.aprenderConteudoDeNovosCursos();
    renatoProfessor.gravarAulasParaCurso();
    println(renatoProfessor.toString());
}

open class Pessoa(
    open val nome: String = "",
    open val idade: Int = 0,
    open val cpf: String = ""
) {

    fun conversar( msg: String) {
        println(msg)
    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade, cpf='$cpf')"
    }
}

class Aluno(
    override val nome: String = "",
    override val idade: Int = 0
): Pessoa(nome, idade), Hobbies {

    override fun aprenderNovasCoisas() {
        println("Gosto de aprender matemática, novos algoritmos e programação.");
    }

}

interface Hobbies {
    fun empreender() {
        println("Analisar problemas e criar soluções.")
    }

    fun aprenderNovasCoisas()
}

class Professor(
    override val nome: String = "",
    override val cpf: String = ""
): Pessoa(nome = nome, cpf = cpf), Cursos {
    override fun aprenderConteudoDeNovosCursos() {
        println("Estudar novos conteúdos para ter mais domínio sobre os conteúdos abordados.")
    }

}

interface Cursos {
    fun gravarAulasParaCurso() {
        println("Gravar e editar as aulas para postar nos cursos online.")
    }

    fun aprenderConteudoDeNovosCursos()
}
