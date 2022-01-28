import com.dio.poo.Bootcamp;
import com.dio.poo.Curso;
import com.dio.poo.Dev;
import com.dio.poo.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinícius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vinicius" + devVinicius.getConteudosIncritos());
        devVinicius.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Vinicius" + devVinicius.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Vinicius" + devVinicius.getConteudosConcluidos());
        System.out.println("xp:"+devVinicius.calcularTotalXp());

        System.out.println("-------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosIncritos());
        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("xp:"+devCamila.calcularTotalXp());


    }
}
