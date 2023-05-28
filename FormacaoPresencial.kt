class FormacaoPresencial(nome: String, conteudos: List<ConteudoEducacional>, val local: String) : Formacao(nome, conteudos) {
    override fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.toString()} matriculado na formação $nome (presencial)")
    }
}