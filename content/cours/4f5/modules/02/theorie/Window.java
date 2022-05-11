public interface Window {


	void resize(int width, int height);

	void installRootView(View<?> rootView);

	void show();

	void fullscreen(boolean isFullscreen);

	void decorations(boolean hasDecorations);

}
