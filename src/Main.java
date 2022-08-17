import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devLeticia = new Dev();
        devLeticia.setNome("Letícia");
        devLeticia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Letícia:" + devLeticia.getConteudosInscritos());

        devLeticia.progredir();

        System.out.println("Conteúdos Inscritos Letícia:" + devLeticia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Letícia:" + devLeticia.getConteudosConcluidos());

        System.out.println("XP" + devLeticia.calcularTotalXp());

        System.out.println("*__*");

        Dev devSergio = new Dev();
        devSergio.setNome("Sérgio");
        devSergio.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdo Inscritos Sérgio:" + devSergio.getConteudosInscritos());

        devSergio.progredir();

        System.out.println("*__*");

        System.out.println("Conteúdo Inscritos Sérgio:" + devSergio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Sérgio:" + devSergio.getConteudosConcluidos());

        System.out.println("XP" + devSergio.calcularTotalXp());
    }
}
