package dessin.frontal.taches;

import ca.ntro.app.tasks.frontend.FrontendTasks;

import static ca.ntro.app.tasks.frontend.FrontendTasks.*;

public class QuestionExamen {

	public static void creerTaches(FrontendTasks tasks) {

		tasks.taskGroup("A")
		     .contains(subTasks -> {
		    	 a1(subTasks);
		    	 a2(subTasks);
		    	 a4(subTasks);
		    	 a3(subTasks);
		    	 a5(subTasks);
		     });
	}

	private static void a1(FrontendTasks subTasks) {
		subTasks.task("a1")

		        .executes(inputs -> {
		        	
		        });
	}

	private static void a2(FrontendTasks subTasks) {
		subTasks.task("a2")

		        .waitsFor("a1")

		        .executes(inputs -> {

		        });
	}

	private static void a3(FrontendTasks subTasks) {
		subTasks.task("a3")

		        .waitsFor("a2")

		        .waitsFor("a4")

		        .executes(inputs -> {

		        });
	}

	private static void a4(FrontendTasks subTasks) {
		subTasks.task("a4")
		        .executes(inputs -> {

		        });
	}

	private static void a5(FrontendTasks subTasks) {
		subTasks.task("a5")

		        .waitsFor("a4")

		        .executes(inputs -> {

		        });
	}
}
