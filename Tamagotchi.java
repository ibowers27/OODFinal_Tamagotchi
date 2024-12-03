abstract class Tamagotchi {
	protected static final String name;
	protected static final String color;
	protected static final String uniqueTrait;
	protected static final String personality;

	abstract void play();
	abstract void feed();
	abstract void sleep();
	abstract void clean();
}