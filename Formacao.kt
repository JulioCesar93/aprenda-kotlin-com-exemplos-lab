abstract class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    abstract fun matricular(usuario: Usuario)
}