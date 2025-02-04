public class q1 {

    abstract static class Animal {
        abstract String makeSound();
    }

    static class Cow extends Animal {
        @Override
        String makeSound() {
            return "Moo";
        }
    }

    static class Dog extends Animal {
        @Override
        String makeSound() {
            return "Bark";
        }
    }

    static class Pig extends Animal {
        @Override
        String makeSound() {
            return "Oink";
        }
    }

    static class Goat extends Animal {
        @Override
        String makeSound() {
            return "Bleat";
        }
    }

    static class Lion extends Animal {
        @Override
        String makeSound() {
            return "Roar";
        }
    }

    static class Voice {

        public void prepareVoice() {
            Animal[] animals = new Animal[5];
            animals[0] = new Cow();
            animals[1] = new Dog();
            animals[2] = new Pig();
            animals[3] = new Goat();
            animals[4] = new Lion();
            hear(animals);
        }

        public void hear(Animal[] animals) {
            for (Animal animal : animals) {
                System.out.println(animal.makeSound());
            }
        }
    }

    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
    }
}
