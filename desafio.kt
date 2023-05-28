class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    val usuario3 = Usuario()
    val usuario4 = Usuario()

    val conteudo1 = ConteudoEducacional("Matemática II", 80, Nivel.Difícil)
    val conteudo2 = ConteudoEducacional("Banco de Dados", 70, Nivel.Intermediário)
    val conteudo3 = ConteudoEducacional("Introdução á Programação", 120, Nivel.Intermediário)
    val conteudo4 = ConteudoEducacional("Introdução á Programação", 120, Nivel.Intermediário)
    val conteudo5 = ConteudoEducacional("Metodologias Ágeis", 60, Nivel.Basico)
    val conteudo6 = ConteudoEducacional("Estatística", 70, Nivel.Intermediário)
    val conteudo8 = ConteudoEducacional("Engenharia de Software", 110, Nivel.Difícil)

    //Realizar matricula
    val formacaoOnline = FormacaoOnline("Introdução aos Sistemas Operacionais", listOf(conteudo1, conteudo2))
    formacaoOnline.matricular(usuario1)
    formacaoOnline.matricular(usuario4)
    formacaoOnline.matricular(usuario2)
}
