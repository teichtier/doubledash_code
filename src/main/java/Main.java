public class Main {


    public static void main(String[] args) {
        DoubleDash doubleDash = new DoubleDash();

        DashParameters.DashParametersBuilder builder = DashParameters.builder();

        builder.getValueOfParameter(args, "char").ifPresent(builder::character);
        builder.getValueOfParameter(args, "weapon").ifPresent(builder::weapon);
        builder.getValueOfParameter(args, "difficulty").ifPresent(builder::difficulty);
        builder.getValueOfParameter(args, "language").ifPresent(builder::langType);
        builder.getValueOfParameter(args, "multiplayer").ifPresent(s -> {
            if (s.toLowerCase().equals("y"))
                builder.numberOfPlayers(2);
        });

        DashParameters parameters = builder.build();
        System.out.println(parameters);
    }

    /*Method for searching for a Value in an Array*/
    private static boolean contains(String[] myArray, String value) {
        for (String i : myArray) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

}
