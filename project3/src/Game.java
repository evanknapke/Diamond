import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    // Room Descriptions
    private String frontDoorDesc = "\n    You just arrived at the front door of the house\n" +
            "    that your friend told you about.";

    private String entrywayDesc = "\n    You have entered into the house and are standing\n" +
            "    in the entryway right in front of the front door.\n" +
            "    You look around and see a large entrance door into what appears to\n" +
            "    be a living room right ahead of you to the north.\n" +
            "    To the west of you, you see a large picture with the portrait of the\n" +
            "    family that lived here before. It appears the parents had two kids,\n" +
            "    a little girl and a young boy.\n" +
            "    To the east there is another door that appears to lead into a dining room.";

    private String diningRoomDesc = "\n    You have just entered into the dining room.\n" +
            "    You notice a large glass chandelier hanging from the ceiling over\n" +
            "    the large dining table. This room has enough seats to dine dozens.\n" +
            "    Straight ahead of you to the east, there is a closed door.\n" +
            "    To the north, there is another large opening that goes into the\n" +
            "    living room.";

    private String livingRoomDesc = "\n    You are in the living room. You are shocked at the size of this room.\n" +
            "    There are two very large TVs hanging on the same wall to the north.\n" +
            "    There are several couches and chairs all over the room. The stained\n" +
            "    hardwood floor is covered by a massive red rug in the center of the room.\n" +
            "    In the far northwest corner there is a staircase going upwards.\n" +
            "    To the east there is a door to the kitchen.\n" +
            "    To the south there is two large doors, one goes to the entryway,\n" +
            "    one goes to the dining room.";

    private String kitchenDesc = "\n    You are in the kitchen.\n" +
            "    The cabinets and cupboards are painted a clean white color.\n" +
            "    There are expensive granite counter tops on top of everything.\n" +
            "    There is a large two-door refrigerator straight ahead.\n" +
            "    In the far corner of the room there are a few cardboard boxes.";

    private String hallwayDesc = "\n    You find yourself in a long hallway.\n" +
            "    There is a long red carpet that runs along the length of the room.\n" +
            "    At the very end of the hallway to the east,you can see a closed\n" +
            "    hardwood door.\n" +
            "    There are a total of four rooms along the walls of the hallway.\n" +
            "    Two doors on the north wall, and two doors to the south wall.\n" +
            "    All four of the doors are shut.";

    private String boyRoomDesc = "\n    Your in a plain looking bedroom. The walls are colored white.\n" +
            "    The bedsheets are blue. This was probably the boys room.\n" +
            "    To the north you can see out of the window.\n" +
            "    To the east there is a large dresser with clothes on top.\n" +
            "    To the west is where the bed was placed.\n" +
            "    There is a large blue rug on the floor.";

    private String masterBedroomDesc = "\n    You enter into a bedroom. There is a large king sized bed in the\n" +
            "    center of the southern wall. It appears to be the master bedroom.\n" +
            "    There is a dresser on both the eastern and western walls.\n" +
            "    You see a large window right above the bed on the southern wall.\n" +
            "    There is a large white rug on the middle of floor covering the hardwood.\n" +
            "    In the northwest corner of the room there is a small trashcan.";

    private String girlRoomDesc = "\n    You are in a bedroom. The walls are pink and there are stuffed\n" +
            "    animals everywhere. It was probably the little girls room.\n" +
            "    You can see out the window to the north.\n" +
            "    On the east side of the room there is a twin bed with pink covers.\n" +
            "    On the west side of the room there is a large wooden dresser.";

    private String bathroomDesc = "\n    You are in a bathroom. There is a very nice white tile on the floor.\n" +
            "    There is a walk in shower in the southeast corner of the room.\n" +
            "    There is a large mirror hanging above a sink on the eastern wall.\n" +
            "    There is a white porcelain toilet on the northeast corner of the room.";

    private String storageRoomDesc = "\n    You open the door into the dark. You get the flashlight out of your\n" +
            "    bag and turn it on. You can see!\n" +
            "    There is dust everywhere.\n" +
            "    You see boxes all over the place. There is a tall cluster of them in the\n" +
            "    northwest corner of the room.\n" +
            "    There is a disassembled bed frame straight ahead on the eastern wall.\n" +
            "    You move the flashlight to the northwest corner of the room and see\n" +
            "    an old lamp.\n" +
            "    There is two old chairs sitting in the southeast corner of the room.\n" +
            "    There appears to be no other exits in this room.";

    private String closetDesc = "\n    Your in the closet. There is a ton of cleaning supplies.\n" +
            "    There is a very strong amonia stench coming from the corner\n" +
            "    of the room.\n" +
            "    There is mops in the northwest corner of the room.\n" +
            "    There is a shelf of small boxes on the eastern wall.\n" +
            "    There is a 5 gallon bucket turned over towards the middle of\n" +
            "    the room.\n" +
            "    There is a box of chlorine tablets close to the door.";

    private String atticDesc = "\n    You open up the hatch and enter into what appears to be an attic.\n" +
            "    It is pitch black up here just like the storage room was.\n" +
            "    You decide to use your flashlight.\n" +
            "    The attic is very clean looking. Everything looks like it has been\n" +
            "    untouched for a long time. Yet there is no dust?\n" +
            "    You move your flashlight around the walls. The room is absolutely empty\n" +
            "    You search around a little more and then you see it. The diamond!\n" +
            "    Right in the middle of the room on a pedestal!";

    // Room Options
    private String frontDoorOpts = "\n1. Enter the house\n" +
            "2. Run away\n";

    private String entrywayOpts = "\n1. Go north into the family room\n" +
            "2. Go east into the dining room\n" +
            "3. Take a closer look at the picture\n";

    private String diningRoomOpts = "\n1. Go north into the living room\n" +
            "2. Go east and try to open the closed door\n" +
            "3. Go west and back into the entryway\n";

    private String livingRoomOpts = "\n1. Go south into the entryway\n" +
            "2. Go south into the dining room\n" +
            "3. Go east into the kitchen\n" +
            "4. Go up the stairs on the west side of the room\n" +
            "5. Search the TVs\n" +
            "6. Search the furniture\n";

    private String kitchenOpts = "\n1. Search around through the cabinets\n" +
            "2. Look inside the fridge\n" +
            "3. Search the boxes\n" +
            "4. Leave the kitchen and go back to the living room\n";

    private String hallwayOpts = "\n1. Go into the first room to the north\n" +
            "2. Go into the second room to the south\n" +
            "3. Go into the third room to the north\n" +
            "4. Go into the fourth room to the south\n" +
            "5. Try to open the closed door at the end of the hallway\n" +
            "6. Go back down the stairs\n";

    private String boyRoomOpts = "\n1. Look out the window\n" +
            "2. Search through the dresser\n" +
            "3. Investigate the bed\n" +
            "4. Take a closer look at the rug\n" +
            "5. Go back into the hallway\n";

    private String masterBedroomOpts = "\n1. Investigate the bed\n" +
            "2. Look at the dresser on the eastern wall\n" +
            "3. Look at the dresser on the western wall\n" +
            "4. Look out the window\n" +
            "5. Search the rug\n" +
            "6. Investigate the trashcan\n" +
            "7. Go back into the hallway\n";

    private String girlRoomOpts = "\n1. Look out the window\n" +
            "2. Lay in the bed\n" +
            "3. Look through the dresser\n" +
            "4. Go back into the hallway\n";

    private String bathroomOpts = "\n1. Go to the shower\n" +
            "2. Go to the toilet\n" +
            "3. Take a look at the mirror\n" +
            "4. Take a look at the sink\n" +
            "5. Go back into the hallway\n";

    private String storageRoomOpts1 = "\n1. Search through the boxes in the northeast corner\n" +
            "2. Investigate the bed frame\n" +
            "3. Take a closer look at the lamp in the northwest corner\n" +
            "4. Search the chairs in the southeast corner of the room\n" +
            "5. Go back into the hallway\n";

    private String storageRoomOpts2 = "\n1. Go up the ladder and open the hatch\n" +
            "2. Take a closer look at the lamp in the northwest corner\n" +
            "3. Search the chairs in the southeast corner of the room\n" +
            "4. Go back into the hallway\n";

    private String closetOpts = "\n1. Take a closer look at the mops\n" +
            "2. Look under the bucket\n" +
            "3. Look through the boxes on the shelf\n" +
            "4. Take a closer look at the chlorine tablets\n" +
            "5. Go back into the dining room\n";

    private String atticOpts = "\n1. Take the diamond!\n" +
            "2. Go back down the ladder into the storage room\n";

    // Introduction
    private String intro = "You friend Ricky has just let you in on a rumor of a recently\n"
            + "abandoned house. Ricky lets you know that this was a very wealthy\n"
            + "family that once lost a very large diamond that was passed down in their\n"
            + "family for generations. He says that the front door was left unlocked so\n"
            + "that anyone can go in and look for it. Nobody knows about this yet besides\n"
            + "you and Ricky but he has no time to go looking. He asks you to go\n"
            + "look for him. Anyone who finds this precious stone gets to keep it.\n\n"
            + "Throughout the game, you will be given a set of options to make.\n"
            + "Your job is to make the right decisions in order to navigate\n"
            + "through the house and do what you are told.\n"
            + "To make your decisions type the corresponding number next to\n"
            + "one of the options.\n\n"
            + "Otherwise:\n"
            + "Type \"notes\" at any time to write a note or view your notes.\n"
            + "Type \"inventory\" at any time in order to view your inventory.\n"
            + "Type \"help\" at any time if you need help.\n"
            + "Type \"quit\" or \"exit\" at any time if you wish to quit the game.\n";

    private String name;
    private ArrayList<String> notes = new ArrayList<>();
    private HashMap<String, String> items = new HashMap<>();

    private void showIntro() {
        System.out.printf("Welcome to Diamond, %s.\n\n%s", getName(), intro);
    }

    private String getName() {
        return name;
    }

    private void setName() {
        System.out.println("What is your name? ");
        this.name = scanner.nextLine();
    }

    private String makeChoice() {
        System.out.println("What do you want to do?");
        String decision = scanner.nextLine();
        return decision;
    }

    private void other(String decision) {
        if (decision.equals("notes")) {
            System.out.println("Type \"view\" to view your notes or type \"add\" to add a note:");
            String viewOrAdd = scanner.nextLine();
            if (viewOrAdd.equals("1")) {
                for (String note : notes) {
                    System.out.println("- " + note);
                }
            } else if (viewOrAdd.equals("2")) {
                System.out.println("Write your note then press enter/return when done");
                String note = scanner.nextLine();
                notes.add(note);
            }
        } else if (decision.equals("inventory")) {
            for (String item : items.keySet()) {
                System.out.println("- " + item);
            }
        } else if (decision.equals("help")) {
            help();
        } else if (decision.equals("quit") || decision.equals("exit")) {
            endGame();
        } else {
            System.out.println("That is not an option. Type \"help\" for help.");
        }
    }

    private void help() {
        System.out.println("    To make your next move, type in the corresponding number next\n" +
                "    to the option that you wish to do from the list of options below:\n" +
                "    Type \"inventory\" in order to view what is in your inventory.\n" +
                "    Type \"notes\" to write a note or view the notes you have written.\n" +
                "    Type \"quit\" or \"exit\" if you wish to quit the game.");
    }

    private void wonGame() {
        System.out.printf("Congratulations %s, you acquired the diamond! YOU WIN!\n\n", getName());
        System.out.println("~GAME OVER~\n");
        System.exit(0);
    }

    private void endGame() {
        System.out.printf("You failed to acquire the diamond %s. LOSER!\n\n", getName());
        System.out.println("~GAME OVER~\n");
        System.exit(0);
    }

    public void runGame() {
        this.setName();
        this.showIntro();
        Room frontDoor = new Room("Front Door", frontDoorDesc, frontDoorOpts, null);
        Room entryway = new Room("Entryway", entrywayDesc, entrywayOpts, null);
        Room diningRoom = new Room("Dining Room", diningRoomDesc, diningRoomOpts, null);
        Room livingRoom = new Room("Living Room", livingRoomDesc, livingRoomOpts, null);
        Room kitchen = new Room("Kitchen", kitchenDesc, kitchenOpts, null);
        Room hallway = new Room("Hallway", hallwayDesc, hallwayOpts, null);
        Room boyRoom = new Room("Boys Room", boyRoomDesc, boyRoomOpts, null);
        Room masterBedroom = new Room("Master Bedroom", masterBedroomDesc, masterBedroomOpts, null);
        Room girlRoom = new Room("Girls Room", girlRoomDesc, girlRoomOpts, null);
        Room bathroom = new Room("Bathroom", bathroomDesc, bathroomOpts, null);
        Room storageRoom = new Room("Storage Room", storageRoomDesc, storageRoomOpts1, storageRoomOpts2);
        Room closet = new Room("Closet", closetDesc, closetOpts, null);
        Room attic = new Room("Attic", atticDesc, atticOpts, null);
        Player player = new Player(name, frontDoor, 50, 10);
        Player boss = new Player("Ricky", attic, 30, 10);
        String decision;
        boolean bedFrameFell = false; // used in storage room

        player.setLocation(frontDoor);
        while (true) {
            Room currentLocation = player.getLocation();
            if (currentLocation == frontDoor) {
                System.out.println(frontDoor.getDescription() + "\n" + frontDoor.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    player.setLocation(entryway);
                } else if (decision.equals("2")) {
                    endGame();
                } else {
                    other(decision);
                }

            } else if (currentLocation == entryway) {
                System.out.println(entryway.getDescription() + "\n" + entryway.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    player.setLocation(livingRoom);
                } else if (decision.equals("2")) {
                    player.setLocation(diningRoom);
                } else if (decision.equals("3")) {
                    if (items.containsKey("Blue Key")) {
                        System.out.println("    You search the picture but find nothing.");
                    } else {
                        items.put("Blue Key", "Blue Door");
                        System.out.println("    You notice that the picture frame is hanging very loosely on the wall.\n" +
                                "    You stick your hand behind it and move the picture outwards.\n" +
                                "    A blue colored key falls down onto the ground and you pick it up and\n" +
                                "    place it into your bag.");
                    }
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Dining Room")) {
                System.out.println(diningRoom.getDescription() + "\n" + diningRoom.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    player.setLocation(livingRoom);
                } else if (decision.equals("2")) {
                    if (items.containsKey("Red Key")) {
                        System.out.println("    You unlock the door with the red key!");
                        player.setLocation(closet);
                    } else {
                        System.out.println("    The door is shut tight with a red lock on it.");
                    }
                } else if (decision.equals("3")) {
                    player.setLocation(entryway);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Living Room")) {
                System.out.println(livingRoom.getDescription() + "\n" + livingRoom.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    player.setLocation(entryway);
                } else if (decision.equals("2")) {
                    player.setLocation(diningRoom);
                } else if (decision.equals("3")) {
                    player.setLocation(kitchen);
                } else if (decision.equals("4")) {
                    System.out.println("    You climb up to the second floor.");
                    player.setLocation(hallway);
                } else if (decision.equals("5") || decision.equals("6")) {
                    System.out.println("    You search around but find nothing.");
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Kitchen")) {
                System.out.println(kitchen.getDescription() + "\n" + kitchen.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    You search the cabinets and find nothing important.");
                } else if (decision.equals("2")) {
                    System.out.println("    You search the fridge and find nothing important.");
                } else if (decision.equals("3")) {
                    System.out.println("    You search the boxes and find nothing important.");
                } else if (decision.equals("4")) {
                    player.setLocation(livingRoom);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Hallway")) {
                System.out.println(hallway.getDescription() + "\n" + hallway.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    You open the door.");
                    player.setLocation(boyRoom);
                } else if (decision.equals("2")) {
                    if (items.containsKey("Yellow Key")) {
                        System.out.println("    You unlock the door with the yellow key!");
                        player.setLocation(masterBedroom);
                    } else {
                        System.out.println("    The door is shut tight with a yellow lock on it.");
                    }
                } else if (decision.equals("3")) {
                    if (items.containsKey("Blue Key")) {
                        System.out.println("    You unlock the door with the blue key!");
                        player.setLocation(girlRoom);
                    } else {
                        System.out.println("    The door is shut tight with a blue lock on it.");
                    }
                } else if (decision.equals("4")) {
                    if (items.containsKey("Green Key")) {
                        System.out.println("    You unlock the door with the green key!");
                        player.setLocation(bathroom);
                    } else {
                        System.out.println("    The door is shut tight with a green lock on it.");
                    }
                } else if (decision.equals("5")) {
                    if (items.containsKey("Orange Key")) {
                        System.out.println("    You unlock the door with the orange key!");
                        player.setLocation(storageRoom);
                    } else {
                        System.out.println("   The door is shut tight with an orange lock on it.");
                    }
                } else if (decision.equals("6")) {
                    System.out.println("    You go down the stairs to the first floor.");
                    player.setLocation(livingRoom);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Boys Room")) {
                System.out.println(boyRoom.getDescription() + "\n" + boyRoom.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    There is a great view of the family's pool.");
                } else if (decision.equals("2")) {
                    System.out.println("    You take a look through the dresser but find nothing important.");
                } else if (decision.equals("3")) {
                    System.out.println("    You lay down in the bed and search through the sheets. You find nothing.");
                } else if (decision.equals("4")) {
                    if (items.containsKey("Red Key")) {
                        System.out.println("    You look under the rug but find nothing.");
                    } else {
                        System.out.println("    You take a look under the rug. You find a red key and place it in your bag.");
                        items.put("Red Key", "Red Door");
                    }
                } else if (decision.equals("5")) {
                    player.setLocation(hallway);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Master Bedroom")) {
                System.out.println(masterBedroom.getDescription() + "\n" + masterBedroom.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    You look through the sheets on the bed and find nothing.");
                } else if (decision.equals("2")) {
                    System.out.println("    You search through the dresser and find nothing.");
                } else if (decision.equals("3")) {
                    System.out.println("    You search through the dresser and find nothing.");
                } else if (decision.equals("4")) {
                    if (items.containsKey("Orange Key")) {
                        System.out.println("    You look out the window into the front yard. You see the large stone\n" +
                                "    driveway that leads all the way up to the house.");
                    } else {
                        items.put("Orange Key", "Orange Door");
                        System.out.println("    You look out the window into the front yard. You see the large stone\n" +
                                "    driveway that leads all the way up to the house. As you move the\n" +
                                "    curtains to get a better look, an orange key falls down from above.\n" +
                                "    You place the orange key into your bag.");
                    }
                } else if (decision.equals("5")) {
                    System.out.println("    You look under the rug but find nothing.");
                } else if (decision.equals("6")) {
                    System.out.println("    You all you find is trash.");
                } else if (decision.equals("7")) {
                    player.setLocation(hallway);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Girls Room")) {
                System.out.println(girlRoom.getDescription() + "\n" + girlRoom.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    You see a large backyard with a giant pool and water slide.");
                } else if (decision.equals("2")) {
                    if (items.containsKey("Flashlight")) {
                        System.out.println("    You lie down a rest for awhile.");
                    } else {
                        if (items.containsKey("Flashlight")) {
                            System.out.println("    You lie down in bed and rest for a while.");
                        } else {
                            items.put("Flashlight", "Dark Room");
                            System.out.println("    You get under the covers and begin to lie down.\n" +
                                    "    As you rest your head on the pillow, you feel something hard.\n" +
                                    "    Why is there a flashlight under the pillow?\n" +
                                    "    You test if it works and it turns on right away.\n" +
                                    "    You place it in your bag.");
                        }
                    }
                } else if (decision.equals("3")) {
                    System.out.println("    You search the dresser but all you find is makeup and hair ties.");
                } else if (decision.equals("4")) {
                    player.setLocation(hallway);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Bathroom")) {
                System.out.println(bathroom.getDescription() + "\n" + bathroom.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    You get in the shower. All you find is soap.");
                } else if (decision.equals("2")) {
                    if (items.containsKey("Yellow Key")) {
                        System.out.println("    You search the toilet but find nothing.");
                    } else {
                        items.put("Yellow Key", "Yellow Door");
                        System.out.println("    You look at the toilet bowl and find nothing inside.\n" +
                                "    You decide to lift up the cover of the tank.\n" +
                                "    You find a yellow key hanging on the inside of the tank.\n" +
                                "    You place the yellow key in your bag.");
                    }
                } else if (decision.equals("3")) {
                    System.out.println("    You see your reflection in the mirror.");
                } else if (decision.equals("4")) {
                    System.out.println("    There is nothing in the sink.");
                } else if (decision.equals("5")) {
                    player.setLocation(hallway);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Storage Room")) {
                if (items.containsKey("Flashlight")) {
                    if (!bedFrameFell) {
                        System.out.println(storageRoom.getDescription() + "\n" + storageRoom.getOptions(1));
                        decision = makeChoice();
                        if (decision.equals("1")) {
                            System.out.println("    You search through some of the boxes but find nothing.");
                        } else if (decision.equals("2")) {
                            bedFrameFell = true;
                            System.out.println("    You take a look at the old wooden bed frame. You find nothing and begin\n" +
                                    "    to walk away. You move the flashlight and start looking around elsewhere.\n" +
                                    "    You here a large \"BANG\" and turn your light towards the tower of boxes.\n" +
                                    "    It appears the bed frame has fallen and knocked over the large stack of boxes.\n" +
                                    "    You walk over towards the boxes and you see a ladder leading upwards to\n" +
                                    "    a hatch in the ceiling!");
                        } else if (decision.equals("3")) {
                            System.out.println("    You search the lamp and find nothing but cobwebs.");
                        } else if (decision.equals("4")) {
                            System.out.println("    You take a look under the chars and find nothing.");
                        } else if (decision.equals("5")) {
                            player.setLocation(hallway);
                        } else {
                            other(decision);
                        }
                    } else if (bedFrameFell) {
                        System.out.println(storageRoom.getDescription() + "\n" + storageRoom.getOptions(2));
                        decision = makeChoice();
                        if (decision.equals("1")) {
                            player.setLocation(attic);
                        } else if (decision.equals("2")) {
                            System.out.println("    You search the lamp but find nothing but cobwebs.");
                        } else if (decision.equals("3")) {
                            System.out.println("    You take a look under the chairs and find nothing.");
                        } else if (decision.equals("4")) {
                            player.setLocation(hallway);
                        }
                    }
                } else {
                    System.out.println("    It is way to dark in here. You cannot see anything" +
                            "    and return to the hallway");
                    player.setLocation(hallway);
                }

            } else if (currentLocation.getName().equals("Closet")) {
                System.out.println(closet.getDescription() + "\n" + closet.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    You look through the mops and find nothing.");
                } else if (decision.equals("2")) {
                    System.out.println("    You look under the bucket and find nothing.");
                } else if (decision.equals("3")) {
                    System.out.println("    You search through the boxes and find nothing of importance.");
                } else if (decision.equals("4")) {
                    if (items.containsKey("Green Key")) {
                        System.out.println("    You search through the tablets but find nothing");
                    } else {
                        items.put("Green Key", "Green Door");
                        System.out.println("    You take a closer look at the chlorine tablets.\n" +
                                "    When you pick up the box you notice a green key lying underneath.\n" +
                                "    You place the green key in your bag.");
                    }
                } else if (decision.equals("5")) {
                    player.setLocation(diningRoom);
                } else {
                    other(decision);
                }

            } else if (currentLocation.getName().equals("Attic")) {
                System.out.println(attic.getDescription() + "\n" + attic.getOptions(1));
                decision = makeChoice();
                if (decision.equals("1")) {
                    System.out.println("    You walk up close and reach for the diamond.\n" +
                            "    You here someone yell your name from the ladder below,\n" +
                            "    \"Hey! You found it! Thank you so much!\"\n" +
                            "    It is your friend Ricky. You can see the greed in his eyes.\n" +
                            "    \"Here hand it over man.\"\n" +
                            "    Ricky sticks his hand out for you to give him the diamond.\n");
                    System.out.println("1. Hand Ricky the diamond\n" +
                            "2. Try to keep it for yourself\n");
                    System.out.println("What do you want to do?");
                    String decision2 = scanner.nextLine();
                    if (decision2.equals("1")) {
                        System.out.println("    \"Here Ricky you take the diamond.\n" +
                                "    You are the one that told me about it anyways.\"\n" +
                                "    \"Wow thanks man this means a lot.\"\n");
                        endGame();
                    } else if (decision2.equals("2")) {
                        System.out.printf("    \"No way Ricky! I found it and I'm keeping it.\"\n" +
                                "    \"Listen, either your going to hand it over to me the easy way,\n" +
                                "    or I am going to get it the hard way... So whats it gonna be, %s\"\n" +
                                "    \"The hard way.\"", getName());
                        System.out.println("    Ricky comes at you quickly trying to fight.\n");
                        System.out.println("1. Closeline him\n" +
                                "2. Give him a roundHouse\n" +
                                "3. Dodge him\n");
                        System.out.println("What do you want to do?");
                        decision2 = scanner.nextLine();
                        if (decision2.equals("1")) {
                            System.out.println("    He ducks your arm and punches you.");
                            player.setHitPoints(player.getHitPoints() - boss.getAttack());
                        } else if (decision2.equals("2")) {
                            System.out.println("    You hit him square in the jaw with your foot.");
                            boss.setHitPoints(boss.getHitPoints() - player.getAttack());
                        } else if (decision2.equals("3")) {
                            System.out.println("    Your attempt to dodge him but fail. He punches\n" +
                                    "    you in the face.");
                            player.setHitPoints(player.getHitPoints() - boss.getAttack());
                        } else {
                            other(decision2);
                        }
                        System.out.println("    He comes right back at you!\n");
                        while (boss.getHitPoints() > 0 && player.getHitPoints() > 0) {
                            System.out.println("1. Roundhouse\n" +
                                    "2. Punch in face\n" +
                                    "3. Dodge\n");
                            System.out.println("What do you want to do?");
                            decision2 = scanner.nextLine();
                            if (decision2.equals("1")) {
                                System.out.println("    You roundhouse kick his head!\n");
                                boss.setHitPoints(boss.getHitPoints() - player.getAttack());
                            } else if (decision2.equals("2")) {
                                System.out.println("    You punch him in the face!\n");
                                boss.setHitPoints((boss.getHitPoints() - player.getAttack()) + 5);
                            } else if (decision2.equals("3")) {
                                System.out.println("    You can't dodge his attack and he hits you in the face!\n");
                                player.setHitPoints(player.getHitPoints() - boss.getAttack());
                            } else {
                                other(decision2);
                            }
                            System.out.printf("Your Health: %d\nRicky's Health: %d\n\n", player.getHitPoints(), boss.getHitPoints());
                        }
                        if (boss.getHitPoints() <= 0) {
                            System.out.println("You killed Ricky!\n");
                            wonGame();
                        } else if (player.getHitPoints() <= 0){
                            System.out.println("Ricky killed you.\n");
                            endGame();
                        }
                    } else {
                        other(decision2);
                    }
                } else if (decision.equals("2")) {
                    player.setLocation(storageRoom);
                } else {
                    other(decision);
                }
            }
        }
    }
}