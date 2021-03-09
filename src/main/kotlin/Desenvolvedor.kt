fun main() {
    val renatoDev               = Desenvolvedor(matricula = 1234, nome = "Renato", salario = 1000.00);

    println("Dev: ${renatoDev.toString()}");

    renatoDev.tocarBateria();
    renatoDev.tocarGuitarra();

    //val novoSalario: Double     = renatoDev.calculaBonus(500.99);

    //println("Salário bonificado: $novoSalario");

    //val joaoDev                 = Desenvolvedor("Rogerio", 1234, true);

    //println("Outro Dev: ${joaoDev.toString()}");

    val renatoTecnico               = LiderTecnico("Renato", 1234, 5248.0);
    val joaoTecnico               = LiderTecnico("João", 1235, 5427.0);
    val nayaraTecnico               = LiderTecnico("Nayara", 1236, 7600.0);
    val lucasTecnico               = LiderTecnico("Lucas", 1237, 5100.0);

    val lideresTecnicos = mutableListOf<LiderTecnico>();
    lideresTecnicos.add(renatoTecnico);
    lideresTecnicos.add(joaoTecnico);
    lideresTecnicos.add(nayaraTecnico);
    lideresTecnicos.add(lucasTecnico);

    for(lider in lideresTecnicos) {
        println(lider.toString());
    }

    //println(renatoTecnico.toString())

}

open class Desenvolvedor(
        open val nome: String = "",
        open val matricula: Long = 0,
        open val salario: Double = 0.0
    ): Musico, Astronomo {

    var status: Boolean = true;
    constructor(nome: String, matricula: Long, status: Boolean): this(nome, matricula) {
        this.status = status;
    }

    init {
        println("SOU IDOSO, VOU PRIMEIRO NAS VACINAS!")
    }

    open fun calculaBonus(bonus: Double): Double {
        return salario + bonus;
    }

    override fun tocarBateria() {
        println("Play Bateria");
    }

    override fun estudoMarte() {
        println("Estudo Marte mano.")
    }

    override fun toString(): String {
        return "Desenvolvedor(nome='$nome', matricula=$matricula, salario=$salario, status=$status)"
    }

}

class LiderTecnico(
    override val nome: String,
    override val matricula: Long,
    override val salario: Double): Desenvolvedor(nome,matricula, salario) {

    override fun calculaBonus(bonus: Double): Double {
        return super.calculaBonus(bonus * (1.05));
    }

    var especializacao: String = "Gerencia técnica";

    override fun toString(): String {
        return "LiderTecnico(nome='$nome', matricula=$matricula, salario=$salario)"
    }

    init {
        println("RODAR PRIMEIRO")
    }

    init {
        println("RODAR SEGUNDO")
    }

    init {
        println("RODAR TERCEIRO")
    }
}

interface Musico {
    fun tocarBateria()

    fun tocarGuitarra() {
        println("Play Guitarra");
    }
}

interface Astronomo {
    fun estudoMarte()
}