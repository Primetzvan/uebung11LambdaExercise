import java.io.IOException;
import java.io.PipedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        String fileName = "pupils.csv";

        System.out.println("Filter: \n");

            try {
                Files
                        .readAllLines(Paths.get(fileName), StandardCharsets.UTF_8)
                        .stream()
                        .skip(1)
                        .map(line -> line.split(";"))
                        .map(lineElement -> new Person( Long.parseLong(lineElement[0]),
                                                        lineElement[1],
                                                        lineElement[2],
                                                        LocalDate.parse(lineElement[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                                                        Integer.parseInt(lineElement[4]),
                                                        lineElement[5]
                                                        ))
                        .filter(Person::filterPostcode)
                        .forEach(pupil -> System.out.println(pupil));

            } catch (IOException e) {
                e.printStackTrace();
            }

        System.out.println("\nSort:\n");

        try {
            Files
                    .readAllLines(Paths.get(fileName), StandardCharsets.UTF_8)
                    .stream()
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(lineElement -> new Person( Long.parseLong(lineElement[0]),
                            lineElement[1],
                            lineElement[2],
                            LocalDate.parse(lineElement[3], DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                            Integer.parseInt(lineElement[4]),
                            lineElement[5]
                    ))
                    .sorted(new Comparator<Person>() {
                        @Override
                        public int compare(Person o1, Person o2) {
                            return o1.getBirthdate().compareTo(o2.getBirthdate());
                        }
                    })
                    .forEach(pupil -> System.out.println(pupil));

        } catch (IOException e) {
            e.printStackTrace();
        }


        }



}
