package com.github.thaynarasilvapinto.composite

import org.junit.Test
import kotlin.test.assertEquals

class CompositeTest {
    @Test
    fun `mostrar a arvore de funcionarios e subordinados`() {
        //Cria programadores (folhas)
        val pEstagiario = Programador("José", 900.00)
        val pJunior = Programador("Pedro", 2900.00)
        val pSenior = Programador("Ricardo", 3900.00)

        //Gerente
        val joaoGerente = Gerente("João", 15000.00)
        val mariaGerente = Gerente("Maria", 10000.00)
        val carlosGerente = Gerente("Carlos", 5000.00)

        //Montar a estrutura em árvore

        //Carlos superviosiona os programadores José e Pedro
        carlosGerente.add(pEstagiario)
        carlosGerente.add(pJunior)

        //Maria superviosiona o programador Ricardo
        mariaGerente.add(pSenior)

        //João é raiz da estrutura em árvore
        joaoGerente.add(carlosGerente)
        joaoGerente.add(mariaGerente)

        joaoGerente.print()
    }

    @Test
    fun `deve deletar uma funcionario da lista de subordinados de um gerente`() {
        //Cria programadores (folhas)
        val pEstagiario = Programador("José", 900.00)
        val pJunior = Programador("Pedro", 2900.00)

        //Gerente
        val joaoGerente = Gerente("João", 15000.00)

        //Adicionar os dois funcionarios a lista de subordindos
        joaoGerente.add(pEstagiario)
        joaoGerente.add(pJunior)

        assertEquals(pEstagiario,joaoGerente.listaSubordinados[0])
        assertEquals(pJunior,joaoGerente.listaSubordinados[1])
        assertEquals(2,joaoGerente.listaSubordinados.size)

        joaoGerente.print()
        System.out.println("--------------------")

        //retirar um subordinado da lista
        joaoGerente.remove(pEstagiario)
        assertEquals(pJunior,joaoGerente.listaSubordinados[0])
        assertEquals(1,joaoGerente.listaSubordinados.size)

        joaoGerente.print()
    }
    @Test
    fun `nao deve deletar um funcionario da lista de subordindos de um funcionario que nao e gerente`() {
        //Cria programadores (folhas)
        val pEstagiario = Programador("José", 900.00)
        val pJunior = Programador("Pedro", 2900.00)
        pEstagiario.remove(pJunior)
    }
    @Test
    fun `nao deve adicionar um funcionario da lista de subordindos de um funcionario que nao e gerente`() {
        //Cria programadores (folhas)
        val pEstagiario = Programador("José", 900.00)
        val pJunior = Programador("Pedro", 2900.00)
        pEstagiario.add(pJunior)
    }
}