import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devAniele = new Dev();
        devAniele.setNome("Aniele");
        devAniele.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Aniele:"+ devAniele.getConteudosInscritos());
        devAniele.progredir();
        devAniele.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Aniele:"+ devAniele.getConteudosInscritos());
        System.out.println("Conteudos concluidos Aniele:"+ devAniele.getConteudosConcluidos());
        System.out.println("XP:" + devAniele.caucularTatalXp());

        System.out.println("----------------");

        Dev devAlan = new Dev();
        devAlan.setNome("Alan");
        devAlan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Alan:"+ devAlan.getConteudosInscritos());
        devAlan.progredir();
        devAlan.progredir();
        devAlan.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Alan:"+ devAlan.getConteudosInscritos());
        System.out.println("Conteudos concluidos Alan:"+ devAlan.getConteudosConcluidos());
        System.out.println("XP:" + devAlan.caucularTatalXp());


    }
}