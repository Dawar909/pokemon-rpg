import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class PokémonRPG {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList <String> UsersPokemon = new ArrayList<>();
        ArrayList <String> WildPokemon = new ArrayList<>();
        String AttackChooser;
        int[] Damage ={30,50,75,100};
        int choice;
        System.out.println("Welcome to Professor Oak's Lab");
        System.out.println("Choose your Starter pokemon");
        System.out.println("1) Bulbasaur\n2) Squirtle\n3) Charmander");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Congratulations, You got a Bulbasaur!!");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                System.out.println("Gary: I will fight you!");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("Gary: Squirtle! I choose you.");
                System.out.println("             _____\r\n" + //
                                        "           ,`o   o \\\r\n" + //
                                        "          ` \\____/ ‘\r\n" + //
                                        "          `,______,`\r\n" + //
                                        "  ,--------/   \\  \\____,\r\n" + //
                                        "  ‘--------|___|__|____/\r\n" + //
                                        "    /  \\   | __  _\\\r\n" + //
                                        "    |  /__\\/  \\ /  \\\r\n" + //
                                        "    \\_____ \\  / \\  |\r\n" + //
                                        "           ^^^^ ^^^^");
                System.out.println("Squirtle \n HP:100");
                try {
                    Thread.sleep(3000);   
                } catch (InterruptedException e) {
                }                         
                System.out.println("You: Bulbasaur! I choose you!");
                System.out.println("\r\n" + //
                                        "\r\n" + //
                                        "           /\\/\\/\\/\\/\\\r\n" + //
                                        "          /     |    \\\r\n" + //
                                        "         /      |     \\\r\n" + //
                                        "        /\\______|_____/\\\r\n" + //
                                        "       /  /´¯\\    /¯`\\  \\\r\n" + //
                                        "       \\  \\ º/    \\º / /         \r\n" + //
                                        "        \\ .·´¯`v´¯`·. / \r\n" + //
                                        "       / \\¨\\______/¨ /  \\  \r\n" + //
                                        "      |  |¯¯¯¯¯¯¯¯¯¯¯|  |    \r\n" + //
                                        "      IooI           IooI     \r\n" + //
                                        "");
                System.out.println("Bulbasaur\nHP:100");
                System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar Beam");
                System.out.println("Choose your move!");
                AttackChooser = scanner.nextLine();
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println(AttackChooser + " did 50 Damage");
                System.out.println("Squirtle\nHP:50");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("Gary:Squirtle use water gun");
                System.out.println("Water gun did 50 damage");
                System.out.println("Bulbasaur\nHP:50");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar beam");
                System.out.println("Choose your move");
                AttackChooser = scanner.nextLine();
                System.out.println(AttackChooser + " did 50 Damage");
                System.out.println("Squirtle fainted!");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("Professor Oak:Congratulations you won the battle");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("Professor Oak:Your'e First Goal is to catch a pokemon so you can fight the gym leader");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("You went out to catch your first pokemon");
                WildPokemon.add("Caterpie");
                WildPokemon.add("Mankey");
                WildPokemon.add("Rattata");
                WildPokemon.add("Pidgey");
                int randomIndex = random.nextInt(WildPokemon.size());
                String Firstpokemon = WildPokemon.get(randomIndex);
                System.out.println("You Encountered a Wild "  + Firstpokemon );
                        System.out.println("You:Bulbasaur I choose you");
                        try {
                        Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println(Firstpokemon + "\nHP:50");
                        System.out.println("Bulbasaur\nHP:100");
                        System.out.println("\r\n" + //
                                        "\r\n" + //
                                        "           /\\/\\/\\/\\/\\\r\n" + //
                                        "          /     |    \\\r\n" + //
                                        "         /      |     \\\r\n" + //
                                        "        /\\______|_____/\\\r\n" + //
                                        "       /  /´¯\\    /¯`\\  \\\r\n" + //
                                        "       \\  \\ º/    \\º / /         \r\n" + //
                                        "        \\ .·´¯`v-¯`·. / \r\n" + //
                                        "       / \\¨\\______/¨ /  \\  \r\n" + //
                                        "      |  |¯¯¯¯¯¯¯¯¯¯¯|  |    \r\n" + //
                                        "      IooI           IooI     \r\n" + //
                                        "");
                        System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar beam");
                        System.out.println("Choose your move ");
                        AttackChooser = scanner.nextLine();
                        System.out.println(AttackChooser + " did 50 damage");
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("You tried to catch " + Firstpokemon);
                        System.out.println("Congratulations, you caught a " + Firstpokemon);
                        UsersPokemon.add(Firstpokemon);
                        UsersPokemon.add("Bulbasaur");
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("You went to professor oak's lab ");
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("Professor Oak:Now you can go to the gym ");
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("But before that I have to give you something");
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("you got a pokedex");
                        System.out.println(UsersPokemon.toString());
                        System.out.println("This is a pokedex");
                        System.out.println("You went to the gym");
                        System.out.println("You are challlenged by Brock! the rock gym leader");                        
                            System.out.println("You:Bulbasaur!I choose you");
                            try {
                                Thread.sleep(1000);   
                            } catch (InterruptedException e) {
                            }
                            System.out.println("Brock:Geodude! I choose you");
                            System.out.println("\r\n" + //
                                        "\r\n" + //
                                        "           /\\/\\/\\/\\/\\\r\n" + //
                                        "          /     |    \\\r\n" + //
                                        "         /      |     \\\r\n" + //
                                        "        /\\______|_____/\\\r\n" + //
                                        "       /  /´¯\\    /¯`\\  \\\r\n" + //
                                        "       \\  \\ º/    \\º / /         \r\n" + //
                                        "        \\ .·´¯`v-¯`·. / \r\n" + //
                                        "       / \\¨\\______/¨ /  \\  \r\n" + //
                                        "      |  |¯¯¯¯¯¯¯¯¯¯¯|  |    \r\n" + //
                                        "      IooI           IooI     \r\n" + //
                                       "");
                            System.out.println("Geodude\nHP:125");
                            try {
                                Thread.sleep(1000);   
                            } catch (InterruptedException e) {
                            }
                            System.out.println("Bulbasaur\nHP:100");
                            System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar Beam");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();
                            randomIndex = random.nextInt(Damage.length);
                            int firstdamage = Damage[randomIndex];
                            int newhp = 125;
                            newhp -= firstdamage;
                            System.out.println(AttackChooser + " did " + firstdamage + " damage");
                            System.out.println("Geodude \nHP:" + newhp);
                            System.out.println("Brock:Geodude use Rock Throw"); 
                            try {
                                Thread.sleep(1000);   
                            } catch (InterruptedException e) {
                            }
                            System.out.println("Rock Throw did 50 damage");
                            System.out.println("Bulbasaur\nHP:50"); 
                            System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar Beam");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();                                 
                            firstdamage = Damage[randomIndex];
                            newhp -= firstdamage;
                            System.out.println(AttackChooser + " did " + firstdamage + " damage");
                            if (newhp <= 0){
                                System.out.println("Geodude Fainted");
                                System.out.println("Brock: Onix! I choose you");
                                System.out.println("Onix\nHP:150");
                                System.out.println("Bulbasaur\nHP:50");
                                System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar Beam");
                                System.out.println("Choose your move");
                                AttackChooser = scanner.nextLine();
                                firstdamage = Damage[randomIndex];
                                newhp = 150;
                                newhp -= firstdamage;
                                System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                                System.out.println("Onix\nHP:" + newhp);
                                System.out.println("Brock: Onix used Rock Throw");
                                System.out.println("Rock throw did 50 damage");
                                System.out.println("Bulbasaur Fainted!");
                                System.out.println("You: " + Firstpokemon +"! I choose you");
                                System.out.println(Firstpokemon + "\nHP:100");
                                System.out.println("Quick Attack\nTackle");
                                System.out.println("Choose your move");
                                AttackChooser = scanner.nextLine();
                                firstdamage = Damage[randomIndex];
                                newhp -= firstdamage;
                                System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                                if (newhp <= 0){
                                    System.out.println("Onix Fainted!\nYou got a Boulder Badge");
                                }
                                else{
                                    System.out.println("Onix\nHP:" + newhp);
                                }
                                }
                                else{
                                System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar Beam");
                                System.out.println("Choose your move");
                                AttackChooser = scanner.nextLine();
                                System.out.println(AttackChooser + " did " + firstdamage + " damage");
                                System.out.println("Geodude\nHP:" + newhp); 
                                System.out.println("Brock:Geodude use Rock Throw");
                                System.out.println("Rock throw did 50 damage");
                                System.out.println("Bulbasaur fainted!"); 
                                System.out.println("You: " + Firstpokemon +"!I choose you");
                                System.out.println(Firstpokemon +"\nHP:100");
                                System.out.println("Quick Attack\ntackle");
                                firstdamage = Damage[randomIndex];
                                System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar Beam");
                                System.out.println("Choose your move");
                                System.out.println(AttackChooser + " did " + firstdamage + " damage");
                                System.out.println("Geodude Fainted");
                                System.out.println("Brock: Onix! I choose you");
                                System.out.println("Onix\nHP:150");
                                System.out.println("Bulbasaur\nHP:50");
                                System.out.println("Vine Whip\nRazor Leaf\nLeech Seed\nSolar Beam");
                                System.out.println("Choose your move");
                                AttackChooser = scanner.nextLine();
                                firstdamage = Damage[randomIndex];
                                newhp = 150;
                                newhp -= firstdamage;
                                System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                                System.out.println("Onix\nHP:" + newhp);
                                System.out.println("Brock: Onix used Rock Throw");
                                System.out.println("Rock throw did 50 damage");
                                System.out.println("Bulbasaur Fainted!");
                                System.out.println("You: " + Firstpokemon +"! I choose you");
                                System.out.println(Firstpokemon + "\nHP:100");
                                System.out.println("Quick Attack\nTackle");
                                System.out.println("Choose your move");
                                AttackChooser = scanner.nextLine();
                                firstdamage = Damage[randomIndex];
                                newhp -= firstdamage;
                                System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                                if (newhp <= 0){
                                    System.out.println("Onix Fainted!\nYou got a Boulder Badge");
                                }
                                else{
                                    System.out.println("Onix\nHP:" + newhp);
                                    System.out.println("Brock: Onix used Rock Throw");
                                    System.out.println("Rock throw did 50 damage");
                                    System.out.println(Firstpokemon +"\nHP:50");
                                    System.out.println("Quick Attack\nTackle");
                                    System.out.println("Choose your move");
                                    AttackChooser = scanner.nextLine();
                                    firstdamage = Damage[randomIndex];
                                    System.out.println("Onix Fainted\nYou got a Boulder Badge");
                                    
                                }}     
                                break;
            case 2:
            System.out.println("Congratulations, You got a Squirtle!!");
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
        System.out.println("Gary: I will fight you!");
        try {
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
        }
        System.out.println("Gary: Bulbasaur! I choose you.");
        System.out.println();
        System.out.println("Bulbasaur\n HP:100");
        try {
            Thread.sleep(3000);   
        } catch (InterruptedException e) {
        }                         
        System.out.println("You: Squirtle! I choose you!");
        System.out.println();
        System.out.println("Squirtle\nHP:100");
        System.out.println("Water gun\nSkull bash\nBubble beam\nRapid spin");
        System.out.println("Choose your move!");
        AttackChooser = scanner.nextLine();
        try {
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
        }
        System.out.println(AttackChooser + " did 50 Damage");
        System.out.println("Squirtle\nHP:50");
        try {
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
        }
        System.out.println("Gary:Bulbasaur whip");
        System.out.println("vine whip did 50 damage");
        System.out.println("Bulbasaur\nHP:50");
        try {
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
        }
        System.out.println("Water gu\nBubble beam\nSkull bash\nRapid Spin");
        System.out.println("Choose your move");
        AttackChooser = scanner.nextLine();
        System.out.println(AttackChooser + " did 50 Damage");
        System.out.println("Bulbasaur");
        try {
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
        }
        System.out.println("Professor Oak:Congratulations you won the battle");
        try {
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
        }
        System.out.println("Professor Oak:Your'e First Goal is to catch a pokemon so you can fight the gym leader");
        try {
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
        }
        System.out.println("You went out to catch your first pokemon");
        WildPokemon.add("Caterpie");
        WildPokemon.add("Mankey");
        WildPokemon.add("Rattata");
        WildPokemon.add("Pidgey");
        randomIndex = random.nextInt(WildPokemon.size());
        Firstpokemon = WildPokemon.get(randomIndex);
        System.out.println("You Encountered a Wild "  + Firstpokemon );
        System.out.println("You:Squirtle I choose you");
                try {
                Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println(Firstpokemon + "\nHP:50");
                System.out.println("Squirtle\nHP:100");            
                System.out.println("Water gun\nBubble Beam\nSkull bash\n   ");
                System.out.println("Choose your move ");
                AttackChooser = scanner.nextLine();
                System.out.println(AttackChooser + " did 50 damage");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("You tried to catch " + Firstpokemon);
                System.out.println("Congratulations, you caught a " + Firstpokemon);
                UsersPokemon.add(Firstpokemon);
                UsersPokemon.add("Bulbasaur");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("You went to professor oak's lab ");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("Professor Oak:Now you can go to the gym ");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("But before that I have to give you something");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
                System.out.println("you got a pokedex");
                System.out.println(UsersPokemon.toString());
                System.out.println("This is a pokedex");
                System.out.println("You went to the gym");
                System.out.println("You are challlenged by Brock! the rock gym leader");                        
                    System.out.println("You:Squirtle!I choose you");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Brock:Geodude! I choose you");                    
                    System.out.println("Geodude\nHP:125");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Squirtle\nHP:100");
                    System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                    System.out.println("Choose your move");
                    AttackChooser = scanner.nextLine();
                    randomIndex = random.nextInt(Damage.length);
                    firstdamage = Damage[randomIndex];
                    newhp = 125;
                    newhp -= firstdamage;
                    System.out.println(AttackChooser + " did " + firstdamage + " damage");
                    System.out.println("Geodude \nHP:" + newhp);
                    System.out.println("Brock:Geodude use Rock Throw"); 
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Rock Throw did 50 damage");                                  
                    firstdamage = Damage[randomIndex];
                    newhp -= firstdamage;
                    if (newhp <= 0){
                        System.out.println("Geodude Fainted");
                        System.out.println("Brock: Onix! I choose you");
                        System.out.println("Onix\nHP:150");
                        System.out.println("Squirtle\nHP:50");
                        System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                        System.out.println("Choose your move");
                        AttackChooser = scanner.nextLine();
                        firstdamage = Damage[randomIndex];
                        newhp = 150;
                        newhp -= firstdamage;
                        System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                        System.out.println("Onix\nHP:" + newhp);
                        System.out.println("Brock: Onix used Rock Throw");
                        System.out.println("Rock throw did 50 damage");
                        System.out.println("Squirtle Fainted!");
                        System.out.println("You: " + Firstpokemon +"! I choose you");
                        System.out.println(Firstpokemon + "\nHP:100");
                        System.out.println("Quick Attack\nTackle");
                        System.out.println("Choose your move");
                        AttackChooser = scanner.nextLine();
                        firstdamage = Damage[randomIndex];
                        newhp -= firstdamage;
                        System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                        if (newhp <= 0){
                            System.out.println("Onix Fainted!\nYou got a Boulder Badge");
                        }
                        else{
                            System.out.println("Onix\nHP:" + newhp);
                        }
                        }
                        else{
                        System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                        System.out.println("Choose your move");
                        AttackChooser = scanner.nextLine();
                        System.out.println(AttackChooser + " did " + firstdamage + " damage");
                        System.out.println("Geodude\nHP:" + newhp); 
                        System.out.println("Brock:Geodude use Rock Throw");
                        System.out.println("Rock throw did 50 damage");
                        System.out.println("Squirtle fainted!"); 
                        System.out.println("You: " + Firstpokemon +"!I choose you");
                        System.out.println(Firstpokemon +"\nHP:100");
                        System.out.println("Quick Attack\ntackle");
                        firstdamage = Damage[randomIndex];
                        System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                        System.out.println("Choose your move");
                        System.out.println(AttackChooser + " did " + firstdamage + " damage");
                        System.out.println("Geodude Fainted");
                        System.out.println("Brock: Onix! I choose you");
                        System.out.println("Onix\nHP:150");
                        System.out.println("Bulbasaur\nHP:50");
                        System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                        System.out.println("Choose your move");
                        AttackChooser = scanner.nextLine();
                        firstdamage = Damage[randomIndex];
                        newhp = 150;
                        newhp -= firstdamage;
                        System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                        System.out.println("Onix\nHP:" + newhp);
                        System.out.println("Brock: Onix used Rock Throw");
                        System.out.println("Rock throw did 50 damage");
                        System.out.println("Squirtle Fainted!");
                        System.out.println("You: " + Firstpokemon +"! I choose you");
                        System.out.println(Firstpokemon + "\nHP:100");
                        System.out.println("Quick Attack\nTackle");
                        System.out.println("Choose your move");
                        AttackChooser = scanner.nextLine();
                        firstdamage = Damage[randomIndex];
                        newhp -= firstdamage;
                        System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                        if (newhp <= 0){
                            System.out.println("Onix Fainted!\nYou got a Boulder Badge");
                        }
                        else{
                            System.out.println("Onix\nHP:" + newhp);
                            System.out.println("Brock: Onix used Rock Throw");
                            System.out.println("Rock throw did 50 damage");
                            System.out.println(Firstpokemon +"\nHP:50");
                            System.out.println("Quick Attack\nTackle");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();
                            firstdamage = Damage[randomIndex];
                            System.out.println("Onix Fainted\nYou got a Boulder Badge");
                        }}
                        break;
                case 3:
                System.out.println("Congratulations, You got a Charmander!!");
                try {
                    Thread.sleep(1000);   
                } catch (InterruptedException e) {
                }
            System.out.println("Gary: I will fight you!");
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
            System.out.println("Gary: Squirtle! I choose you.");
            System.out.println("             _____\r\n" + //
                                    "           ,`o   o \\\r\n" + //
                                    "          ` \\____/ ‘\r\n" + //
                                    "          `,______,`\r\n" + //
                                    "  ,--------/   \\  \\____,\r\n" + //
                                    "  ‘--------|___|__|____/\r\n" + //
                                    "    /  \\   | __  _\\\r\n" + //
                                    "    |  /__\\/  \\ /  \\\r\n" + //
                                    "    \\_____ \\  / \\  |\r\n" + //
                                    "           ^^^^ ^^^^");
            System.out.println("Squirtle \n HP:100");
            try {
                Thread.sleep(3000);   
            } catch (InterruptedException e) {
            }                         
            System.out.println("You: Charmander! I choose you!");             
            System.out.println("Charmander\nHP:100");
            System.out.println("FlameThrower\nFire spin\nember\nRock slide");
            System.out.println("Choose your move!");
            AttackChooser = scanner.nextLine();
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
            System.out.println(AttackChooser + " did 50 Damage");
            System.out.println("Squirtle\nHP:50");
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
            System.out.println("Gary:Squirtle use water gun");
            System.out.println("Water gun did 50 damage");
            System.out.println("Charmander\nHP:50");
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
            System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
            System.out.println("Choose your move");
            AttackChooser = scanner.nextLine();
            System.out.println(AttackChooser + " did 50 Damage");
            System.out.println("Squirtle fainted!");
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
            System.out.println("Professor Oak:Congratulations you won the battle");
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
            System.out.println("Professor Oak:Your'e First Goal is to catch a pokemon so you can fight the gym leader");
            try {
                Thread.sleep(1000);   
            } catch (InterruptedException e) {
            }
            System.out.println("You went out to catch your first pokemon");
            WildPokemon.add("Caterpie");
            WildPokemon.add("Mankey");
            WildPokemon.add("Rattata");
            WildPokemon.add("Pidgey");
            randomIndex = random.nextInt(WildPokemon.size());
            Firstpokemon = WildPokemon.get(randomIndex);
            System.out.println("You Encountered a Wild "  + Firstpokemon );
                    System.out.println("You:Charmander I choose you");
                    try {
                    Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println(Firstpokemon + "\nHP:50");
                    System.out.println("Bulbasaur\nHP:100");
                    System.out.println("\r\n" + //
                                    "\r\n" + //
                                    "           /\\/\\/\\/\\/\\\r\n" + //
                                    "          /     |    \\\r\n" + //
                                    "         /      |     \\\r\n" + //
                                    "        /\\______|_____/\\\r\n" + //
                                    "       /  /´¯\\    /¯`\\  \\\r\n" + //
                                    "       \\  \\ º/    \\º / /         \r\n" + //
                                    "        \\ .·´¯`v-¯`·. / \r\n" + //
                                    "       / \\¨\\______/¨ /  \\  \r\n" + //
                                    "      |  |¯¯¯¯¯¯¯¯¯¯¯|  |    \r\n" + //
                                    "      IooI           IooI     \r\n" + //
                                    "");
                    System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                    System.out.println("Choose your move ");
                    AttackChooser = scanner.nextLine();
                    System.out.println(AttackChooser + " did 50 damage");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("You tried to catch " + Firstpokemon);
                    System.out.println("Congratulations, you caught a " + Firstpokemon);
                    UsersPokemon.add(Firstpokemon);
                    UsersPokemon.add("Charmander");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("You went to professor oak's lab ");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("Professor Oak:Now you can go to the gym ");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("But before that I have to give you something");
                    try {
                        Thread.sleep(1000);   
                    } catch (InterruptedException e) {
                    }
                    System.out.println("you got a pokedex");
                    System.out.println(UsersPokemon.toString());
                    System.out.println("This is a pokedex");
                    System.out.println("You went to the gym");
                    System.out.println("You are challlenged by Brock! the rock gym leader");                        
                        System.out.println("You:Charmander!I choose you");
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("Brock:Geodude! I choose you");
                    
                        System.out.println("Geodude\nHP:125");
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("Charmander\nHP:100");
                        System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                        System.out.println("Choose your move");
                        scanner.nextLine();
                        AttackChooser = scanner.nextLine();
                        randomIndex = random.nextInt(Damage.length);
                        firstdamage = Damage[randomIndex];
                        newhp = 125;
                        newhp -= firstdamage;
                        System.out.println(AttackChooser + " did " + firstdamage + " damage");
                        System.out.println("Geodude \nHP:" + newhp);
                        System.out.println("Brock:Geodude use Rock Throw"); 
                        try {
                            Thread.sleep(1000);   
                        } catch (InterruptedException e) {
                        }
                        System.out.println("Rock Throw did 50 damage");                                  
                        firstdamage = Damage[randomIndex];
                        newhp -= firstdamage;
                        if (newhp <= 0){
                            System.out.println("Geodude Fainted");
                            System.out.println("Brock: Onix! I choose you");
                            System.out.println("Onix\nHP:150");
                            System.out.println("Charmander\nHP:50");
                            System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();
                            firstdamage = Damage[randomIndex];
                            newhp = 150;
                            newhp -= firstdamage;
                            System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                            System.out.println("Onix\nHP:" + newhp);
                            System.out.println("Brock: Onix used Rock Throw");
                            System.out.println("Rock throw did 50 damage");
                            System.out.println("Charmander Fainted!");
                            System.out.println("You: " + Firstpokemon +"! I choose you");
                            System.out.println(Firstpokemon + "\nHP:100");
                            System.out.println("Quick Attack\nTackle");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();
                            firstdamage = Damage[randomIndex];
                            newhp -= firstdamage;
                            System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                            if (newhp <= 0){
                                System.out.println("Onix Fainted!\nYou got a Boulder Badge");
                            }
                            else{
                                System.out.println("Onix\nHP:" + newhp);
                            }
                            }
                            else{
                            System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();
                            System.out.println(AttackChooser + " did " + firstdamage + " damage");
                            System.out.println("Geodude\nHP:" + newhp); 
                            System.out.println("Brock:Geodude use Rock Throw");
                            System.out.println("Rock throw did 50 damage");
                            System.out.println("Charmander fainted!"); 
                            System.out.println("You: " + Firstpokemon +"!I choose you");
                            System.out.println(Firstpokemon +"\nHP:100");
                            System.out.println("Quick Attack\ntackle");
                            firstdamage = Damage[randomIndex];
                            System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                            System.out.println("Choose your move");
                            System.out.println(AttackChooser + " did " + firstdamage + " damage");
                            System.out.println("Geodude Fainted");
                            System.out.println("Brock: Onix! I choose you");
                            System.out.println("Onix\nHP:150");
                            System.out.println("Charmander\nHP:50");
                            System.out.println("Flamethrower\nFire Spin\nEmber\nRock Slide");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();
                            firstdamage = Damage[randomIndex];
                            newhp = 150;
                            newhp -= firstdamage;
                            System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                            System.out.println("Onix\nHP:" + newhp);
                            System.out.println("Brock: Onix used Rock Throw");
                            System.out.println("Rock throw did 50 damage");
                            System.out.println("Charmander Fainted!");
                            System.out.println("You: " + Firstpokemon +"! I choose you");
                            System.out.println(Firstpokemon + "\nHP:100");
                            System.out.println("Quick Attack\nTackle");
                            System.out.println("Choose your move");
                            AttackChooser = scanner.nextLine();
                            firstdamage = Damage[randomIndex];
                            newhp -= firstdamage;
                            System.out.println(AttackChooser + " did " + firstdamage + " damage.");
                            if (newhp <= 0){
                                System.out.println("Onix Fainted!\nYou got a Boulder Badge");
                            }
                            else{
                                System.out.println("Onix\nHP:" + newhp);
                                System.out.println("Brock: Onix used Rock Throw");
                                System.out.println("Rock throw did 50 damage");
                                System.out.println(Firstpokemon +"\nHP:50");
                                System.out.println("Quick Attack\nTackle");
                                System.out.println("Choose your move");
                                AttackChooser = scanner.nextLine();
                                firstdamage = Damage[randomIndex];
                                System.out.println("Onix Fainted\nYou got a Boulder Badge");
                            }}                                              
        }
    }
}        
