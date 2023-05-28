class FormacaoOnline (nome: String, conteudos: List<ConteudoEducacional>) : Formacao(nome, conteudos) {
    override fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.toString()} matriculado na formação $nome (online)")
    }
}