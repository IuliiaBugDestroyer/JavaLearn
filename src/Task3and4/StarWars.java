package Task3and4;


public class StarWars {
    public static void main(String[] args) {
        var a = Factory.Create("CloneTrooper", "Trooper", "1");
        var b = Factory.Create("Jedi", "Mace", "Windu");
        Factory.Create("Sith", "Darth", "Vader");
        Factory.Create("Sith", "Darth", "Sidius");
        Factory.Create("Sith", "Darth", "Tiranus");
        System.out.println(a.isForceUser());
        System.out.println(b.isForceUser());

        var hello = ((Jedi) b).new Inner();
        var salute = new CloneTrooper.Nested();

        hello.SayHello();
        salute.SayHello();
        var Chewwy = new Humanoid("Chewbacca", "Vookie", false) {
            public void SayHello() {
                System.out.println("Arrrrrw");
            }
        };
        Chewwy.SayHello();
    }
}