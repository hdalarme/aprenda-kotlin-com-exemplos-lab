enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }

    fun exibirInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println(it.nome) }
    }
}

fun main() {
    // Criação de usuários
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    // Criação de conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 180)

    // Criação de uma formação
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2))

    // Matrícula de usuários na formação
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    // Exibição de inscritos na formação
    formacaoKotlin.exibirInscritos()
}
