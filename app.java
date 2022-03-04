package cpit252;

public class app {

    public static void main(String[] args) {
        try {
            //Changed var to Character because I use IDE 8.2
            Characters knight = CharacterFactory.createCharacter(CharacterTypes.KNIGHT, "");
            System.out.println(knight.toString());

            Characters archer = CharacterFactory.createCharacter(CharacterTypes.ARCHER, "Legolas");
            System.out.println(archer.toString());

            Characters flagBearer = CharacterFactory.createCharacter(CharacterTypes.FLAG_BEARER, "Frodo");
            System.out.println(flagBearer.toString());
        } catch (IllegalArgumentException | NullPointerException e) {
            System.err.println(e.getMessage()
            );
        }

    }
}
