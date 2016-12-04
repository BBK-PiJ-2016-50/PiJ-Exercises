public class NoahsArk {
	
	public static void main(String[] args) {
		NoahsArk noahsArk = new NoahsArk();
		noahsArk.launch();
	}
	
	private void launch() {
		Bear bears = new Bear("Bears");
		bears.call();
		bears.makeSound();
		bears.reproduce();
		Beetle beetles = new Beetle("Beetles");
		beetles.call();
		beetles.makeSound();
		beetles.reproduce();
		Cat cats = new Cat("Cats");
		cats.call();
		cats.makeSound();
		cats.reproduce();
		Crocodile crocodiles = new Crocodile("Crocodiles");
		crocodiles.call();
		crocodiles.makeSound();
		crocodiles.reproduce();
		Dog dogs = new Dog("Dogs");
		dogs.call();
		dogs.makeSound();
		dogs.reproduce();
		Dolphin dolphins = new Dolphin("Dolphins");
		dolphins.call();
		dolphins.makeSound();
		dolphins.reproduce();
		Eagle eagles = new Eagle("Eagles");
		eagles.call();
		eagles.makeSound();
		eagles.reproduce();
		Lizard lizards = new Lizard("Lizards");
		lizards.call();
		lizards.makeSound();
		lizards.reproduce();
		Fly flies = new Fly("Flies");
		flies.call();
		flies.makeSound();
		flies.reproduce();
		Frog frogs = new Frog("Frogs");
		frogs.call();
		frogs.makeSound();
		frogs.reproduce();
		Monkey monkeys = new Monkey("Monkeys");
		monkeys.call();
		monkeys.makeSound();
		monkeys.reproduce();
		Pigeon pigeons = new Pigeon("Pigeons");
		pigeons.call();
		pigeons.makeSound();
		pigeons.reproduce();
		Salmon salmon = new Salmon("Salmon");
		salmon.call();
		salmon.makeSound();
		salmon.reproduce();
		Shark sharks = new Shark("Sharks");
		sharks.call();
		sharks.makeSound();
		sharks.reproduce();
		Snake snakes = new Snake("Snakes");
		snakes.call();
		snakes.makeSound();
		snakes.reproduce();
		Whale whales = new Whale("Whales");
		whales.call();
		whales.makeSound();
		whales.reproduce();	
	}
	
}