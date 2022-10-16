package Task3and4;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) throws WrongChoiceException {
        var scanner = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.println("Choose your destiny:");
        System.out.println("1 - Share your wisdom into holocrone");
        System.out.println("2 - Roll call");
        System.out.println("3 - Run, Luke! RUN!");
        System.out.println("4 - Add new friend");
        System.out.println("5 - Kill old friend");
        System.out.println("6 - Change him");

        var chosenMenuItem = scanner.nextInt();


        switch (chosenMenuItem) {
            case 1:
                try {
                    var file = new FileOutputStream("objects.txt"); // Создание файла и потока для записи в него
                    var out = new ObjectOutputStream(file); // Для сериализации объектов
                    var objects = new ArrayList<Humanoid>(); // Создание коллекции объектов в памяти

                    objects.add(Factory.Create("CloneTrooper", "Trooper", "1"));
                    objects.add(Factory.Create("Jedi", "Mace", "Windu"));
                    objects.add(Factory.Create("Sith", "Darth", "Vader"));
                    objects.add(Factory.Create("Sith", "Darth", "Sidius"));

                    out.writeObject(objects); // Сериализуем коллекцию объектов и записываем в файл

                    out.close(); // Закрываем потому что не оставляем ресурсы открытыми. Проветрили и хватит
                    file.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println(fileNotFoundException.getMessage());
                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                }
                break;

            case 2:
                try {
                    var file = new FileInputStream("objects.txt"); // Берем файл для чтения из него
                    var in = new ObjectInputStream(file); // Для десериализации объектов (пока что не десериализуем)

                    var objects = (ArrayList<Humanoid>) in.readObject(); // Вот теперь десериализуем коллекцию объектов в память

                    for (var obj : objects) { // Проходимся по коллекции объектов
                        System.out.println(obj.toString()); // Выводим в консоль строковое представление
                    }
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println(fileNotFoundException.getMessage());
                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                } catch (ClassNotFoundException classNotFoundException) {
                    System.out.println(classNotFoundException.getMessage());
                }
                break;

            case 3:
                System.out.println("I'm out!"); // Добавляем колкое замечание
                return; // и выходим из программы

            case 4:
                try {
                    var file = new FileInputStream("objects.txt");
                    var in = new ObjectInputStream(file);

                    var objects = (ArrayList<Humanoid>) in.readObject();

                    in.close();
                    file.close();

                    var Chewwy = new Humanoid("Chewbacca", "Vookie", false) {
                        public void SayHello() {
                            System.out.println("Arrrrrw");
                        }
                    };
                    Chewwy.SayHello();
                    objects.add(Chewwy);

                    var file1 = new FileOutputStream("objects.txt"); //надо оба иначе он не поймет что надо записывать хоть ты и час потратила на объяснения
                    var out = new ObjectOutputStream(file1);

                    out.writeObject(objects);

                    out.close();
                    file1.close();

                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println(fileNotFoundException.getMessage());
                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                } catch (ClassNotFoundException classNotFoundException) {
                    System.out.println(classNotFoundException.getMessage());
                }
                break;
            case 5:
                try {
                    var file = new FileInputStream("objects.txt");
                    var in = new ObjectInputStream(file);

                    var objects = (ArrayList<Humanoid>) in.readObject();

                    in.close();
                    file.close();

                    objects.remove(1);

                    var file1 = new FileOutputStream("objects.txt");
                    var out = new ObjectOutputStream(file1);

                    out.writeObject(objects);

                    out.close();
                    file1.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println(fileNotFoundException.getMessage());
                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                } catch (ClassNotFoundException classNotFoundException) {
                    System.out.println(classNotFoundException.getMessage());
                }
                break;
            case 6:
                try {
                    var file = new FileInputStream("objects.txt");
                    var in = new ObjectInputStream(file);

                    var objects = (ArrayList<Humanoid>) in.readObject();

                    in.close();
                    file.close();

                    var a = objects.get(0);
                    a.lastname = "2";

                    var file1 = new FileOutputStream("objects.txt");
                    var out = new ObjectOutputStream(file1);

                    out.writeObject(objects);

                    out.close();
                    file1.close();
                } catch (FileNotFoundException fileNotFoundException) {
                    System.out.println(fileNotFoundException.getMessage());
                } catch (IOException ioException) {
                    System.out.println(ioException.getMessage());
                } catch (ClassNotFoundException classNotFoundException) {
                    System.out.println(classNotFoundException.getMessage());
                }
                break;


            default:
                throw new WrongChoiceException(); // Бросаем юзеру в лицо наш прекрасный эксепшон потому что он не прав
        }


//        var a = Factory.Create("CloneTrooper", "Trooper", "1");
//        var b = Factory.Create("Jedi", "Mace", "Windu");
//        Factory.Create("Sith", "Darth", "Vader");
//        Factory.Create("Sith", "Darth", "Sidius");
//        Factory.Create("Sith", "Darth", "Tiranus");
//        System.out.println(a.isForceUser());
//        System.out.println(b.isForceUser());
//
//        var hello = ((Jedi) b).new Inner();
//        var salute = new CloneTrooper.Nested();
//
//        hello.SayHello();
//        salute.SayHello();
//        var Chewwy = new Humanoid("Chewbacca", "Vookie", false) {
//            public void SayHello() {
//                System.out.println("Arrrrrw");
//            }
//        };
//        Chewwy.SayHello();

        scanner.close();
    }
}