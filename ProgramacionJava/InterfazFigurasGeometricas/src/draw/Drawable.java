package draw;

public interface Drawable {
	void draw();
	default void applyTheme() {
		throw new UnsupportedOperationException("No aplicable");
}
}