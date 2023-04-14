import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDouglas = new Dev("Douglas");
        devDouglas.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos:" + devDouglas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos:" + devDouglas.getConteudosConcluidos());
        System.out.println("XP: " + devDouglas.calcularTotalXp());

        System.out.println("Progrendindo...");
        devDouglas.progredir();

        System.out.println("Conteúdos inscritos:" + devDouglas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos:" + devDouglas.getConteudosConcluidos());
        System.out.println("XP: " + devDouglas.calcularTotalXp());
    }
}
