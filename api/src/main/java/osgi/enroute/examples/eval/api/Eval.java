package osgi.enroute.examples.eval.api;
/**
 * A service that evaluates an expression and returns the result
 */

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Eval {
	/**
	 * Evaluate an expression and return the result.
	 */
	double eval(String expression) throws Exception;
}
