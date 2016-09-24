@Grab('io.ratpack:ratpack-groovy:1.4.2')

import static ratpack.groovy.Groovy.ratpack;

ratpack {
	handlers {
		get {
			render "Hello, Nexmo! "
		}
	}
}