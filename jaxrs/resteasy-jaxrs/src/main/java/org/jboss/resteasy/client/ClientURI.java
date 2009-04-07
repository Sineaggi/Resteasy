package org.jboss.resteasy.client;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate a predefined URL (as opposed to a @PAthParam /@QueryParam)
 * in a Proxied client.<br>
 * 
 * For Example:
 * <p>
 * 
 * @GET MyDTO getDTO(@ClientURI String uri);
 * 
 * 
 * @author <a href="mailto:sduskis@gmail.com">Solomon</a>
 * @version $Revision: 1 $
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClientURI
{

}
