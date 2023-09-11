public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4 ;
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightOfOneBoxer = 78.2;
        System.out.println("Масса одного боксера "+ weightOfOneBoxer + " кг");
        var weightOfTheSecondBoxer = 82.7;
        System.out.println(  "Масса второго боксера " + weightOfTheSecondBoxer + " кг");
        var totalWeight = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("Общая масса " +totalWeight + "кг");
        var totalWeightMin = weightOfOneBoxer - weightOfTheSecondBoxer;
        System.out.println("Разность между массами бойцов " +totalWeightMin + " кг");

        var weightOfTheFirstAthlete = 80;
        var   weightOfTheSecondAthlete = 100;
        var theFirstWay = weightOfTheFirstAthlete - weightOfTheSecondAthlete;
        var theSecondWay = weightOfTheFirstAthlete % weightOfTheSecondAthlete;
        System.out.println("Первый способ  " + theFirstWay + " кг");
        System.out.println("Второй способ " + theSecondWay + " кг");


    }


}