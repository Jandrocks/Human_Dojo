public class HumanTest {
   
        public static void main(String[] args) {
            Human human1 = new Human();
            Human human2 = new Human();
    
            System.out.println("Salud inicial de human1: " + human1.getHealth());
            System.out.println("Salud inicial de human2: " + human2.getHealth());
    
            human1.attack(human2);
    
            System.out.println("Salud después del ataque a human2: " + human2.getHealth());
        }
    }

