package br.senai.sp.jandira.turismo.dao

import android.content.Context
import br.senai.sp.jandira.turismo.R
import br.senai.sp.jandira.turismo.model.PontoTuristico

class PontosTuristicosDao {

    //tudo que está dentro do método companion é estático
    companion object {

        fun getPontosTuristicos(context: Context): List<PontoTuristico> {

            val pt1 = PontoTuristico()
            pt1.codigo = 1
            pt1.nomePontoTuristico = "China Cyberpunk"
            pt1.descricao = "A cultura cyberpunk teve seu inicio por volta da década de 40 e 50, dentro dos livros de ficção científica com uma visão utópica. O termo “Cyberpunk” tem como significado a subcultura que é focada na cybercultura, tem como preferência músicas psicodélicas, da junção do punk rock e música eletrônica e por adereços de moda futurista."
            pt1.imagem = context.getDrawable(R.drawable.cyberpunk)

            val pt2 = PontoTuristico()
            pt2.codigo = 2
            pt2.nomePontoTuristico = "Austin, Texas"
            pt2.descricao = "Austin, a capital do Texas, nos EUA, é uma cidade que faz divisa com a região de Texas Hill Country. Contando com o campus principal da Universidade do Texas, Austin é conhecida pelo cenário eclético de música ao vivo centralizado nos gêneros country, blues e rock."
            pt2.imagem = context.getDrawable(R.drawable.tlou)

            val pt3 = PontoTuristico()
            pt3.codigo = 3
            pt3.nomePontoTuristico = "Hijacked"
            pt3.descricao = "O local é ambientado em um grande superiate sequestrado. Os cantos afiados e os espaços confinados promovem o combate corpo a corpo. Há também um grande compartimento de contêineres na parte inferior do mapa. Além disso, existem dois zodíacos no final do lado da piscina."
            pt3.imagem = context.getDrawable(R.drawable.cod)

            val pt4 = PontoTuristico()
            pt4.codigo = 4
            pt4.nomePontoTuristico = "Halo Array"
            pt4.descricao = "O Halo Array, Halos, alternativamente conhecido como os Anéis Sagrados pelo Covenant, Fortress Worlds por seus criadores, Instalações pela A.I. Os monitores que os controlam, e as Grandes Rodas por humanos pré-históricos, são sete (de doze originais) enormes instalações em forma de anel construídas pelos Forerunners em toda a galáxia há mais de cem mil anos como último recurso ao combater o parasita conhecido como Enchente. Quando nada mais pôde ser feito, eles ativaram os anéis que mataram todas as formas de vida sencientes dentro de três raios do centro galáctico."
            pt4.imagem = context.getDrawable(R.drawable.halo)

            val pt5 = PontoTuristico()
            pt5.codigo = 5
            pt5.nomePontoTuristico = "Dark Souls World"
            pt5.descricao = "O mundo de Dark Souls é um mundo de ciclos. Reinos sobem e descem, eras vêm e vão, e até o tempo pode terminar e recomeçar enquanto a chama se apaga e se renova. Esses ciclos estão ligados à Primeira Chama, uma misteriosa manifestação de vida que divide e define estados separados, como calor e frio, ou vida e morte."
            pt5.imagem = context.getDrawable(R.drawable.ds)

            val pontosTuristicos = listOf<PontoTuristico>(pt1, pt2, pt3, pt4, pt5)

            return pontosTuristicos

        }

    }

}